package ObjectClass;

import java.util.Objects;

public class student {

    private   int a;
   private String s;

   public  student (int a,String s){
       this.a=a;
       this.s=s;

   }

   public student(){

   }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return a == student.a && Objects.equals(s, student.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, s);
    }

    @Override
    public String toString() {
        return "student{" +
                "a=" + a +
                ", s='" + s + '\'' +
                '}';
    }

    public static void main(String[] args) {
        student s=new student();
      //  student = null;
        System.gc();

    }
}
