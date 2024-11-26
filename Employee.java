// Employee class extending Person
import src.Person;
public class Employee extends Person {
    private String employeeId;
    private String role;

    // Default Constructor
    public Employee() {}

    // Parameterized Constructor
    public Employee(String name, int age, String gender, String employeeId, String role) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.role = role;
}
}