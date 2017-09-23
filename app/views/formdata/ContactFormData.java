package views.formdata;


import com.google.errorprone.annotations.FormatString;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.SafeHtml;
import play.Logger;
import play.api.libs.logback.LogbackLoggerConfigurator;
import play.data.validation.Constraints;
import play.filters.csrf.AddCSRFToken;
import play.filters.csrf.RequireCSRFCheck;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static sun.awt.X11.XConstants.Success;

/**
 * Created by alex on 2017-09-09.
 */

@Constraints.Validate
public class ContactFormData implements Constraints.Validatable<String> {
    @NotNull
    @NotBlank(message = "Neįvestas vardas")
    private String firstName=" XXX";
    @Email(message = "Neteisingai įvestas elektroninis paštas")
    @NotBlank(message = "Neįvestas elektroninis paštas")
    private String email="jano@one.lt";
    @NotBlank(message = "Neįvesta žinutė")
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
