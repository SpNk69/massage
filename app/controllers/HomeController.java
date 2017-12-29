package controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.mysql.jdbc.JDBC4PreparedStatement;
import jsonthings.*;
import play.Logger;
import play.data.Form;
import play.data.FormFactory;
import play.libs.Json;
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
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
    private final ObjectMapper objectMapper = new ObjectMapper();

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

    List<String> myList = new ArrayList();


    public List<String> getMyList() {
        return myList;
    }

    private void init() {
        myList.add("One");
        myList.add("Two");
        myList.add("Three");
    }

    public void setMyList(String myList) {
        this.myList.add(myList);
    }

    private boolean isItHere(String item) {
        return getMyList().contains(item);
    }

    private String getExactElement(List toCheck, String against) {
        for (Object item : toCheck) {
            if (item.equals(against)) {
                return against;
            }
//            element =item.equals(against) ? against : "";

        }
        return "";
    }

    private void addElement(String item) {
        myList.add(item);
    }

    private String returnLast() {
        return myList.get(-1);
    }

    private List<String> getAll() {
        return myList;


    }

    private int getSize() {
        return myList.size() - 1;
    }

    // after recompile, data added is gone ofcourse
    public Result myPage(String b) {
        if (b.equals("load")) {
            init();
            return ok(Json.toJson(getAll()));
        }
        if (isItHere(b)) {
            getExactElement(getMyList(), b);
//            return ok(Json.toJson("name: Jack, surname: Daniels"));
            return ok(Json.toJson(getExactElement(getMyList(), b)));
        } else if (b.equals("all")) {
            return ok(Json.toJson(getAll()));

        } else {
            addElement(b);
//            return ok(Json.toJson(setMyList(b)));
            return badRequest("Element was not found, but now added to the list: " + myList.get(getSize()));
        }
    }

    //    public Result connection()  {
////        DriverManager.getConnection("127.0.0.1:3306/play");
//        try (com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/play", "root", "root")) {
//            System.out.println("Database connected!");
//            return ok(Json.toJson("Got Connection"));
////            return ok(Json.toJson(connection.clientPrepareStatement("USE play; SHOW tables;").executeQuery()));
//
//
//        } catch (SQLException e) {
//            throw new IllegalStateException("Cannot connect the database!", e);
//        }
//
//        //        db.getConnection().createStatement().execute("show tables;");
//
//    }
    public Result testing() {
        return ok(calledFromRoutes.render("x"));
    }
    public Result adminPage() {
        return ok(calledFromRoutesAdmin.render("x"));
    }

    public Result addToDatabase(String lastName, String firstName, String age) {

        if (true) {
            try (com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/play", "root", "root")) {
                int xx = connection.createStatement().executeUpdate("INSERT INTO Persons (LastName,FirstName,Age) VALUES('" + lastName + "','" + firstName + "','" + age + "');");
                return ok(Json.toJson("Added"));
            } catch (SQLException e) {
                return badRequest("Something went wronggggggg");
                //throw new IllegalStateException("Cannot connect the database!", e);
            }
        } else {
            return badRequest("Something went wronggggggg");
        }

    }
//    public Result getFromDatabase(String name){
//        try (com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/play", "root", "root")) {
//            int xx = connection.createStatement().executeQuery("SELECT LastName from Persons ('" + name + "');");
//            return ok(Json.toJson("Added"));
//        } catch (SQLException e) {
//            return badRequest("Something went wronggggggg");
//            //throw new IllegalStateException("Cannot connect the database!", e);
//        }}else {
//        return badRequest("Something went wronggggggg");
// select LastName  from Persons where FirstName='no';

