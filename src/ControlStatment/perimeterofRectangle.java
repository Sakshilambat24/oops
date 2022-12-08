package ControlStatment;

import java.util.Scanner;

public class perimeterofRectangle {
    public static void main(String[] args) {

        int length,breath;

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the length :");
        length = scanner.nextInt();

        System.out.println("enter the breath:");
        breath=scanner.nextInt();

        float perimeterofRectangle=length+breath+length+breath;

        System.out.println("the perimeter of  Rectangle is:"+perimeterofRectangle);

    }
}
