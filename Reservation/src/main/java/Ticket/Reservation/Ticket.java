package main.java.Ticket.Reservation;

import java.util.List;

public class Ticket {
    private String name;
    private String email;
    private List<String> days;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public List<String> getDays() { return days; }
    public void setDays(List<String> days) { this.days = days; }
}
