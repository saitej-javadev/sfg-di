package com.springframework.pets;

import com.springframework.pets.GreetingService;
import org.springframework.stereotype.Service;

//@Service
public class ConstructorGreetingService implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
