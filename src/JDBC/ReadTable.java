package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadTable {
    public static void main(String[] args) throws SQLException {
             String url="jdbc:mysql://localhost:3306/world";
             String username="root";
             String password="#sakshi123";
        Connection connection;
        try{
            connection= DriverManager.getConnection(url,username,password);
            Statement statement=connection.createStatement();
            Boolean istablecreated=statement.execute("create table product ( id int , name varchar(20), adddress varchar(30));");
            System.out.println("istable created"+istablecreated);
        }
        catch (SQLException sqlException){
            System.out.println("exception is handle is");
            throw new RuntimeException(sqlException);
        }
        try{
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        }
    }

