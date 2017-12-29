//import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
//
//import javax.naming.Context;
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//import javax.sql.DataSource;
//import java.sql.*;
//import java.util.Properties;
//
//public class AccessDataBase {
//    MysqlDataSource dataSource = new MysqlDataSource();
//
//
//
//
//    Connection conn = dataSource.getConnection();
//    Statement stmt = conn.createStatement();
//
//    ResultSet rs = stmt.executeQuery("show tables;");
//
//    public AccessDataBase() throws SQLException {
//    }
//
//
//
//
////
////    Context context = new InitialContext();
////    DataSource dataSource = (DataSource) context.lookup("java:comp/env/jdbc/myDB");
////
////
////    public AccessDataBase() throws NamingException {
////    }
//}


import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccessDataBase{

    public static void main(String[] args) throws SQLException {
        List<String> list = new ArrayList<>();

        try (Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/play", "root", "root")) {
            System.out.println("Database connected!");

//            connection.createStatement().executeQuery("USE play;");
            ResultSet x =connection.createStatement().executeQuery("USE play;");
            String query="SELECT LastName FROM Persons;";
            ResultSet y = connection.createStatement().executeQuery(query);

            while(y.next()){
           if(y.next()){
               list.add(y.getString("LastName"));



           }}

            for (String item: list){
                System.out.println("item: " + item);
            }
            System.out.println(list.size());
            //insert
            int age=6;
            String user="Pizda";
            String last="Jane";
            int xx = connection.createStatement().executeUpdate("INSERT INTO Persons (LastName,FirstName,Age) VALUES('"+last+"','"+user+"','"+age+"');");
            System.out.println("insert: " + xx);

        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }


        }



}
