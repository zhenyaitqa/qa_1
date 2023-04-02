public class Employee {
    private int salary;
    public String surname;
    protected int id;

    public void getId() {
        System.out.println(this.id);
    }
    public void getSalary() {
        System.out.println(this.salary);
    }
    public void getSurname() {
        System.out.println(this.surname);
    }

    public Employee(String surname) {
        this.surname = surname;
    }
    private Employee(int salary) {
        this.salary = salary;
    }
    Employee(int salary, String surname, int id) {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    public static void main(String[] arg) {
        Employee employee = new Employee(1000);
        employee.getId();
        employee.getSalary();
        employee.getSurname();
    }
}
