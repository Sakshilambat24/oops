package Class;

public class LocalInstanceDemo {
    int a=100;//instance variable
    static int b=200;

    public static void main(String[] args) {
        int a=300;
        int b=400;
        System.out.println("local variable"+a);
        System.out.println("local variable"+b);

        LocalInstanceDemo ref=new LocalInstanceDemo();
        System.out.println("Instanous variable"+ref.a);
        System.out.println("static variable"+LocalInstanceDemo.b);
        m1();


    }
   static void m1(){
        int a=500;
        int b=600;
       System.out.println("m1 methoud");
       System.out.println("local variable"+a);
       System.out.println("local variable"+b);

       LocalInstanceDemo ref = new LocalInstanceDemo();
       System.out.println("instanous variable"+ref.a);
       System.out.println("static variable"+LocalInstanceDemo.b);


   }

}
