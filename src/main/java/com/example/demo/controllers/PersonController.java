package com.example.demo.controllers;

import com.example.demo.models.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class PersonController {
    List<Person> people = new ArrayList<>();

    {
        people.add(new Person(1, "John", "Doe", new Date()));
    }

    @GetMapping("/person")
    public List<Person> person() {
        return people;
    }

    @GetMapping("/person/{id}")
    public Person person(@PathVariable("id") int id) {
        for(Person person : people) {
            if(person.getId() == id) return person;
        }
        throw new Error();
    }
}
