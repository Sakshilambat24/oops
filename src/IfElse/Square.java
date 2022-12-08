package IfElse;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

        int l,b,l1,b2;
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the lenght and breath is :");
        l= scanner.nextInt();
        b= scanner.nextInt();
        l1= scanner.nextInt();
        b2= scanner.nextInt();



        if(l==l1 && b==b2){
            System.out.println("the given side is squre");

        }
        else{
            System.out.println("the given side is not a square");
        }
    }
}
