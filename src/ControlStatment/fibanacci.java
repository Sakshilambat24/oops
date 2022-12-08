package ControlStatment;

import java.util.Scanner;

public class fibanacci {


    public static void main(String[] args) {

        int start=0 ,end=0 ,count=0 ,temp;

        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the start no :");
        start= scanner.nextInt();

        System.out.println("enter the end no :" );
        end= scanner.nextInt();

        for(int i=start;i<=end;i++ ){

             i=start;
             start=i+1+count;
             temp=i;


            count++;


            System.out.println(count);
        }


    }
}
