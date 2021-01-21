package com.qa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

import com.qa.controller.Action;
import com.qa.controller.CrudController;

import com.qa.controller.ItemController;
import com.qa.persistence.dao.ItemsDaoMysql;
import com.qa.services.ItemServices;

import com.qa.persistence.dao.CustomerDaoMysql;
import com.qa.services.CustomerServices;
import com.qa.controller.CustomerController;

import com.qa.persistence.dao.OrdersDaoMysql;
import com.qa.services.OrderServices;
import com.qa.controller.OrderController;

import com.qa.utils.Utils;

import com.qa.persistence.domain.Domain;

public class Ims {
	
	public static final Logger LOGGER = Logger.getLogger(Ims.class);

	public void imsSystem() {
		LOGGER.info("What is your username");
		String username = Utils.getInput();
		LOGGER.info("What is your password");
		String password = Utils.getInput();

		init(username, password);
		boolean stop = false;
		do {

			LOGGER.info("Welcome to IMS. Please type an option?");
			Domain.printDomains();
			
			Domain domain = Domain.getDomain();
			if(domain.name() == "STOP") {
				LOGGER.info("Exiting Application");
				System.exit(0);
			}

			LOGGER.info("What would you like to do with " + domain.name().toLowerCase() + ":");

			Action.printActions();
			Action action = Action.getAction();

			switch (domain) {
			case CUSTOMER:
				CustomerController customerController = new CustomerController(
						new CustomerServices(new CustomerDaoMysql(username, password)));
				doAction(customerController, action);
				break;
			case ITEM:
				ItemController itemController = new ItemController(new ItemServices(new ItemsDaoMysql(username, password)));
				doAction(itemController, action);
				break;
			case ORDER:
				OrderController orderController = new OrderController(new OrderServices(new OrdersDaoMysql(username, password)));
				doAction(orderController, action);
				break;
			case ORDERLINE:
				OrderlineController orderlineController = new OrderlineController(new OrderlineServices(new OrderlineDaoMysql(username, password)));
				doAction(orderlineController, action);
				break;
			case STOP:
				stop = true;
				break;
			default:
				break;
			}
		} while (!stop);
		LOGGER.info("Exiting Application");

	}

	public void doAction(CrudController<?> crudController, Action action) {
		switch (action) {
		case CREATE:
			crudController.create();
			break;
		case READ:
			crudController.readAll();
			break;
		case UPDATE:
			crudController.update();
			break;
		case DELETE:
			crudController.delete();
			break;
		case RETURN:
			break;
		default:
			break;
		}
	}


	public void init(String username, String password) {
		init("jdbc:mysql://localhost:3306/", username, password, "src/main/resources/sql-schema.sql");
	}

	public String readFile(String fileLocation) {
		StringBuilder stringBuilder = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(fileLocation));) {
			String string;
			while ((string = br.readLine()) != null) {
				stringBuilder.append(string);
				stringBuilder.append("\r\n");
			}
		} catch (IOException e) {
			for (StackTraceElement ele : e.getStackTrace()) {
				LOGGER.debug(ele);
			}
			LOGGER.error(e.getMessage());
		}
		return stringBuilder.toString();
	}


	public void init(String jdbcConnectionUrl, String username, String password, String fileLocation) {
		try (Connection connection = DriverManager.getConnection(jdbcConnectionUrl, username, password);
				BufferedReader br = new BufferedReader(new FileReader(fileLocation));) {
			String string;
			while ((string = br.readLine()) != null) {
				try (Statement statement = connection.createStatement();) {
					statement.executeUpdate(string);
				}
			}
		} catch (SQLException | IOException e) {
			for (StackTraceElement ele : e.getStackTrace()) {
				LOGGER.debug(ele);
			}
			LOGGER.error(e.getMessage());
		}
	}

}
