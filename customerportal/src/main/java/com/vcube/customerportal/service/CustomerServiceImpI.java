package com.vcube.customerportal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.customerportal.model.Customer;
import com.vcube.customerportal.repo.CustomerRepo;

//How TO DO
@Service
public class CustomerServiceImpI implements CustomerService {
	@Autowired
	CustomerRepo customerRepo;
	
	@Override
	public Customer createCustomerData(Customer c) {
		return customerRepo.save(c);
	}

	@Override
	public List<Customer> getAllCustomerInfo() {
		return customerRepo.findAll();//select*from customer;
	}

	@Override
	public Customer getCustomer(Integer id) {
		return customerRepo.findById(id).get();//select*from customer where cid = 1
	}

	@Override
	public Customer updateData(Customer c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerService deleteCustomer(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
