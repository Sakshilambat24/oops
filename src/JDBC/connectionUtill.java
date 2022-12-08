package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectionUtill {
    public static Connection connection;
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "#sakshi123";

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
          //  throw new RuntimeException(e);
            System.out.println("failed to connect to the database");

        }
        return connection;

    }

    }



