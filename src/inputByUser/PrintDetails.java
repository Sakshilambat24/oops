package inputByUser;

import java.util.Scanner;

public class PrintDetails {
    public static void main(String[] args) {
        String name;
        int rollNumber;
        String sub;

        String a,b;


        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the name,rollnumber,sub :");
        name=scanner.next();
        rollNumber= scanner.nextInt();
        sub= scanner.next();
        a= scanner.next();
        b=scanner.next();

        System.out.println("my name is :"+name);
        System.out.println("my roll no is :"+rollNumber);
        System.out.println("my area of intersed is :"+sub);
        System.out.println(a+b);

    }
}
