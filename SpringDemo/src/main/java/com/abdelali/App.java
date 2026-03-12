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
        // Objects are created as soon as application context is initialized
        // if multiple instances of the bean ex: alien were provided in spring.xml, the same amount of objs will be created
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // What happens below?
        Alien obj = (Alien) context.getBean("alien1");
        obj.code();
        Alien obj1 = (Alien) context.getBean("alien1");
        obj1.code();

    }
}
