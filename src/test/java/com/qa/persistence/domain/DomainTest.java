package com.qa.persistence.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.qa.persistence.domain.Domain;

public class DomainTest {
	
	@Test
	public void customerTest() {
		Domain domain = Domain.CUSTOMER;
		assertTrue(domain.getDescription().toLowerCase().contains("customers"));
	}
	
	@Test
	public void itemTest() {
		Domain domain = Domain.ITEM;
		assertTrue(domain.getDescription().toLowerCase().contains("items"));
	}
	
	@Test
	public void orderTest() {
		Domain domain = Domain.ORDER;
		assertTrue(domain.getDescription().toLowerCase().contains("order"));
	}
	
	
	@Test
	public void orderlineTest() {
		Domain domain = Domain.ORDER;
		assertTrue(domain.getDescription().toLowerCase().contains("orderline"));
	}
	
	@Test
	public void stopTest() {
		Domain domain = Domain.STOP;
		assertTrue(domain.getDescription().toLowerCase().contains("stop"));
	}
	
	


}
