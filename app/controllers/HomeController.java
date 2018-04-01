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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeController extends Controller {

    HelperUtilityClass helperUC = new HelperUtilityClass();

    public Result singlePageApplication() {
        return ok(SPAcalledFromController.render(""));
    }

    public Result toFaceBook() {
        return redirect("http://facebook.com");
    }

    public Result adminPage() {
        return ok(calledFromRoutesAdmin.render("getSpecificQuery"));
    }

    /*
    Display Massages data in admin page
     */
    public Result getMassagesData() throws JsonProcessingException {
        JsonNode json = request().body().asJson();
        try {
            try (Connection connection = helperUC.getConnection()) {
                try (PreparedStatement preparedStatement1 = connection.prepareStatement(helperUC.getSpecificQuery(json))) {
                    JTopRootList massageList = new JTopRootList();
                    try (ResultSet data = preparedStatement1.executeQuery()) {

                        while (data.next()) {
                            massageList.add(new MassageInfo(data.getInt(1), data.getString(3), data.getString(2), data.getString(4),
                                    data.getString(5), data.getString(6), data.getString(7)));
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
        String query = HelperUtilityClass.getEnvVar("TABLE_PRICES");

        try {
            try (Connection connection = helperUC.getConnection()) {
                try (PreparedStatement preparedStatement1 = connection.prepareStatement(query)) {
                    JTopRootList pricesList = new JTopRootList();
                    try (ResultSet data = preparedStatement1.executeQuery()) {

                        while (data.next()) {
                            pricesList.add(new PricesInfo(data.getString(2), data.getString(3), data.getString(4)));
                        }
                        JRootKeysToGetArrays topKey = new JRootKeysToGetArrays();
                        topKey.setPricesInfo(pricesList);
                        String response = helperUC.initializeObjectMapper().writeValueAsString(topKey);
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
                            dataToBeSentToFE.add(dataFromDB(resultSet, HelperUtilityClass.fullFormNames));
                        }
                        topKey.setFullFormSubmit(dataToBeSentToFE);
                        String out = helperUC.initializeObjectMapper().writeValueAsString(topKey);
                        Logger.warn("out:" +out);
                        return ok(out);
                    }
                }
            }
        } catch (SQLException e) {
            Logger.debug("SQL exception while getting admin data...", e);
            return badRequest("Getting admin client data went wrong");
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
