package inputByUser;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        int a,b;

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the the number is :");
        a= scanner.nextInt();
        b=scanner.nextInt();

        System.out.println("the sum of a and b is :"+(a+b));
        System.out.println("the sum of the product is :"+a*b);


    }
}
