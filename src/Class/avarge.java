package Class;

import java.util.Scanner;

public class avarge {
    int a,b,c;

    public int calculate(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number a,b,c:");
        a= scanner.nextInt();
        b= scanner.nextInt();
        c= scanner.nextInt();

        int avarge=(a+b+c)/3;
         return avarge;
    }

    public static void main(String[] args) {
        avarge avarge1=new avarge();
        System.out.println("the avarge of a no is :"+avarge1.calculate());

    }


}
