package com.ekart.dao;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.ekart.model.Customer;

public class CustomerDaoImpl implements ICustomerDao{
	
	private static Map <Integer,Customer> customers;
	private static int origin = 100;
	
	static {
		customers = new HashMap <Integer,Customer>();
	}
	
	//this method adds the customer to the map
	@Override
	public boolean addCustomer(Customer customer) {
		int initialSize = customers.size();
		customers.put(origin++, customer);
		
		if(customers.size()>initialSize)
			return true;
		else
			return false;
	}

	
    //this method gets the customer of specified customer id
	@Override
	public Customer getCustomer(int customerId) {
		for(Entry<Integer, Customer> i:customers.entrySet()) {
			if(i.getKey() == customerId) {
				Customer cust = customers.get(customerId);
				return cust;
			}
		}
		return null;
	}

}