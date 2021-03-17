package com.ekart.controller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.ekart.model.Product;
import com.ekart.service.IProductService;
import com.ekart.service.ProductServiceImpl;
import com.ekart.util.DateUtil;
import com.ekart.util.InputUtil;

public class AdminController {
	
	private static IProductService productService = new ProductServiceImpl();
	
	//this methods performs operations to be carried out by admin
	public void operations() {
		
		Scanner scanner = InputUtil.getScanner();
		boolean status = true;
		Product product = new Product();
		
		while(status){
			
			System.out.println("=== Admin operations===");
			System.out.println(
					"1. Add Product \n2. Update Product \n3. Remove Product \n4. View Product \n5. View All Products \n6. Exit");

			System.out.println("enter your choice:");
			int choice = scanner.nextInt();
			
			
			int id;
			
			switch (choice) {
			
			case 1:
				product = readProductInfo();
				if (productService.addProduct(product)) {
					System.out.println("Product  with id " + product.getPId() + " added successfully.!");
				} else {
					System.out.println("Product not added.!");
				}
				break;
				
			case 2:
				product = readUpdatedProductInfo();
				if (productService.updateProduct(product)) {
					System.out.println("Product details  with id" + product.getPId() + " updated successfully.!");
				} else {
					System.out.println("product details not updated.!");
				}
				break;
				
			case 3:
				System.out.println("Enter product id:");
				id = scanner.nextInt();
				if(productService.delete(id)) {
					System.out.println("Product  with id: " + id+" deleted.");
				}
				else {
					System.out.println("Product does not exist");
				}
				break;
				
			case 4:
				System.out.println("Enter product id:");
				id = scanner.nextInt();
				if(productService.getProduct(id) != null) {
					System.out.println(product.toString());
				}
				else {
					System.out.println("Product does not exist.");
				}
				break;
				
			case 5:
				List<Product> allProducts = productService.getAllProducts();

				for (Product prod : allProducts) {
					System.out.println(prod);
				}
				break;
				
			case 6:
				System.out.println("----Exiting Admin operations-----");
				status = false;
			}
	    }
	}
	private Product readProductInfo() {

		Scanner scanner = InputUtil.getScanner();
		System.out.println("Enter product name,price,quantity,manufactured date and expiry Date:");
		String name = scanner.next();
		double price = scanner.nextDouble();
		int quantity = scanner.nextInt();
		Date mDate = DateUtil.convertToDate(scanner.next());
		Date eDate = DateUtil.convertToDate(scanner.next());

		return new Product(name,price,quantity,mDate,eDate);
	}
	
	private Product readUpdatedProductInfo() {

		Scanner scanner = InputUtil.getScanner();
		System.out.println("Enter product id");
		int id = scanner.nextInt();
		System.out.println("Enter updated name, price, quantity, manufactured date and expiry date:");
		String name = scanner.next();
		double price = scanner.nextDouble();
		int quantity = scanner.nextInt();
		Date mDate = DateUtil.convertToDate(scanner.next());
		Date eDate = DateUtil.convertToDate(scanner.next());

		return new Product(id,name,price,quantity,mDate,eDate);
	}
}




