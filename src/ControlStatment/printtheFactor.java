package ControlStatment;

import java.util.Scanner;

public class printtheFactor {

    public static void main(String[] args) {

        int  number1,number2,number3,number4;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number:");
        number1 = scanner.nextInt();

        System.out.println("enter the second number:");
        number2 = scanner.nextInt();

        System.out.println("enter the third number:");
        number3 = scanner.nextInt();

        System.out.println("enter the fourth number:");
        number4 = scanner.nextInt();


        int number = 0;
        while ( number >=0) {

            number=number1+number2+number3+number4;


            System.out.println(number);
            break;
        }

    }
}
