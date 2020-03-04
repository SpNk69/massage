package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.mysql.jdbc.Connection;
import com.sun.mail.smtp.SMTPAddressFailedException;
import dataholders.BookingFormErrors;
import org.apache.commons.mail.EmailException;
import play.Logger;
import play.libs.Json;
import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
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

    @Inject
    MailerClient mailerClient;

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

                            deliverEmail(dataFromFullForm);

                            //send email here

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

    private void deliverEmail(Map<String, JsonNode> data) {

        System.out.println("IN THE SEND EMAIL");
        System.out.println(data.get("email"));
        System.out.println(data.get("email").asText());

        String email1=data.get("email").asText();
        String email2 = "\""+email1+"\"";
    Email readyEmail = new Email().setSubject("Ihre Massagereservierung unter www.vidamassage.ch")
            .setFrom("info@vidamassage.ch")
            .addTo("info@vidamassage.ch")
            .addTo(data.get("email").asText())
            .setBodyText("Hallo " + data.get("name").asText() + " " + data.get("surname").asText() + "," +

                            "\n\n" +
                            "Sie haben folgende Massage gebucht: " + data.get("massage").asText() +
                            "\n" + "Sie haben hingewiesen dieses E-mail Adresse: " + data.get("email").asText() +
//                        "\n\n" + "Botschaft: " + data.get("message").asText()+
                            "\n" + "Die Stelle: Schaffhausen, Oberstadt 22, 1. Stock" +
                            "\n" + "Datum: " + data.get("date").asText() +
                            "\n" + "Zeit: " + data.get("time").asText() +

                            "\n" + "Dauer: " + data.get("massageOption").asText().split(" – ")[0] +
                            "\n" + "Betrag: " + data.get("massageOption").asText().split(" – ")[1] + "" +
//                        "\n\n" + data.get("date").asText() +
                            "\n" + "Ihre Wünsche: " + data.get("message").asText() +
                            "\n" + "Art der Zahlung: Bargeld" +
                            "\n" + "Um die Massage Zeit abbrechen oder zu ändern, rufen Sie +41797897010 an oder senden Sie eine E-Mail an info@vidamassage.ch" +
                            "\n\n" + "Mit freundlichen Grüßen" +
                            "\n" + "vidamassage" +
                            "\n\n" + "--------------" +
                            "\n" + "www.vidamassage.ch" +
                            "\n" + "+41797897010" +
                            "\n" + "info@vidamassage.ch" +
                            "\n" + "P.S. Im Februar gilt 35% Rabatt auf Ihre gewählte Massage." +

                            "\n" + "Sie können gerne eine Bewertung auf Facebook hinterlassen - https://www.facebook.com/behandlungspraxisVida/"
            );
    System.out.println("IN THE SEND EMAIL2");


        System.out.println(readyEmail.getTo());
        try{
    mailerClient.send(readyEmail);}
        catch(Exception e){
    Logger.debug("Some retard used retarded email again: ", e);
            
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