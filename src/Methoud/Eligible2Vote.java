package Methoud;

public class Eligible2Vote {

     int  vote (int a){
         if(a>18){
             System.out.println("eligible to vote");
         }
         else{
             System.out.println("below 18 ");
         }
         return a;

     }

    public static void main(String[] args) {
        Eligible2Vote e1=new Eligible2Vote();
        System.out.println("the age is "+e1.vote(24));
    }

}
