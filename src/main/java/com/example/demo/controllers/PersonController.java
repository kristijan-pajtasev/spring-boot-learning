package com.example.demo.controllers;

import com.example.demo.models.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class PersonController {


    @GetMapping("/person")
    public Greeting person() {
        return null;
//        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
