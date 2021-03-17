package com.ekart.controller;

import java.util.Scanner;
import com.ekart.util.InputUtil;

public class MainController {
	
	public static void main(String[] args) {

		runApplication();

	}
	
	private static void runApplication() {
		
		Scanner scanner = InputUtil.getScanner();
		boolean status = true;
		
		while(status) {
			System.out.println("=====WELCOME TO EKart=====");
			System.out.println("1. Admin \n2.Customer \n3.Exit");

			System.out.println("Enter your choice:");
			int choice = scanner.nextInt();
			switch (choice) {

			case 1:
				AdminController adminController = new AdminController();
				adminController.operations();
				break;

			case 2:
				CustomerController customerController = new CustomerController();
				customerController.operations();
				break;

			case 3:
				System.out.println("Exiting System..!");
				status = false;
				System.exit(1);
				
			default:System.out.println("incorrect input");

			}
	   }
	}
}