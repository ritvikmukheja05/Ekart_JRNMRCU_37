package com.ekart.service;

import com.ekart.dao.CustomerDaoImpl;
import com.ekart.dao.ICustomerDao;
import com.ekart.model.Customer;

public class CustomerServiceImpl implements ICustomerService{
	
	private static ICustomerDao customerDao = new CustomerDaoImpl();
	
	//this method adds new customer 
	@Override
	public boolean addCustomer(Customer customer) {
		return customerDao.addCustomer(customer);
	}

	//this method gets customer of specified id
	@Override
	public Customer getCustomer(int customerId) {
		return customerDao.getCustomer(customerId);
	}

}
