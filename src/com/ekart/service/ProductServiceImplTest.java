package com.ekart.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ekart.model.Product;

class ProductServiceImplTest {

	@BeforeEach
	void setUp() throws Exception {
		 ProductServiceImpl psi=new ProductServiceImpl();
	     Product product=new Product();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
   ProductServiceImpl psi=new ProductServiceImpl();
     Product product=new Product();
     
	@Test
	void testAddProduct() {
		
		product.setPId(1000);
		product.setPname("chocolate");
		product.setPrice(80);
		product.setQuantity(3);
		
		boolean status=psi.addProduct(product);
		assertEquals(true, status);
		fail("Not yet implemented");
	}

	@Test
	void testGetProductForNegativeId() {
		Product product=psi.getProduct(-1001);
		assertEquals(null, product);
		fail("negative value is given");
		
	}
	
	@Test
	void testGetProductForOutOfRangeId() {
		Product product=psi.getProduct(10010003);
		assertEquals(null, product);
		fail("value is out of range");
	}

	@Test
	void testGetAllProducts() {
		fail("Not yet implemented");
	}

}
