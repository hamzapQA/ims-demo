package com.qa.services;

import java.util.List;
import com.qa.persistence.dao.Dao;
import com.qa.persistence.domain.Orders;

public class OrderServices implements CrudServices<Orders> {

private Dao<Orders> orderDao;
	
	public OrderServices(Dao<Orders> orderDao) {
		this.orderDao = orderDao;
		
	}

	@Override
	public List<Orders> readAll() {
		
		return orderDao.readAll();
	}

	@Override
	public Orders create(Orders order) {
		return orderDao.create(order);
	}

	@Override
	public Orders update(Orders order) {
		return orderDao.update(order);
		
	}

	@Override
	public void delete(Long id) {
		orderDao.delete(id);
		
	}

	
}
