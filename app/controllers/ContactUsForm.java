package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import jsonthings.ContactFormErrors;
import play.Logger;
import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
import play.libs.ws.*;
import play.mvc.Controller;
import play.mvc.Result;
import validation.ValidationUtility;
import javax.inject.Inject;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContactUsForm extends Controller implements WSBodyReadables, WSBodyWritables {

    private static final String NAME = "name";
    private static final String EMAIL = "email";
    private static final String MESSAGE = "message";
    private static final String CAPTCHA = "captcha";

    private static final List<String> nodeNamesList = Arrays.asList(NAME, EMAIL, MESSAGE);
    private HelperUtilityClass helperUC = new HelperUtilityClass();

    @Inject
    MailerClient mailerClient;

    private ValidationUtility validationUtility = new ValidationUtility();

    private final WSClient ws;

    @Inject
    public ContactUsForm(WSClient ws) {
        this.ws = ws;
    }

    public Result sendEmail() throws IOException {
        Map<String, String> errorCodesAfterValidation;
        JsonNode json = request().body().asJson();
        Map<String, JsonNode> dataMapFromCF = new HashMap<>();
        String captchaError;
        String response;

        for (String item : nodeNamesList) {
            dataMapFromCF.put(item, json.findPath(item));
        }
        errorCodesAfterValidation = validationUtility.mergedValidationForCF(dataMapFromCF);
        if (helperUC.containsErrors(errorCodesAfterValidation)) {
            response = helperUC.prepareJsonResponse(new ContactFormErrors(errorCodesAfterValidation, ""));
            Logger.debug("ContactForm contains errors...");

            return badRequest(response);
        } else {
            captchaError = validateCaptchaCF(json.findPath(CAPTCHA));
            if (helperUC.isValid(captchaError)) {
                response = helperUC.prepareJsonResponse(new ContactFormErrors(errorCodesAfterValidation, captchaError));
                deliverEmail(dataMapFromCF);
                Logger.debug("Email delivered...");

                return ok(response);
            } else {
                response = helperUC.prepareJsonResponse(new ContactFormErrors(errorCodesAfterValidation, captchaError));
                Logger.debug("Something went very wrong...");

                return badRequest(response);
            }
        }
    }

    /*
    Method to send email
     */
    private void deliverEmail(Map<String, JsonNode> data) {
        Email readyEmail = new Email().setSubject("Klausimas")
                .setFrom("info@vidamassage.ch")
                .addTo("info@vidamassage.ch")
                .setBodyText("Vardas: " + data.get("name").asText() +
                        "\n" + "Email: " + data.get("email").asText() +
                        "\n" + "Zinute: " + data.get("message").asText());
        mailerClient.send(readyEmail);
    }

    /*
    Communication towards google API for captcha verification
     */
    protected String validateCaptchaCF(JsonNode captcha) {
        String captchaResponse = captcha.asText();
        WSRequest request = ws.url(HelperUtilityClass.CAPTCHA_API_URL);
        String answer = helperUC.getCaptchaResponseFromGoogleAPI(request, captchaResponse);

        if (!answer.equalsIgnoreCase("true")) {
            return "captchaNotSolved";
        }
        return "";
    }

}
