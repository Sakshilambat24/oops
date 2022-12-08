package Class;

import java.util.Scanner;

public class area1 {
    int legth;
    int breath;

    public area1(int legth, int breath) {
        this.legth = legth;
        this.breath = breath;
    }

    public int returnarea(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the length,breath");
        legth= scanner.nextInt();
        breath= scanner.nextInt();
        int areaofreactangle=legth*breath;
        return areaofreactangle;

       // this.breath == breath;
       // this.legth==legth;
    }

    public static void main(String[] args) {
        area1 area2=new area1(2,4);
        System.out.println("the area of rectangle is :"+area2.returnarea());
    }
}
