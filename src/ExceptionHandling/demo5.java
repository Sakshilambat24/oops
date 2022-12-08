package ExceptionHandling;

public class demo5 {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
            throw new ArithmeticException("divide by zero");
        }
        catch(ArithmeticException arithmeticException){
            System.out.println("catch block is executed");
        }
        System.out.println("rest of the code");
    }
}
