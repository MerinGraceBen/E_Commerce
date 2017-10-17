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
@Table(name="CATEGORY")
public class Category implements Serializable
{
private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
 
    @Column(name = "CTYPE", nullable = false)
    private String ctype;
    
  
    
    @OneToMany(targetEntity=Product.class, mappedBy="category")
    
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

	public void setId(int id) {
		this.id = id;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}
    
}
