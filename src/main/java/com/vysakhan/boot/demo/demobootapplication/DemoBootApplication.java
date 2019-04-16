package com.vysakhan.boot.demo.demobootapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoBootApplication{
    public static void main(String... args){
        SpringApplication.run(DemoBootApplication.class, args);
    }
    
    @GetMapping("/")
    public String greeting(){
        return "Hello";
    }
}