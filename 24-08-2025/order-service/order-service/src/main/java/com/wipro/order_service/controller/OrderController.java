package com.wipro.order_service.controller;


import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.wipro.order_service.entity.OrderEntity;
import com.wipro.order_service.service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

  private final OrderService service;

  @GetMapping
  public List<OrderEntity> all() {
    return service.findAll();
  }

  @GetMapping("/{id}")
  public OrderEntity byId(@PathVariable Long id) {
    return service.findById(id);
  }

  @PostMapping
  
  @ResponseStatus(HttpStatus.CREATED)
  public OrderEntity create(@RequestBody OrderEntity order) {
    return service.create(order);
  }

  @PutMapping("/{id}")
  public OrderEntity update(@PathVariable Long id, @RequestBody OrderEntity order) {
    return service.update(id, order);
  }

  @DeleteMapping("/{id}")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void delete(@PathVariable Long id) {
    service.delete(id);
  }
}

