package com.archi.models;



import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Orders {
	
	
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	@GenericGenerator(name="increment", strategy="increment")
	private int ordid;
	
	@ManyToOne
	private Customers customer;
	
	private Date orddate;
	private int transactionNumber;
	private double totalAmount;
	
	@ElementCollection
	@CollectionTable(name = "OrderedItems", 
					joinColumns = @JoinColumn(name = "ordid"))
	private Set<Items> orderedItems = new HashSet<>();

	public int getOrdid() {
		return ordid;
	}

	public void setOrdid(int ordid) {
		this.ordid = ordid;
	}


	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	public Date getOrddate() {
		return orddate;
	}

	public void setOrddate(Date date) {
		this.orddate = date;
	}

	public int getTransactionNumber() {
		return transactionNumber;
	}

	public void setTransactionNumber(int transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Set<Items> getOrderedItems() {
		return orderedItems;
	}

	public void setOrderedItems(Set<Items> orderedItems) {
		this.orderedItems = orderedItems;
	}

	
	
}
