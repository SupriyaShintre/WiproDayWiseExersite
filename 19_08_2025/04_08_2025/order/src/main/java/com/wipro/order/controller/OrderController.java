package com.wipro.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.wipro.order.dto.OrderPaymentResponse;
import com.wipro.order.entity.Order;
import com.wipro.order.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/orders")  // Changed to plural for better REST practice
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Place a new order (POST /orders)
    @PostMapping
    public String placeOrder(@RequestBody Order order) {
        return orderService.placeOrder(order);
    }

    // Get order + payment details by orderId (GET /orders/{orderId})
    @GetMapping("/{orderId}")
    public OrderPaymentResponse getOrderWithPayment(@PathVariable int orderId) {
        return orderService.getOrderWithPayment(orderId);
    }

    // NEW: Get list of all orders (GET /orders)
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();  // <-- You need to implement this method in your service
    }
}
