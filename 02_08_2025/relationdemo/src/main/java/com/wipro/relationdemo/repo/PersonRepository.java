package com.wipro.relationdemo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.relationdemo.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
