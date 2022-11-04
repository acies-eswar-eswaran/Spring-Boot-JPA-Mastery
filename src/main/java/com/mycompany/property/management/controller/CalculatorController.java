package com.mycompany.property.management.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/calculator") //class level mapping of url to a controller class

public class CalculatorController {

// http://localhost:8080/api/v1/calculator/operators/10?Type=add&num1=5
    @GetMapping("/operators/{num2}") //method level mapping of url to a controller function
    public Double operators(@RequestParam("Type") String Type, @RequestParam("num1") Double num1, @PathVariable("num2") Double num2){
    Double Value;
    System.out.println(Type);
        switch (Type){
            case "add":
                Value = num1 + num2;
                break;
            case "sub":
                Value = num1-num2;
                break;
            case "div":
                Value=num1/num2;
                break;
            default:
                Value = num1*num2;
     }
     return Value;
    }
}