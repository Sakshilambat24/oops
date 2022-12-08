package ExceptionHandling;

public class demo4 {
    public static void main(String[] args) {
        try{
            System.out.println("try is execueted");
            System.exit(0);

        }
        finally
        {
            System.out.println("finally block always exected");
        }

        System.out.println("rest of the code is executed");
    }

}
