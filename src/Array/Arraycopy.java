package Array;

public class Arraycopy {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6};
        int[] array1 = createcopy(array);


    }
    private static int[] createcopy(int[] array) {
        if (array == null) {
            return new int[0];
        }
        int result[] = new int[array.length];
        for (int index = 0; index < array.length; index++) {
            result[index] = array[index];
        }
        return result;
    }

}
