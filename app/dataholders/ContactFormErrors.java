package dataholders;

import common.Constants;

import java.util.Map;

public class ContactFormErrors {

    private String name;
    private String email;
    private String message;
    private String captcha;

    public ContactFormErrors(Map<String, String> params, String captcha) {
        this.name = params.get(Constants.NAME);
        this.email = params.get(Constants.EMAIL);
        this.message = params.get(Constants.MESSAGE);
        this.captcha = captcha;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }

    public String getCaptcha() {
        return captcha;
    }
}
