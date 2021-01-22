package com.qa.controller;

import java.util.List;

import org.apache.log4j.Logger;

import com.qa.persistence.domain.Customer;
import com.qa.services.CrudServices;
import com.qa.utils.Utils;

public class CustomerController implements CrudController<Customer>{

	public static final Logger LOGGER = Logger.getLogger(CustomerController.class);
	
	private CrudServices<Customer> customerService;
	
	public CustomerController(CrudServices<Customer> customerService) {
		this.customerService = customerService;
	}
	

	String getInput() {
		return Utils.getInput();
	}
	
	@Override
	public List<Customer> readAll() {
		List<Customer> customers = customerService.readAll();
		for(Customer customer: customers) {
			LOGGER.info(customer.toString());
		}
		return customers;
	}

	public Customer create() {
		LOGGER.info("Please enter First Name");
		String firstName = getInput();
		LOGGER.info("Please enter Surname");
		String surname = getInput();
		Customer customer = customerService.create(new Customer(firstName, surname));
		LOGGER.info("Customer created");
		return customer;
	}

	
	@Override
	public Customer update() {
		LOGGER.info("Please enter id of customerto update");
		Long id = Long.valueOf(getInput());
		LOGGER.info("Please enter a first name");
		String firstName = getInput();
		LOGGER.info("Please enter a surname");
		String surname = getInput();
		Customer customer = customerService.update(new Customer(id, firstName, surname));
		LOGGER.info("Customer Updated");
		return customer;
	}


	@Override
	public void delete() {
		LOGGER.info("Please enter the id of the customer you would like to delete");
		Long id = Long.valueOf(getInput());
		customerService.delete(id);
	}
	
}