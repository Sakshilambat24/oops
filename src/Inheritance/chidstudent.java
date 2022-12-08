package Inheritance;

public class chidstudent extends student{
     int i=30;
     String s="amol";

     void m1(){
         System.out.println(" the methoud of m1 class child methoud is execute");
     }

    public static void main(String[] args) {
        student s1=new student();
        System.out.println(s1.i);//20
        System.out.println(s1.s);//prachi
        s1.m1();

        chidstudent cs= new chidstudent();
        System.out.println(cs.s);//30
        System.out.println(cs.i);//amol
        cs.m1();//child class

        student s2=new chidstudent();
        System.out.println(s2.s);//20
        System.out.println(s2.i);//prachi
        s2.m1();//child


    }

}
