package JDBC;

import java.sql.*;

public class StepstoConnectDatabase {
    public static void main(String[] args) throws SQLException {
        //step1=create the project
        //step2=add the musql to the project
        //step3=Established connection between java aap and database server

        String url = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "#sakshi123";

        Connection connection = DriverManager.getConnection(url, username, password);
        String query = "select * from student";
        Statement statement = connection.createStatement();

        //execute the quary
        ResultSet resultSet = statement.executeQuery(query);

        //read the result

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2));

        }

        //connection close
        connection.close();

    }



    }

