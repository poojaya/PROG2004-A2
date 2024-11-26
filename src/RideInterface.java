package src;

// RideInterface
import java.util.LinkedList;

public interface RideInterface {
    void addVisitorToQueue(Visitor visitor);         // Add visitor to queue
    void removeVisitorFromQueue();                  // Remove visitor from queue
    void printQueue();                              // Print visitors in queue
    void runOneCycle();                             // Run a ride cycle
    void addVisitorToHistory(Visitor visitor);      // Add visitor to ride history
    boolean checkVisitorFromHistory(Visitor visitor); // Check if visitor in history
    int numberOfVisitors();                         // Number of visitors in ride history
    void printRideHistory();                        // Print ride history
}

