package com.wipro.order.model;

import java.util.List;

public class OrderResponse {
    private int id;
    private String orderNumber;
    private String orderStatus;
    private double orderValue;
    private List<Payment> payment;

    // Getters and Setters

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getOrderNumber() { return orderNumber; }
    public void setOrderNumber(String orderNumber) { this.orderNumber = orderNumber; }

    public String getOrderStatus() { return orderStatus; }
    public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }

    public double getOrderValue() { return orderValue; }
    public void setOrderValue(double orderValue) { this.orderValue = orderValue; }

    public List<Payment> getPayment() { return payment; }
    public void setPayment(List<Payment> payment) { this.payment = payment; }
}
