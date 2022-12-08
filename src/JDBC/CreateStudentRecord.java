package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CreateStudentRecord {
    @Override
    public String toString() {
        return "CreateStudentRecord{}";
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the student record");
        String StudentId= scanner.next();
        String StudentName= scanner.next();
        String address= scanner.next();
        String email= scanner.next();
        String phone= scanner.next();
        //step1 : get the connection
        String url = "jdbc:mysql://localhost:3306/world";
        String username = "root";
        String password = "#sakshi123";
        try {
            Connection connection= DriverManager.getConnection(url,username,password);
            Statement statement= connection.createStatement();
            String insertquery="insert into student values("+ " ' "+StudentId+" ' ,"+
                     " ' "+StudentName+" ' ,"+
                     " ' "+address+" ' ,"+
                    " ' "+email+" ' ,"+
                     " ' "+phone+" ' ,"+
                    ")";
            int recordsInserted = statement.executeUpdate(insertquery);
            System.out.println("record inserted sucessfully "+recordsInserted);
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }
}

