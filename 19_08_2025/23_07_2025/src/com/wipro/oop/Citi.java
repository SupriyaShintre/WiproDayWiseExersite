package com.wipro.oop;

public class Citi implements BankOps {
    private double balance = 5000; // initial balance

    @Override
    public void deposit(double amount, String accNumber) {
        balance += amount;
        System.out.println("Citi: Deposited ₹" + amount + " into account " + accNumber);
    }

    @Override
    public double withdraw(double amount, String accNumber) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Citi: Withdrawn ₹" + amount + " from account " + accNumber);
        } else {
            System.out.println("Citi: Insufficient balance in account " + accNumber);
        }
        return balance;
    }
}
