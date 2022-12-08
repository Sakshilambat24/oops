package inputByUser;

import java.util.Scanner;

public class TotalMarks {
    public static void main(String[] args) {
        int maths,science,english;

        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the sub marks maths,science,english:");
        maths= scanner.nextInt();
        science= scanner.nextInt();
        english= scanner.nextInt();

         float total=(maths+science+english)/3*100;
        System.out.println("the total marks is :"+total);
    }
}
