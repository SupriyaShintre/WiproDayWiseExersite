package com.wirpo.oop.test;

import com.wipro.oop.BankOps;
import com.wipro.oop.HDFC;
import com.wipro.oop.Citi;

public class BankTest {
    public static void main(String[] args) {
        BankOps hdfc = new HDFC();
        BankOps citi = new Citi();

        hdfc.deposit(2000, "HDFC123");
        hdfc.withdraw(3000, "HDFC123");
        citi.deposit(1000, "CITI456");
        citi.withdraw(7000, "CITI456");
    }
}
