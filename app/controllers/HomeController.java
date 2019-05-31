package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.mysql.jdbc.Connection;
import dataholders.*;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.With;
import views.html.*;

import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@With(ForceHttps.class)
public class HomeController extends Controller {

    HelperUtilityClass helperUC = new HelperUtilityClass();

    public Result singlePageApplication() {
        return ok(SPAcalledFromController.render(""));
    }

    public Result toFaceBook() {
        return redirect("https://www.facebook.com/Vida-Massage-Schweiz-644545529337602/?modal=admin_todo_tour");
    }

    public Result adminPage() {
        return ok(calledFromRoutesAdmin.render(""));
    }

    /**
     * Method for fetching data from DB related to Massage data, such as name, code, price and etc.
     *
     * @return response with data
     * @throws JsonProcessingException
     */
    public Result getMassagesData() throws JsonProcessingException {
        JsonNode json = request().body().asJson();
        try {
            try (Connection connection = helperUC.getConnection()) {
                try (PreparedStatement preparedStatement1 = connection.prepareStatement(helperUC.getSpecificQuery(json))) {
                    JsonDataArrayFromBeToFe massageList = new JsonDataArrayFromBeToFe();
                    try (ResultSet data = preparedStatement1.executeQuery()) {

                        while (data.next()) {
                            massageList.add(new MassageInfo(data.getInt(1), data.getString(3), data.getString(2), data.getString(4),
                                    data.getString(5), data.getString(6), data.getString(7),data.getString(8)));
                        }
                        String response = helperUC.initializeObjectMapper().writeValueAsString(massageList);
                        Logger.debug("Getting massageData...");

                        return ok(response);
                    }
                }
            }
        } catch (SQLException e) {
            Logger.debug("GetMassageData went wrong... {}", e);
            return badRequest("Failed while getting MassagesData");
        }
    }

    /**
     * Method for fetching massages prices and code
     *
     * @return response with data
     * @throws JsonProcessingException
     */
    public Result getPrices() throws JsonProcessingException {
        String query = HelperUtilityClass.getEnvVar("TABLE_PRICES");

        try {
            try (Connection connection = helperUC.getConnection()) {
                try (PreparedStatement preparedStatement1 = connection.prepareStatement(query)) {
                    JsonDataArrayFromBeToFe pricesList = new JsonDataArrayFromBeToFe();
                    try (ResultSet data = preparedStatement1.executeQuery()) {

                        while (data.next()) {
                            pricesList.add(new PricesInfo(data.getString(2), data.getString(3), data.getString(4)));
                        }
                        String response = helperUC.initializeObjectMapper().writeValueAsString(pricesList);
                        Logger.debug("Getting prices for massages...");

                        return ok(response);
                    }
                }
            }
        } catch (SQLException e) {
            Logger.debug("Getting prices went wrong... ", e);
            return badRequest("Failed while getting prices");
        }
    }

    /**
     * Method for getting clients data for adminPage
     *
     * @return - response with data
     * @throws JsonProcessingException
     */
    public Result getAdminClientData() throws JsonProcessingException {
        String query = HelperUtilityClass.getEnvVar("ADMIN_DATA");
        try {
            try (Connection connection = helperUC.getConnection()) {
                JsonDataArrayFromBeToFe fullFormDataForFE = new JsonDataArrayFromBeToFe();
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    try (ResultSet resultSet = preparedStatement.executeQuery()) {

                        while (resultSet.next()) {
                            fullFormDataForFE.add(dataFromDB(resultSet, HelperUtilityClass.fullFormNames));
                        }
                        String response = helperUC.initializeObjectMapper().writeValueAsString(fullFormDataForFE);
                        Logger.debug("Getting bookingForm data for adminPage...");

                        return ok(response);
                    }
                }
            }
        } catch (SQLException e) {
            Logger.debug("SQL exception while getting adminData data... {}", e);
            return badRequest("Getting adminData client data went wrong");
        }
    }

    // Fetch data from DB for bookingForm
    private Map dataFromDB(ResultSet rs, List<String> list) {
        Map<String, String> map = new HashMap<>();
        for (String item : list) {
            try {
                map.put(item, rs.getString(item).replace("\"", ""));
            } catch (SQLException e) {
                Logger.debug("ResultSet failed while fetching from DB...", e);
            }
        }
        return map;
    }
}
