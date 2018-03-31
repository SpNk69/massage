package controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mysql.jdbc.Connection;
import jsonthings.*;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


    private static final List<String> fullFormNames = Arrays.asList("name", "surname", "email", "phone", "massage", "massageOption", "date", "time", "message");


    HelperUtilityClass helperUC = new HelperUtilityClass();


    public Result singlePageApplication() {
        return ok(SPAcalledFromController.render(""));
    }


    public Result toFaceBook() {
        return redirect("http://facebook.com");
    }


    public Result adminPage() {
        return ok(calledFromRoutesAdmin.render("x"));
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


    private Map dataFromDB(ResultSet rs, List<String> list) {
        Map<String, String> map = new HashMap<>();
        for (String item : list) {
            try {
                map.put(item, rs.getString(item));
            } catch (SQLException e) {
                Logger.debug("ResultSet failed while fetching from DB...", e);
            }
        }
        return map;
    }

    public Result getAdminClientData() throws JsonProcessingException {
        String query= HelperUtilityClass.getEnvVar("ADMIN_DATA");
        try {
            try (Connection connection = helperUC.getConnection()) {
                JTopRootList dataToBeSentToFE = new JTopRootList();
                JRootKeysToGetArrays topKey = new JRootKeysToGetArrays();
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    try (ResultSet resultSet = preparedStatement.executeQuery()) {
                        while (resultSet.next()) {
                            dataToBeSentToFE.add(dataFromDB(resultSet, fullFormNames));
                        }
                        topKey.setFullFormSubmit(dataToBeSentToFE);
                        String out = initializeObjectMapper().writeValueAsString(topKey);
                        return ok(out);
                    }
                }
            }
        } catch (SQLException e) {
            Logger.debug("SQL exception while getting admin data...",e);
            return badRequest("Stuff went wrong");
        }

    }

}
