package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import play.Logger;
import play.mvc.Result;

import java.sql.*;

import static play.mvc.Controller.request;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.ok;

/**
 * Created by alex on 2017-12-26.
 */
public class FullFormMagic {


    public Result addBookingToDatabase() {

        try (com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/play", "root", "root")) {

            if(executeShit(connection)){
                return ok("OK");
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }
        return badRequest();


    }

    private boolean executeShit(com.mysql.jdbc.Connection connection) throws SQLException {


        try {

            JsonNode json = request().body().asJson();
            Logger.warn("THE FUCK IS HAPPENING: " + json);

            PreparedStatement xs = connection.prepareStatement("INSERT INTO play.fullReservationForm (name, surname, email, phone, massage, date, time, message)  VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)");
            xs.setString(1, String.valueOf(json.findPath("name")));
            xs.setString(2, String.valueOf(json.findPath("surname")));
            xs.setString(3, String.valueOf(json.findPath("email")));
            xs.setString(4, String.valueOf(json.findPath("phone")));
            xs.setString(5, String.valueOf(json.findPath("massage")));
            xs.setString(6, String.valueOf(json.findPath("date")));
            xs.setString(7, String.valueOf(json.findPath("time")));
            xs.setString(8, String.valueOf(json.findPath("message")));
            xs.execute();
            return true;


        } catch (SQLException e) {
            return false;

        }

    }
}


