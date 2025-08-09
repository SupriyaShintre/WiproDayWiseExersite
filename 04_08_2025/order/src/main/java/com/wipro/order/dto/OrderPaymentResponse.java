package com.wipro.order.dto;

import com.wipro.order.entity.Order;
import com.wipro.order.model.Payment;

public class OrderPaymentResponse {

    private Order order;
    private Payment payment;

    public OrderPaymentResponse(Order order, Payment payment) {
        this.order = order;
        this.payment = payment;
    }

    // getters & setters
    public Order getOrder() { return order; }
    public void setOrder(Order order) { this.order = order; }
    public Payment getPayment() { return payment; }
    public void setPayment(Payment payment) { this.payment = payment; }
}
