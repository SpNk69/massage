package controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.mysql.jdbc.Connection;
import jsonthings.JsonDataArrayFromBeToFe;
import jsonthings.TimeSlot;
import play.Logger;
import play.mvc.Controller;
import play.mvc.Result;

import java.sql.*;
import java.text.ParseException;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class DatabaseController extends Controller {

    HelperUtilityClass helperUC = new HelperUtilityClass();

    /**
     * Method for one-time usage to populate DB with needed data and then can be exported
     *
     * @return response
     * @throws SQLException
     * @throws ParseException
     */
    public Result loadDatabase() throws SQLException {
        final long incrementHour = 1800;

        // To Do: add env variables for this one as well
        try (com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/play", "root", "root")) {

            try (PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO heroku_e3d8ce5aa92835f.bookingdata (date, status)  VALUES (?,?)")) {

                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(1522785600000L);

                java.sql.Timestamp timestamp = new java.sql.Timestamp(calendar.getTimeInMillis());

                long startTime = System.currentTimeMillis();
                Logger.debug("Started populating db with data");
                for (int i = 0; i < 75000; i++) {
                    preparedStatement.setTimestamp(1, Timestamp.from(timestamp.toInstant().plusSeconds(incrementHour * i).truncatedTo(ChronoUnit.MINUTES)));
                    preparedStatement.setBoolean(2, true);
                    preparedStatement.execute();
                }
                long endTime = System.currentTimeMillis();
                long timeElapsed = endTime - startTime;
                Logger.debug("Finished populating: " + timeElapsed / 1000);
            }
        }
        return ok("Finished...");
    }

    /**
     * Method for getting available timeSlots according to chosen date
     *
     * @return response with data
     * @throws SQLException
     * @throws JsonProcessingException
     */
    public Result getTimeSlots() throws SQLException, JsonProcessingException {
        JsonNode json = request().body().asJson();

        String query = "SELECT * FROM heroku_e3d8ce5aa92835f.bookingdata WHERE (date LIKE ? AND status=?)";

        try (Connection connection = helperUC.getConnection()) {
            try (PreparedStatement preparedStatement1 = connection.prepareStatement(query)) {
                String xx1 = json.findPath("date").asText();
                preparedStatement1.setString(1, "%" + xx1 + "%");
                preparedStatement1.setBoolean(2, false);
                JsonDataArrayFromBeToFe timeSlots = new JsonDataArrayFromBeToFe();
                try (ResultSet data = preparedStatement1.executeQuery()) {

                    Logger.debug("Getting time slot(s) for chosen date...");
                    while (data.next()) {
                        timeSlots.add(new TimeSlot(data.getInt(1), data.getString(2), data.getBoolean(3), getTimeFromDate(data.getString(2))));
                    }
                    String response = helperUC.initializeObjectMapper().writeValueAsString(timeSlots);

                    return ok(response);
                }
            }
        }
    }

    /**
     * Method for extracting time from i.e. TimeStamp format
     *
     * @param value - TimeStamp to be trimmed to time only
     * @return
     */
    private String getTimeFromDate(String value) {
        return String.valueOf(value.split(" ")[1].subSequence(0, 5));
    }

    /**
     * Method to handle a booking slot process.
     *
     * @return response with success or fail (ok,badRequest)
     */
    public Result makeABooking() {
        JsonNode json = request().body().asJson();
        int rowId = json.findPath("id").asInt();

        String ultimateQuery = "UPDATE heroku_e3d8ce5aa92835f.bookingdata SET status= ? WHERE id=? AND status =?";

        try (Connection connection = helperUC.getConnection()) {
            try (PreparedStatement psIsSlotAvailable = connection.prepareStatement(ultimateQuery)) {

                psIsSlotAvailable.setBoolean(1, true);
                psIsSlotAvailable.setInt(2, rowId);
                psIsSlotAvailable.setBoolean(3, false);
                psIsSlotAvailable.executeUpdate();

                if (psIsSlotAvailable.getUpdateCount() != 1) {
                    Logger.warn("Update failed, time slot is taken already...");
                    return badRequest("SlotNotAvailable");
                }
                Logger.debug("Updating row {} in DB", rowId);
            }
            return ok();

        } catch (SQLException e) {
            Logger.debug("SQL operation went to hell {}, {}", e, e.toString());

            return badRequest("SQLException happened");
        }
    }
}


