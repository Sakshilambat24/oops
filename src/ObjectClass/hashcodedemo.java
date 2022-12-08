package ObjectClass;

public class hashcodedemo {
    public static void main(String[] args) {
        student s=new student(1,"sakshi");

        student s1 =new student(2,"prachi");
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s);
        System.out.println(s1);

    }
}
