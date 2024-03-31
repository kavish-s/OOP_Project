package com.mycompany.airlinebookingsystem;

public class AirlineDetails {
    private String airlineName;
    private int flightNo, capacity;
    private boolean availability;

    public AirlineDetails(int flight_no) {
        this.flightNo = flight_no;
    }

    public boolean getAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void updateFlightDetails() {
        // Implementation to update flight details
    }

    @Override
    public String toString() {
        return "Airline Name: " + airlineName + "\nFlight No: " + flightNo +
                "\nCapacity: " + capacity + "\nAvailability: " + availability;
    }
}
