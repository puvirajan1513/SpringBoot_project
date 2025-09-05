package com.tnsif.springIOC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIocApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(SpringIocApplication.class, args);
		
		Shop s1=var.getBean(Shop.class);
		
		s1.ordering();
		
		Customer c1=var.getBean(Customer.class);
		
		c1.order();
	}

}
