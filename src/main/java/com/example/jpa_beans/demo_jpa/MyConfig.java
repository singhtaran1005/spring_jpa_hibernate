package com.example.jpa_beans.demo_jpa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration         // so that its picked by spring ioc container
public class MyConfig {
    @Bean
    public Hello getHelloObject() {
        return new Hello();
    }
}
