package com.ekart.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ekart.dao.IProductDao;
import com.ekart.dao.ProductDaoImpl;
import com.ekart.model.Product;

public class ProductServiceImpl implements IProductService{
	
	private static IProductDao productDao = new ProductDaoImpl();
	
	
	//this method adds products to the map
	@Override
	public boolean addProduct(Product product) {
		return productDao.addProduct(product);
	}
    
	//this method updates the product of specified id
	@Override
	public boolean updateProduct(Product product) {
		return productDao.updateProduct(product);
	}
    
	//this method deletes product of specified id
	@Override
	public boolean delete(int pId) {
		return productDao.delete(pId);
	}
    
	//this method gets details of specified id
	@Override
	public Product getProduct(int pId) {
		return productDao.getProduct(pId);
	}
    
	//this method gets all products in a list
	@Override
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}
    
	//this method gets all products that are not expired
	@Override
	public List<Product> getAllNonExpiredProducts() {
		List<Product> productList = productDao.getAllProducts();
		List<Product> nonExpiredProducts = new ArrayList<Product>();
		for(Product i:productList) {
			
			Date expDate = i.getExpiryDate();
			Date date = new Date();
			
			if(date.before(expDate)) {
				nonExpiredProducts.add(i);
			}
		}
		return nonExpiredProducts;
	}

}
