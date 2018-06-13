package com.archi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.archi.models.Products;
import com.archi.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Products> getAllProducts() {
		
		List<Products> products = new  ArrayList<>();
		productRepository.findAll()
							.forEach(products::add);
		
		return products; 
	}

	@Override
	public Products getProduct(int pid) {
		
		return productRepository.findOne(pid);
	}
	
	@Override
	public void addProduct(Products product) {
		
		productRepository.save(product);
	}
	
	@Override
	public void deleteProduct(int pid) {
		
		productRepository.delete(pid);
	}
	
}
