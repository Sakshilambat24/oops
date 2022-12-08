package ForLoop;

public class factorial {
    public static void main(String[] args) {
        int a=1;
        int n=5;
        int factorial=1;
        while (a<=n){
            factorial *=a;
            a++;
           // System.out.println(factorial);
        }
        System.out.println(" "+factorial);

    }
}
