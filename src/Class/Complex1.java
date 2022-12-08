package Class;

import java.util.Scanner;

public class Complex1 {
    int a;
    int b;

    public int print() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter the no a ,b is :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        this.a = a;
        this.b = b;

        int sum=a+b;
        int differnce=a-b;
        int product=a*b;


        return b;
    }

    public static void main(String[] args) {
        Complex1 co =new Complex1();
        System.out.println("the sum is " +co.print());


    }
}
