package Class;

public class LocalDateTime {

    public static class order {
        int orderId;
        String orderTitle;
        static int count = 0;


        public order() {
        }

        public order(int orderId,String orderTitle){
            this.orderId=orderId;
            this. orderTitle=orderTitle;

        }
      /*  {
            System.out.println("order is placed at" + LocalDateTime.now());

            count++;
        }

       */
        {
            System.out.println("instance block");
        }

        public static void main(String[] args) {
            order order1=  new order();
            order order2=new order();
            order order3=new order();
            order order4 =new order();
            order order5 =new order();
            System.out.println("number of orders placed till now"+order.count);
        }
    }


}
