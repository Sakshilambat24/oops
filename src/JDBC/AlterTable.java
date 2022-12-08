package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AlterTable {
    public static void main(String[] args) {
        String url="jdbc:mysql://Localhost:3306/world";
        String us="root";
        String password="#sakshi123";

        Connection connection=null;
        try{
            connection = DriverManager.getConnection("url","us","password");
            Statement statement=connection.createStatement();
            //boolean b= statement.execute();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
