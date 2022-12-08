package ControlStatment;

import java.util.Scanner;

public class areaofIsosclestriangle

{

    public static void main(String[] args) {

        int a,b;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the area:");
        a= scanner.nextInt();

        System.out.println("eneter the area:");
        b= scanner.nextInt();


        float areaofIsosclestriangle=((a*a-b*b/4)*b)/2;
        System.out.println(areaofIsosclestriangle);

    }

}
