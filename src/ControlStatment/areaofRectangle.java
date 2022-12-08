package ControlStatment;

import java.util.Scanner;

public class areaofRectangle {

    public static void main(String[] args) {
        int l,b;

        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the length:");
        l=scanner.nextInt();

        System.out.println("enter the breath");
        b= scanner.nextInt();

        int areaofrectangle =l*b;

        System.out.println(areaofrectangle);
    }
}
