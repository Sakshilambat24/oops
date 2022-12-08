package Methoud;

import java.util.Scanner;

public class Findgrand {
    int marks;

    int grade(){
        if(marks>=80 && marks<=100) {
            System.out.println("the grand is A");
        }
        if(marks<=70 && marks>=80){
            System.out.println(" the grand is B");
        }
        if(marks<=60 && marks>=70){
            System.out.println("the grand is C");
        }
        if(marks<=40){
            System.out.println("fail");
        }
        return marks;
    }

    public static void main(String[] args) {
        Findgrand f1=new Findgrand();
        Scanner scanner=new Scanner(System.in);
        System.out.println(" enter the marks which is out of 100  :");
        int marks= scanner.nextInt();
        System.out.println(f1.grade());
    }
}
