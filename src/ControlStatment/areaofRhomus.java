package ControlStatment;

import java.util.Scanner;

public class areaofRhomus {

    public static void main(String[] args) {

        int diagnols1,diagnols2;


        Scanner scanner =new Scanner(System.in);

        System.out.println("enter the d1 value:");
        diagnols1= scanner.nextInt();

        System.out.println("enter the d2 value:");
        diagnols2= scanner.nextInt();

        float areaofRhomus=((diagnols1*diagnols1)*(diagnols2*diagnols2))/2;

        System.out.println("area of rhomus is:"+areaofRhomus);


    }
}
