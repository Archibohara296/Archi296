package com.archi.services;

import com.archi.models.Cart;
import com.archi.models.Customers;
import com.archi.models.Products;

public interface CartService {

	public Cart getCart(int custId);
	
	public boolean addProductToCart(int pid, int cid, int quantity);
	
	public boolean deleteProduct(int pid, int cid);
	
	public boolean emptyCart(int l);
	
	public boolean updateQuantity(int quantity, int cid, int pid);
	
}

