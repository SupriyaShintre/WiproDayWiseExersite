package com.wipro.relationdemo.repo;

import com.wipro.relationdemo.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {}
