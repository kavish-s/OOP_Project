package com.mycompany.airlinebookingsystem;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private int ticketID, flightNo;
    private String seatNo, depDate, depTime, arrDate, arrTime;
    private String from, destination;

    public Ticket(int ticket_id) {
        this.ticketID = ticket_id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public static List<Ticket> tickets = new ArrayList<>();

    public static void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public static void deleteTicket(int ticketID) {
        tickets.removeIf(ticket -> ticket.ticketID == ticketID);
    }

    public static Ticket getTicketByID(int ticketID) {
        for (Ticket ticket : tickets) {
            if (ticket.ticketID == ticketID) {
                return ticket;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketID + "\nFlight No: " + flightNo +
                "\nDestination: " + destination + "\nSeat No: " + seatNo;
    }
}
