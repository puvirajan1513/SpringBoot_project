package com.tnsif.SpringIocDi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("productconfig.xml");
        Product p1 = (Product) context.getBean("p1");
        Product p2 = (Product) context.getBean("p2");
        Product cart = (Product) context.getBean("cartBean");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(cart);
    }
}
