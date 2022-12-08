package ForLoop;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args){;
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the no a,b,c");
        a= scanner.nextInt();
        b= scanner.nextInt();
        c= scanner.nextInt();
        //for(int i=0; i<10; i++) - Goes from i=0 to i=9
        for(int i=1;i<=10;i++) {
            System.out.printf("%d X %d = %d\n", a, i, a * i);
        }
        System.out.println( );
        for(int i =1;i<=10;i++) {
               System.out.printf("%d X %d = %d\n", b, i, b * i);
           }
        System.out.println( );
        for(int i=1;i<=10;i++){
                System.out.printf("%d X %d = %d\n", c, i, c*i);
    }
    }
}
