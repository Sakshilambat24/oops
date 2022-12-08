package JDBC;

import java.sql.*;


public class ConnectionJdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //pre -requsite to the connection
        //1.load the driver class into the memory
        //2.static block will register the driver class obj with DriverManger
        //this line required befire java
        //Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306";
        String username="root";
        String password="#sakshi123";
        //get the connection;
        Connection connection= DriverManager.getConnection(url,username,password);
        Statement statment=connection.createStatement();

        //execute quary
        ResultSet resultset = statment.executeQuery(" + select * from student where id=3");
        //get the result

        while(resultset.next()){
            System.out.println(resultset.getInt("id")+"\t"+
            resultset.getString("name")+"\t"+
            resultset.getString("address"));

        }

        //close connection
        connection.close();



    }


}
