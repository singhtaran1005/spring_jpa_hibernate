package com.example.jpa_beans.demo_jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

@SpringBootApplication
public class DemoJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJpaApplication.class, args);


//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ApplicationContext
//        ctx.register(MyConfig.class);
//        ctx.refresh();  //to prevent illegal state exception
//        Hello obj = ctx.getBean(Hello.class);
//        Hello obj2 = ctx.getBean(Hello.class);
//
//        obj.setData("12");
//        obj.setMessage("Hello everyone!");
//        System.out.println(obj);
//        System.out.println(obj2);
    }
}


//whenever we run appln some other context is running !
