package com.archi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.archi.models.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {
	
	public Cart findByCustomerCid(int cid);
	public void deleteBySelectedItems(int pid);

	
}
