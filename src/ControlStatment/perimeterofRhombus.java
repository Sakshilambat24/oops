package ControlStatment;

import java.util.Scanner;

public class perimeterofRhombus {

    public static void main(String[] args) {


        int side;

        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the side:");
        side= scanner.nextInt();

        int perimeterofRhomus = 4*side;

        System.out.println("perimeter of rhomus is: "+perimeterofRhomus);
    }
}
