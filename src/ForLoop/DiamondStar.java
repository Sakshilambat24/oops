package ForLoop;

public class DiamondStar {
    public static void main(String[] args) {
        int number=4;
        for(int row=1; row<=number;row++){
            for(int space=number-1;space<1;space--){
                System.out.print(" ");
            }
            for(int star=1; star<=row; star++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int row=1;row<=number;row++){
            for(int space =1;space<row;space++){
                System.out.print(" ");
            }
            for(int star =number-row;star>=1;star--){
                System.out.print(" * ");
            }
            System.out.println( );
        }


    }
}
