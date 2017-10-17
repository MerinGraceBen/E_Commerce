package com.niit.EcommerceBackEnd.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="SUPPLIER")
public class Supplier implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
 

	@Column(name = "Supplier_Name", nullable = false)
	private String s_name;
	
	 @Column(name = "Supplier_Address", nullable = false)
	    private String address;
	 
	 @OneToMany(targetEntity=Product.class, mappedBy="supplier")
	 private Set<Product> product;
	 
	 public Set<Product>getProduct()
	 {
		 return product;
	 }

	 public void setProduct(Set<Product> product)
	 {
		 this.product=product;
	 }
	
	public int getId() {
		return id;
	}

	public void setId(int Id) {
		Id = id;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	
}
