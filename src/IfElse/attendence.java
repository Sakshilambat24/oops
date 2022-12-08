package IfElse;

import java.util.Scanner;

public class attendence {
    public static void main(String[] args) {

        int attendance;
         double held;

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the attence ,nd class is conducted");
        attendance= scanner.nextInt();
        held= scanner.nextInt();
        if(held>=attendance){

            System.out.println("he and she attendent the class  attend is :"+ (attendance/held)*100);
        }

        if(attendance>75){
            System.out.println("he she is attending  the exam :");
        }
        else{
            System.out.println("he /she is not attending the exam");
        }



    }
}
