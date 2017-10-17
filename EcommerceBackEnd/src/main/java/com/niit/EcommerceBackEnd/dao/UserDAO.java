package com.niit.EcommerceBackEnd.dao;

import java.util.List;

import com.niit.EcommerceBackEnd.model.User;

public interface UserDAO 
{
	void saveUser(User u);
	List<User> getAllUser();
	User getUserById();
}
