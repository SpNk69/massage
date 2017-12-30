package jsonthings;

import java.util.Date;

/**
 * Created by alex on 2017-12-24.
 */
public class JFullFormSubmit {


    private String name;
    private String surname;
    private String email;
    private String phone;
    private String massage;
    private String date;
    private String time;
    private String message;

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public JFullFormSubmit(String name, String surname, String email, String phone,String massage, String date, String time, String message) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.massage=massage;
        this.date = date;
        this.time = time;
        this.message = message;
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

    @Override
    public String toString() {
        return "JFullFormSubmit{" +
                "massageName='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", massage='" + massage + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
