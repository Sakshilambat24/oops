package Class;

public class student {
    String name;
    int rollNo;
    long phoneNo;
    String address;

    public student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public student(String name, int rollNo, long phoneNo, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public static void main(String[] args) {
        student student1 = new student("john", 2);
        student student2 = new student("sam", 4  , 83299073745l,"pune");
        System.out.println(student1.name);
        System.out.println(student1.rollNo);
        System.out.println(student2.rollNo);
        System.out.println(student2.name);
        System.out.println(student2.phoneNo);
        System.out.println(student2.address);

        // student();



    }
}

