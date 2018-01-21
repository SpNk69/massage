package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.mysql.jdbc.Connection;
import play.Logger;
import play.libs.Json;
import play.mvc.Result;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import static play.mvc.Controller.request;
import static play.mvc.Results.badRequest;
import static play.mvc.Results.ok;

/**
 * Created by alex on 2017-12-26.
 */
public class FullFormMagic {
    //
    private static final String NAME = "name";
    private static final String SURNAME = "surname";
    private static final String EMAIL = "email";
    private static final String PHONE = "phone";
    private static final String MASSAGE = "massage";
    private static final String DATE = "date";
    private static final String TIME = "time";
    private static final String MESSAGE = "message";

    private static Connection getConnection() throws URISyntaxException, SQLException {
        URI dbUri = new URI(System.getenv("CLEARDB_DATABASE_URL"));

        String username = dbUri.getUserInfo().split(":")[0];
        String password = dbUri.getUserInfo().split(":")[1];
        String dbUrl = "jdbc:mysql://" + dbUri.getHost() + dbUri.getPath();

        Logger.warn("SUP: " + dbUrl);

        return (Connection) DriverManager.getConnection(dbUrl, username, password);
    }

    public Result addBookingToDatabase() throws UnsupportedEncodingException, URISyntaxException {
        JsonNode json = request().body().asJson();
        try (com.mysql.jdbc.Connection connection = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/play", "root", "root")) {
//        try (com.mysql.jdbc.Connection connection = getConnection()) {

            PreparedStatement xs = connection.prepareStatement("INSERT INTO play.fullReservationForm (name, surname, email, phone, massage, date, time, message)  VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)");
            xs.setString(1, setMaxColTypeLen(findJson(json, NAME), getMaxSize(connection, NAME)));
            xs.setString(2, setMaxColTypeLen(findJson(json, SURNAME), getMaxSize(connection, SURNAME)));
            xs.setString(3, setMaxColTypeLen(findJson(json, EMAIL), getMaxSize(connection, EMAIL)));
            xs.setString(4, setMaxColTypeLen(findJson(json, PHONE), getMaxSize(connection, PHONE)));
            xs.setString(5, setMaxColTypeLen(findJson(json, MASSAGE), getMaxSize(connection, MASSAGE)));
            xs.setString(6, setMaxColTypeLen(findJson(json, DATE), getMaxSize(connection, DATE)));
            xs.setString(7, setMaxColTypeLen(findJson(json, TIME), getMaxSize(connection, TIME)));
            xs.setString(8, setMaxColTypeLen(findJson(json, MESSAGE), getMaxSize(connection, MESSAGE)));

            xs.execute();

            return ok();
        } catch (SQLException e) {

            Logger.warn("LOG 2:  1: " + e.getErrorCode() + " 2: " + e.getSQLState() + " 3: " + e.getNextException());
            return badRequest(Json.toJson(e.getErrorCode()));
        }
    }

    // To Do, Fetch size of i.e. varchar automatically from DB.
    private String setMaxColTypeLen(String toBeTrimmed, int maxSize) {
        return toBeTrimmed.substring(0, Math.min(toBeTrimmed.length(), maxSize));
    }

    private int getMaxSize(Connection connection, String param1) throws SQLException {
        ResultSet rs = prepareStatementSelectAll(connection, "SHOW FIELDS FROM  play.fullReservationForm;");
        HashMap<String, String> hashMap = new HashMap<>();
        HashMap<String, String> anotherMap = new HashMap<>();
        while (rs.next()) {

            String rx = rs.getString(2);
            String ry = rs.getString(1);

            hashMap.put(ry, rx);
        }

        hashMap.forEach((x, y) -> {
            anotherMap.put(x,
                    y.replaceAll("\\D+", ""));
        });
        final int[] red = new int[1];


        anotherMap.forEach((x, y) -> {
            if (x.equalsIgnoreCase(param1)) {
                red[0] = Integer.parseInt(y);
            }
        });
        return red[0];
    }

    private String findJson(JsonNode node, String path) {
        return node.findPath(path).toString();
    }

    private ResultSet prepareStatementSelectAll(Connection con, String query) throws SQLException {

        PreparedStatement preparedStatement = con.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        return resultSet;
    }

}