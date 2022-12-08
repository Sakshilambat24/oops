package JDBC;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/*
public class Connection {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost:3306/world";
            String username = "root";
            String password = "root@1234";
            connection=DriverManager.getConnection(url,username,password);
           Statement statement = connection.createStatment();

            boolean isTableCreated = statement.execute("alter table product add coiumn product-id int");
            System.out.println("table is alterded " + isTableCreated);

        } catch (SQLException e) {
            throw new RuntimeException(e);

        } finally {
            connection.close();
        }


    }


}*/
