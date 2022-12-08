package IfElse;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
         int number,rem,rev=0;

        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the number :");
        number= scanner.nextInt();

        if(number>=0){

            rem=number%10;
            rev=rev*10+rem;
            number/=10;

            System.out.println(rev);


        }
    }
}
