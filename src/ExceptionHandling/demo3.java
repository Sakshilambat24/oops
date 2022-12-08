package ExceptionHandling;

public class demo3 {
    public static void main(String[] args) {
        try{
            String str=null;
            System.out.println(10/0);
            System.out.println(str.length());
        }
        catch(NullPointerException nullPointerException ){
            System.out.println("string point is ");

        }
        catch(ArithmeticException arithmeticException){
            System.out.println("the value is ");

        }

        System.out.println("rest of the code is executed");
    }

}
