package com.mycompany.airlinebookingsystem;

import java.util.ArrayList;
import java.util.List;

public class AirlineBookings {
    private User user;
    private int bookingID, flightNo;
    private String bookingDate, bookingDescription;
    private boolean status;

    public AirlineBookings(int booking_id, User user, int flight_no, String booking_date, String booking_description, boolean status) {
        this.bookingID = booking_id;
        this.user = user;
        this.flightNo = flight_no;
        this.bookingDate = booking_date;
        this.bookingDescription = booking_description;
        this.status = status;
    }

    public int getBookingID() {
        return bookingID;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public static List<AirlineBookings> bookings = new ArrayList<>();

    public static void addBooking(AirlineBookings booking) {
        bookings.add(booking);
    }

    public static void cancelBooking(int bookingID) {
        for (AirlineBookings booking : bookings) {
            if (booking.getBookingID() == bookingID) {
                booking.setStatus(false);
                return;
            }
        }
        throw new IllegalArgumentException("Booking not found with ID: " + bookingID);
    }

    public static AirlineBookings getBookingByID(int bookingID) {
        for (AirlineBookings booking : bookings) {
            if (booking.getBookingID() == bookingID) {
                return booking;
            }
        }
        throw new IllegalArgumentException("Booking not found with ID: " + bookingID);
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingID + "\nUser: " + user.getName() +
                "\nFlight No: " + flightNo + "\nBooking Date: " + bookingDate +
                "\nBooking Description: " + bookingDescription + "\nStatus: " + status;
    }
}
