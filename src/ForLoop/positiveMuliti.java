package ForLoop;

import java.util.Scanner;

public class positiveMuliti {
    public static void main(String[] args) {
        int number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number :");
        number= scanner.nextInt();

        if(number>0) {
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d X %d = %d\n", number, i, number * i);

            }

        }
        System.out.println("negative number");
    }
}

