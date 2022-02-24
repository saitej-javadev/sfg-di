package com.springframework.pets;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;



public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - from Primary Bean";
    }
}
