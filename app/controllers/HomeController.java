package controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.jdbc.Connection;
import jsonthings.*;
import play.Logger;
import play.data.FormFactory;
import play.libs.mailer.Email;
import play.libs.mailer.MailerClient;
import play.mvc.Controller;
import play.mvc.Result;
import validation.ValidationUtility;
import views.html.*;

import javax.inject.Inject;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;
import java.util.HashMap;
import java.util.concurrent.CompletionStage;

import play.libs.ws.*;



/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller implements WSBodyReadables, WSBodyWritables {

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

    ValidationUtility validationHelper = new ValidationUtility();

    private final WSClient ws;

    @Inject
    public HomeController(WSClient ws) {
        this.ws = ws;
    }



    public Result pagrindinisLTTEST() {
        return ok(pagrindinisTEST.render(""));
    }


    public Result toFaceBook() {
        return redirect("http://facebook.com");
    }





    public Result testing() {
        return ok(calledFromRoutes.render("x"));
    }

    public Result adminPage() {
        return ok(calledFromRoutesAdmin.render("x"));
    }


    private ResultSet prepareStatementSelectAll(Connection con, String query) throws SQLException {

        PreparedStatement preparedStatement = con.prepareStatement(query);
        return preparedStatement.executeQuery();
    }

    private ObjectMapper initializeObjectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }

    //good
    public Result getMassagesData() throws IOException, URISyntaxException, SQLException {

//        try (com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/play", "root", "root")) {

        Connection connection = null;
        ResultSet data = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://eu-cdbr-west-02.cleardb.net/heroku_e3d8ce5aa92835f?useUnicode=yes&characterEncoding=UTF-8", "b2945c551737ae", "809360b3");

            Logger.warn("CONNECT" + connection.toString());
            JTopRootList massageList = new JTopRootList();
            String query = "SELECT * FROM heroku_e3d8ce5aa92835f.massageinfo;";
            preparedStatement = connection.prepareStatement(query);
            // reassignment - shorter name for now
//           data= prepareStatementSelectAll(connection,query);
            data = preparedStatement.executeQuery();

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
        } finally {

            if (data != null) {
                try {
                    data.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
    }


    public Result getAdminClientData() throws SQLException, IOException, URISyntaxException {


        Connection connection = null;
        ResultSet rs1 = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs2 = null;
        String query = "SELECT * from heroku_e3d8ce5aa92835f.fullreservationform";

        try {
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://eu-cdbr-west-02.cleardb.net/heroku_e3d8ce5aa92835f?useUnicode=yes&characterEncoding=UTF-8", "b2945c551737ae", "809360b3");
            JTopRootList jTopRootList = new JTopRootList();

//            preparedStatement=connection.prepareStatement(query);

            rs1 = prepareStatementSelectAll(connection, query);


//            data = prepareStatementSelectAll(connection,query);

            while (rs1.next()) {
                jTopRootList.add(new JFullFormSubmit(rs1.getString("name")
                        , rs1.getString("surname"), rs1.getString("email"), rs1.getString("phone"), rs1.getString("massage"), rs1.getString("massageOption"),
                        rs1.getString("date"), rs1.getString("time"), rs1.getString("message")));
            }

            JRootKeysToGetArrays topKey = new JRootKeysToGetArrays();
            topKey.setFullFormSubmit(jTopRootList);
            String out = initializeObjectMapper().writeValueAsString(topKey);


            // additional implementation to read database max size of each type of table
            rs2 = prepareStatementSelectAll(connection, "SHOW FIELDS FROM  heroku_e3d8ce5aa92835f.fullreservationform;");
            String rx = null;
            String ry = null;
            HashMap<String, String> hashMap = new HashMap<>();
            while (rs2.next()) {

                rx = rs2.getString(2);
                ry = rs2.getString(1);
                Logger.warn("STUFF : " + ry + " " + rx);

                hashMap.put(ry, rx);
            }

//            list2.forEach(x->{Logger.warn(x.replaceAll("\\D+",""));});

            HashMap<String, String> anotherMap = new HashMap<>();
            hashMap.forEach((x, y) -> {
                anotherMap.put(x,
                        y.replaceAll("\\D+", ""));
            });
            anotherMap.forEach((x, y) -> Logger.warn("MAP : " + x + " " + y));


            return ok(out);

        } catch (SQLException e) {
            e.printStackTrace();
            return badRequest("asd");
        } finally {

            if (rs1 != null) {
                try {
                    rs1.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


            if (rs2 != null) {
                try {
                    rs2.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }



    private void deliverEmail(JsonNode name, JsonNode email, JsonNode message) {
        Email readyEmail = new Email().setSubject("Klausimas")
                .setFrom("info@vidamassage.ch")
                .addTo("info@vidamassage.ch")
                .setBodyText("Vardas: " + name.asText() +
                        "\n" + "Email: " + email.asText() +
                        "\n" + "Zinute: " + message.asText());
        mailerClient.send(readyEmail);

    }


    private String prepareResponse(ContactFormErrors form) throws JsonProcessingException {
        JTopRootList jTopRootList = new JTopRootList();
        JRootKeysToGetArrays topKey = new JRootKeysToGetArrays();
        jTopRootList.add(form);
        topKey.setContactFormErrors(jTopRootList);
        return initializeObjectMapper().writeValueAsString(topKey);
    }


    public Result sendEmail() throws IOException {

        JsonNode json = request().body().asJson();

        JsonNode nameNode = json.findPath("name");
        JsonNode emailNode = json.findPath("email");
        JsonNode messageNode = json.findPath("message");
        JsonNode captchaNode = json.findPath("captcha");

        String nameER = validationHelper.validateName(nameNode);
        String emailER = validationHelper.validateEmail(emailNode);
        String messageER = validationHelper.validateMessage(messageNode);
        String captchaER = "";

        String response;

        if (nameER.equalsIgnoreCase("") && emailER.equalsIgnoreCase("") && messageER.equalsIgnoreCase("")) {
            Logger.warn("HAPPENED IN IF");

            captchaER = captchaValidation2(captchaNode);
            if (!captchaER.equalsIgnoreCase("")) {
                response = prepareResponse(new ContactFormErrors(nameER, emailER, messageER, captchaER));
                Logger.warn("Happened in IF IF ");
                return badRequest(response);
            }

            deliverEmail(nameNode, emailNode, messageNode);
            response = prepareResponse(new ContactFormErrors(nameER, emailER, messageER, captchaER));

            return ok(response);

        } else if (!nameER.equalsIgnoreCase("") || !emailER.equalsIgnoreCase("") || !messageER.equalsIgnoreCase("")) {
            Logger.warn("Happened in ELSE IF ");
            response = prepareResponse(new ContactFormErrors(nameER, emailER, messageER, captchaER));
            return badRequest(response);
        }

        return badRequest("Something absolutely went wrong");
    }


    protected String captchaValidation2(JsonNode captcha) {
        String x = captcha.asText();
        String urlTo = "https://www.google.com/recaptcha/api/siteverify";
        Logger.warn("BEFORE REQUEST");
        WSRequest request = ws.url(urlTo);
        Logger.warn("AFTER REQUEST");

        request.addQueryParameter("secret", "6Lfg2z8UAAAAACiagKKEsYHfi0RdFce0HQf9XLfo");
        request.addQueryParameter("response", x);
//        CompletionStage jsonPromise = ws.url(urlTo).setContentType("application/x-www-form-urlencoded; charset=utf-8").post("secret=6Lfg2z8UAAAAACiagKKEsYHfi0RdFce0HQf9XLfo&response=" + x).thenApply(WSResponse::asJson);
        CompletionStage<WSResponse> responsePromise = request.post("x");
        CompletionStage<JsonNode> jsonPromise = responsePromise.thenApply(WSResponse::asJson);
        JsonNode jsonData = jsonPromise.toCompletableFuture().join();
        String answer = jsonData.findPath("success").asText();
        Logger.warn("CAPTCHA: " + answer);
        Logger.warn("BEFORE CAPTCHA VALIDATION");

        if (!answer.equalsIgnoreCase("true")) {
            return "captchaNotSolved";
        }
        return "";
    }


    private static Connection getConnection() throws URISyntaxException, SQLException {
        URI dbUri = new URI(System.getenv("CLEARDB_DATABASE_URL"));

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:mysql://" + dbUri.getHost() + dbUri.getPath();
//
//        String dbUrl="eu-cdbr-west-02.cleardb.net/heroku_e3d8ce5aa92835f?reconnect=true";
//        String password ="809360b3";
//        String username="b2945c551737ae";

        Logger.warn("dbUrl: " + dbUrl);
        Logger.warn("password: " + password);
        Logger.warn("username: " + username);

        return (Connection) DriverManager.getConnection(dbUrl, username, password);
    }


}
