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
        String pattern = "[^\\p{L}.' ]+";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(name);

        if (name.length() < 1 || name.length() > 100) {
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

        if (surname.length() < 1 || surname.length() > 100) {
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
            Logger.warn("EMAIL VALIDATION WORKS!");
            return "emailFormat";
        }
        return "";
    }



    public String validateMessage(JsonNode messageNode) {

        //check messagefield for something
        String message = messageNode.asText();
        //make regex from malicous crap
        String pattern = "";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(message);

        if (message.length() < 1 || message.length() > 1000) {
            return "messageLength";
        } else if (m.find()) {
            //do something here!!
            return "messageFormat";

        }

        return "";
    }





    public String validateMessageFullForm(JsonNode messageNode) {

        //check messagefield for something
        String message = messageNode.asText();
        //make regex from malicous crap
        String pattern = "";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(message);

        if (message.length() > 1000) {
            return "messageLength";
        } else if (m.find()) {
            //do something here!!

        }

        return "";
    }





    public String validateDate(JsonNode dateNode) {
        Logger.warn("inside dateNode: " + dateNode);
        String date = dateNode.asText();
        String pattern = "^\\d{4}-\\d{2}-\\d{2}$";
//        (?s)^(?!\d{4}-\d{2}-\d{2}$).* -opposite
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(date);

        if (date.length() < 1 || date.length() > 10) {
            return "dateLength";
        } else if (!m.find()) {
            return "dateFormat";
        }
        return "";
    }




    public String validateTime(JsonNode timeNode) {
        Logger.warn("inside dateNode: " + timeNode);
        String time = timeNode.asText();
        String pattern = "^\\d{2}:\\d{2}$";
//        (?s)^(?!\d{4}-\d{2}-\d{2}$).* -opposite
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(time);

        if (time.length() < 1 || time.length() > 5) {
            return "timeLength";
        } else if (!m.find()) {
            return "timeFormat";
        }
        return "";
    }









    public String validatePhone(JsonNode phoneNode) {
        String phone = phoneNode.asText();
        //To do: add regex for phone numbers
                String pattern = "[^\\d+\\\\() -]";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(phone);

        if (phone.length() < 1 || phone.length() > 20) {
            return "phoneLength";
        } else if (m.find()) {
            return "phoneFormat";
        }
        return "";
    }





    public String validateMassageOption(JsonNode massageOptionNode) {
        String massageOption = massageOptionNode.asText();
        String pattern = "^\\d{2,3}$";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(massageOption);

        if (massageOption.length() < 1 || massageOption.length() > 3) {
            return "massageOptionLength";
        } else if (!m.find()) {
            return "massageOptionFormat";
        }
        return "";
    }




    public String validateMassage(JsonNode massageNode) {
        String massage = massageNode.asText();
        String pattern = "[^\\p{L}.' -]";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(massage);

        if (massage.length() < 1 || massage.length() > 100) {
            return "massageLength";
        } else if (m.find()) {
            return "massageFormat";
        }
        return "";
    }



}
