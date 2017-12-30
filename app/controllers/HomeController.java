package controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.jdbc.Connection;
import jsonthings.*;
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
import views.html.*;

import javax.inject.Inject;
import java.io.IOException;
import java.sql.*;


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
        return ok(germanPagrindinis.render("", userForm));
    }

    public Result russianVersion() {
        Form<ContactFormDataRU> userForm = formFactory.form(ContactFormDataRU.class).bindFromRequest();

        return ok(russianPagrindinis.render("", userForm));
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
        return redirect("/lt#klausk");
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
        return redirect("/ru#bonpoc");
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
        return redirect("/#fragen");
    }




    public Result testing() {
        return ok(calledFromRoutes.render("x"));
    }

    public Result adminPage() {
        return ok(calledFromRoutesAdmin.render("x"));
    }


    private ResultSet prepareStatementSelectAll(Connection con, String query) throws SQLException {

        PreparedStatement preparedStatement = con.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        return resultSet;
    }
    private ObjectMapper initializeObjectMapper(){
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }

//good
    public Result getMassagesData() throws IOException {

        try (com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/play", "root", "root")) {
            JTopRootList massageList = new JTopRootList();
            String query="SELECT * FROM play.massageInfo";
            // reassignment - shorter name for now
           ResultSet data= prepareStatementSelectAll(connection,query);

            while (data.next()) {
                massageList.add(new JEntryMassagePriceLength(data.getString(2), data.getDouble(3), data.getInt(4)));
            }

            JRootKeysToGetArrays topKey = new JRootKeysToGetArrays();
            topKey.setMassageInfo(massageList);

            String serializedData = initializeObjectMapper().writeValueAsString(topKey);

            return ok(serializedData);
        } catch (SQLException e) {
            e.printStackTrace();
            return badRequest("Shit Happened");
        }
    }


    public Result getAdminClientData() throws SQLException, IOException {

        try (com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/play", "root", "root")) {

            Logger.warn("IN THE GETADMIN: ");
            JTopRootList jTopRootList = new JTopRootList();
            String query = "SELECT * from play.fullReservationForm";
            ResultSet data = prepareStatementSelectAll(connection,query);
            while (data.next()) {
                jTopRootList.add(new JFullFormSubmit(data.getString("name")
                            ,data.getString("surname"),data.getString("email"),data.getString("phone"),data.getString("massage"),
                            data.getString("date"),data.getString("time"),data.getString("message")));
            }

            JRootKeysToGetArrays topKey = new JRootKeysToGetArrays();
            topKey.setFullFormSubmit(jTopRootList);
            String out = initializeObjectMapper().writeValueAsString(topKey);

            return ok(out);

        } catch (SQLException e) {
            e.printStackTrace();
            return badRequest("asd");
        }

    }


}
