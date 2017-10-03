package views.formdata;


import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import play.data.validation.Constraints;

import javax.validation.constraints.NotNull;

/**
 * Created by alex on 2017-09-09.
 */

@Constraints.Validate
public class ContactFormDataRU implements Constraints.Validatable<String> {
    @NotNull
    @NotBlank(message = "Имя не введено")
    private String firstName=" XXX";
    @Email(message = "Неправильный адрес электронной почты")
    @NotBlank(message = "Не введено электронное письмо")
    private String email="jano@one.lt";
    @NotBlank(message = "Сообщение не введено")
    private String textbox="Lalalalaa";

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTextbox() {
        return textbox;
    }

    public void setTextbox(String textbox) {
        this.textbox = textbox;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String validate() {

        return null;
    }




}