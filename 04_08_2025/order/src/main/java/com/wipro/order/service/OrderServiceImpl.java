package com.wipro.order.service;

import com.wipro.order.dto.OrderPaymentResponse;
import com.wipro.order.entity.Order;
import com.wipro.order.model.Payment;
import com.wipro.order.repo.OrderRepo;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class OrderServiceImpl implements OrderService {

    // This name should match your resilience4j config in application.properties or yml
    private static final String PAYMENT_SERVICE = "order-cb";

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public String placeOrder(Order order) {
        // Save order with initial status
        order.setOrderStatus("I");
        Order savedOrder = orderRepo.save(order);

        // Call payment service via circuit breaker method
        String paymentResult = callPaymentService(savedOrder);

        if (paymentResult != null && paymentResult.contains("success")) {
            savedOrder.setOrderStatus("P"); // Payment successful
        } else {
            savedOrder.setOrderStatus("C"); // Payment failed or fallback triggered
        }
        orderRepo.save(savedOrder);

        return "Order placed with status: " + savedOrder.getOrderStatus();
    }

    // The circuit breaker annotation must be on the method declaration (not inside method body)
    @CircuitBreaker(name = PAYMENT_SERVICE, fallbackMethod = "paymentFallback")
    public String callPaymentService(Order order) {
        String paymentUrl = "http://localhost:9012/payment";
        return restTemplate.postForObject(paymentUrl, order, String.class);
    }

    // This fallback method must match the signature of the method + Throwable as last param
    public String paymentFallback(Order order, Throwable throwable) {
        System.out.println("Fallback called due to: " + throwable.getMessage());
        return "Payment service is currently unavailable. Please try again later.";
    }

    @Override
    public Payment makePayment(Payment payment) {
        String paymentUrl = "http://localhost:9012/payment";
        return restTemplate.postForObject(paymentUrl, payment, Payment.class);
    }

    @Override
    public OrderPaymentResponse getOrderWithPayment(int orderId) {
        Order order = orderRepo.findById(orderId)
                .orElseThrow(() -> new RuntimeException("Order not found with id: " + orderId));

        String paymentUrl = "http://localhost:9012/payment/order/" + orderId;
        Payment payment = restTemplate.getForObject(paymentUrl, Payment.class);

        return new OrderPaymentResponse(order, payment);
    }
    @Override
    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }
}
