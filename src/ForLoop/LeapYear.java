package ForLoop;

public class LeapYear {
    public static void main(String[] args) {
        int year=2004;
        if(year % 400==0 || (year%100!=0 && year%4==0 )){
            System.out.println("the year is leap year");
        }
        else {
            System.out.println("the no is not a leap year");
        }



    }
}

