package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateClass {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
      //  Class.forName("com.mysql.cj.jdbc.Driver");
        Connection  connection=null;
        try{
            String url="jdbc:mysql://localhost:3306/world";
            String username="root";
            String password="#sakshi123";
            connection= DriverManager.getConnection(url,password,username);
            Statement statement= connection.createStatement();

            boolean istableCreated= statement.execute("create table studuent(student id int,student  name varchar(20))");
            System.out.println("table created "+istableCreated);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        finally {

                connection.close();
              }
            }
        }

