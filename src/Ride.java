package src;
import java.util.LinkedList;
import java.util.Queue;
// Ride class
public class Ride implements RideInterface{
    private String name;
    private int maxRiders;
    private Employee operator;
    private Queue<Visitor> queue;               // Queue to manage visitors
    private LinkedList<Visitor> rideHistory;    // History of visitors who took the ride
    // Default Constructor
    public Ride() {}

    // Parameterized Constructor
    public Ride(String name, int maxRiders, Employee operator) {
        this.name = name;
        this.maxRiders = maxRiders;
        this.operator = operator;
    }
        // Getters and Setters
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public int getMaxRiders() {
            return maxRiders;
        }
    
        public void setMaxRiders(int maxRiders) {
            this.maxRiders = maxRiders;
        }
    
        public Employee getOperator() {
            return operator;
        }
    
        public void setOperator(Employee operator) {
            this.operator = operator;
        }
}
