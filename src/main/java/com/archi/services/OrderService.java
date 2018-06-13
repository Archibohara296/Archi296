package com.archi.services;

import java.util.List;

import com.archi.models.Cart;
import com.archi.models.Orders;

public interface OrderService {
	
	
	public boolean confirmOrder(Cart cart);
	
	public List<Orders> getOrdersByCutomer(int cid);

}
