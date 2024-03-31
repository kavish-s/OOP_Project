package com.mycompany.airlinebookingsystem;

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

    public void addTicket() {
        // Implementation to add ticket
    }

    public void deleteTicket() {
        // Implementation to delete ticket
    }

    public void updateTicket() {
        // Implementation to update ticket
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketID + "\nFlight No: " + flightNo +
                "\nDestination: " + destination + "\nSeat No: " + seatNo;
    }
}
