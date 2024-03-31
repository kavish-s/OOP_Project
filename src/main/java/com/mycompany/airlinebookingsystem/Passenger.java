package com.mycompany.airlinebookingsystem;

public class Passenger extends User {
    private int passengerID;
    private String passengerName, passengerMobile, passengerDOB, passengerAddress;

    public Passenger(int passenger_id, User user, String passenger_name, String passenger_mobile, String passenger_dob, String passenger_address) {
        super(user.getUserID(), user.getName(), user.getEmail(), user.getDOB(), user.getAddress());
        this.passengerID = passenger_id;
        this.passengerName = passenger_name;
        this.passengerMobile = passenger_mobile;
        this.passengerDOB = passenger_dob;
        this.passengerAddress = passenger_address;
    }

    public int getPassengerID() {
        return passengerID;
    }

    public String getName() {
        return passengerName;
    }

    public void setName(String name) {
        this.passengerName = name;
    }

    public String getMobile() {
        return passengerMobile;
    }

    public void setMobile(String mobile) {
        this.passengerMobile = mobile;
    }

    public String getDOB() {
        return passengerDOB;
    }

    public void setDOB(String dob) {
        this.passengerDOB = dob;
    }

    public String getAddress() {
        return passengerAddress;
    }

    public void setAddress(String address) {
        this.passengerAddress = address;
    }

    public void addPassenger() {
    System.out.println("Passenger added successfully.");
    }

    public void deletePassenger() {
        System.out.println("Passenger deleted successfully.");
    }

    public void updatePassenger() {
        System.out.println("Passenger updated successfully.");
    }
    
    public void updatePassengerDetails(String mobile, String address) {
        this.passengerMobile = mobile;
        this.passengerAddress = address;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPassenger ID: " + passengerID + "\nName: " + passengerName +
                "\nMobile: " + passengerMobile + "\nDOB: " + passengerDOB + "\nAddress: " + passengerAddress;
    }
}
