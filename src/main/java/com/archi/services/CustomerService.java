package com.archi.services;

import java.util.ArrayList;

import java.util.List;

import com.archi.models.Cart;
import com.archi.models.Customers;

public interface CustomerService {
	
	public List<Customers> getAllCustomers();
	
	public Customers getCustomer(int cid);

	public void addCustomer(Customers customer);
	
	public void deleteCustomer(int cid);

	public void updateCustomer(Customers customers);

	Customers getCustomerByName(String username);

	public List<Cart> getCart(String username);

	



}
