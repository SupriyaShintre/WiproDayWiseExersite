package com.wipro.relationdemo.controller;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.wipro.relationdemo.entity.Person;
import com.wipro.relationdemo.entity.Post;
import com.wipro.relationdemo.repo.PersonRepository;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonRepository personRepository;

    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public Person createPerson(@RequestBody Person person) {
        if (person.getPosts() != null) {
            for (Post post : person.getPosts()) {
                post.setPerson(person); // set back-reference
            }
        }
        return personRepository.save(person);
    }
}
