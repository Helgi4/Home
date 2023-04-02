package Employee;

public class Employee {

    private int id;
    private String surname;
    private double salary;

    public Employee() {
    }

    public Employee(int id, String surname, double salary) {
        this.id = id;
        this.surname = surname;
        this.salary = salary;
    }

    public void displayId() {
        System.out.println("Employee ID: " + id);
    }

    public void displaySurname() {
        System.out.println("Employee surname: " + surname);
    }

    public void displaySalary() {
        System.out.println("Employee salary: " + salary);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(144, "Oleh", 1000);
        employee1.displayId();
        employee1.displaySurname();
        employee1.displaySalary();
    }
}
