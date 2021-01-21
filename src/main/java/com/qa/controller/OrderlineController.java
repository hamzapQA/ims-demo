package com.qa.controller;

import java.util.List;
import org.apache.log4j.Logger;
import com.qa.services.CrudServices;
import com.qa.controller.CrudController;
import com.qa.persistence.domain.Orderline;
import com.qa.utils.Utils;

public class OrderlineController implements CrudController<Orderline> {

public static final Logger LOGGER = Logger.getLogger(Orderline.class);
	
	private CrudServices<Orderline> orderlineServices;
	
	public OrderlineController (CrudServices<Orderline> orderlineservices) {
		this.orderlineServices = orderlineservices;
	}
	
	String getInput() {
		return Utils.getInput();
	}

	@Override
	public List<Orderline> readAll() {
	List<Orderline> orderline = orderlineServices.readAll();
	for (Orderline orderlines: orderline) {
		LOGGER.info(orderlines.toString());
	}
		return orderline;
	}

	@Override
	public Orderline create() {
		
		LOGGER.info("Please enter the order ID you wish to add items to");
		Long orderId = Long.valueOf(getInput());
		LOGGER.info("Please enter the item ID to add to this order");
		Long itemId = Long.valueOf(getInput());
		LOGGER.info("Please enter item quantity");
		Integer quantity = Integer.valueOf(getInput());
		Orderline orderline = orderlineServices.create(new Orderline(itemId, orderId, quantity));
		LOGGER.info("Order Succesfully Generated");
		return orderline;
	}

	@Override
	public Orderline update() {
		LOGGER.info("Please enter orderline ID to update");
		Long orderlineId = Long.valueOf(getInput());
		LOGGER.info("please enter order ID linked with this line");
		Long orderId = Long.valueOf(getInput());
		LOGGER.info("Please enter the item ID you wish to update");
		Long itemId = Long.valueOf(getInput());
		LOGGER.info("please update the quantity of this item");
		Integer quantity = Integer.valueOf(getInput());
		Orderline orderline = orderlineServices.update(new Orderline(orderlineId, itemId, orderId, quantity));
		
		LOGGER.info("your orderline has been updated");
		return orderline;
	}

	@Override
	public void delete() {
		LOGGER.info("Please enter the ID of the orderline you wish to delete: ");
		Long orderlineId = Long.valueOf(getInput());
		orderlineServices.delete(orderlineId);
		
	}
	
	
}
