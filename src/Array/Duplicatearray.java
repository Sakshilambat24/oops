package Array;

public class Duplicatearray {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(isdupicate(array) ? "duplicate" : "not duplicate");
    }
    private static boolean isdupicate(int[] array){
            if (array == null) {
                return false;
            }
            boolean flag=false;

        for (int index = 0; index < array.length ; index++) {
            for(int j = 0; j< array.length && index!=j;j++){
               if (array[index]==array[j]){
                   flag=true;
                }
            }
        }
        return flag;
        }
    }


