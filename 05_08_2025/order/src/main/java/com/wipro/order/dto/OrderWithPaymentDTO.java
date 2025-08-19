package com.wipro.order.dto;

import java.util.List;
import com.wipro.order.model.Payment;  // Adjust package if needed
import lombok.Data;

@Data
public class OrderWithPaymentDTO {
    private String orderNumber;
    private String orderStatus;
    private double orderValue;
    private List<Payment> payments; // List of payment DTOs
}
