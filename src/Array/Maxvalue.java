package Array;

public class Maxvalue {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5};
        int min=Integer.MAX_VALUE;

        if(array==null){
            System.out.println("null");
        }
        for (int index = 0; index < array.length ; index++) {
            if(min>array[index]){
                array[index]=min;
            }
        }
       System.out.println( "array of index- "+min);
    }
}
