package com.ekart.dao;

import java.util.HashMap;
import java.util.List;

import com.ekart.model.Customer;
import com.ekart.model.Product;

public interface ICartDao {
	
	public void setCartId(int id);
	
	public boolean addOrder (Customer customer, List<Product> product);
	
	public HashMap<Customer, List<Product>> getCart (int cartId);
}
