package com.niit.EcommerceBackEnd.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.EcommerceBackEnd.model.Cart;
import com.niit.EcommerceBackEnd.model.Category;
import com.niit.EcommerceBackEnd.model.Supplier;

@Repository
public class CartDAOimpl implements CartDAO
{
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired public CartDAOimpl(SessionFactory sessionfactory)
	{
		this.sessionFactory=sessionfactory;
	}
	
	public List<Cart> getcartbyusername()
	{
		Session ssn=sessionFactory.openSession();
		Transaction t=ssn.getTransaction();
		t.begin();
		Query q=ssn.createQuery("From Cart");
		List<Cart> l=(List<Cart>) q.list();
		
		t.commit();
		ssn.close();
		return l;
	}

	
	public void saveCart(Cart ca)
	{
		Session s=sessionFactory.openSession();
		Transaction t= s.beginTransaction();
		s.save(ca);
		t.commit();
		s.close();
	}

	public void deleteCart(int cart_id) 
	{
		Session ssn=sessionFactory.openSession();
    	Transaction t=ssn.getTransaction();
    	t.begin();
    	
    	Category i = (Category) ssn.get(Category.class,cart_id);
    	ssn.delete(i);
    	
    	t.commit();
    	ssn.close();
	}

	public void updateCart(Cart ca) 
	{
		Session ssn=sessionFactory.openSession();
		Transaction t=ssn.getTransaction();
		t.begin();
		ssn.update(ca);
		t.commit();
		ssn.close();
		
	}

	public List<Cart> getcartbyusername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
