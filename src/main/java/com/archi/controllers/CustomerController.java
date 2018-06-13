package com.archi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.archi.models.Customers;
import com.archi.services.CartService;
import com.archi.services.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@Autowired
	CartService cartService;
	
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public List<Customers> getAllCustomers() {
		
		return customerService.getAllCustomers();
	}
	
	@RequestMapping(value = "/customers/{username}", method = RequestMethod.GET)
	public Customers getCustomer(@PathVariable String username) {
		Customers c = customerService.getCustomerByName(username);
		int cid = c.getCid();
		return customerService.getCustomer(cid);
	}
	
/*	@RequestMapping(value = "/customers/{userName}", method = RequestMethod.PUT)
	public void updateCustomer(@RequestBody Customers customers){
		customerService.updateCustomer(customers);
	}*/

	@RequestMapping(value = "/customers", method = RequestMethod.POST)
	public void addCustomer(@RequestBody Customers customer) {
		
		customerService.addCustomer(customer);
	}
	
	@RequestMapping(value = "/customers/{cid}", method = RequestMethod.DELETE)
	public void deleteCustomer(@PathVariable int cid) {
		
		customerService.deleteCustomer(cid);
	}
}
