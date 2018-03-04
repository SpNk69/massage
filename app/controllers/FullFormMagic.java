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
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.concurrent.CompletionStage;

import static play.mvc.Results.badRequest;
import static play.mvc.Results.ok;

/**
 * Created by alex on 2017-12-26.
 */
public class FullFormMagic extends Controller implements WSBodyReadables, WSBodyWritables {
    //
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


    ValidationUtility validationUtility = new ValidationUtility();
    JFullFormSubmit jFullFormSubmit;
    HelperClass helperClass;
    HomeController homeController;



   private final WSClient ws;

    @Inject
    public FullFormMagic(WSClient ws) {
        this.ws = ws;
    }


    private static Connection getConnection() throws URISyntaxException, SQLException {
        URI dbUri = new URI(System.getenv("CLEARDB_DATABASE_URL"));

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:mysql://" + dbUri.getHost() + dbUri.getPath();

        Logger.warn("SUP: " + dbUrl);

        return (Connection) DriverManager.getConnection(dbUrl, username, password);
    }


    protected String validateCaptcha(JsonNode captcha) {
        String x = captcha.asText();
        String urlTo = "https://www.google.com/recaptcha/api/siteverify";
        Logger.warn("BEFORE REQUEST");
        WSRequest request = ws.url(urlTo);
        Logger.warn("AFTER REQUEST");

        request.addQueryParameter("secret", "6Lfg2z8UAAAAACiagKKEsYHfi0RdFce0HQf9XLfo");
        request.addQueryParameter("response", x);
//        CompletionStage jsonPromise = ws.url(urlTo).setContentType("application/x-www-form-urlencoded; charset=utf-8").post("secret=6Lfg2z8UAAAAACiagKKEsYHfi0RdFce0HQf9XLfo&response=" + x).thenApply(WSResponse::asJson);
        CompletionStage<WSResponse> responsePromise = request.post("x");
        CompletionStage<JsonNode> jsonPromise = responsePromise.thenApply(WSResponse::asJson);
        JsonNode jsonData = jsonPromise.toCompletableFuture().join();
        String answer = jsonData.findPath("success").asText();
        Logger.warn("CAPTCHA: " + answer);
        Logger.warn("BEFORE CAPTCHA VALIDATION");

        if (!answer.equalsIgnoreCase("true")) {
            return "captchaFormat";
        }
        return "";
    }




