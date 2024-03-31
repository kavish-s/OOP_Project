package com.mycompany.airlinebookingsystem;

public class AirlineBookingSystem {

    public static void main(String[] args) {
        // Creating Users
        User user1 = new User(1, "John Doe", "john@example.com", "1990-01-01", "123 Main St");
        User user2 = new User(2, "Jane Smith", "jane@example.com", "1995-02-15", "456 Elm St");

        // Adding Users to the User list
        User.addUser(user1);
        User.addUser(user2);

        // Creating Bookings
        AirlineBookings booking1 = new AirlineBookings(101, user1, 101, "2024-04-05", "Business Class", true);
        AirlineBookings booking2 = new AirlineBookings(102, user2, 102, "2024-04-07", "Economy Class", true);

        // Adding Bookings to the Booking list
        AirlineBookings.addBooking(booking1);
        AirlineBookings.addBooking(booking2);

        // Printing User Details
        System.out.println("User Details:\n" + User.getUserByID(1));
        System.out.println("\nUser Details:\n" + User.getUserByID(2));

        // Printing Booking Details
        System.out.println("\nBooking Details:\n" + AirlineBookings.getBookingByID(101));
        System.out.println("\nBooking Details:\n" + AirlineBookings.getBookingByID(102));
    }
}
