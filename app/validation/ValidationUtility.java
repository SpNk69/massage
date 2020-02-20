package validation;

import com.fasterxml.jackson.databind.JsonNode;
import common.Constants;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationUtility {

    public ValidationUtility() {

    }

    public String validateName(JsonNode nameNode) {
        String name = nameNode.asText();
        String pattern = "[^\\p{L}.' ]+";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(name);

        if (name.length() < 2 || name.length() > 50) {
            return "nameLength";
        } else if (m.find()) {
            return "nameFormat";
        }
        return "";
    }


    public String validateSurname(JsonNode surnameNode) {
        String surname = surnameNode.asText();
        String pattern = "[^\\p{L}.' ]+";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(surname);

        if (surname.length() < 2 || surname.length() > 50) {
            return "surnameLength";
        } else if (m.find()) {
            return "surnameFormat";
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
            return "emailFormat";
        }
        return "";
    }


    //TODO: Validate against malicious but in non blocking way;)
    public String validateMessage(JsonNode messageNode) {

        String message = messageNode.asText();
        String pattern = "";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(message);

        if (message.length() < 1 || message.length() > 1000) {
            return "messageLength";
        }
        return "";
    }


    //TODO: Validate against malicious but in non blocking way;)
    public String validateMessageFullForm(JsonNode messageNode) {

        String message = messageNode.asText();
        String pattern = "";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(message);

        if (message.length() > 1000) {
            return "messageLength";
        }
        return "";
    }


    //TODO: Minimize regex patterns
    public String validateDate(JsonNode dateNode) {

        String date = dateNode.asText();
        String pattern = "^\\d{4}-\\d{2}-\\d{2}$";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(date);
        //parse month
        String pattern2 = "(?<=-)(.*0[1-9]|1[0-2])(?=-)";
        Pattern r2 = Pattern.compile(pattern2);
        Matcher m2 = r2.matcher(date);

        //parse day
        String pattern3 = "(?<=-..-)(.*0[1-9]|1[0-9]|2[0-9]|3[0-1])";
        Pattern r3 = Pattern.compile(pattern3);
        Matcher m3 = r3.matcher(date);

        if (date.length() < 1 || date.length() > 10) {
            return "dateLength";
        } else if (!m.find()) {
            return "dateFormat";
        } else if (!m2.find()) {
            return "dateFormat";
        } else if (!m3.find()) {
            return "dateFormat";
        }
        return "";
    }

    public String validateTime(JsonNode timeNode) {
        String time = timeNode.asText();
        String pattern = "(?:[01]\\d|2[0123]):(?:[012345]\\d)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(time);

        if (time.length() < 1 || time.length() != 5 || time.equalsIgnoreCase("null")) {
            return "timeLength";
        } else if (!m.find()) {
            return "timeFormat";
        }
        return "";
    }


    public String validatePhone(JsonNode phoneNode) {
        String phone = phoneNode.asText();
        String pattern = "[^\\d+\\\\() –-]";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(phone);

        if (phone.length() < 9 || phone.length() > 20) {
            return "phoneLength";
        } else if (m.find()) {
            return "phoneFormat";
        }
        return "";
    }


    public String validateMassageOption(JsonNode massageOptionNode) {
        String massageOption = massageOptionNode.asText();
        String pattern = "[^a-zA-Z0-9– -]+";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(massageOption);

        if (massageOption.length() < 2 || massageOption.length() > 25 || massageOption.equalsIgnoreCase("null")) {
            return "massageOptionLength";
        } else if (m.find()) {
            return "massageOptionFormat";
        }
        return "";
    }


    public String validateMassage(JsonNode massageNode) {
        String massage = massageNode.asText();
        String pattern = "[^\\p{L}\\p{Pd}.')(+ -]";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(massage);

        if (massage.length() < 1 || massage.length() > 100) {
            return "massageLength";
        } else if (m.find()) {
            return "massageFormat";
        }
        return "";
    }

    public Map<String, String> mergedValidationForFF(Map<String, JsonNode> dataMap) {
        HashMap<String, String> validationResult = new HashMap<>();

        validationResult.put(Constants.NAME, validateName(dataMap.get(Constants.NAME)));
        validationResult.put(Constants.SURNAME, validateSurname(dataMap.get(Constants.SURNAME)));
        validationResult.put(Constants.EMAIL, validateEmail(dataMap.get(Constants.EMAIL)));
        validationResult.put(Constants.PHONE, validatePhone(dataMap.get(Constants.PHONE)));
        validationResult.put(Constants.MASSAGE, validateMassage(dataMap.get(Constants.MASSAGE)));
        validationResult.put(Constants.MASSAGE_OPTION, validateMassageOption(dataMap.get(Constants.MASSAGE_OPTION)));
        validationResult.put(Constants.DATE, validateDate(dataMap.get(Constants.DATE)));
        validationResult.put(Constants.TIME, validateTime(dataMap.get(Constants.TIME)));
        validationResult.put(Constants.MESSAGE, validateMessageFullForm(dataMap.get(Constants.MESSAGE)));

        return validationResult;
    }

    public Map<String, String> mergedValidationForCF(Map<String, JsonNode> dataMap) {
        HashMap<String, String> validationResult = new HashMap<>();
        validationResult.put(Constants.NAME, validateName(dataMap.get(Constants.NAME)));
        validationResult.put(Constants.EMAIL, validateEmail(dataMap.get(Constants.EMAIL)));
        validationResult.put(Constants.MESSAGE, validateMessage(dataMap.get(Constants.MESSAGE)));

        return validationResult;
    }
}
