package com.archi.models;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="cart")
public class Cart {

	@Id @GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy="increment")	
	private int caid;
	
	@OneToOne @JoinColumn(name="customer_id")
	private Customers customer;	

	@ElementCollection
	@JoinTable(name="Cart_Items",
			joinColumns = @JoinColumn(name="caid"))
	private Set<Items> selectedItems = new HashSet<>();

	public int getCaid() {
		return caid;
	}

	public void setCaid(int caid) {
		this.caid = caid;
	}

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	public Set<Items> getSelectedItems() {
		return selectedItems;
	}

	public void setSelectedItems(Set<Items> selectedItems) {
		this.selectedItems = selectedItems;
	}
}