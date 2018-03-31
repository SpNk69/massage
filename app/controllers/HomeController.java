package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
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

    /*
    Display Massages data in admin page
     */
    public Result getMassagesData() throws JsonProcessingException {

        String query = HelperUtilityClass.getEnvVar("MASSAGES_DATA");

        try {
            try (Connection connection = helperUC.getConnection()) {
                try (PreparedStatement preparedStatement1 = connection.prepareStatement(query)) {
                    JTopRootList massageList = new JTopRootList();
                    try (ResultSet data = preparedStatement1.executeQuery()) {

                        while (data.next()) {
                            massageList.add(new JEntryMassagePriceLength(data.getString(2), data.getDouble(3), data.getInt(4)));
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
