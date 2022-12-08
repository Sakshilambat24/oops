package ForLoop;

public class sumEven {
    public static void main(String[] args) {
        int sum = 0, count = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;

                sum++;
                System.out.println("the sum is :" + sum);
            }
        }
    }
}
