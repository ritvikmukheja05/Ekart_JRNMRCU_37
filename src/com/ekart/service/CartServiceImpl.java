package com.ekart.service;

import java.util.HashMap;
import java.util.List;

import com.ekart.dao.CartDaoImpl;
import com.ekart.dao.ICartDao;
import com.ekart.model.Customer;
import com.ekart.model.Product;

public class CartServiceImpl implements ICartService {
	private static ICartDao cartDao = new CartDaoImpl();
    
	//this method gets cart of specified id
	@Override
	public HashMap<Customer, List<Product>> getCart(int cartId) {
		return cartDao.getCart(cartId);
	}
    
	//this method sets cart id
	@Override
	public void setCartId(int custId) {
		cartDao.setCartId(custId);
	}
   
	//this method adds products to customer's carts
	@Override
	public boolean addOrder(Customer customer, List<Product> product) {
		return cartDao.addOrder(customer, product);
	}
	

}
