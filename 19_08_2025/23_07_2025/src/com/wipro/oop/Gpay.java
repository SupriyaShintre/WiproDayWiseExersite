package com.wipro.oop;

public class Gpay implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Gpay.");
    }
}

