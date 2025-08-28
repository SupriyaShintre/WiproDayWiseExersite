package com.wipro.order_service.service;

import java.util.List;

import com.wipro.order_service.entity.OrderEntity;

public interface OrderService {
  List<OrderEntity> findAll();
  OrderEntity findById(Long id);
  OrderEntity create(OrderEntity order);
  OrderEntity update(Long id, OrderEntity order);
  void delete(Long id);
}
