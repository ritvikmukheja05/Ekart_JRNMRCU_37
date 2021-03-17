package com.ekart.service;

import com.ekart.model.Customer;

public interface ICustomerService {
	
	Customer getCustomer (int customerId);
	
	boolean addCustomer (Customer customer);
}
