package com.abdelali;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        // Spring has the IoC Container, we need to create one to indicate the use of Spring

        // ApplicationContext: Spring interface that represents the IoC container

        // Responsible for: Creating and managing bean objects, injecting dependencies between beans, managing the lifecycle of beans
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien obj = (Alien) context.getBean("alien");
        obj.code();

    }
}
