package com.wipro.annonymous;

public class BankDemo {
    public static void main(String[] args) {

        // Anonymous inner class for Savings Account
        BankOps savingsAccount = new BankOps() {
            @Override
            public void deposit(double amount) {
                System.out.println("Deposited ₹" + amount + " into Savings Account");
            }
        };

        // Anonymous inner class for Current Account
        BankOps currentAccount = new BankOps() {
            @Override
            public void deposit(double amount) {
                System.out.println("Deposited ₹" + amount + " into Current Account");
            }
        };

        // Calling deposit method from both objects
        savingsAccount.deposit(5000);
        currentAccount.deposit(10000);
    }
}