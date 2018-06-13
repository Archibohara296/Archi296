package com.archi.repositories;

import org.springframework.data.repository.CrudRepository;

import com.archi.models.Products;

public interface ProductRepository extends CrudRepository<Products, Integer> {
	
	

}
