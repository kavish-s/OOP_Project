package com.mycompany.airlinebookingsystem;

public class AirlineBookingSystem {

    public static void main(String[] args) {
        try {
            // Creating Users
            User user1 = new User(1, "Kavish Shah", "kavish.shah25@nmims.in", "2004-06-18", "Malad East");
            User user2 = new User(2, "Kriya Shah", "kriya.shah@nmims.in", "1995-02-15", "Juhu");
            User user3 = new User(3, "Avani Bhat", "avani.bhat@nmims.in", "1995-02-15", "Juhu");

            // Adding Users to the User list
            User.addUser(user1);
            User.addUser(user2);
            User.addUser(user3);

            // Creating Bookings
            AirlineBookings booking1 = new AirlineBookings(101, user1, 101, "2024-04-05", "Business Class", true);
            AirlineBookings booking2 = new AirlineBookings(102, user2, 102, "2024-04-07", "Economy Class", true);
            AirlineBookings booking3 = new AirlineBookings(103, user3, 103, "2024-04-09", "First Class", true);

            // Adding Bookings to the Booking list
            AirlineBookings.addBooking(booking1);
            AirlineBookings.addBooking(booking2);
            AirlineBookings.addBooking(booking3);

            // Print User Details
            System.out.println("User Details:");
            for (User user : User.users) {
                System.out.println(user);
            }

            // Print Booking Details
            System.out.println("\nBooking Details:");
            for (AirlineBookings booking : AirlineBookings.bookings) {
                System.out.println(booking);
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
