package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import dataholders.ContactFormErrors;
import play.Logger;
import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
import play.libs.ws.*;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import validation.ValidationUtility;

import javax.inject.Inject;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@With(ForceHttps.class)
public class ContactUsForm extends Controller implements WSBodyReadables, WSBodyWritables {

    private static final String CAPTCHA = "captcha";
    private HelperUtilityClass helperUC = new HelperUtilityClass();
    private ValidationUtility validationUtility = new ValidationUtility();

    public ContactUsForm() {
        //empty
    }


    @Inject
    MailerClient mailerClient;

    @Inject
    WSClient ws1;

    /**
     * Method for processing the email before sending
     *
     * @return response
     * @throws IOException
     */
    public Result sendEmail() throws IOException {
        Map<String, String> errorCodesAfterValidation;
        JsonNode json = request().body().asJson();
        Map<String, JsonNode> dataMapFromCF = new HashMap<>();
        String captchaError;
        String response;

        for (String item : HelperUtilityClass.contactFormNames) {
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

    /**
     * Method for preparing email for delivery
     *
     * @param data - data for email
     */
    private void deliverEmail(Map<String, JsonNode> data) {
        Email readyEmail = new Email().setSubject("Frage")
                .setFrom("info@vidamassage.ch")
                .addTo("info@vidamassage.ch")
                .setBodyText("Name: " + data.get("name").asText() +
                        "\n\n" + "Email: " + data.get("email").asText() +
                        "\n\n" + "Botschaft: " + data.get("message").asText());
        mailerClient.send(readyEmail);
    }

    /**
     * Method for processing response from GoogleAPI for contactUsForm
     *
     * @param captcha - captcha response from FE
     * @return - empty on success, otherwise error - captchaNotSolved
     */
    protected String validateCaptchaCF(JsonNode captcha) {
        String captchaResponse = captcha.asText();
        WSRequest request = ws1.url(HelperUtilityClass.CAPTCHA_API_URL);
        String answer = helperUC.getCaptchaResponseFromGoogleAPI(request, captchaResponse);

        if (!answer.equalsIgnoreCase("true")) {
            return "captchaNotSolved";
        }
        return "";
    }

}
