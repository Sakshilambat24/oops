package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306";
        String us="root";
        String pass="#sakshi123";

        Connection connection=null;
        try {
            connection= DriverManager.getConnection(url,us,pass);
            Statement statement=connection.createStatement();
            boolean b=statement.execute("create table cybersucess(id int ,name varchar(20));");
            System.out.println("table is created  "+b);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


}
}
