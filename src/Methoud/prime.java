package Methoud;

public class prime {
    int count ;
    int i;
    int prime(int a) {
        if (i <= a / 2) {
            if (a % 2 == 0) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("the no is  not a prime:");
        } else {
            System.out.println("the  no  a  is prime:");


            // System.out.println("the no is not a prime:");
        }

            return a;

        }

        public static void main (String[]args){
            prime p1 = new prime();
            System.out.println(p1.prime(13));
        }
    }
