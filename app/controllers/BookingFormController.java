package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.mysql.jdbc.Connection;
import dataholders.BookingFormErrors;
import play.Logger;
import play.libs.Json;
import play.libs.ws.*;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import validation.ValidationUtility;

import javax.inject.Inject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by alex on 2017-12-26.
 */
@With(ForceHttps.class)
public class BookingFormController extends Controller implements WSBodyReadables, WSBodyWritables {

    private static final String CAPTCHA = "captcha";

    private ValidationUtility validationUtility = new ValidationUtility();
    private HelperUtilityClass helperUC = new HelperUtilityClass();
    private HashMap<String, String> dbColumnSize;

    private final WSClient ws;

    @Inject
    public BookingFormController(WSClient ws) {
        this.ws = ws;
    }

    /**
     * Method which handles validation of bookingForm and writing to database on success
     *
     * @return response - success or fail (with options)
     * @throws JsonProcessingException
     */
    public Result addBookingToDatabase() throws JsonProcessingException {
        helperUC.initializeObjectMapper();
        String sqlStatement = HelperUtilityClass.getEnvVar("TABLE_FULLFORM");
        JsonNode json = request().body().asJson();
        HashMap<String, JsonNode> dataFromFullForm = new HashMap<>();
        JsonNode captchaNode = json.findPath(CAPTCHA);
        String captchaError;

        for (String item : HelperUtilityClass.fullFormNames) {
            dataFromFullForm.put(item, json.findPath(item));
        }

        try {
            try (Connection connection = helperUC.getConnection()) {
                try (PreparedStatement preparedStatement = connection.prepareStatement(sqlStatement)) {
                    // perform validation on all fields in BookingFormController except captcha
                    Map<String, String> errorCodesAfterValidation = validationUtility.mergedValidationForFF(dataFromFullForm);
                    if (helperUC.containsErrors(errorCodesAfterValidation)) {
                        String response = helperUC.prepareJsonResponse(new BookingFormErrors(errorCodesAfterValidation, ""));
                        Logger.debug("Form contains errors...");

                        return badRequest(response);
                    } else {
                        // captcha separately as it can be checked ONCE on google api side, otherwise gets invalid
                        captchaError = validateCaptchaFF(captchaNode);
                        if (helperUC.isValid(captchaError)) {
                            String response = helperUC.prepareJsonResponse(new BookingFormErrors(errorCodesAfterValidation, captchaError));

                            prepareDataForWritingToDB(HelperUtilityClass.fullFormNames, preparedStatement, dataFromFullForm, connection).execute();

                            return ok(response);
                        }
                    }
                    //Probably captcha validation
                    Logger.warn("Something went very wrong");
                    String response = helperUC.prepareJsonResponse(new BookingFormErrors(errorCodesAfterValidation, captchaError));
                    return badRequest(response);
                }
            }
        } catch (SQLException e) {
            Logger.debug("SQLException : {}", e);
            return badRequest(Json.toJson(e.getErrorCode()));
        }
    }


    /**
     * Method for handle writing to the DB, dynamically parsing length of input according to the size of the column
     *
     * @param nodeNameList - List of form fields
     * @param ps           - preparedStatement
     * @param hashMap      - actual data from the form to be written to the DB
     * @param conn         - DB Connection
     * @return - a ready preparedStatement
     */
    private PreparedStatement prepareDataForWritingToDB(List<String> nodeNameList, PreparedStatement ps, HashMap hashMap, Connection conn) {

        try {
            this.dbColumnSize = new HashMap<>();
            getMaxSizeForEachCol(conn);
            int i = 0;
            for (String item : nodeNameList) {
                i++;
                ps.setString(i, setMaxSizeForEachCol(String.valueOf(hashMap.get(item)), getColumnSize(item)));
            }
        } catch (SQLException e) {
            Logger.error("Stuff went very wrong on writeToDb: ", e);
        }
        return ps;
    }

    /**
     * Method for limiting the length of the i.e. String to be written to DB specific column
     *
     * @param toBeTrimmed - input data
     * @param maxSize     - maximum length allowed for specific DB column
     * @return - trimmed input
     */
    private String setMaxSizeForEachCol(String toBeTrimmed, int maxSize) {
        return toBeTrimmed.substring(0, Math.min(toBeTrimmed.length(), maxSize));
    }

    /**
     * Method for fetching the max size of the specific column in a table
     *
     * @param columnName - column name in the table
     * @return - size
     */
    private int getColumnSize(String columnName) {
        return Integer.valueOf(this.dbColumnSize.get(columnName));
    }

    /**
     * Method for fetching table columns information, such as name, length and prepares for further usage.
     *
     * @param connection - DB connection
     * @throws SQLException
     */
    private void getMaxSizeForEachCol(Connection connection) throws SQLException {
        HashMap<String, String> tableColumnDataMap = new HashMap<>();

        String query = HelperUtilityClass.getEnvVar("FIELDS_FULLFORM");
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            try (ResultSet rs = ps.executeQuery()) {

                while (rs.next()) {
                    String columnSize = rs.getString(2);
                    String columnName = rs.getString(1);

                    tableColumnDataMap.put(columnName, columnSize);
                }
                tableColumnDataMap.forEach((x, y) -> this.dbColumnSize.put(x,
                        y.replaceAll("\\D+", "")));
            }
        }
    }


    /**
     * Method for processing response from GoogleAPI for bookingForm
     *
     * @param captcha - captcha response from FE
     * @return - empty on success, otherwise error - captchaFormat
     */
    protected String validateCaptchaFF(JsonNode captcha) {
        String captchaResponse = captcha.asText();
        WSRequest request = ws.url(HelperUtilityClass.CAPTCHA_API_URL);
        String answer = helperUC.getCaptchaResponseFromGoogleAPI(request, captchaResponse);

        if (!answer.equalsIgnoreCase("true")) {
            return "captchaFormat";
        }
        return "";
    }
}