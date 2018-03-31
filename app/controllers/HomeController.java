package controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
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




    public Result singlePageApplication() {
        return ok(SPAcalledFromController.render(""));
    }


    public Result toFaceBook() {
        return redirect("http://facebook.com");
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











}
