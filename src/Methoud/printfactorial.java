package Methoud;

public class printfactorial {

    int a=1;
    int factorial1=1;

    int factorial(int i) {
        if (a<=i) {
            factorial1 *= a;
            a++;
        }
        return factorial1;
    }

        public static void main (String[]args){
            printfactorial p1 = new printfactorial();
            System.out.println(p1.factorial(5));
        }

    }
