package src;
// Visitor class extending Person

public class Visitor extends Person {
    private String ticketId;
    private boolean isVip;

        // Default Constructor
    public Visitor() {}

    // Parameterized Constructor
    public Visitor(String name, int age, String gender, String ticketId, boolean isVip) {
        super(name, age, gender);
        this.ticketId = ticketId;
        this.isVip = isVip;
}
    // Getters and Setters
    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }
}