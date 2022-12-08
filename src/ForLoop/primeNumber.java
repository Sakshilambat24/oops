package ForLoop;

import java.util.Scanner;


public class primeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start and end : ");
        int number = sc.nextInt();
        int start = sc.nextInt();
        int end = sc.nextInt();
        int count = 0;


            for (int i = 1; i < number / 2; i++) {
                if (number % i == 0) {

                    count++;
                }
            }
            if (count > 1) {
                System.out.println("Number is  a  not prime number");

            } else {
                System.out.println(" it is  a prime number");
            }


        }
    }

    

