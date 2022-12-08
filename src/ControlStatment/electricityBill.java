package ControlStatment;

import java.util.Scanner;

public class electricityBill {

    public static void main(String[] args) {
        int rupes=10,unit;

        Scanner scanner=new Scanner(System.in);


        System.out.println("enter the unit:");
        unit= scanner.nextInt();

        int electricityBill=rupes*unit;

        System.out.println("the electricity bill is :"+electricityBill);


    }
}
