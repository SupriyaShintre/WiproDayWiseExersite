package com.wipro.order_service.entity;


import java.time.Instant;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "orders")
@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class OrderEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Long userId;
  private Long foodId;

  private Integer quantity;
  private Double price;         
  private String status;        

  @Column(nullable = false, updatable = false)
  private Instant createdAt;

  @PrePersist
  void prePersist() {
    if (createdAt == null) createdAt = Instant.now();
    if (status == null) status = "CREATED";
  }
}
