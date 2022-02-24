package com.saitej.sfgdi;

import com.saitej.sfgdi.controllers.*;
import com.saitej.sfgdi.controllers.services.PrototypeBean;
import com.saitej.sfgdi.controllers.services.SingletonBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.springframework.pets","com.saitej.sfgdi"})
@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
        MyController myController = ctx.getBean(MyController.class);
        System.out.println("-------------------Profiles");
        I18nController i18nController = ctx.getBean(I18nController.class);
        System.out.println(i18nController.sayHello());
        System.out.println("----------------from Primary Bean");
        System.out.println(myController.sayHello());
        System.out.println("---------------Property");
        PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
        System.out.println(propertyInjectedController.getGreeting());
        System.out.println("---------------Setter");
        SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
        System.out.println(setterInjectedController.getGreeting());
        System.out.println("---------------Constructor");
        ConsturctorInjectedController consturctorInjectedController = ctx.getBean(ConsturctorInjectedController.class);
        System.out.println(consturctorInjectedController.getGreeting());

        PetController petController = ctx.getBean(PetController.class);
        System.out.println(petController.getPetType());

        System.out.println("----------------------Bean Scopes----------------------");
        SingletonBean singletonBean = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean.getSingleton());
        SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
        System.out.println(singletonBean1.getSingleton());

        PrototypeBean prototypeBean = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean.getPrototype());
        PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
        System.out.println(prototypeBean1.getPrototype());

    }

}
