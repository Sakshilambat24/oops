package ControlStatment;

import java.util.Scanner;

public class volumeofSphere {


    public static void main(String[] args) {

        int radius;

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the radius:");
        radius= scanner.nextInt();

         double volumeofSphere=Math.PI*radius*radius*radius*4/3;

        System.out.println("the volume of sphere is :"+volumeofSphere);

    }
}
