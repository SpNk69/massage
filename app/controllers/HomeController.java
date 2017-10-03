package controllers;

import play.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
import play.mvc.Controller;
import play.mvc.Result;
import views.formdata.ContactFormData;
import views.formdata.ContactFormDataDE;
import views.formdata.ContactFormDataRU;
import views.html.germanPagrindinis;
import views.html.pagrindinis;
import views.html.russianPagrindinis;

import javax.inject.Inject;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */


    @Inject
    FormFactory formFactory;
    @Inject
    MailerClient mailerClient;


    public Result pagrindinisLT() {
        Form<ContactFormData> userForm = formFactory.form(ContactFormData.class).bindFromRequest();
        return ok(pagrindinis.render("", userForm));
    }

    public Result germanVersion() {

        Form<ContactFormDataDE> userForm = formFactory.form(ContactFormDataDE.class).bindFromRequest();
        return ok(germanPagrindinis.render("",userForm));
    }

    public Result russianVersion() {
        Form<ContactFormDataRU> userForm = formFactory.form(ContactFormDataRU.class).bindFromRequest();

        return ok(russianPagrindinis.render("",userForm));
    }

    public Result toFaceBook() {
        return redirect("http://facebook.com");
    }


    private String cleanUp(String input) {
        return input.replaceAll("[^\\w ]+", "");
    }

    public Result submitLT() {
        Form<ContactFormData> userForm = formFactory.form(ContactFormData.class).bindFromRequest();
        try {

            Logger.info("UserFormLT: " + userForm.get().toString());
        } catch (IllegalStateException e) {
            return badRequest(views.html.pagrindinis.render("", userForm));
        }
        //TO DO: Make email content look better
        Email email = new Email().setFrom(userForm.get().getEmail())
                .addTo("info@vidamassage.ch")
                .setBodyText("Vardas: " + cleanUp(userForm.get().getFirstName()) +
                        "\n" + "Email: " + userForm.get().getEmail() +
                        "\n Zinute: " + cleanUp(userForm.get().getTextbox()));
        mailerClient.send(email);


        flash("success", "Ačiū už klausimą! Susisieksime kai tik galėsime.");
        return redirect("lt#klausk");
    }
    public Result submitRU() {
        Form<ContactFormDataRU> userForm = formFactory.form(ContactFormDataRU.class).bindFromRequest();
        try {

            Logger.info("UserFormRU: " + userForm.get().toString());
        } catch (IllegalStateException e) {
            return badRequest(views.html.russianPagrindinis.render("", userForm));
        }
        //TO DO: Make email content look better
        Email email = new Email().setFrom(userForm.get().getEmail())
                .addTo("info@vidamassage.ch")
                .setBodyText("Vardas: " + cleanUp(userForm.get().getFirstName()) +
                        "\n" + "Email: " + userForm.get().getEmail() +
                        "\n Zinute: " + cleanUp(userForm.get().getTextbox()));
        mailerClient.send(email);


        flash("success", "Спасибо за вопрос! Мы свяжемся с вами, как только сможем.");
        return redirect("ru#bonpoc");
    }

    public Result submitDE() {
        Form<ContactFormDataDE> userForm = formFactory.form(ContactFormDataDE.class).bindFromRequest();
        try {

            Logger.info("UserFormDE: " + userForm.get().toString());
        } catch (IllegalStateException e) {
            return badRequest(views.html.germanPagrindinis.render("", userForm));
        }
        //TO DO: Make email content look better
        Email email = new Email().setFrom(userForm.get().getEmail())
                .addTo("info@vidamassage.ch")
                .setBodyText("Vardas: " + cleanUp(userForm.get().getFirstName()) +
                        "\n" + "Email: " + userForm.get().getEmail() +
                        "\n Zinute: " + cleanUp(userForm.get().getTextbox()));
        mailerClient.send(email);


        flash("success", "Vielen Dank für die Frage! Wir werden uns so schnell wie möglich mit Ihnen in Verbindung setzen.");
        return redirect("#fragen");
    }



}
