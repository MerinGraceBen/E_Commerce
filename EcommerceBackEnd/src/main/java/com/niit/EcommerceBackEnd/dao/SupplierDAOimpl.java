package com.niit.EcommerceBackEnd.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.EcommerceBackEnd.model.Category;
import com.niit.EcommerceBackEnd.model.Supplier;

@Repository
public class SupplierDAOimpl implements SuppilerDAO
{

	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired public SupplierDAOimpl(SessionFactory sessionfactory)
	{
		this.sessionFactory=sessionfactory;
	}
	
	public void saveSupplier(Supplier supplier)
	{
		Session s=sessionFactory.openSession();
		Transaction t= s.beginTransaction();
		s.save(supplier);
		t.commit();
		s.close();
	}

	public List<Supplier> getAllSupplier()
	{
		Session ssn=sessionFactory.openSession();
		Transaction t=ssn.getTransaction();
		t.begin();
		Query q=ssn.createQuery("From Supplier");
		List<Supplier> l=(List<Supplier>) q.list();
		
		t.commit();
		ssn.close();
		return l;
	}


	public Supplier getSupplierById(int sup_id)
	{
		Session ssn=sessionFactory.openSession();
		Transaction t=ssn.getTransaction();
		t.begin();
		Supplier l=(Supplier) ssn.get(Supplier.class,sup_id);
		System.out.println(l.getS_name()+l.getId());
	
		t.commit();
		ssn.close();
		return l;
	}
	public Supplier deleteSupplier(int id) {
		Session ssn=sessionFactory.openSession();
		Transaction t=ssn.getTransaction();
		t.begin();
		
		Supplier i = (Supplier) ssn.get(Supplier.class,id);
		ssn.delete(i);
		
		t.commit();
		ssn.close();
		return i;
	}


    public void updateSupplier(Supplier s) 
    {
		Session ssn=sessionFactory.openSession();
		Transaction t=ssn.getTransaction();
		t.begin();
		ssn.update(s);
		t.commit();
		ssn.close();
		
	}

}
