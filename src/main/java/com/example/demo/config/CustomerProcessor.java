package com.example.demo.config;

import org.springframework.batch.item.ItemProcessor;

import com.example.demo.domain.Customer;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer item) throws Exception {
//		if(item.getCountry())
		return item;
	}

}
