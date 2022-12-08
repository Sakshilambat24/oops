package ForLoop;

import java.util.Scanner;

public class PrintAvage {
    public static void main(String[] args) {
           int a,b,c,d,e,f,g,h,k,j;

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the 10 interger:");
        a= scanner.nextInt();
        b= scanner.nextInt();
        c= scanner.nextInt();
        d= scanner.nextInt();
        e= scanner.nextInt();
        f= scanner.nextInt();
        g= scanner.nextInt();
        h= scanner.nextInt();
        k= scanner.nextInt();
        j= scanner.nextInt();
        int v=a+b+c+d+e+f+g+h+k+j;


        for(int i=a; i<=j;i++){
            System.out.println(v/10);
        }


    }
}
