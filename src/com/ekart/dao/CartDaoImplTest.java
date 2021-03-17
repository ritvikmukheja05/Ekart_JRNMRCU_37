package com.ekart.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ekart.model.Cart;
import com.ekart.model.Customer;
import com.ekart.model.Product;

class CartDaoImplTest {
/*
	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
*/
	CartDaoImpl cdi=new CartDaoImpl();
	Cart cart=new Cart();
	HashMap<Customer,List<Product>> custcart=new HashMap<>();
	
	@Test
	void testGetCart() {
		assertEquals(cart,cdi.getCart(2000));
		fail("Not yet implemented");
	}

	@Test
	void testSetCartId() {
		
		fail("Not yet implemented");
	}

	@Test
	void testAddOrder() {
		fail("Not yet implemented");
	}

}
