package inputByUser;

import java.util.Scanner;

public class twoResult {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the a,b value:");
        a= scanner.nextInt();
        b= scanner.nextInt();

      int c= a+b;
      int d=a*b;

        System.out.println("the sum of  a and b is a is :"+c);
        System.out.println("the product of a nd b is :"+d);
        System.out.println("the sum of c and d is a :"+(c+d));
        System.out.println("the product of c and d is :"+(c*d));
        System.out.println("the sum and product of c and d is :"+((c*d)+(c+d)));





    }
}
