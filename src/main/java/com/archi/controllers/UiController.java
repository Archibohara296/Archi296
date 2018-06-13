package com.archi.controllers;


	import java.util.List;
	import java.util.Map;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.archi.models.Cart;
import com.archi.models.Customers;
import com.archi.models.Orders;
import com.archi.models.Products;
import com.archi.services.CustomerService;
import com.archi.services.ProductService;

	

	@Controller
	public class UiController {

		@Autowired
		private ProductService p;
		
		@Autowired
		private CustomerService u;
		

		private String message = "Shopping Service Application";
		
		@RequestMapping("/")
		public String login() {
			//model.put("message",message);
			return "login1";
		}
		
		@RequestMapping("/login")
		public String login1(Map<String, Object>  model) {
					
					model.put("message",message);
			return "login1";
		}
		
		@RequestMapping("/register")
		public String Register(Map<String, Object> model) {

			model.put("message",message);
			return "register";
		}
		
		@RequestMapping("/home")
		public String home(Model model) {

			List<Products> list = p.getAllProducts();
			model.addAttribute("list", list);
			return "home";
		}
		@RequestMapping("/viewProduct/{productID}")
		public String viewProduct(Model model,@PathVariable("productID") int productID) {

			Products prod = p.getProduct(productID);
			model.addAttribute("prod",prod);
			return "product";
		}

/*	@RequestMapping("/viewOrders/{username}")
		public String viewOrders(Model model,@PathVariable String username) {

			List<Orders> list1 = u.getOrdersForUser(username);
			model.addAttribute("list1",list1);
			return "vieworders";
		}*///

		@RequestMapping("/viewCart/{userName}")
		public String viewCart(Model model,@PathVariable("userName") String userName) {

			List<Cart> Items2 = u.getCart(userName);
			model.addAttribute("Items2",Items2);
			return "viewCart";
		}

		/*@RequestMapping("/Customers/{userName}")
		public String updateUser(Model model,@PathVariable("userName") String userName) {

		 Customers customer = u.getUserByName(userName);
			model.addAttribute("Customers",customer);
			return "updateUser";
		}*/
		@RequestMapping("/logout")
		public String logout() {
			   return "login";
			 }
	}

	


