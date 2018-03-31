package controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.jdbc.Connection;
import jsonthings.JRootKeysToGetArrays;
import jsonthings.JTopRootList;
import play.Logger;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.atomic.AtomicBoolean;

public class HelperUtilityClass {

    /*
    Constructor for class initialization
     */
    public HelperUtilityClass() {
    }

    public static final String CAPTCHA_API_URL = "https://www.google.com/recaptcha/api/siteverify";
    public static final String CAPTCHA_SECRET = getEnvVar("CAPTCHA_SECRET_FF");

    /*
    Initialize object mapper for further usage
     */
    public ObjectMapper initializeObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }

    /*
    Prepare Json response
         */
    public String prepareJsonResponse(Object form) throws JsonProcessingException {
        JTopRootList jTopRootList = new JTopRootList();
        JRootKeysToGetArrays topKey = new JRootKeysToGetArrays();
        jTopRootList.add(form);
        topKey.setContactFormErrors(jTopRootList);
        return initializeObjectMapper().writeValueAsString(topKey);
    }

    /*
    Check if form contains any errors.
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

    /*
    Check if field is valid
     */
    public boolean isValid(String value) {
        return value.equalsIgnoreCase("");
    }

    /*
    Get variable from the system environment
     */
    public static String getEnvVar(String name) {
        return System.getenv(name);
    }

    /*
    Initiate connection towards DB
     */
    public Connection getConnection() {
        try {
            return (Connection) DriverManager.getConnection(getEnvVar("DB_URL"), getEnvVar("DB_USER"), getEnvVar("DB_PASS"));

        } catch (SQLException e) {
            Logger.debug("Connection went to hell: ", e);
        }
        return null;
    }



        public String getCaptchaResponseFromGoogleAPI(WSRequest request, String captchaResponse) {
        request.addQueryParameter("secret", CAPTCHA_SECRET);
        request.addQueryParameter("response", captchaResponse);
        CompletionStage<WSResponse> responsePromise = request.execute();
        CompletionStage<JsonNode> jsonPromise = responsePromise.thenApply(WSResponse::asJson);
        JsonNode jsonData = jsonPromise.toCompletableFuture().join();
        return jsonData.findPath("success").asText();
    }



}
