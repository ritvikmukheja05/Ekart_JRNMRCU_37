package com.ekart.service;

import java.util.HashMap;
import java.util.List;

import com.ekart.model.Customer;
import com.ekart.model.Product;

public interface ICartService {
	
	void setCartId(int custId);
	
	HashMap<Customer, List<Product>> getCart (int cartId);
	
	boolean addOrder(Customer customer, List<Product> product);
}
