package com.wipro.relationdemo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;

    // Many posts belong to one person
    @ManyToOne
    @JoinColumn(name = "person_id")  // Foreign key column
    @JsonBackReference  // <-- Add this
    private Person person;
}
