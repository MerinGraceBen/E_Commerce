package com.niit.EcommerceBackEnd.dao;

import java.util.List;

import com.niit.EcommerceBackEnd.model.Category;
import com.niit.EcommerceBackEnd.model.Product;

public interface ProductDao 
{
	
	List<Product> getAllProducts();
	Product getProductById(int id);
	void saveProduct(Product pr);
	public void deleteProduct(int id);
	void updateProduct(Product p);
}
