package com.example.demo.controller;

import com.example.demo.model.Hello;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public Hello sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Hello("Hello, " + name + "!");
    }
}

