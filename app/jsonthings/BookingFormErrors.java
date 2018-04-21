package jsonthings;

import java.util.Map;

/**
 * Created by alex on 2017-12-24.
 */
public class BookingFormErrors {

    private String name;
    private String surname;
    private String email;
    private String phone;
    private String massage;
    private String massageOption;
    private String date;
    private String time;
    private String message;
    private String captcha;

    public BookingFormErrors(Map<String, String> params, String captcha) {
        this.name = params.get("name");
        this.surname = params.get("surname");
        this.email = params.get("email");
        this.phone = params.get("phone");
        this.massage = params.get("massage");
        this.massageOption = params.get("massageOption");
        this.date = params.get("date");
        this.time = params.get("time");
        this.message = params.get("message");
        this.captcha = captcha;
    }

    public String getCaptcha() {
        return captcha;
    }

    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public String getMassageOption() {
        return massageOption;
    }

    public void setMassageOption(String massageOption) {
        this.massageOption = massageOption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
