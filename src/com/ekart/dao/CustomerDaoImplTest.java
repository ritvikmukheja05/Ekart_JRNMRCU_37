package com.ekart.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ekart.model.Customer;

class CustomerDaoImplTest {
/*
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}*/
	
	CustomerDaoImpl cdi=new CustomerDaoImpl();
	Customer customer=new Customer();

	@Test
	void testAddCustomer() {
		assertEquals(true,new Customer("arun","arun@xyz.com",1042897653));
		
	}

	@Test
	void testGetCustomer() {
		assertEquals(customer, 100);
		
	}

}
