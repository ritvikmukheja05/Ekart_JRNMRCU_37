package com.ekart.service;

import java.util.List;

import com.ekart.model.Product;

public interface IProductService {
	
	boolean addProduct(Product product);

	boolean updateProduct(Product product);

	boolean delete(int pId);

	Product getProduct(int pId);

	List<Product> getAllProducts();
	
	List<Product> getAllNonExpiredProducts();
 }
