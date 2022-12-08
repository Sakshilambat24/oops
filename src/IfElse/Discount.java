package IfElse;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        int discount;
        int quality;

        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the quamtity :");
        quality=scanner.nextInt();

        if(quality>=1000){
            System.out.println("the shopes gives the discount of 10 percentage is :");
        }

        System.out.println(quality/10-quality);
    }
}
