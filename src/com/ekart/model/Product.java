package com.ekart.model;

import java.util.Date;

public class Product {
	private int pId;
	private String pname;
	private double price;
	private int quantity;
	private Date manufacturedDate;
	private Date expiryDate;
	
	private static int origin = 1000;
	
	public Product() {
	}

	public Product(String pname, double price, int quantity, Date manufacturedDate, Date expiryDate) {
		this.pId = origin++;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
		this.manufacturedDate = manufacturedDate;
		this.expiryDate = expiryDate;
	}

	public Product(int pId, String pname, double price, int quantity, Date manufacturedDate, Date expiryDate) {
		super();
		this.pId = pId;
		this.pname = pname;
		this.price = price;
		this.quantity = quantity;
		this.manufacturedDate = manufacturedDate;
		this.expiryDate = expiryDate;
	}

	public int getPId() {
		return pId;
	}

	public void setPId(int pId) {
		this.pId = pId;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Date getManufacturedDate() {
		return manufacturedDate;
	}

	public void setManufacturedDate(Date manufacturedDate) {
		this.manufacturedDate = manufacturedDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pname=" + pname + ", price=" + price + ", quantity=" + quantity
				+ ", manufacturedDate=" + manufacturedDate + ", expiryDate=" + expiryDate + "]";
	}
	
	
}
