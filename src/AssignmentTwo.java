package src;

public class AssignmentTwo {
    public static void main(String[] args) {
        
        // Test Person, Employee, Visitor, and Ride classes
        Employee emp = new Employee("John Doe", 35, "Male", "E123", "Ride Operator");
        Visitor vis = new Visitor("Jane Smith", 28, "Female", "V001", true);
        Ride rollerCoaster = new Ride("Roller Coaster", 20, emp);

        Visitor v1 = new Visitor("Alice", 25, "Female", "V001", true);
        Visitor v2 = new Visitor("Bob", 28, "Male", "V002", false);
        Visitor v3 = new Visitor("Charlie", 23, "Male", "V003", false);
        Visitor v4 = new Visitor("Diana", 26, "Female", "V004", true);
        Visitor v5 = new Visitor("Eve", 29, "Female", "V005", false);

        // Add Visitors to queue
        rollerCoaster.addVisitorToQueue(v1);
        rollerCoaster.addVisitorToQueue(v2);
        rollerCoaster.addVisitorToQueue(v3);
        rollerCoaster.addVisitorToQueue(v4);
        rollerCoaster.addVisitorToQueue(v5);

        // Add Visitors to history
        rollerCoaster.addVisitorToHistory(v1);
        rollerCoaster.addVisitorToHistory(v2);
        rollerCoaster.addVisitorToHistory(v3);
        rollerCoaster.addVisitorToHistory(v4);
        rollerCoaster.addVisitorToHistory(v5);

        // Print queue
        System.out.println("\nQueue Before Removing Visitors:");
        rollerCoaster.printQueue();

        // Remove a visitor from queue
        rollerCoaster.removeVisitorFromQueue();

        // Print updated queue
        System.out.println("\nQueue After Removing One Visitor:");
        rollerCoaster.printQueue();

        // Print details
        System.out.println("Employee: " + emp.getName() + ", Role: " + emp.getRole());
        rollerCoaster.runOneCycle();
        System.out.println("Visitor: " + vis.getName() + ", VIP: " + vis.isVip());
        rollerCoaster.printQueue();
        System.out.println("Ride: " + rollerCoaster.getName() + ", Operator: " + rollerCoaster.getOperator().getName());
        rollerCoaster.printRideHistory();

        System.out.println("------------------------");
    }

    public void partFourA() {
        // Create a new Ride object
        Employee emp = new Employee("John Doe", 35, "Male", "E123", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 20, emp);
            
        // Add 5 Visitors to the ride history
        Visitor v1 = new Visitor("Alice", 25, "Female", "V001", true);
        Visitor v2 = new Visitor("Bob", 28, "Male", "V002", false);
        Visitor v3 = new Visitor("Charlie", 23, "Male", "V003", false);
        Visitor v4 = new Visitor("Diana", 26, "Female", "V004", true);
        Visitor v5 = new Visitor("Eve", 29, "Female", "V005", false);
            
        rollerCoaster.addVisitorToHistory(v1);
        rollerCoaster.addVisitorToHistory(v2);
        rollerCoaster.addVisitorToHistory(v3);
        rollerCoaster.addVisitorToHistory(v4);
        rollerCoaster.addVisitorToHistory(v5);

        // Check if a specific Visitor is in the history
        System.out.println("Is Bob in the history? " + rollerCoaster.checkVisitorFromHistory(v2));

        // Print the number of visitors in the history
        System.out.println("Total visitors in ride history: " + rollerCoaster.numberOfVisitors());
            
        // Print all visitors in the history using Iterator
        rollerCoaster.printRideHistory();

        System.out.println("------------------------");
    }

    public void partFourB() {
        // Create a new Ride object
        Employee emp = new Employee("John Doe", 35, "Male", "E123", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 20, emp);

        // Add 5 Visitors to the ride history
        Visitor v1 = new Visitor("Alice", 25, "Female", "V001", true);
        Visitor v2 = new Visitor("Bob", 28, "Male", "V002", false);
        Visitor v3 = new Visitor("Charlie", 23, "Male", "V003", false);
        Visitor v4 = new Visitor("Diana", 26, "Female", "V004", true);
        Visitor v5 = new Visitor("Eve", 29, "Female", "V005", false);

        rollerCoaster.addVisitorToHistory(v1);
        rollerCoaster.addVisitorToHistory(v2);
        rollerCoaster.addVisitorToHistory(v3);
        rollerCoaster.addVisitorToHistory(v4);
        rollerCoaster.addVisitorToHistory(v5);
        // Print unsorted ride history
        System.out.println("Unsorted Ride History:");
        rollerCoaster.printRideHistory();

        // Sort the ride history
        rollerCoaster.sortRideHistory();

        // Print sorted ride history
        System.out.println("Sorted Ride History:");
        rollerCoaster.printRideHistory();
        }
    public void partFive() {
        Employee emp = new Employee("John Doe", 35, "Male", "E123", "Ride Operator");
        Ride rollerCoaster = new Ride("Roller Coaster", 5, emp);
    }
}