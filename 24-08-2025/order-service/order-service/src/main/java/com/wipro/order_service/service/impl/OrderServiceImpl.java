package com.wipro.order_service.service.impl;


import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.order_service.Repository.OrderRepository;
import com.wipro.order_service.entity.OrderEntity;
import com.wipro.order_service.service.OrderService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional
public class OrderServiceImpl implements OrderService {

  private final OrderRepository repo;

  @Override
  public List<OrderEntity> findAll() { return repo.findAll(); }

  @Override
  public OrderEntity findById(Long id) { return repo.findById(id).orElse(null); }

  @Override
  public OrderEntity create(OrderEntity order) { return repo.save(order); }

  @Override
  public OrderEntity update(Long id, OrderEntity order) {
    OrderEntity db = repo.findById(id).orElseThrow();
    db.setFoodId(order.getFoodId());
    db.setUserId(order.getUserId());
    db.setQuantity(order.getQuantity());
    db.setPrice(order.getPrice());
    db.setStatus(order.getStatus());
    return repo.save(db);
  }

  @Override
  public void delete(Long id) { repo.deleteById(id); }
}

