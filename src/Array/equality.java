package Array;

import java.util.Arrays;

public class equality {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array1 = {2, 3, 4, 5, 6, 7, 8};

        Arrays.sort(array);
        Arrays.sort(array1);

        boolean ischeakequal = cheakequality(array, array1);
        System.out.println(ischeakequal
        );
    }
    private static boolean cheakequality(int[] array, int[] array1) {
        boolean flag=false;
        if(array1==null||array==null)return false;
        if(array.length!=array1.length) return false;
       Arrays.equals(array,array1);
        for (int index = 0; index < array.length ; index++) {
            if (array[index] != array1[index]) {
                return false ;
            }
        }
     return true;
    }
}
