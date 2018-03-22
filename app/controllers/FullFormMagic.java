package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.SocketMetadata;
import jsonthings.JFullFormSubmit;
import play.Logger;
import play.libs.Json;
import play.libs.ws.*;
import play.mvc.Controller;
import play.mvc.Result;
import validation.ValidationUtility;

import javax.inject.Inject;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicBoolean;

import static play.mvc.Results.badRequest;
import static play.mvc.Results.ok;

/**
 * Created by alex on 2017-12-26.
 */
public class FullFormMagic extends Controller implements WSBodyReadables, WSBodyWritables {
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

    private final WSClient ws;

    @Inject
    public FullFormMagic(WSClient ws) {
        this.ws = ws;
    }


    protected String validateCaptcha(JsonNode captcha) {
        String captchaResponse = captcha.asText();
        String urlTo = "https://www.google.com/recaptcha/api/siteverify";
        WSRequest request = ws.url(urlTo);
        String secret = "6Lfg2z8UAAAAACiagKKEsYHfi0RdFce0HQf9XLfo";

        request.addQueryParameter("secret", secret);
        request.addQueryParameter("response", captchaResponse);
//        CompletionStage jsonPromise = ws.url(urlTo).setContentType("application/x-www-form-urlencoded; charset=utf-8").post("secret=6Lfg2z8UAAAAACiagKKEsYHfi0RdFce0HQf9XLfo&response=" + x).thenApply(WSResponse::asJson);
        CompletionStage<WSResponse> responsePromise = request.post("");
        CompletionStage<JsonNode> jsonPromise = responsePromise.thenApply(WSResponse::asJson);
        JsonNode jsonData = jsonPromise.toCompletableFuture().join();
        String answer = jsonData.findPath("success").asText();

        if (!answer.equalsIgnoreCase("true")) {
            return "captchaFormat";
        }
        return "";
    }


    private boolean containsErrors(Map<String, String> map1) {
        AtomicBoolean value = new AtomicBoolean(false);
        map1.forEach((x, y) -> {
            if (!y.equalsIgnoreCase("")) {
                value.set(true);
            }
        });

        return value.get();
    }

    private boolean isValid(String value) {
        return value.equalsIgnoreCase("");
    }

    private String getEnv(String name) {
        return System.getenv(name);
    }


    private Connection getConnection() {
        try {
            return (Connection) DriverManager.getConnection(getEnv("DB_URL"), getEnv("DB_USER"), getEnv("DB_PASS"));

        } catch (SQLException e) {
            Logger.error("Connection went to hell: ", e);
        }
        return null;
    }


    public Result addBookingToDatabase() throws JsonProcessingException {
        HelperClass helperClass = new HelperClass();
        helperClass.initializeObjectMapper();
        String sqlStatement = "INSERT INTO heroku_e3d8ce5aa92835f.fullreservationform (name, surname, email, phone, massage,massageOption, date, time, message)  VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        JsonNode json = request().body().asJson();
        HashMap<String, JsonNode> dataHashMap = new HashMap<>();
        JsonNode captchaNode = json.findPath(CAPTCHA);

        for (String item : nodeNamesList) {
            dataHashMap.put(item, json.findPath(item));
        }

        try {
            try (Connection connection = getConnection()) {
                if (connection == null) return badRequest("Connection is null");
                try (PreparedStatement preparedStatement = connection.prepareStatement(sqlStatement)) {
                    Map<String, String> errorCodesAfterValidation = validationUtility.mergedValidation(dataHashMap);
                    if (containsErrors(errorCodesAfterValidation)) {
                        String response = helperClass.prepareResponse(new JFullFormSubmit(errorCodesAfterValidation, ""));
                        Logger.debug("Form contains errors...");

                        return badRequest(response);
                    } else {
                        String captchaError = validateCaptcha(captchaNode);
                        if (isValid(captchaError)) {
                            String response = helperClass.prepareResponse(new JFullFormSubmit(errorCodesAfterValidation, captchaError));

                            writeToDatabase(nodeNamesList, preparedStatement, dataHashMap, connection).execute();

                            return ok(response);
                        }
                    }
                }
            }
            Logger.debug("Not written to DB");

            return badRequest("Something went very very wrong");
        } catch (SQLException e) {

            Logger.warn("SQLEXCEPTION: " + e.getErrorCode() + " 2: " + e.getSQLState() + " 3: " + e.getNextException());
            return badRequest(Json.toJson(e.getErrorCode()));
        }
    }


    private PreparedStatement writeToDatabase(List<String> list, PreparedStatement ps, HashMap hashMap, Connection conn) {
        try {
            int i = 0;
            for (String item : list) {
                i++;
                ps.setString(i, setMaxColTypeLen(String.valueOf(hashMap.get(item)), getMaxSize(conn, item)));
            }
        } catch (SQLException e) {
            Logger.error("Stuff went very wrong on writeToDb");
        }
        return ps;

    }


    // To Do, Fetch size of i.e. varchar automatically from DB.
    private String setMaxColTypeLen(String toBeTrimmed, int maxSize) {
        return toBeTrimmed.substring(0, Math.min(toBeTrimmed.length(), maxSize));
    }

    private int getMaxSize(Connection connection, String param1) throws SQLException {

        //to add as env var/hide
        String query = "SHOW FIELDS FROM  heroku_e3d8ce5aa92835f.fullreservationform;";
        int[] red;
        try (PreparedStatement ps = connection.prepareStatement(query)) {

            try (ResultSet rs = ps.executeQuery()) {
                HashMap<String, String> hashMap = new HashMap<>();
                HashMap<String, String> anotherMap = new HashMap<>();

                while (rs.next()) {
                    Logger.warn("Inside getMaxSize: " + rs);

                    String rx = rs.getString(2);
                    String ry = rs.getString(1);

                    hashMap.put(ry, rx);
                }

                hashMap.forEach((x, y) -> anotherMap.put(x,
                        y.replaceAll("\\D+", "")));
                red = new int[1];


                anotherMap.forEach((x, y) -> {
                    if (x.equalsIgnoreCase(param1)) {
                        red[0] = Integer.parseInt(y);
                    }
                });
            }
        }
        return red[0];
    }
}