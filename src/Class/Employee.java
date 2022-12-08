package Class;


public class Employee {

    int info(String name,int yoj,String address){
        String space="\t\t\t";
        System.out.println("name"+space);
        System.out.println("YEAR OF JOINING "+space);
        System.out.println("ADRESS");

        System.out.println(name+space);
        System.out.println(yoj+space);
        System.out.println(address+space);
        return yoj;

    }

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.info("robert\t",1994,"64c-wallstreet");
        employee.info("sam \t",1998,"65c-wallstreet");
        employee.info("john\t",2000,"68c-wallstreet");

    }
}

