package ForLoop;

import java.util.Scanner;

public class aremstrongNumber {
    public static void main(String[] args) {
        int number;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number :");
        number= scanner.nextInt();
        int originalnumber= number;
        int sum=0;
        while(number>0){
            int lastDigit=number%10;
            sum=sum+lastDigit*lastDigit*lastDigit;
            number=number/10;
        }

   System.out.println(sum==originalnumber ? "aremstrong number":"not a aremstrong number");
}
}
