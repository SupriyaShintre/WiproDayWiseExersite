package com.wipro.relationdemo.repo;

import com.wipro.relationdemo.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {}
