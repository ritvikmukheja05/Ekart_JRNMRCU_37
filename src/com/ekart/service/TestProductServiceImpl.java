package com.ekart.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.ekart.model.Product;

public class TestProductServiceImpl {
     
	ProductServiceImpl psi=new ProductServiceImpl();
	Product product=new Product();
	
	@Test
    public void testAddProduct() {
		
		product.setPId(1000);
		product.setPname("chocolate");
		product.setPrice(80);
		product.setQuantity(3);
		
		boolean status=psi.addProduct(product);
		assertEquals(true, status);
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
}

