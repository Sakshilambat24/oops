package functionInterface;

public  interface messageservice {
    void sendMessage();

    class messageserviceimpl implements messageservice{

        @Override
        public void sendMessage() {
            System.out.println("send message");

        }

        public static void main(String[] args) {
            messageservice ms=new messageserviceimpl();
            ms.sendMessage();
        }

        messageservice anon =new messageservice() {
            @Override
            public void sendMessage() {
                System.out.println("send message annoymous way");
            }
        };
     //   anon.sendMesaage();

        messageservice lambda =()-> System.out.println("sending message lambda");
     //   lambda.sendMessage();


    }

}
