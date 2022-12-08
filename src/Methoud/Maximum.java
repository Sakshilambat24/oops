package Methoud;

import java.util.Scanner;

public class Maximum {

    int  maxi( int a,int b,int c){
        int midResult=(a>b)?a:b;
        int finalResult=(midResult>c)?midResult:c;
        return finalResult;

        }

    int minumum( int a,int b,int c){
        int midResult=(a<b)?a:b;
        int finalResult=(midResult<c)?midResult:c;
        return finalResult;

    }

    public static void main(String[] args) {
        Maximum maximum=new Maximum();


        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the number a,b,c");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();


        System.out.println("the maximum number is "+maximum.maxi(2,3,4));
        System.out.println("the minimum number is "+maximum.minumum(2 ,3, 4));

    }
    }

