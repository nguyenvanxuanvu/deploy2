package com.example.demo;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/hellovu")
    public String hello(){
        return "helloddfdsfsdfdsfdsfdsf";
    }
}
