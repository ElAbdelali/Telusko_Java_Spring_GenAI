package com.abdelali.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SbDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SbDemoApplication.class, args);

        Alien alien = context.getBean(Alien.class);
        alien.code();

//        Laptop lap = context.getBean(Laptop.class);
//        lap.compile();
    }

}
