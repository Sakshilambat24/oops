package Array;

public class secondmin {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 6, 7};
        System.out.println(issecondmin(array));

    }
    private static int  issecondmin(int[] array) {
        if(array==null) return-1;
        int min=Integer.MAX_VALUE;
        int secondmin=Integer.MAX_VALUE;

        for (int index = 0; index < array.length ; index++) {
            if(array[index]<min){
                min=secondmin;
                array[index]=min;
            } else if (array[index]<min && min<secondmin) {
                array[index]=secondmin;

            }

        }
        return secondmin;

    }
}