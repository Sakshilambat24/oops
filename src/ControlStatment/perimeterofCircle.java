package ControlStatment;

import java.util.Scanner;

public class perimeterofCircle {
    public static void main(String[] args) {

        int radius=0;

        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the radius:");
        radius= scanner.nextInt();

        float  perimeterofCircle=2*3.14f* radius;
        System.out.println("perimeter of cicle is:"+perimeterofCircle);


    }


}
