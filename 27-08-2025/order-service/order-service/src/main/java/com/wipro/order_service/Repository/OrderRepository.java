package com.wipro.order_service.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.order_service.entity.OrderEntity;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> { }

