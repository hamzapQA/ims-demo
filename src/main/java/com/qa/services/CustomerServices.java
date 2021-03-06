package com.qa.services;

import java.util.List;

import com.qa.services.CrudServices;
import com.qa.persistence.dao.Dao;
import com.qa.persistence.domain.Customer;
import com.qa.services.CustomerServices;

public class CustomerServices implements CrudServices<Customer> {

	private Dao<Customer> customerDao;
	
	public CustomerServices(Dao<Customer> customerDao) {
		this.customerDao = customerDao;
	}
	
	public List<Customer> readAll() {
		return customerDao.readAll();
	}

	public Customer create(Customer customer) {
		return customerDao.create(customer);
	}

	public Customer update(Customer customer) {
		return customerDao.update(customer);
	}

	public void delete(Long id) {
		customerDao.delete(id);
	}

}
