/*package com.niit.EcommerceBackEnd.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="Cart")
public class Cart implements Serializable
{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
	
	 @ManyToOne
	 @JoinColumn(name="PRODID",updatable=true,insertable=true,nullable=false)
	Product prodid;
	 
	 @Column(name = "Quantity", nullable = false)
	int quantity;
	 
	 @Column(name = "PRICE", nullable = false)
	int price;
	 

	 @Column(name = "PRODNAME", nullable = false)
	Product prodname;
	
	 @Column(name = "USERNAME", nullable = false)
	 String username;
	 
	 
	public Product getProdid() {
		return prodid;
	}

	public void setProdid(Product prodid) {
		this.prodid = prodid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getProdname() {
		return prodname;
	}

	public void setProdname(Product p) {
		this.prodname = p;
	}
			 
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
}
*/