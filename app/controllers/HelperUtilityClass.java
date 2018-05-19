package controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.jdbc.Connection;
import jsonthings.JsonDataArrayFromBeToFe;
import play.Logger;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicBoolean;

public class HelperUtilityClass {

    public static final String CAPTCHA_API_URL = getEnvVar("GOOGLE_API");
    public static final String CAPTCHA_SECRET = getEnvVar("CAPTCHA_SECRET_FF");
    protected static final List<String> fullFormNames = Arrays.asList("name", "surname", "email", "phone", "massage", "massageOption", "date", "time", "message");
    protected static final List<String> contactFormNames = Arrays.asList("name", "email", "message");

    /**
     * Constructor for class initialization
     */
    public HelperUtilityClass() {
        //initialized from another class
    }

    /**
     * Method for serialization and deserialization JSON
     *
     * @return JSON data
     */

    public ObjectMapper initializeObjectMapper() {

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        return objectMapper;
    }

    /**
     * Wrap JsonResponse
     *
     * @param form in this case either bookingForm or contactUs data
     * @return Serialized JSON
     * @throws JsonProcessingException
     */
    public String prepareJsonResponse(Object form) throws JsonProcessingException {

        JsonDataArrayFromBeToFe jTopRootList = new JsonDataArrayFromBeToFe();
        jTopRootList.add(form);

        return initializeObjectMapper().writeValueAsString(jTopRootList);
    }


    /**
     * Check if form contains any errors
     *
     * @param dataFromFieldsAfterValidation Map of form fields to be checked if errors are present
     * @return true if form contains errors, otherwise false
     */
    public boolean containsErrors(Map<String, String> dataFromFieldsAfterValidation) {

        AtomicBoolean value = new AtomicBoolean(false);
        dataFromFieldsAfterValidation.forEach((x, y) -> {
            if (!y.equalsIgnoreCase("")) {
                value.set(true);
            }
        });

        return value.get();
    }

    /**
     * Method for checking field of the form for validity
     *
     * @param value - field to be checked
     * @return true if valid, false otherwise
     */
    public boolean isValid(String value) {
        return value.equalsIgnoreCase("");
    }

    /**
     * Method to extract environment variables
     *
     * @param name - environment variable
     * @return environment variable for usage
     */
    public static String getEnvVar(String name) {
        return System.getenv(name);
    }

    /**
     * Method for retrieving connection towards DB
     *
     * @return - connection
     */
    public Connection getConnection() {

        try {
            return (Connection) DriverManager.getConnection(getEnvVar("DB_URL"), getEnvVar("DB_USER"), getEnvVar("DB_PASS"));

        } catch (SQLException e) {
            Logger.debug("Connection went to hell: ", e);
        }
        return null;
    }

    /**
     * Check captcha validity against Google API
     *
     * @param request         - request to be sent towards google API
     * @param captchaResponse - captcha response from FE to be sent for validation towards google API
     * @return - true if captcha validated successfully, otherwise false
     */
    public String getCaptchaResponseFromGoogleAPI(WSRequest request, String captchaResponse) {
        request.addQueryParameter("secret", CAPTCHA_SECRET);
        request.addQueryParameter("response", captchaResponse);
        CompletionStage<WSResponse> responsePromise = request.execute();
        CompletionStage<JsonNode> jsonPromise = responsePromise.thenApply(WSResponse::asJson);
        JsonNode jsonData = jsonPromise.toCompletableFuture().join();
        return jsonData.findPath("success").asText();
    }

    /**
     * Method for fetching specific table from DB according to current language
     *
     * @param json - json data with option which table to pick
     * @return - table
     */
    public String getSpecificQuery(JsonNode json) {
        String table;
        switch (json.asText()) {
            case "lt":
                table = getEnvVar("TABLE_LT");
                break;
            case "de":
                table = getEnvVar("TABLE_DE");
                break;
            case "ru":
                table = getEnvVar("TABLE_RU");
                break;
            default:
                throw new IllegalArgumentException("No such language");
        }
        return table;
    }

}
