package src;

// Ride class
public class Ride {
    private String name;
    private int maxRiders;
    private Employee operator;
    // Default Constructor
    public Ride() {}

    // Parameterized Constructor
    public Ride(String name, int maxRiders, Employee operator) {
        this.name = name;
        this.maxRiders = maxRiders;
        this.operator = operator;
    }
}
