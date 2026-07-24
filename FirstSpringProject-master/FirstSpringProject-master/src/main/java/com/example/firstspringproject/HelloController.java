package com.example.firstspringproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/Hello")
    public String getHello(){
        return "<h1>Hello All!</h1>";
    }

    @GetMapping("/")
    public String getHome(){
        return "<h1>Welcome to home!😊</h1>";
    }

    @GetMapping("/test")
    public String getTest(){
        return "<h1>testingg......</h1>";
    }
}
