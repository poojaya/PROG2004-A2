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
    public Ride() {
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
    }

    // Parameterized Constructor
    public Ride(String name, int maxRiders, Employee operator) {
        this.name = name;
        this.maxRiders = maxRiders;
        this.operator = operator;
        this.queue = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
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
        @Override
        public void addVisitorToQueue(Visitor visitor) {
            queue.add(visitor);
            System.out.println("Added visitor to queue: " + visitor.getName());
        }
        @Override
        public void removeVisitorFromQueue() {
            if (!queue.isEmpty()) {
                Visitor removedVisitor = queue.poll();
                System.out.println("Removed visitor from queue: " + removedVisitor.getName());
            } else {
                System.out.println("Queue is empty. No visitors to remove.");
            }
        }
        @Override
        public void printQueue() {
            if (!queue.isEmpty()) {
                System.out.println("Visitors in the queue:");
                for (Visitor visitor : queue) {
                    System.out.println(visitor.getName());
                }
            } else {
                System.out.println("Queue is empty.");
            }
        }
        @Override
        public void addVisitorToHistory(Visitor visitor) {
            rideHistory.add(visitor);
            System.out.println("Added visitor to ride history: " + visitor.getName());
        }
        @Override
        public boolean checkVisitorFromHistory(Visitor visitor) {
            return rideHistory.contains(visitor);
        }



}
