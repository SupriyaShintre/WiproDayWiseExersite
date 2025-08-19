package com.wipro.relationdemo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.relationdemo.entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}

