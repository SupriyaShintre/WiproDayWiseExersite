package com.wipro.oop;

public class PhonePay implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using PhonePay.");
    }
}

