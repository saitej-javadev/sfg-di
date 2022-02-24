package com.saitej.sfgdi.controllers;

import com.springframework.pets.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("Hello World");
        return greetingService.sayGreeting();
    }


}
