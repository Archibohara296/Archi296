package com.archi.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.archi.models.Cart;
import com.archi.services.CartService;

@RestController
public class CartContoller {

	@Autowired
	CartService cartService;
	
	@RequestMapping(value = "/mycart/{custId}", method = RequestMethod.GET)
	public Cart getCart(@PathVariable int custId) {
		
		return cartService.getCart(custId);
	}
	
	@RequestMapping(value = "/mycart/{pid}/{cid}/{quantity}", method = RequestMethod.POST)
	public boolean addProductToCart(@PathVariable int pid, @PathVariable int cid, @PathVariable int quantity) {
		
		return cartService.addProductToCart(pid, cid, quantity);
	}
	
	@RequestMapping(value = "/mycart/{pid}/{cid}", method = RequestMethod.DELETE)
	public boolean deleteProduct(@PathVariable int pid, @PathVariable int cid) {
		
		return cartService.deleteProduct(pid, cid);
	}
	
	
	
	@RequestMapping(value = "/mycart/{cid}", method = RequestMethod.DELETE)
	public boolean emptyCart(@PathVariable int cid) {
		
		return cartService.emptyCart(cid);
	}
	
	@RequestMapping(value = "/mycart/{quantity}/{cid}/{pid}", method = RequestMethod.PUT)
	public boolean updateQuantity(@PathVariable int quantity, @PathVariable int cid, @PathVariable int pid) {
	
		return cartService.updateQuantity(quantity, cid, pid);
	}
	
	
}
