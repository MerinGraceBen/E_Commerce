package com.niit.EcommerceBackEnd.dao;

import java.util.List;

import com.niit.EcommerceBackEnd.model.Category;


public interface CategoryDAO 
{
	
	List<Category> getAllCategory();
	Category getCategoryById(int cat_id);
	void saveCategory(Category c);
	 public void deleteCategory(int cat_id);
	    public void updateCategory(Category c);
		
}
