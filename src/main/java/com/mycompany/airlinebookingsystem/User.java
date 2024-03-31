package com.mycompany.airlinebookingsystem;

import java.util.ArrayList;
import java.util.List;

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

    public static List<User> users = new ArrayList<>();

    public static void addUser(User user) {
        users.add(user);
    }

    public static void deleteUser(int userID) {
        users.removeIf(user -> user.getUserID() == userID);
    }

    public static User getUserByID(int userID) {
        for (User user : users) {
            if (user.getUserID() == userID) {
                return user;
            }
        }
        throw new IllegalArgumentException("User not found with ID: " + userID);
    }

    @Override
    public String toString() {
        return "User ID: " + userID + "\nName: " + username + "\nEmail: " + userEmail +
                "\nDOB: " + userDOB + "\nAddress: " + userAddress;
    }
}
