package com.niit.EcommerceBackEnd.dao;

import java.util.List;

import com.niit.EcommerceBackEnd.model.Cart;

public interface CartDAO
{
	void saveCart(Cart ca);
	public void deleteCart(int cart_id);
	public void updateCart(Cart ca);
	List<Cart> getcartbyusername(String username);
}
