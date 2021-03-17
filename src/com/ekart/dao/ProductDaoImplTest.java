package com.ekart.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.HashMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.ekart.model.Product;
import com.ekart.service.ProductServiceImpl;

class ProductDaoImplTest {

	/*
	@BeforeEach
	void setUp() throws Exception {
		ProductDaoImpl pdi=new ProductDaoImpl();
		}

	@AfterEach
	void tearDown() throws Exception {
	}*/
	
	ProductDaoImpl pdi=new ProductDaoImpl();
	Product product=new Product();
  
	@Test
	void testAddProduct() {
		
		assertEquals(true, pdi.addProduct(new Product("chocolate",50,4,null,null)));
		
		
	}
	@Test
	void testDeleteProduct() {
		assertEquals(true,pdi.delete(1000));
		
	}
	
	

}
