package ForLoop;

import java.util.Scanner;

public class oddNdEven {
    public static void main(String[] args) {
         int number;
        Scanner scanner=new Scanner(System.in);
        System.out.println(" enter the value");
        number= scanner.nextInt();
        if(number%2==0){
            System.out.println("its a even value");
        }
        else{
            System.out.println("its a odd number");
        }


    }
}
