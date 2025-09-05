package com.tnsif.springq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringqualifiersApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext var = SpringApplication.run(SpringqualifiersApplication.class, args);
		Customer c1=var.getBean(Customer.class);
		c1.order();
	}

}
