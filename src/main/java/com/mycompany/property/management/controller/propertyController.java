package com.mycompany.property.management.controller;
import com.mycompany.property.management.dto.PropertyDTO;
import com.mycompany.property.management.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class propertyController {

    @Autowired
    private PropertyService propertyService;

//    RESTFUL Api is the mapping of a url to java class function
// http://localhost:8080/api/v1/properties/hello (Rest full api)

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello";
    }

    @PostMapping("/properties")
    public PropertyDTO saveProperty(@RequestBody PropertyDTO propertyDTO){
       propertyService.saveProperty(propertyDTO);
        System.out.println(propertyDTO);
        return propertyDTO;
    }
}