//    }


    public Result doIt() throws IOException {
        JsonNode json = request().body().asJson();
        JsonNode json2 = request().body().asJson();
        JsonNode json3 = request().body().asJson();
//        JsonNode tree = objectMapper.readTree(request().body().);
        Logger.warn("FULL JSON: " + json);
        ObjectNode result = Json.newObject();
        result.put("vardas", "gaidys");

        // va taip naxui kurva
        Logger.warn("ASILAS: " + json.findPath("CustomerID"));
        Logger.warn("durnsvisai: " + json.findPath("CompanyName"));
        Logger.warn("durnsvisai: " + json.findPath("CompanyName"));
        Logger.warn("PIDER: " + json.findPath("GetAllCustomersResult").get(1));
        Logger.warn("PIDER: " + json.findPath("GetAllCustomersResult").get(2).get("CustomerID"));


        Logger.warn("FULL STUFF: " + json.findPath("Date").getNodeType());

//        Iterator<String> fieldNames = json2.fieldNames();
//        while (fieldNames.hasNext()) {
//            String fieldName = fieldNames.next();
//            Logger.warn("GO > " + fieldName);
//        }
//        Logger.warn("STFF3: "     +    json3.asText());
//        Logger.warn("STFF1: "     +    json);

        // "name" is not a json key... more like schemas' names, attributes or w/e
//        Logger.warn("The fuck: " + json.findPath("name"));


        String name = json.findPath("name").textValue();
        Logger.warn("FUCK THAT: " + name);
        if (name == null) {
            return badRequest("Missing parameter [name]");
        } else {
            try (com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/play", "root", "root")) {

                ResultSet xx = connection.createStatement().executeQuery("SELECT * from Persons where FirstName=('" + name + "');");
                String yyy = null;
                String yyy1 = null;
                int yyy2 = 0;
                while (xx.next()) {
                    String sup = xx.getString("LastName");
                    String sup1 = xx.getString("Age");
                    int sup2 = xx.getInt("ID");

                    yyy = sup;
                    yyy1 = sup1;
                    yyy2 = sup2;
                }


                return ok("Hello " + name + " fuck " + yyy + " age : " + yyy1 + " id: " + yyy2 + " THE FUCK: " + result);
            } catch (SQLException e) {
                e.printStackTrace();
                return badRequest("asd");
            }
        }
    }


    public Result massageList() throws IOException {

        JTopRootList l = new JTopRootList();
        JTopRootList l2 = new JTopRootList();

        try (com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/play", "root", "root")) {
//should be double instead of float
//            ResultSet ss = connection.createStatement().executeQuery("SELECT COUNT(*) FROM play.MassageList;");
            PreparedStatement xs = connection.prepareStatement("INSERT INTO play.massageListTest (massageName, price) " + "VALUES " + "(?,"+" ?);");
            xs.setString(1,"KojuPeduLala");
            xs.setFloat(2,120);
            Logger.warn("NU KAS VYKSTA ? : " + ((JDBC4PreparedStatement)xs).asSql());
            xs.execute();


            ResultSet ss = connection.createStatement().executeQuery("SELECT * FROM play.massageList2;");

            while (ss.next()) {//get stuff
                l.add(new JEntryMassageAndPrices(ss.getString(2),ss.getString(3)));


            }



            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);


            //JsonNode node = objectMapper.readValue(message, JsonNode.class);



//            l.add(new JEntryMassageAndPrices());



            JRootKeysToGetArrays r = new JRootKeysToGetArrays();

            l2.add(new JEntryLeTesto("PIDERIENA","DUXIENA"));


//            r.setName("rootName");

            r.setMassageListAndPrices(l);
            r.setLeTesto(l2);



            String out = objectMapper.writeValueAsString(r);

            System.out.println(out);


            JRootKeysToGetArrays in = objectMapper.readValue(out, JRootKeysToGetArrays.class);


            System.out.println("STUFF -> " + in);
            System.out.println("STUFF2 -> " + out);


                return ok(Json.toJson(in));
        } catch (SQLException e) {
            e.printStackTrace();
            return ok("yep");


        }


    }



    public Result submitFullForm() {
        JsonNode json = request().body().asJson();
        Logger.warn("THIS IS WHAT I GOT: " + json);
        Logger.warn("nameito1: " +         json.findPath("name"));
        Logger.warn("nameito2: " +         json.findPath("date"));
        Logger.warn("nameito2: " +         json.findPath("massage"));


        try (com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/play", "root", "root")) {


            PreparedStatement xs = connection.prepareStatement("INSERT INTO play.fullform (name, surname, email, phone, massage, date, time, message)  VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)");
//            PreparedStatement xs = connection.prepareStatement("INSERT INTO play.fullform (name, surname, email, phone, massage, date, time, message) " + "VALUES " + "(" +json.findPath("name").toString()+
//            ", " +json.findPath("surname").toString()+ ", "+json.findPath("email").toString() + ", " + json.findPath("phone").toString() + ", " +json.findPath("massage").toString() + ", " + json.findPath("date").toString()+ ", "+ json.findPath("time").toString()+ ", " +json.findPath("message").toString()+");");


            xs.setString(1, String.valueOf(json.findPath("name")));


//            xs.setString(1, String.valueOf(json.findPath("name")));

            xs.setString(2, String.valueOf(json.findPath("surname")));
            xs.setString(3, String.valueOf(json.findPath("email")));
            xs.setInt(4, json.findPath("phone").asInt());
            xs.setString(5, String.valueOf(json.findPath("massage")));
            xs.setString(6, String.valueOf(json.findPath("date")));
            xs.setString(7, String.valueOf(json.findPath("time")));
            xs.setString(8, String.valueOf(json.findPath("message")));
            Logger.warn("NU KAS VYKSTA 22222222? : " + ((JDBC4PreparedStatement)xs).asSql());
            xs.execute();
            return ok("OK");
        } catch (SQLException e) {
            Logger.warn(" DAFQ : " + e);
            return badRequest("SHIT HAPPENED");

        }
    }


    public Result getAdminData() throws SQLException, IOException {

        JTopRootList l = new JTopRootList();

        try (com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/play", "root", "root")) {




            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            JTopRootList jTopRootList = new JTopRootList();
            JRootKeysToGetArrays jRootKeysToGetArrays = new JRootKeysToGetArrays();
//            ResultSet xx = connection.createStatement().executeQuery("SELECT * from play.fullform;");
            PreparedStatement preps = connection.prepareStatement("SELECT * from play.fullform;");
            ResultSet x =preps.executeQuery();
            String yyy = null;
//            String yyy1 = null;

//            int yyy2 = 0;
            while (x.next()) {
                l.add(new JFullFormSubmit(x.getString("name")
                            ,x.getString("surname"),x.getString("email"),x.getString("phone"),x.getString("massage"),
                            x.getString("date"),x.getString("time"),x.getString("message")));

//                String sup1 = xx.getString("Age");
//                int sup2 = xx.getInt("ID");
//
//                yyy = sup;
//                yyy1 = sup1;
//                yyy2 = sup2;
            }


            JRootKeysToGetArrays r = new JRootKeysToGetArrays();

            r.setFullFormSubmit(l);

            String out = objectMapper.writeValueAsString(r);

            System.out.println(out);


            JRootKeysToGetArrays in = objectMapper.readValue(out, JRootKeysToGetArrays.class);
//
//
//            jRootKeysToGetArrays.setFullFormSubmit(jTopRootList);
//            String out = objectMapper.writeValueAsString(jTopRootList);
//
//            System.out.println(out);
//
//
//            JRootKeysToGetArrays in = objectMapper.readValue(out, JRootKeysToGetArrays.class);


            return ok(out);

        } catch (SQLException e) {
            e.printStackTrace();
            return badRequest("asd");
        }

    }




}
