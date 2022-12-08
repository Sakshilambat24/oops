package ControlStatment;

import java.util.Scanner;

public class perimeterofPallogram {

    public static void main(String[] args) {

        int a=0,b=0;

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the a value:");
        a =scanner.nextInt();

        System.out.print("enter the b value:" );
        b= scanner.nextInt();

        int perimeterofPallogram=(a+b)*2;
        System.out.println("the perimeter of pallogram is:"+perimeterofPallogram);

    }
}
