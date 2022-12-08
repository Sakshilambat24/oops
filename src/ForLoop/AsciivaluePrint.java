package ForLoop;

import java.util.Scanner;

public class AsciivaluePrint {
    public static void main(String[] args) {
        int firstValue,lastValue;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the first value,last value:");
        firstValue=scanner.nextInt();
        lastValue= scanner.nextInt();
         char c='0';
         int ascii=(char)c;

         for(int i=firstValue;i<=lastValue;i++){
             System.out.println((char)(c));
         }
    }
}
