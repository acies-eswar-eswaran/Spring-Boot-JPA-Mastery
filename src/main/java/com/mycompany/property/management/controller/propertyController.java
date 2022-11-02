package com.mycompany.property.management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/properties")
public class propertyController {

// http://localhost:8080/api/v1/properties/hello (Rest full api)

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }
}
