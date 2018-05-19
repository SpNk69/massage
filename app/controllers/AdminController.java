package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.mysql.jdbc.Connection;
import dataholders.JsonDataArrayFromBeToFe;
import dataholders.TimeSlot;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminController extends Controller {

    HelperUtilityClass helperUC = new HelperUtilityClass();

    /**
     * Method to process data in adminPage
     *
     * @return
     * @throws SQLException
     * @throws JsonProcessingException
     */
    public Result getAdminDates() throws SQLException, JsonProcessingException {
        JsonNode json = request().body().asJson();
        String date = json.findPath("date").asText();
        Boolean status = json.findPath("status").asBoolean();

        String query = "SELECT * FROM heroku_e3d8ce5aa92835f.bookingdata WHERE (date LIKE ? AND status=?)";

        try (Connection connection = helperUC.getConnection()) {
            try (PreparedStatement preparedStatement1 = connection.prepareStatement(query)) {

                preparedStatement1.setString(1, "%" + date + "%");
                preparedStatement1.setBoolean(2, status);

                JsonDataArrayFromBeToFe timeSlots = new JsonDataArrayFromBeToFe();
                try (ResultSet data = preparedStatement1.executeQuery()) {

                    Logger.debug("Inside admin dates...");
                    while (data.next()) {
                        timeSlots.add(new TimeSlot(data.getInt(1), data.getString(2), data.getBoolean(3), getTimeFromDate(data.getString(2))));
                    }
                    String response = helperUC.initializeObjectMapper().writeValueAsString(timeSlots);
                    Logger.debug("Getting admin dates finished...");

                    return ok(response);
                }
            }
        }
    }

    /**
     * Method for updating timeSlot from adminPage
     *
     * @return - response
     * @throws SQLException
     * @throws JsonProcessingException
     */
    public Result updateAdminTimes() throws SQLException {
        JsonNode json = request().body().asJson();
        Logger.warn(json.findPath("date").asText());

        String updateQuery = "UPDATE heroku_e3d8ce5aa92835f.bookingdata SET status= ? WHERE id=?";

        try (Connection connection = helperUC.getConnection()) {
            try (PreparedStatement psIsSlotAvailable = connection.prepareStatement(updateQuery)) {

                Integer date = json.findPath("date").asInt();
                Boolean status = json.findPath("status").asBoolean();
                psIsSlotAvailable.setBoolean(1, status);
                psIsSlotAvailable.setInt(2, date);

                psIsSlotAvailable.executeUpdate();
                Logger.debug("Time slot updated from adminPage...");

                return ok("Updated");
            }
        }
    }

    //extract Time from TimeStamp
    private String getTimeFromDate(String value) {
        return String.valueOf(value.split(" ")[1].subSequence(0, 5));
    }
}
