package com.archi.services;

import java.util.ArrayList;
import java.util.List;

import com.archi.models.Products;

public interface ProductService {
	
	
	public List<Products> getAllProducts();

	public Products getProduct(int pid);
	
	public void addProduct(Products product);
	
	public void deleteProduct(int pid);


}
