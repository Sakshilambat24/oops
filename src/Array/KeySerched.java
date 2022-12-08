package Array;

public class KeySerched {
    public static void main(String[] args) {
        int key=3;
        int[] array ={2,3,4,5,6};
        boolean ispresent=false;
        for (int index=0 ; index < array.length ; index++) {
           if(key== array[index]) {
               System.out.println( index);
               ispresent=true;
               break;
           }


        }
        String ispresent1=(ispresent) ?"is present ":" not present ";
        System.out.println(ispresent1);
    }
}
