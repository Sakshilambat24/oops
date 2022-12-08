package Array;

public class Sumofdigit {
    public static void main(String[] args) {

        int [] array ={2,4,5,6,7,8};
        int sum = 0;

        for (int  index=0; index<array.length ; index++) {
              sum += array[index];
        }

        System.out.println(sum);


    }

}
