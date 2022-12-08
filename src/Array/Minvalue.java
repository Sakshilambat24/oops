package Array;

public class Minvalue {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5};
        int max=Integer.MIN_VALUE;
        if(array==null) {
            System.out.println("null");
        }
        for (int index = 0; index < array.length ; index++) {
         if(  max<array[index]){
             max=array[index];
         }
        }
        System.out.println("array of index is :"+max);
    }
}