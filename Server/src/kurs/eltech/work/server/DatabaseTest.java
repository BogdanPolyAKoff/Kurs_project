package kurs.eltech.work.server;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseTest {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost/Kurs";
        String login = "postgres";
        String password = "eltechkurs";
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            Connection conn = DriverManager.getConnection(url, login, password);
            Statement statement = conn.createStatement();
            String sql = "CREATE TABLE machine ( id varchar(60),  data varchar(15) NOT NULL,  marck varchar(50) NOT NULL, probeg varchar(50) NOT NULL, replase varchar(50) NOT NULL, resurs varchar(50) NOT NULL, rezult varchar(50), PRIMARY KEY (id));";
            //String sql = "INSERT INTO machine(id, data, marck, probeg, replase, resurs, rezult) VALUES ('"+ UUID.randomUUID() +"', '"+ data
            // +"', '"+ nameBox +"', '"+ currentDistance +"', '"+ fieldLast +"', '"+ fieldRes +"', '"+ fieldLeft +"') ";
            statement.execute(sql);
            ResultSet resultSet = statement.executeQuery(sql);

            statement.close();
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

