package com.ekart.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ekart.model.Customer;

class CustomerServiceImplTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddCustomer() {
		assertEquals(true,new Customer(100,"arun","arun@xyz.com",1042897653));
		
	}

	@Test
	void testGetCustomer() {
		fail("Not yet implemented");
	}

}
