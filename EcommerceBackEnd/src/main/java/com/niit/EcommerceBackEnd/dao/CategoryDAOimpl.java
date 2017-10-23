package com.niit.EcommerceBackEnd.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.EcommerceBackEnd.model.Category;
import com.niit.EcommerceBackEnd.model.Product;
import com.niit.EcommerceBackEnd.model.Supplier;

@Repository
public class CategoryDAOimpl implements CategoryDAO
{

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired public CategoryDAOimpl(SessionFactory sessionfactory)
	{
		this.sessionFactory=sessionfactory;
	}
	
	public void saveCategory(Category category)
	{
		Session s=sessionFactory.openSession();
		Transaction t= s.beginTransaction();
		s.save(category);
		t.commit();
		s.close();
	}
	
	public List<Category> getAllCategory()
	{
		Session ssn=sessionFactory.openSession();
		Transaction t=ssn.getTransaction();
		t.begin();
		List<Category> l=(List<Category>) ssn.createQuery("from Category").list();
		
		t.commit();
		ssn.close();
		return l;
	}
    public Category getCategoryById(int cat_id)
    {
    	Session ssn=sessionFactory.openSession();
		Transaction t=ssn.getTransaction();
		t.begin();
		Category l=(Category) ssn.get(Category.class,cat_id);
		System.out.println(l.getCtype()+l.getId());
	
		t.commit();
		ssn.close();
		return l;
    }

    public void deleteCategory(int id)
    {
    	Session ssn=sessionFactory.openSession();
    	Transaction t=ssn.getTransaction();
    	t.begin();
    	
    	Category i = (Category) ssn.get(Category.class,id);
    	ssn.delete(i);
    	
    	t.commit();
    	ssn.close();
    		
    }
    public void updateCategory(Category c) 
    {
		Session ssn=sessionFactory.openSession();
		Transaction t=ssn.getTransaction();
		t.begin();
		ssn.update(c);
		t.commit();
		ssn.close();
		
	}

}
