package com.wipro.oop;

public class HDFC implements BankOps {
    private double balance = 10000; 
    @Override
    public void deposit(double amount, String accNumber) {
        balance += amount;
        System.out.println("HDFC: Deposited ₹" + amount + " into account " + accNumber);
    }

    @Override
    public double withdraw(double amount, String accNumber) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("HDFC: Withdrawn ₹" + amount + " from account " + accNumber);
        } else {
            System.out.println("HDFC: Insufficient balance in account " + accNumber);
        }
        return balance;
    }
}
