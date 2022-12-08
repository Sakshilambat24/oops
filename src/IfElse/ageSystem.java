package IfElse;

import java.util.Scanner;

public class ageSystem {
    public static void main(String[] args) {
        int sham,ram,nam;

        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the sham ,nav ,ram age:");
        sham= scanner.nextInt();
        ram= scanner.nextInt();
        nam= scanner.nextInt();

        if(ram<sham ||sham<nam || nam<ram ){
            System.out.println("the oldest is");
        }

        return;

    }
}
