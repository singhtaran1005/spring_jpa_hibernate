package com.example.jpa_beans.demo_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired   //injecting some other bean -> usong autowired
    Hello helloWorld;

    @GetMapping("/basic")
    public void func() {
        System.out.println(helloWorld);
    }

}
