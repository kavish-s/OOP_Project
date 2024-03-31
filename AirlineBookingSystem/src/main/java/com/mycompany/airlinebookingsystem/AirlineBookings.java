package com.mycompany.airlinebookingsystem;

public class AirlineBookings {
    private User user;
    private int bookingID, flightNo;
    private String bookingDate, bookingDescription;
    private boolean status;

    public AirlineBookings(int booking_id, User user, int flight_no, String booking_date, String booking_description, boolean status) {
        super();
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

    public void bookFlight() {
        // Implementation to book flight
    }

    public void cancelBooking() {
        // Implementation to cancel booking
    }

    public void updateBooking() {
        // Implementation to update booking
    }

    @Override
    public String toString() {
        return "Booking ID: " + bookingID + "\nUser: " + user.getName() +
                "\nFlight No: " + flightNo + "\nBooking Date: " + bookingDate +
                "\nBooking Description: " + bookingDescription + "\nStatus: " + status;
    }
}
