package IfElse;

import java.util.Scanner;

public class gradingSystem {

    public static void main(String[] args) {

        int marks;

        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the marks:");
        marks= scanner.nextInt();

        if(marks<=25){
            System.out.println("the garde is :F");
        }
        if(marks>=25 && marks<=40){
            System.out.println("the garde is E:");
        }
        if(marks>=40 && marks<=50){
            System.out.println("the garde is :c");
        }


    }
}
