package com.saitej.sfgdi.controllers.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("Creating SingletonBean!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
    public String getSingleton(){
        return "I' am Singleton";
    }
}
