package com.ekart.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.ekart.model.Customer;
import com.ekart.model.Product;
import com.ekart.service.CartServiceImpl;
import com.ekart.service.CustomerServiceImpl;
import com.ekart.service.ICartService;
import com.ekart.service.ICustomerService;
import com.ekart.service.IProductService;
import com.ekart.service.ProductServiceImpl;
import com.ekart.util.InputUtil;

public class CustomerController {
	private static ICustomerService customerService = new CustomerServiceImpl();
	private static IProductService productService = new ProductServiceImpl();
	private static ICartService cartService = new CartServiceImpl();

	//this method performs operations that are done by customers
	public void operations() {
		
		Scanner scanner = InputUtil.getScanner();
		boolean status = true;
		Customer customer = new Customer();
		
		while(status) {
			
			System.out.println("=== Customer operations===");
			System.out.println("1.Register \n2. View Profile \n3. View Products \n4. Add Product to cart \n5. View Cart \n6. Exit");

			System.out.println("enter your choice:");
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				customer = readCustomerInfo();
				if(customerService.addCustomer(customer)) {
					System.out.println("Customer registered with id: " + customer.getCid());
				}
				else {
					System.out.println("Cannot register");
				}
				break;
				
			case 2:
				System.out.println("Enter customer id:");
				int id = scanner.nextInt();
				if(customerService.getCustomer(id) != null) {
					System.out.println(customer.toString());
				}
				else {
					System.out.println("Customer does not exist.");
				}
				break;
				
			case 3:
				List<Product> productList = productService.getAllNonExpiredProducts();
				for(Product i : productList) {
					System.out.println(i);
				}
				break;
				
			case 4:
				boolean action = true;
				List<Product> products = new ArrayList<Product>();
				System.out.println("Enter customer id:");
				int custId = scanner.nextInt();
				while(action) {
					System.out.println("Enter product id:");
					int pId = scanner.nextInt();
					Product product = productService.getProduct(pId);
					product.setPId(pId);
					products.add(product);
					System.out.println("Want to add more products: 1.yes 2.no");
					int selection = scanner.nextInt();
					if(selection == 2) {
						action = false;
					}
					else {
						action = true;
					}
				}
				cartService.setCartId(custId);
				customer = customerService.getCustomer(custId);
				if(cartService.addOrder(customer,products)) {
					System.out.println("Products added.");
				}
				else {
					System.out.println("not added.");
				}
				break;
				
			case 5:
				System.out.println("Enter customer id");
				int customerId = scanner.nextInt();
				HashMap<Customer, List<Product>> cart = cartService.getCart(customerId);
				Collection<List<Product>> cartValues = cart.values();
				for(List<Product> i:cartValues) {
					System.out.println(i);
				}
				break;
				
			case 6:
				System.out.println("----Exiting customer operations---");
				status = false;
			}
		}
	}
	
	private Customer readCustomerInfo() {
		Scanner scanner = InputUtil.getScanner();
		System.out.println("Enter customer name, email, phoneNo");
		String name = scanner.next();
		String email = scanner.next();
		long phone = scanner.nextLong();
		
		return new Customer(name,email,phone);
	}
	
}
