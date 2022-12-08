package encapsulation;

public class StudentDetailsimpl {
    public static void main(String[] args) {


        StudentDetails sd = new StudentDetails();
        sd.setId(10);

        sd.setS1("sakshi");
        System.out.println(sd.getId());
        System.out.println(sd.getS1());


    }
}