package Class;


public class Bankaccount {
    int accountNumber;
    int bankAccount;
    int customerId;
    String accountHolderName;
    float accountbalance;
    String branch;
    static String bankName="bank of ballya";
    static int rateofIntersest=5;

    float cheakbalance(int accountNumber,int customerId){
        if(this.accountNumber==accountNumber && this.customerId==customerId){
            return accountbalance;
        }

        return -1;

    }

    static String displaybankName(){
      // int bankName=accountNumber;
        return bankName;

    }

    public static void main(String[] args) {
        Bankaccount a =new Bankaccount();
           a .accountNumber=1;
           a.customerId=101;
           a.accountHolderName="cyber sucess";
          // a.accounType="current";
           a.branch="deccan";
           a.accountbalance =100;
        System.out.println(a.cheakbalance(2,101));

        //calling static methoud

        String bankName =a.displaybankName();
        System.out.println(" bank name"+bankName);



    }



}
