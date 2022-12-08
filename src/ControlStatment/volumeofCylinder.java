package ControlStatment;

import java.util.Scanner;

public class volumeofCylinder {

    public static void main(String[] args) {

        int radius,height=4;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the radius:");
        radius= scanner.nextInt();

        float volumeofCylinder=3.14f*radius*radius*height;
        System.out.println("volume of cylinder is "+volumeofCylinder);




    }
}
