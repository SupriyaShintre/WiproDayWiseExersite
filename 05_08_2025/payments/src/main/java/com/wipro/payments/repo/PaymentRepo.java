package com.wipro.payments.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.payments.entity.Payment;

@Repository
public interface PaymentRepo extends JpaRepository<Payment, Integer> {
	Optional<Payment> findByOrderId(int orderId);

}
