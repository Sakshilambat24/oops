package encapsulation;

public class Employeeimpl {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.setId(10);
        employee.setName("sakshi");
        System.out.println(employee.getId());
        System.out.println(employee.getName());
    }
}
