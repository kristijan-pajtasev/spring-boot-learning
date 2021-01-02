package com.example.demo.controllers;

import com.example.demo.models.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class PersonController {


    @GetMapping("/person")
    public List<Person> person() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Doe", new Date()));
        return people;
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
