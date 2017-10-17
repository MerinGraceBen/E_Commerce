package com.niit.EcommerceBackEnd.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.EcommerceBackEnd.model.User;

@Repository
public class UserDAOimpl implements UserDAO
{

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired public UserDAOimpl(SessionFactory sessionfactory)
	{
		this.sessionFactory=sessionfactory;
	}
	
	
	public UserDAOimpl() {
		
	}


	public void saveUser(User user)
	{
		Session s=sessionFactory.openSession();
		Transaction t= s.beginTransaction();
		s.save(user);
		t.commit();
		s.close();
	}

	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUserById() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
