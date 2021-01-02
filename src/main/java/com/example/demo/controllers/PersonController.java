package com.example.demo.controllers;

import com.example.demo.models.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class PersonController {


    @GetMapping("/person")
    public Person person() {
        return new Person("John", "Doe", new Date());
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
