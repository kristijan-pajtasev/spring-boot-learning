package com.example.demo.controllers;

import com.example.demo.models.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class PersonController {
    List<Person> people = new ArrayList<>();
    private int id = 2;

    {
        people.add(new Person(1, "John", "Doe", new Date()));
        people.add(new Person(2, "John 2", "Doe 2", new Date()));
    }

    @GetMapping("/person")
    public List<Person> person() {
        return people;
    }

    @GetMapping("/person/{id}")
    public Person person(@PathVariable("id") int id) {
        for (Person person : people) {
            if (person.getId() == id) return person;
        }
        throw new Error();
    }

    @PostMapping("/person")
    public Person makePerson(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String dob) throws ParseException {
        id++;
        Date dateOfBirth = new SimpleDateFormat("yyyy-MM-dd").parse(dob);
        Person person = new Person(id, firstName, lastName, dateOfBirth);
        people.add(person);
        return person;
    }
}
