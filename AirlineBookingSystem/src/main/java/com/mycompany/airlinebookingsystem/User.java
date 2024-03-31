package com.mycompany.airlinebookingsystem;

public class User {
    private int userID;
    private String username, userEmail, userDOB, userAddress;

    public User(int user_id, String user_name, String user_email, String user_dob, String user_address) {
        this.userID = user_id;
        this.username = user_name;
        this.userEmail = user_email;
        this.userDOB = user_dob;
        this.userAddress = user_address;
    }

    public int getUserID() {
        return userID;
    }

    public String getName() {
        return username;
    }

    public void setName(String name) {
        this.username = name;
    }

    public String getEmail() {
        return userEmail;
    }

    public void setEmail(String email) {
        this.userEmail = email;
    }

    public String getDOB() {
        return userDOB;
    }

    public void setDOB(String dob) {
        this.userDOB = dob;
    }

    public String getAddress() {
        return userAddress;
    }

    public void setAddress(String address) {
        this.userAddress = address;
    }

    public void addUser() {
        // Implementation to add user
    }

    public void deleteUser() {
        // Implementation to delete user
    }

    public void updateUser() {
        // Implementation to update user
    }

    @Override
    public String toString() {
        return "User ID: " + userID + "\nName: " + username + "\nEmail: " + userEmail +
                "\nDOB: " + userDOB + "\nAddress: " + userAddress;
    }
}
