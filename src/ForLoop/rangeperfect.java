package ForLoop;

public class rangeperfect {
  public static void main(String[] args) {
        //int sum=0;
    for(int i=1;i<=1000;i++){
       if(isperfectNumber(i)){
           System.out.println("perfect number"+i);
       }
    }
}
private static boolean isperfectNumber(int number) {
    int sum = 0;
   // int number = 0;
    for (int i = 1; i <= number / 2; i++) {
        if (number%i == 0) {
            sum += i;
        }


    }
    return sum == number;
}

}
