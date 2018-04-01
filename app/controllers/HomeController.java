package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.mysql.jdbc.Connection;
import jsonthings.*;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import java.sql.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeController extends Controller {

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


    private String x(JsonNode json) {
        String meh;
        switch (json.asText()) {
            case "lt":
                meh = "SELECT * FROM heroku_e3d8ce5aa92835f.massagelt;";
                break;
            case "de":
                meh = "SELECT * FROM heroku_e3d8ce5aa92835f.massagede;";
                break;
            case "ru":
                meh = "SELECT * FROM heroku_e3d8ce5aa92835f.massageru;";
                break;
            default:
                throw new IllegalArgumentException("No such language");
        }
        return meh;
    }

    /*
    Display Massages data in admin page
     */
    public Result getMassagesData() throws JsonProcessingException {
        String query = HelperUtilityClass.getEnvVar("MASSAGES_DATA");

        JsonNode json = request().body().asJson();

        try {
            try (Connection connection = helperUC.getConnection()) {
                try (PreparedStatement preparedStatement1 = connection.prepareStatement(x(json))) {
                    JTopRootList massageList = new JTopRootList();
                    try (ResultSet data = preparedStatement1.executeQuery()) {

                        while (data.next()) {
                            massageList.add(new MassageInfo(data.getInt(1), data.getString(3), data.getString(2), data.getString(4),
                                    data.getString(5),data.getString(6),data.getString(7)));
                        }
                        JRootKeysToGetArrays topKey = new JRootKeysToGetArrays();
                        topKey.setMassageInfo(massageList);

                        String response = helperUC.initializeObjectMapper().writeValueAsString(topKey);
                        return ok(response);
                    }
                }
            }
        } catch (SQLException e) {
            Logger.debug("GetMassageData went wrong... ", e);
            return badRequest("Failed while getting MassagesData");
        }
    }


    /*
Display Massages data in admin page
 */
    public Result getPrices() throws JsonProcessingException {
        String query = "SELECT * FROM heroku_e3d8ce5aa92835f.prices;";

        try {
            try (Connection connection = helperUC.getConnection()) {
                try (PreparedStatement preparedStatement1 = connection.prepareStatement(query)) {
                    JTopRootList pricesList = new JTopRootList();
                    try (ResultSet data = preparedStatement1.executeQuery()) {

                        while (data.next()) {
                            Logger.warn("SUP1 " + data.getString(2));
                            Logger.warn("SUP2 " +data.getString(3));
                            Logger.warn("SUP3 " +data.getString(4));

                            pricesList.add(new PricesInfo(data.getString(2),data.getString(3),data.getString(4)));

                        }
                        JRootKeysToGetArrays topKey = new JRootKeysToGetArrays();
                        topKey.setPricesInfo(pricesList);

                        String response = helperUC.initializeObjectMapper().writeValueAsString(topKey);
                        Logger.warn("RESPONSE BACK: " + response);
                        return ok(response);
                    }
                }
            }
        } catch (SQLException e) {
            Logger.debug("Getting prices went wrong... ", e);
            return badRequest("Failed while getting prices");
        }
    }


    /*
    Display clients in admin page
     */
    public Result getAdminClientData() throws JsonProcessingException {
        String query = HelperUtilityClass.getEnvVar("ADMIN_DATA");
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
                        String out = helperUC.initializeObjectMapper().writeValueAsString(topKey);
                        return ok(out);
                    }
                }
            }
        } catch (SQLException e) {
            Logger.debug("SQL exception while getting admin data...", e);
            return badRequest("Stuff went wrong");
        }

    }

    /*
    Fetch data from db
     */
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

}
