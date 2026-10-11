package com.vcube.customerportal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.customerportal.model.Customer;
import com.vcube.customerportal.service.CustomerService;


//http://localhost:8888/customer
@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService ;
	
	//http://localhost:8888/customer/wel
	@GetMapping("/wel")
	String welcome() {
		return "welcome to Spring Boot world";
	}
	
	//http://localhost:888/customer/getCus/1
	@GetMapping("/getCus/{cid}")
	Customer getCustomer(@PathVariable Integer cid){
		return customerService.getCustomer(cid);
		
	}
	
	@GetMapping("/getCustomers")
	List<Customer>getAllCustomers(){
		return customerService.getAllCustomerInfo();
	}
	
	//http://localhost:8888/customer/create
	@PostMapping("/create")
	Customer createCustomerInfo(@RequestBody Customer c){
		return customerService.createCustomerData(c);
	}
	
}
