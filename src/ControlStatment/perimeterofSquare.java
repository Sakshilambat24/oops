package ControlStatment;

import java.util.Scanner;

public class perimeterofSquare {

    public static void main(String[] args) {

        int area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the area:");
        area= scanner.nextInt();

        float perimeterofsquare=4*area;

        System.out.println("enter the perimeter of square is:"+perimeterofsquare);


    }
}
