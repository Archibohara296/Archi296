package com.archi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archi.models.Cart;
import com.archi.models.Customers;
import com.archi.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public List<Customers> getAllCustomers() {
		
		List<Customers> customers = new ArrayList<>();
		customerRepository.findAll()
							.forEach(customers::add);
		return customers;
	}
	
	@Override
	public Customers getCustomerByName(String username){
		return customerRepository.findByuserName(username);
	}
	@Override
	public Customers getCustomer(int cid) {
		
		return customerRepository.findOne(cid);
	}

	@Override
	public void addCustomer(Customers customer) {
		
		customerRepository.save(customer);
	}
	
	
	@Override
	public void deleteCustomer(int cid) {
		
		customerRepository.delete(cid);
	}

	@Override
	public void updateCustomer(Customers customers) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cart> getCart(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public void updateCustomer(Customers customers) {
		// TODO Auto-generated method stub
		customerRepository.updateCustomer(customers);
	}*/	
}
