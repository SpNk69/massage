package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.mysql.jdbc.Connection;
import jsonthings.JFullFormSubmit;
import play.Logger;
import play.libs.Json;
import play.libs.ws.*;
import play.mvc.Controller;
import play.mvc.Result;
import validation.ValidationUtility;
import javax.inject.Inject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by alex on 2017-12-26.
 */
public class FullForm extends Controller implements WSBodyReadables, WSBodyWritables {

    private static final String NAME = "name";
    private static final String SURNAME = "surname";
    private static final String EMAIL = "email";
    private static final String PHONE = "phone";
    private static final String MASSAGE = "massage";
    private static final String MASSAGE_OPTION = "massageOption";
    private static final String DATE = "date";
    private static final String TIME = "time";
    private static final String MESSAGE = "message";
    private static final String CAPTCHA = "captcha";

    private static final List<String> nodeNamesList = Arrays.asList(NAME, SURNAME, EMAIL, PHONE, MASSAGE, MASSAGE_OPTION, DATE, TIME, MESSAGE);

    private ValidationUtility validationUtility = new ValidationUtility();
    private HelperUtilityClass helperUC = new HelperUtilityClass();
    private HashMap<String, String> dbColumnSize;

    private final WSClient ws;

    @Inject
    public FullForm(WSClient ws) {
        this.ws = ws;
    }

    /*
    Method which handles validation of data and writes to DB
     */
    public Result addBookingToDatabase() throws JsonProcessingException {
        helperUC.initializeObjectMapper();
        String sqlStatement = helperUC.getEnvVar("TABLE_FULLFORM");
        JsonNode json = request().body().asJson();
        HashMap<String, JsonNode> dataFromFullForm = new HashMap<>();
        JsonNode captchaNode = json.findPath(CAPTCHA);
        String captchaError;

        for (String item : nodeNamesList) {
            dataFromFullForm.put(item, json.findPath(item));
        }

        try {
            try (Connection connection = helperUC.getConnection()) {
                if (connection == null) return badRequest("Connection is null");
                try (PreparedStatement preparedStatement = connection.prepareStatement(sqlStatement)) {
                    // perform validation on all fields in FullForm except captcha
                    Map<String, String> errorCodesAfterValidation = validationUtility.mergedValidationForFF(dataFromFullForm);
                    if (helperUC.containsErrors(errorCodesAfterValidation)) {
                        String response = helperUC.prepareJsonResponse(new JFullFormSubmit(errorCodesAfterValidation, ""));
                        Logger.debug("Form contains errors...");

                        return badRequest(response);
                    } else {
                        // captcha separately as it can be checked ONCE on google api side, otherwise gets invalid
                        captchaError = validateCaptchaFF(captchaNode);
                        if (helperUC.isValid(captchaError)) {
                            String response = helperUC.prepareJsonResponse(new JFullFormSubmit(errorCodesAfterValidation, captchaError));

                            writeToDatabase(nodeNamesList, preparedStatement, dataFromFullForm, connection).execute();

                            return ok(response);
                        }
                    }
                    //Probably captcha validation
                    Logger.warn("Something went very wrong");
                    String response = helperUC.prepareJsonResponse(new JFullFormSubmit(errorCodesAfterValidation, captchaError));
                    return badRequest(response);
                }
            }
        } catch (SQLException e) {
            Logger.debug("SQLException : ", e);
            return badRequest(Json.toJson(e.getErrorCode()));
        }
    }

    /*
    Method which handles writing to DB, dynamically parsing length of input and etc
     */
    private PreparedStatement writeToDatabase(List<String> nodeNameList, PreparedStatement ps, HashMap hashMap, Connection conn) {

        try {
            this.dbColumnSize = new HashMap<>();
            getMaxSize(conn);
            int i = 0;
            for (String item : nodeNameList) {
                i++;
                ps.setString(i, setMaxColTypeLen(String.valueOf(hashMap.get(item)), getColumnSize(item)));
            }
        } catch (SQLException e) {
            Logger.error("Stuff went very wrong on writeToDb: ", e);
        }
        return ps;
    }

    /*
    Method for making sure that data fits into column of a table in the DB
     */
    private String setMaxColTypeLen(String toBeTrimmed, int maxSize) {
        return toBeTrimmed.substring(0, Math.min(toBeTrimmed.length(), maxSize));
    }

    /*
    Fetches specific column size of a table from DB
     */
    private int getColumnSize(String columnName) {
        return Integer.valueOf(this.dbColumnSize.get(columnName));
    }

    /*
    Fetches table columns information, such as name, length and prepares for further usage.
     */
    private void getMaxSize(Connection connection) throws SQLException {
        HashMap<String, String> tableColumnDataMap = new HashMap<>();

        //to add as env var/hide
        String query = helperUC.getEnvVar("FIELDS_FULLFORM");
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

    /*
    Communication towards google API for captcha verification
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