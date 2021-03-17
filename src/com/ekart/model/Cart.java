package com.ekart.model;

import java.util.HashMap;
import java.util.List;

public class Cart {
	private int cartId;
	private HashMap<Customer,List<Product>> cart;
	
	
	public Cart() {
		
	}
	
	public Cart(int id, HashMap<Customer, List<Product>> cart) {
		this.cartId = id;
		this.cart = cart;
	}

	public int getId() {
		return cartId;
	}

	public void setId(int id) {
		this.cartId = id;
	}

	public HashMap<Customer, List<Product>> getCart() {
		return cart;
	}

	public void setCart(HashMap<Customer, List<Product>> cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", cart=" + cart + "]";
	}
	
	
}