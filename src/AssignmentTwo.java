package src;

public class AssignmentTwo {
    public static void main(String[] args) {
        // Test Person, Employee, Visitor, and Ride classes
        Employee emp = new Employee("John Doe", 35, "Male", "E123", "Ride Operator");
        Visitor vis = new Visitor("Jane Smith", 28, "Female", "V001", true);
        Ride rollerCoaster = new Ride("Roller Coaster", 20, emp);

        // Print details
        System.out.println("Employee: " + emp.getName() + ", Role: " + emp.getRole());
        System.out.println("Visitor: " + vis.getName() + ", VIP: " + vis.isVip());
        System.out.println("Ride: " + rollerCoaster.getName() + ", Operator: " + rollerCoaster.getOperator().getName());
    }
}
