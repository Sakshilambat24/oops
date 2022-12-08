package Methoud;

public class Evenodd {

     int even(int a){
         int number;
         if(a%2==0){
             System.out.println("the no is even");
         }
         else {
             System.out.println("the no is odd");
         }
         return a;
     }

    public static void main(String[] args) {
        Evenodd e1=new Evenodd();
        System.out.println("the no is :"+e1.even(5));
    }
}
