package com.qa.controller;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.qa.controller.Action;

public class ActionTest {
	
	@Test
	public void createTest() {
		Action action = Action.CREATE;
		assertTrue(action.description().toLowerCase().contains("database"));
		
		
	}
	
	@Test
	public void readTest() {
		Action action = Action.READ;
		assertTrue(action.description().toLowerCase().contains("read"));
	}
	
	@Test
	public void updateTest() {
		Action action = Action.UPDATE;
		assertTrue(action.description().toLowerCase().contains("change"));
	}
	
	@Test
	public void deleteTest() {
		Action action = Action.DELETE;
		assertTrue(action.description().toLowerCase().contains("remove"));
		
	
	}
	
	@Test
	public void returnTest() {
		Action action = Action.RETURN;
		assertTrue(action.description().toLowerCase().contains("return"));
		
		
		
	}
	
	

}
