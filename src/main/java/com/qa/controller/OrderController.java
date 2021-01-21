package com.qa.controller;

import java.util.List;
import org.apache.log4j.Logger;
import com.qa.services.CrudServices;
import com.qa.controller.CrudController;
import com.qa.persistence.domain.Orders;
import com.qa.utils.Utils;

public class OrderController implements CrudController<Orders> {

	public static final Logger LOGGER = Logger.getLogger(OrderController.class);
	private CrudServices<Orders> orderservice;

	public OrderController(CrudServices<Orders> orderservice) {
		this.orderservice = orderservice;

	}

	String getInput() {
		return Utils.getInput();

	}

	@Override
	public List<Orders> readAll() {
		List<Orders> orders = orderservice.readAll();
		for (Orders order : orders) {
			LOGGER.info(order.toString());
		}
		return orders;
	}

	@Override
	public Orders create() {

		LOGGER.info("Enter Customer ID");
		Long customerId = Long.valueOf(getInput());
		LOGGER.info("Enter Order Date using format DD/MM/YYYY");
		String datePlaced = getInput();
		Orders orders = orderservice.create(new Orders(customerId, datePlaced));

		LOGGER.info("Order Succesfully Created. Select Orderline to add items and total");
		return orders;
	}

	@Override
	public Orders update() {
LOGGER.info("Enter ID of order to update");
		Long order_id = Long.valueOf(getInput());
		LOGGER.info("Enter the customer ID relevent to this order");
		Long customerId = Long.valueOf(getInput());
		LOGGER.info("Enter updated order date");
		String dateplaced = getInput();
		Orders orders = orderservice.update(new Orders(order_id, customerId, dateplaced));
		LOGGER.info("Order has been updated");
		
		return orders;
	}
		

	@Override
	public void delete() {
		LOGGER.info("Enter ID of order to delete");
		Long orderId = Long.valueOf(getInput());
		orderservice.delete(orderId);
		LOGGER.info("Order has been deleted");
		
	}

}