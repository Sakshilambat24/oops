package ExceptionHandling;

public class demo2 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            System.out.println("try block is executed");
        }
        catch( ArithmeticException arithmeticException){
            System.out.println(10%1);
            System.out.println("catch block is executed");

        }

    }
}
