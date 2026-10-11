package com.vcube.customerportal.service;

import java.util.List;

import com.vcube.customerportal.model.Customer;

//interface tells what to do
public interface CustomerService {
	
//Created the Customer Data or Insert 
	
public abstract Customer createCustomerData(Customer c);
	
	//Get all the Customers Data
	public abstract List<Customer> getAllCustomerInfo();
	
	//Get one  Customers Data Based on ID
	public abstract Customer getCustomer(Integer id);

	//Update all the Customer Data
	public abstract Customer updateData(Customer c);
	
	//Delete the Data From DB Based on ID 
	public abstract CustomerService deleteCustomer(Integer id);

}
