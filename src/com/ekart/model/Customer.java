package com.ekart.model;

public class Customer {
	
	private int customerId;
	private String cname;
	private String email;
	private long phoneNo;
	
	private static int origin = 100;
	
	public Customer(){
	}

	public Customer(String cname, String email, long phoneNo) {
		this.customerId = origin++;
		this.cname = cname;
		this.email = email;
		this.phoneNo = phoneNo;
	}
	
	

	public Customer(int customerId, String cname, String email, long phoneNo) {
		super();
		this.customerId = customerId;
		this.cname = cname;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public int getCid() {
		return customerId;
	}

	public void setCid(int cid) {
		this.customerId = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}


	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", cname=" + cname + ", email=" + email + ", phoneNo=" + phoneNo
				+ "]";
	}
	
	
	
}