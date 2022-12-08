package Inheritance;

public class ChildClass extends Employee{
    int id1=20;
    String name="prachi";

   void  m2()
    {
        System.out.println("child class method");

    }
    public static void main(String[] args) {
        ChildClass childClass=new ChildClass();
        System.out.println(childClass.id);//20
        System.out.println(childClass.name);//prachi
        childClass.m1();//child class



        Employee employee=new ChildClass();
        System.out.println(employee.id);//10
        System.out.println(employee.name);//sakshi
       employee.m1();//childe

        Employee emp=new Employee();
        System.out.println(employee.id);//10
        System.out.println(employee.name);//sakshi
        employee.m1();//child
    }
}

