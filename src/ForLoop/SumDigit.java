package ForLoop;

public class SumDigit {
    public static void main(String[] args) {
        int number =1234;
        int rev,rem,sum=0;

        for(int i=0;i<=number;i++){
            rev=number%10;
            sum=sum+rev;
            number=rev/10;
            System.out.println(sum);
        }

    }
}
