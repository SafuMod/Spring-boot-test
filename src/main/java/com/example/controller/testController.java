package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @RequestMapping("/")
    public String test(){
        return "Hey there we have started";
    }

    @RequestMapping("/name")
    public String name(){
        return "Amreen";
    }
}
