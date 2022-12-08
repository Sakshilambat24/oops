package ControlStatment;

import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {

        int originalvalue,discount=10;
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the price :");
        originalvalue= scanner.nextInt();

        int price=originalvalue-originalvalue/10;
        System.out.println(price);


    }
}
