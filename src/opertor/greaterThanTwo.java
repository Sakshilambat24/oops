package opertor;

public class greaterThanTwo {
    public static void main(String[] args) {
        int digit,sum=0 ;
        int number=5696;
        for (int i=number;i<=number;i++){
            digit=number%10;
           sum=digit+2;
            number=number/10;
           // System.out.println(number);
        }
        System.out.println(sum);
    }

}