    public Result addBookingToDatabase() throws JsonProcessingException {
        JsonNode json = request().body().asJson();

        JsonNode nameNode=json.findPath(NAME);
        JsonNode surnameNode = json.findPath(SURNAME);
        JsonNode emailNode = json.findPath(EMAIL);
        JsonNode phoneNode = json.findPath(PHONE);
        JsonNode massageNode = json.findPath(MASSAGE);
        JsonNode massageOptionNode = json.findPath(MASSAGE_OPTION);
        JsonNode dateNode = json.findPath(DATE);
        JsonNode timeNode = json.findPath(TIME);
        JsonNode messageNode = json.findPath(MESSAGE);
        JsonNode captchaNode = json.findPath(CAPTCHA);

        Connection connection=null;
        PreparedStatement xs=null;
        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://eu-cdbr-west-02.cleardb.net/heroku_e3d8ce5aa92835f?useUnicode=yes&characterEncoding=UTF-8", "b2945c551737ae", "809360b3");

//        try (com.mysql.jdbc.Connection connection = getConnection()) {

            xs = connection.prepareStatement("INSERT INTO heroku_e3d8ce5aa92835f.fullreservationform (name, surname, email, phone, massage,massageOption, date, time, message)  VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            xs.setString(1, setMaxColTypeLen(findJson(json, NAME), getMaxSize(connection, NAME)));
            xs.setString(2, setMaxColTypeLen(findJson(json, SURNAME), getMaxSize(connection, SURNAME)));
            xs.setString(3, setMaxColTypeLen(findJson(json, EMAIL), getMaxSize(connection, EMAIL)));
            xs.setString(4, setMaxColTypeLen(findJson(json, PHONE), getMaxSize(connection, PHONE)));
            xs.setString(5, setMaxColTypeLen(findJson(json, MASSAGE), getMaxSize(connection, MASSAGE)));
            xs.setString(6, setMaxColTypeLen(findJson(json, MASSAGE_OPTION), getMaxSize(connection, MASSAGE_OPTION)));
            xs.setString(7, setMaxColTypeLen(findJson(json, DATE), getMaxSize(connection, DATE)));
            xs.setString(8, setMaxColTypeLen(findJson(json, TIME), getMaxSize(connection, TIME)));
            xs.setString(9, setMaxColTypeLen(findJson(json, MESSAGE), getMaxSize(connection, MESSAGE)));

            Logger.warn("name :" +findJson(json, NAME));
            Logger.warn("surname :" +findJson(json, SURNAME));
            Logger.warn("email :" +findJson(json, EMAIL));
            Logger.warn("phone :" +findJson(json, PHONE));
            Logger.warn("massage :" +findJson(json, MASSAGE));
            Logger.warn("massageOption :" +findJson(json, MASSAGE_OPTION));
            Logger.warn("date :" +findJson(json, DATE));
            Logger.warn("time :" +findJson(json, TIME));
            Logger.warn("message :" +findJson(json, MESSAGE));
            Logger.warn("captcha :" +findJson(json, CAPTCHA));

            validationUtility = new ValidationUtility();


            String nameError=validationUtility.validateName(nameNode);
            String surnameError=validationUtility.validateSurname(surnameNode);
            String emailError=validationUtility.validateEmail(emailNode);
            String phoneError=validationUtility.validatePhone(phoneNode);
            String massageError=validationUtility.validateMassage(massageNode);
            String massageOptionError=validationUtility.validateMassageOption(massageOptionNode);
            String dateError=validationUtility.validateDate(dateNode);
            String timeError=validationUtility.validateTime(timeNode);
            String messageError=validationUtility.validateMessageFullForm(messageNode);
            String captchaError= validateCaptcha(captchaNode);
            Logger.warn("CaptchaError: " + captchaError);



            Logger.warn("Before validation1");
            if(!nameError.equalsIgnoreCase("") || !surnameError.equalsIgnoreCase("")
                    || !emailError.equalsIgnoreCase("") || !phoneError.equalsIgnoreCase("")
                    || !massageError.equalsIgnoreCase("") || !massageOptionError.equalsIgnoreCase("")
                    || !dateError.equalsIgnoreCase("") || !timeError.equalsIgnoreCase("")
                    || !messageError.equalsIgnoreCase("")){

                Logger.warn("are we here?");

                helperClass = new HelperClass();
                helperClass.initializeObjectMapper();
                String x =helperClass.prepareResponse(new JFullFormSubmit(nameError,surnameError,emailError,phoneError,massageError,massageOptionError,dateError,timeError,messageError,""));

                return badRequest(x);

            }else if(captchaError.equalsIgnoreCase("")){
                Logger.warn("In the else if captcha validation");
                helperClass = new HelperClass();
                helperClass.initializeObjectMapper();
                String x =helperClass.prepareResponse(new JFullFormSubmit(nameError,surnameError,emailError,phoneError,massageError,massageOptionError,dateError,timeError,messageError,captchaError));

                return ok(x);

            }
            Logger.warn("After validation");



            String ErTest=validationUtility.validateDate(json.findPath("date"));
            if(!ErTest.equalsIgnoreCase("")){
                return badRequest("CRY HARD");
            }


            xs.execute();


            return ok();
        } catch (SQLException e) {

            Logger.warn("LOG 2:  1: " + e.getErrorCode() + " 2: " + e.getSQLState() + " 3: " + e.getNextException());
            return badRequest(Json.toJson(e.getErrorCode()));
        }finally{

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (xs != null) {
                try {
                    xs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    // To Do, Fetch size of i.e. varchar automatically from DB.
    private String setMaxColTypeLen(String toBeTrimmed, int maxSize) {
        return toBeTrimmed.substring(0, Math.min(toBeTrimmed.length(), maxSize));
    }

    private int getMaxSize(Connection connection, String param1) throws SQLException {

        PreparedStatement ps=null;
        ResultSet rs =null;
        String query="SHOW FIELDS FROM  heroku_e3d8ce5aa92835f.fullreservationform;";
        ps=connection.prepareStatement(query);

//         rs = prepareStatementSelectAll(connection, "SHOW FIELDS FROM  heroku_e3d8ce5aa92835f.fullreservationform;");

         rs =ps.executeQuery();
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, String> anotherMap = new HashMap<>();
        while (rs.next()) {

            String rx = rs.getString(2);
            String ry = rs.getString(1);

            hashMap.put(ry, rx);
        }

        hashMap.forEach((x, y) -> {
            anotherMap.put(x,
                    y.replaceAll("\\D+", ""));
        });
        final int[] red = new int[1];


        anotherMap.forEach((x, y) -> {
            if (x.equalsIgnoreCase(param1)) {
                red[0] = Integer.parseInt(y);
            }
        });
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return red[0];
    }

    private String findJson(JsonNode node, String path) {
        return node.findPath(path).toString();
    }

    private ResultSet prepareStatementSelectAll(Connection con, String query) throws SQLException {

        PreparedStatement preparedStatement = con.prepareStatement(query);

        return preparedStatement.executeQuery();
    }

}