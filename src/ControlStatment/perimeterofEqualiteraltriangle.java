package ControlStatment;

import java.util.Scanner;

public class perimeterofEqualiteraltriangle {

    public static void main(String[] args) {

        int area=0;

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the area:");
        area= scanner.nextInt();

        float perimeterofequaliteraltriangle=3*area;
        System.out.println(" perimeter of equaliteral triangle is:"+perimeterofequaliteraltriangle);

    }
}
