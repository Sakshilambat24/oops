package ControlStatment;

import java.util.Scanner;

public class digitofanInterger {
    public static void main(String[] args) {

        int number;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the interger :");

        number = scanner.nextInt();
        int sum = 0;
        int product=1;
        while (number > 0) {
            sum += number % 10;
            product *= number % 10;
            number /= 10;
        }






            System.out.println("The sum of number is"+sum);


        }
    }
