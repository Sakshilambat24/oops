package Array;

public class secondmax {
    public static void main(String[] args) {
        int[]array={2,3,4,5,6};
        System.out.println(issecondmax(array));
    }

    private static int issecondmax(int[] array) {
        if (array==null)return -1;
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for (int index = 0; index < array.length ; index++) {
            if (array[index]>max){
                secondmax=max;
                max=array[index];}
         else if (array[index]>max && max>array[index]) {
                     secondmax=array[index];
            }
            }


       return secondmax;
}

}
