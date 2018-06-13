package com.archi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.archi.models.Products;
import com.archi.services.ProductService;
import com.archi.services.ProductServiceImpl;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="/products", method = RequestMethod.GET)
	public List<Products> getAllProducts() {
		
		return productService.getAllProducts();
	}
	
	@RequestMapping(value="/products/{pid}", method = RequestMethod.GET)
	public Products getProduct(@PathVariable int pid) {
		
		return productService.getProduct(pid);
	}

	@RequestMapping(value="/products",method = RequestMethod.POST)
	public void addProduct(@RequestBody Products product) {
		
		productService.addProduct(product);
	}
	
	@RequestMapping(value="/products/{pid}",method = RequestMethod.DELETE)
	public void deleteProduct(@PathVariable int pid) {
	
		productService.deleteProduct(pid);
	}
	
}