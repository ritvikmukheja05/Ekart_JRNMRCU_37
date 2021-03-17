package com.ekart.dao;

import java.util.HashMap;
import java.util.List;

import com.ekart.model.Cart;
import com.ekart.model.Customer;
import com.ekart.model.Product;

public class CartDaoImpl implements ICartDao{
	private static Cart cart = new Cart();
    
	//this method gets the gets the cart of specified id
	@Override
	public HashMap<Customer, List<Product>> getCart(int cartId) {
		return cart.getCart();
	}
    
	//this method sets the id of the cart
	@Override
	public void setCartId(int id) {
		cart.setId(id);
	}
    
	//this method adds products to cart
	@Override
	public boolean addOrder(Customer customer, List<Product> product) {
		HashMap<Customer,List<Product>> cartMap = new HashMap<Customer,List<Product>>();
		cartMap.put(customer, product);
		cart.setCart(cartMap);
		return true;
	}

}