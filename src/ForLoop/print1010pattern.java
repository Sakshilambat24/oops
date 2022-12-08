package ForLoop;

public class print1010pattern {
    public static void main(String[] args) {
        int  number=5;
        for(int row=1;row<=number; row++){
            for( int space=1; space<row ;space++){
                System.out.print("0");
            }
            for(int star=number-row;star>=1;star--){
                System.out.print("1");
            }
            System.out.println( );
        }
    }
}
