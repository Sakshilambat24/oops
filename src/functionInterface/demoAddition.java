package functionInterface;

public class demoAddition {
    public static void main(String[] args) {
       // Addition ad=new addimplImpl();
       // System.out.println(ad.add(10,20));
    }

     //annomous way
    Addition way2=new Addition() {
         @Override
         public int add(int number1, int number2) {
             return number1+number2;
         }
     };
   Addition way3=(number1, number2) -> number1+number2;
 //  System.out.println(way3.add(10,20));





}
