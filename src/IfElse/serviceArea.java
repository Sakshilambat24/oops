package IfElse;
import java.util.Scanner;

public class serviceArea {
    public static void main(String[] args) {
        int age;
        String gender,male = "null",female="null";
        Scanner scanner =new Scanner(System.in);
        System.out.println("enter the age and gender :");
        age= scanner.nextInt();
        gender= scanner.next();

        if(gender=="female"){
            System.out.println("she works only urban area");
        }
       else  if(gender=="male" && (age>20 && age<=40)){
            System.out.println("he is works anywhare");
        }
       else  if(gender=="male "&& (age<40&& age>=60)){
            System.out.println("he works only urban area");
        }

       else{
            System.out.println("nope");
        }
    }
}
