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



    HelperUtilityClass helperUtilityClass = new HelperUtilityClass();


    /*
    Method to populate local database so data can be exported and imported to the remote one. Usage -> in production should not be used ever.
     */
    public Result loadDatabase() throws SQLException, ParseException {
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


    HelperUtilityClass helperUC = new HelperUtilityClass();

    public Result getTimeSlots() throws SQLException, JsonProcessingException {
        JsonNode json = request().body().asJson();
        Logger.warn(json.findPath("date").asText());

        String query = "SELECT * FROM heroku_e3d8ce5aa92835f.bookingdata WHERE (date LIKE ? AND status=?)";

        try (Connection connection = helperUC.getConnection()) {
            try (PreparedStatement preparedStatement1 = connection.prepareStatement(query)) {
                String xx1 = json.findPath("date").asText();
                preparedStatement1.setString(1, "%" + xx1 + "%");
                preparedStatement1.setBoolean(2, false);
                JsonDataArrayFromBeToFe timeSlots = new JsonDataArrayFromBeToFe();
                try (ResultSet data = preparedStatement1.executeQuery()) {

                    Logger.debug("Inside getTimeSlotsFromDB");
                    while (data.next()) {
                        timeSlots.add(new TimeSlot(data.getInt(1), data.getString(2), data.getBoolean(3), getTimeFromDate(data.getString(2))));
                    }
                    Logger.debug("after getTimeSlotsFromDB");

                    String response = helperUC.initializeObjectMapper().writeValueAsString(timeSlots);
                    Logger.warn(response);

                    return ok(response);
                }
            }
        }

    }

    private String getTimeFromDate(String value) {
        return String.valueOf(value.split(" ")[1].subSequence(0, 5));
    }


    public Result makeABooking() {
        JsonNode json = request().body().asJson();
        int rowId = json.findPath("id").asInt();
        // for provoking the throw... while developing
//        int rowId = 65;
        Logger.debug("ID: " + rowId);

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
            Logger.warn("SQL went to hell {}, {}", e, e.toString());
            return badRequest("SQLException happened");
        }

    }
}


