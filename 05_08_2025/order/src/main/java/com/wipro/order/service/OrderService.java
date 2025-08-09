package com.wipro.order.service;


import java.util.List;

import com.wipro.order.dto.OrderPaymentResponse;
import com.wipro.order.entity.Order;
import com.wipro.order.model.Payment;

public interface OrderService {
    String placeOrder(Order order);
    Payment makePayment(Payment payment);
    OrderPaymentResponse getOrderWithPayment(int orderId);
    List<Order> getAllOrders();
}

