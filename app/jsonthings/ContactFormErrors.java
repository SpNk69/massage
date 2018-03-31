package jsonthings;


import java.util.HashMap;
import java.util.Map;

public class ContactFormErrors{

    private String name;
    private String email;
    private String message;
    private String captcha;

    public ContactFormErrors(String name, String email, String message, String captcha) {
        this.name = name;
        this.email = email;
        this.message = message;
        this.captcha = captcha;
    }
    public ContactFormErrors(Map<String,String> params, String captcha){
        this.name=params.get("name");
        this.email=params.get("email");
        this.message=params.get("message");
        this.captcha=captcha;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
}
