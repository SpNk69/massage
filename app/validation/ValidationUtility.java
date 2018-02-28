package validation;

import com.fasterxml.jackson.databind.JsonNode;
import play.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtility {

    public ValidationUtility() {

    }



    public String validateName(JsonNode nameNode) {
        String name = nameNode.asText();
        String pattern = "[^\\p{L}.']+";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(name);

        if (name.length() < 1 || name.length() > 100) {
            return "nameLength";
        } else if (m.find()) {
            return "nameFormat";
        }
        return "";
    }


    public String validateEmail(JsonNode emailNode) {

        String email = emailNode.asText();
        String pattern = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(email);

        if (email.length() < 1 || email.length() > 100) {
            return "emailLength";
        } else if (!m.find()) {
            Logger.warn("EMAIL VALIDATION WORKS!");
            return "emailFormat";
        }
        return "";
    }



    public String validateMessage(JsonNode messageNode) {

        //check messagefield for something
        String message = messageNode.asText();
        String pattern = "";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(message);

        if (message.length() < 1 || message.length() > 1000) {
            return "messageLength";
        } else if (m.find()) {
            //do something here!!

        }

        return "";
    }




}
