package com.example.microservice.demo;




import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyController {

    @RequestMapping("/")
    public String homePage(){
        return "index";
    }
}
