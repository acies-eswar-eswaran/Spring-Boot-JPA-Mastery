package com.mycompany.property.management.controller;

import com.mycompany.property.management.dto.propertyDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class propertyController {

// http://localhost:8080/api/v1/properties/hello (Rest full api)

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }

    @PostMapping("/properties")
    public propertyDTO saveProperty(@RequestBody propertyDTO propertyDTO){
        System.out.println(propertyDTO);
        return propertyDTO;
    }
}