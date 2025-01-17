package org.example.entities;
import java.util.List;
public class User {
    private String name;
    private String password;
    private String hashedPassword;

    private List<Ticket> ticketsBooked;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    private String userId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public List<Ticket> getTicketsBooked() {
        return ticketsBooked;
    }

    public void setTicketsBooked(List<Ticket> ticketsBooked) {
        this.ticketsBooked = ticketsBooked;
    }

    public List<Ticket> getBookedTickets() {
        return ticketsBooked;
    }

    public String getHashedpassword() {
        return hashedPassword;
    }

    public void printTickets() {
        for (Ticket ticket : ticketsBooked) {
            System.out.println(ticket.getTicketId());
        }
    }

    public User(String name, String password, String hashedPassword, List<Ticket> ticketsBooked,String userId)
    {
        this.name = name;
        this.password = password;
        this.hashedPassword = hashedPassword;
        this.ticketsBooked = ticketsBooked;
        this.userId = userId;

    }
}
