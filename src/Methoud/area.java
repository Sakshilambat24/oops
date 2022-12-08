package Methoud;

import java.util.Scanner;


public class area {
    int radius;


    int circumfernce( int a){
        int cirumfernce1=2*radius;
        return cirumfernce1;

    }

    double area(int b){
        double  area1=3.14*radius;
        return area1;
    }

    public static void main(String[] args) {
        area area1=new area();
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the radius ");
        int radius= scanner.nextInt();
        System.out.println(area1.circumfernce(2));
        System.out.println(area1.area(4));
    }
}
