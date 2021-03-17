package com.ekart.dao;

import java.util.List;

import com.ekart.model.Product;

public interface IProductDao {
	
	public boolean addProduct(Product product);

	public boolean updateProduct(Product product);

	public boolean delete(int pId);

	public Product getProduct(int pId);

	public List<Product> getAllProducts();


}
