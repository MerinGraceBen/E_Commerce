package com.niit.EcommerceBackEnd.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Entity
@Component
@Table(name="PRODUCTS")
public class Product implements Serializable
{

	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
 
    @Column(name = "DTYPE", nullable = false)
    private String dtype;
    
    @Column(name = "TITLE", nullable = false)
    private String title;
    
    @Column(name = "SHORT_DESCRIPTION", nullable = false)
    private String shortDesc;
   
    @Column(name = "PRICE", nullable = false)
    private int price;
    
    @Column(name = "STOCK", nullable = false)
    private int stock;
    
    @ManyToOne
    @JoinColumn(name="c_id",insertable=true,updatable=true,nullable=false)
    private Category category;
    
    @ManyToOne
    @JoinColumn(name="s_id",insertable=true,updatable=true,nullable=false)
    private Supplier supplier;
    
   /* @OneToMany(targetEntity=Product.class, mappedBy="cart")
	 private Set<Cart> cart;
	 
	 public Set<Cart>getCart()
	 {
		 return cart;
	 }*/

	/* public void setCart(Set<Cart> cart)
	 {
		 this.cart=cart;
	 }*/
    private String image;
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDtype() {
		return dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}


}
