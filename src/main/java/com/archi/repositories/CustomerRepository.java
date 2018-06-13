package com.archi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.archi.models.Customers;

public interface CustomerRepository extends CrudRepository<Customers, Integer> {

	Customers findByuserName(String username);

	/*public void updateCustomer(Customers customers );*/

	//public void deleteBySelectedItems(int pid);
	
	

	
}
