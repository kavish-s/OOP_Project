package com.mycompany.airlinebookingsystem;

public class AirlineBookingSystem {

    public static void main(String[] args) {
        // Creating User
        User user1 = new User(36, "Kavish Shah", "Kavish.shah25@nmims.in", "18-06-2004", "Malad East");

        // Creating Passenger
        Passenger passenger1 = new Passenger(101, user1, "Jane Doe", "1234567890", "1995-01-01", "456 Elm St");

        // Creating Payment
        Payment payment1 = new Payment(201, user1, 100.00, "2024-04-01", "Credit Card");

        // Creating Ticket
        Ticket ticket1 = new Ticket(301);
        ticket1.setDestination("New York");

        // Creating AirlineDetails
        AirlineDetails airlineDetails1 = new AirlineDetails(401);
        airlineDetails1.setAvailability(true);

        // Creating AirlineBookings
        AirlineBookings booking1 = new AirlineBookings(501, user1, 101, "2024-04-05", "Business Class", true);

        // Printing details
        System.out.println("User Details:\n" + user1);
        System.out.println("\nPassenger Details:\n" + passenger1);
        System.out.println("\nPayment Details:\n" + payment1);
        System.out.println("\nTicket Details:\n" + ticket1);
        System.out.println("\nAirline Details:\n" + airlineDetails1);
        System.out.println("\nBooking Details:\n" + booking1);
    }
}
