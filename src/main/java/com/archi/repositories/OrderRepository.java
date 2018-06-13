package com.archi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.archi.models.Items;
import com.archi.models.Orders;

public interface OrderRepository extends CrudRepository<Orders, Integer> {

	//public Orders findByCustomerCid(int cid);
	
	//public Orders findByCustomerCid(int cid);

}
