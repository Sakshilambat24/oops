package inputByUser;

import java.util.Scanner;

public class typeCasting {

    public static void main(String[] args) {
        double l,b,A;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the value of l and b ");
        l= scanner.nextByte();
        b= scanner.nextByte();

        A=l*b;

        System.out.println(A);

        int a;

        a=(int)A;

        System.out.println("the area of perimeter is :"+a);


    }
}
