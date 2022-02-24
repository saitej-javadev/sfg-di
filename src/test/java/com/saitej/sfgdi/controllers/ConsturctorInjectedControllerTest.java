package com.saitej.sfgdi.controllers;

import com.saitej.sfgdi.controllers.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConsturctorInjectedControllerTest {
    ConsturctorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConsturctorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}