package com.ekart.dao;

import com.ekart.model.Customer;

public interface ICustomerDao {
	
	public Customer getCustomer (int customerId);
	
	public boolean addCustomer (Customer customer);
}