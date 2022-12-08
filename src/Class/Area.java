package Class;
import java.util.Scanner;
public class Area {

    int breath;
    int length;

    public void setDim() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the breath");
        int breath = scanner.nextInt();
        System.out.println("enter the length");
        int length = scanner.nextInt();


        this.breath = breath;
        this.length=length;

    }

    public int getArea() {
       int  areaofRectangle = length * breath;
        //this.length = length;
      //  this.breath = breath;
        return areaofRectangle;

    }


    public static void main(String[] args) {

        Area a = new Area();
        a.setDim();
        System.out.println("area of reactangle is:"+a.getArea());



    }
}