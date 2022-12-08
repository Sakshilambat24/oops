package ControlStatment;

import java.util.Scanner;

public class FindthelargeNumber {
    public static void main(String[] args) {

        int  i,number,number1, number2, number3, number4;

        Scanner scanner=new Scanner(System.in);


        System.out.println("enter the first number :");
        number1=scanner.nextInt();

        System.out.println("enter the second number :");
        number2=scanner.nextInt();

        System.out.println("enter the third  number :");
        number3=scanner.nextInt();

        System.out.println("enter the fourth number :");
        number4=scanner.nextInt();


      if(number1<=number2){
          System.out.println(number1);

        if( number2<=number3);
          {
              System.out.println(number2);
          }
          if(number3<=number4){
              System.out.println(number3);
          }

          System.out.println(number4);





      }
        }

    }
