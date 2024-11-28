package src;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;
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
        @Override
        public int numberOfVisitors() {
            return rideHistory.size();
        }
        @Override
        public void printRideHistory() {
            if (!rideHistory.isEmpty()) {
                System.out.println("Ride History:");
                for (Visitor visitor : rideHistory) {
                    System.out.println(visitor.getName());
                }
            } else {
                System.out.println("No visitors in ride history.");
            }
        }
    @Override
    public void runOneCycle() {
        if (operator == null) {
            System.out.println("No operator assigned. Cannot run the ride.");
            return;
        }

        if (queue.isEmpty()) {
            System.out.println("No visitors in the queue. Cannot run the ride.");
            return;
        }

        System.out.println("Running one cycle of the ride: " + name);

        int riders = Math.min(maxRiders, queue.size());
        for (int i = 0; i < riders; i++) {
            Visitor visitor = queue.poll();
            addVisitorToHistory(visitor);
            System.out.println("Visitor took the ride: " + visitor.getName());
        }
    }
    public void sortRideHistory() {
        Collections.sort(rideHistory, new VisitorComparator());
        System.out.println("Ride history sorted successfully.");;
    }
      
    public void exportRideHistory(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Visitor visitor : rideHistory) {
                writer.write(visitor.getName() + "," + visitor.getAge() + "," + visitor.getGender() + "," + visitor.getTicketId() + "," + visitor.isVip());
                writer.newLine();
            }
            System.out.println("Ride history exported successfully to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while exporting ride history: " + e.getMessage());
        }
    }
    public void importRideHistory(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                if (details.length == 5) { // Adjust based on Visitor fields
                    String name = details[0];
                    int age = Integer.parseInt(details[1]);
                    String gender = details[2];
                    String ticketId = details[3];
                    boolean isVip = Boolean.parseBoolean(details[4]);
                    Visitor visitor = new Visitor(name, age, gender, ticketId, isVip);
                    addVisitorToHistory(visitor);
                }
            }
            System.out.println("Ride history imported successfully from " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

}
        
