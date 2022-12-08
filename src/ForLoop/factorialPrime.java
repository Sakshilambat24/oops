package ForLoop;

public class factorialPrime {
    public static void main(String[] args) {
        int a = 1;
        int n = 5;
        int factorioal = 1;
        while (a <= n) {
            factorioal *= a;
            a++;
            System.out.println(factorioal);
            if (factorioal/2 == 0) {
                if(a%2==0)
                    System.out.println("its a not a prime number factorial");
            } else {
                System.out.println(" its a prime no ,factors");
            }


        }
    }
}
        //System.out.println(factorioal);
       //if(factorioal/2==0 ){
         //   System.out.println("its a not a prime number factorial");
       // }
        //else{
         //   System.out.println(" its a prime no factors");
       // }

   // }
//}
