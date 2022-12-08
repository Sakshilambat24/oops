package IfElse;

import java.util.Scanner;

public class CheakGratestValue {
    public static void main(String[] args) {



        int a,b,c;
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the a,and b");
        a= scanner.nextInt();
        b= scanner.nextInt();
        c= scanner.nextInt();

        int res=a>b ?a:b;
        int result= (res>c)? res:c;
        //return result;

       }
    }

