package ForLoop;

public class perfectNumber {
    public static void main(String[] args) {

        int n=45;
        int sum=0;
        for(int i=0;i<=n/2;i++){
            if(n%2==0){
                sum +=i;
                if(n==sum){
                    System.out.println("its is a perfect number");
                }




                //System.out.println("sum");
            }
            System.out.println("it not a perfect number");

           // else{
               // System.out.println("not a perfect");
          //  }
            //System.out.println(sum==n?"isperfect":"not perfect");
        }
        System.out.println(" ");
        //System.out.println(sum==n?"isperfect":"not perfect");

    }
}
