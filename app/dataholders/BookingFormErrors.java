package dataholders;

import common.Constants;

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
        this.name = params.get(Constants.NAME);
        this.surname = params.get(Constants.SURNAME);
        this.email = params.get(Constants.EMAIL);
        this.phone = params.get(Constants.PHONE);
        this.massage = params.get(Constants.MASSAGE);
        this.massageOption = params.get(Constants.MASSAGE_OPTION);
        this.date = params.get(Constants.DATE);
        this.time = params.get(Constants.TIME);
        this.message = params.get(Constants.MESSAGE);
        this.captcha = captcha;
    }

    public String getCaptcha() {
        return captcha;
    }

    public String getMassage() {
        return massage;
    }

    public String getMassageOption() {
        return massageOption;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getMessage() {
        return message;
    }


}
