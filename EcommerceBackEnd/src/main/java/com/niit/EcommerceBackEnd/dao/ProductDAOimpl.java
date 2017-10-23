package com.niit.EcommerceBackEnd.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.EcommerceBackEnd.model.Category;
import com.niit.EcommerceBackEnd.model.Product;

@Repository
public class ProductDAOimpl implements ProductDao
{

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired public ProductDAOimpl(SessionFactory sessionfactory)
	{
		this.sessionFactory=sessionfactory;
	}
	
	
	public ProductDAOimpl() {
		
	}


	public void saveProduct(Product product)
	{
		Session s=sessionFactory.openSession();
		Transaction t= s.beginTransaction();
		s.save(product);
		t.commit();
		s.close();
	}


	public List<Product> getprbyid(int id)
	{
		Session ssn=sessionFactory.openSession();
		Transaction t=ssn.getTransaction();
		t.begin();
		
		Query q = ssn.createQuery("from Product where id = "+id);
		List<Product> cat = (List<Product>)q.list();
		t.commit();
		ssn.close();
		return cat;
		
	}
	
	public List<Product> getallproducts() {
		Session ssn=sessionFactory.openSession();
		System.out.println("Product__List");
		Transaction t=ssn.getTransaction();
		t.begin();
		
	    List<Product> l=(List<Product>) ssn.createCriteria(Product.class).list();
        t.commit();
		ssn.close();
		for(Product c:l)
		{
			System.out.println(c);
		}
				return l;

		}
	
	
	public List<Product> getAllProducts()
	{
		Session ssn=sessionFactory.openSession();
		System.out.println("Product__List");
		Transaction t=ssn.getTransaction();
		t.begin();
		
	    List<Product> l=(List<Product>) ssn.createCriteria(Product.class).list();
        t.commit();
		ssn.close();
		for(Product c:l)
		{
			System.out.println(c);
		}
				return l;
		
	}


	public Product getProductById(int id) {
		Session ssn=sessionFactory.openSession();
		Transaction t=ssn.getTransaction();
		t.begin();
		
		Product p=ssn.get(Product.class, id);
		t.commit();
		ssn.close();
		return p;
	}

    
	public void deleteProduct(int id)
	{
		Session ssn=sessionFactory.openSession();
		Transaction t=ssn.getTransaction();
		t.begin();
		
		Product i = (Product) ssn.get(Product.class,id);
		ssn.delete(i);
		
		t.commit();
		ssn.close();
		
	}

public void updateProduct(Product p) 
    {
		Session ssn=sessionFactory.openSession();
		Transaction t=ssn.getTransaction();
		t.begin();
		ssn.update(p);
		t.commit();
		ssn.close();
		
	}	
	
public List<Product> getprbycatid(int id)
{
	Session s=sessionFactory.openSession();
	Transaction t=s.getTransaction();
	t.begin();
	Query q=s.createQuery("from Product where c_id="+id);
	List<Product> cat=(List<Product>)q.list();
       t.commit();
       s.close();
       return cat;
}
}
