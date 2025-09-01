package com.tnsif.SampleSpring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Load the Spring config file (beans.xml must be inside resources folder)
        ApplicationContext var = new ClassPathXmlApplicationContext("applicationcontext.xml");

        // Fetch the bean from Spring container
        Customer c = var.getBean("clothes", Customer.class);

        // Just to check
        System.out.println(c);
        
        
    }
}
