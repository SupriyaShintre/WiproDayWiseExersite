package com.wipro.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wipro.order.model.Payment;

@FeignClient(name = "payment-service", url = "http://localhost:9011")
public interface PaymentConnectService {

    @PostMapping("/payment")
    ResponseEntity<Payment> savePaymentData(@RequestBody Payment payment);

    @GetMapping("/payment/order/{orderId}")
    Payment getPaymentByOrderId(@PathVariable("orderId") int orderId);
}
