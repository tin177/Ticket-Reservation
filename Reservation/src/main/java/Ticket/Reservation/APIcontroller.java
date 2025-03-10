package main.java.Ticket.Reservation;

import org.springframework.web.bind.annotation.*;
import java.util.*;

public class APIcontroller {
    private static final Map<String, Ticket> reservations = new HashMap<>();

    @PostMapping
    public String reserveTicket(@RequestBody Ticket ticket) {
        reservations.put(ticket.getEmail(), ticket);
        return "Reservation successful for " + ticket.getName();
    }

    @GetMapping
    public Ticket getReservation(@RequestParam String name, @RequestParam String email) {
        return reservations.getOrDefault(email, new Ticket());
    }

    @DeleteMapping
    public String removeReservation(@RequestParam String name, @RequestParam String email) {
        reservations.remove(email);
        return "Reservation removed for " + name;
    }
}
}
