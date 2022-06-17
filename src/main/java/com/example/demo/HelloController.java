package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = {"/","/{name}"})
    public String hello(@PathVariable (required = false) String name){
        String sayHelloTo = name != null ? name : "World";
        return "Hello "+sayHelloTo;
    }
}
