package functionInterface;

public class servicemesageimpl implements messageservice {
    @Override
    public void sendMessage() {
       return ;
    }


    public static void main(String[] args) {
        messageservice ms=new messageserviceimpl();
       // System.out.println(ms.sendMessage("hey","hii" ));

    }
}
