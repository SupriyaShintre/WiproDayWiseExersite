package com.wirpo.oop.test;

import com.wipro.oop.Gpay;
import com.wipro.oop.PaymentMethod;
import com.wipro.oop.PhonePay;

public class PaymentTest {
    public static void main(String[] args) {
        PaymentMethod payment;

        payment = new Gpay();
        payment.pay(1500);

        payment = new PhonePay();
        payment.pay(2500);
    }
}
