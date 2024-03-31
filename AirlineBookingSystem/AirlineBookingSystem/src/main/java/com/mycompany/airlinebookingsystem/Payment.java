package com.mycompany.airlinebookingsystem;

public class Payment extends User {
    private int paymentID;
    private double amount;
    private String paymentDate, paymentMethod;

    public Payment(int payment_id, User user, double amount, String payment_date, String payment_method) {
        super(user.getUserID(), user.getName(), user.getEmail(), user.getDOB(), user.getAddress());
        this.paymentID = payment_id;
        this.amount = amount;
        this.paymentDate = payment_date;
        this.paymentMethod = payment_method;
    }

    public int getPaymentID() {
        return paymentID;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void processPayment() {
        // Implementation to process payment
    }

    public void cancelPayment() {
        // Implementation to cancel payment
    }

    @Override
    public String toString() {
        return super.toString() + "\nPayment ID: " + paymentID + "\nAmount: " + amount +
                "\nPayment Date: " + paymentDate + "\nPayment Method: " + paymentMethod;
    }
}
