package com.ekart.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.ekart.model.Product;

public class ProductDaoImpl implements IProductDao{
	
	private static Map <Integer,Product> products;
	private static int origin = 1003;
	
	static {
		products = new HashMap <Integer,Product>();
		products.put(1000,new Product("chocolate",80,3,new Date(20/12/2020),new Date(19/06/2021)));
		products.put(1001,new Product("soap",100,4,new Date(12/11/2020),new Date(30/12/2021)));
		products.put(1002,new Product("deodrant",250,2,new Date(05/05/2020),new Date(22/07/2021)));
	}
	
	
	
    
	//this methods adds products to the hash map
	@Override
	public boolean addProduct(Product product) {
		int initialSize = products.size();
		products.put(origin++, product);
		
		if(products.size()>initialSize)
			return true;
		else
			return false;
	}
    
	//this method updates the details of product of particular product id
	@Override
	public boolean updateProduct(Product product) {
		for(Entry<Integer, Product> i:products.entrySet()) {
			if(i.getKey() == product.getPId()) {
				i.setValue(product);
				return true;
			}
		}
		return false;
	}
    
	//this method deletes a product of specified product id
	@Override
	public boolean delete(int pId) {
		for(Entry<Integer, Product> i:products.entrySet()) {
			if(i.getKey() == pId) {
				products.remove(pId);
				return true;
			}
		}
		return false;
	}
    
	//this method gets the product of specified product id
	@Override
	public Product getProduct(int pId) {
		for(Entry<Integer, Product> i:products.entrySet()) {
			if(i.getKey() == pId) {
				Product p = products.get(pId);
				return p;
			}
		}
		return null;
	}
    
	// this method gets all products that are in the list
	@Override
	public List<Product> getAllProducts() {
		if(products != null) {
			Collection<Product> productValues = products.values();
			List<Product> productList = new ArrayList<Product>(productValues);
			return productList;
		}
		return null;
	}

}
