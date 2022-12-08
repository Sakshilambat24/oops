package opertor;

public class Swap {

    public static void main(String[] args) {
        int x=5;
        int y=10;
       //int temp;

         x=x+y;
         y=x-y;
         x=y;
         y=x;

        System.out.println(x);
        System.out.println(y);

        int temp=x;
        x=y;
        y=temp;


        System.out.println(temp);
        System.out.println(x);

    }
}
