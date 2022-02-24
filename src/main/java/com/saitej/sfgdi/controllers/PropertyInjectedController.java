package com.saitej.sfgdi.controllers;

import com.springframework.pets.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyGreetingService")
    @Autowired
    public GreetingService greetingService;


    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
