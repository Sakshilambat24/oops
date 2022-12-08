package Class;

public class rectangle {
     int length;
     int breath;

    public rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public int area(){
       int   areaofreactangle=length*breath;
       return areaofreactangle;
    }

    public static void main(String[] args) {
        rectangle rectangle1=new rectangle(2,4);
        rectangle rectangle2=new rectangle(4,5);
        System.out.println("area of rectangle:"+rectangle1.area());
        System.out.println("area of rectangle:"+rectangle2.area());

    }
}
