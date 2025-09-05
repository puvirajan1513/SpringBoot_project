package com.tnsif.springIOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Shop {
	
	@Autowired
	private Customer customer;
	@Autowired
	private Customer1 customer1;
	@Autowired
	private Customer2 customer2;
	
	public void ordering() {
		customer.order();
		customer1.order();
		customer2.order();
		
	}

}
