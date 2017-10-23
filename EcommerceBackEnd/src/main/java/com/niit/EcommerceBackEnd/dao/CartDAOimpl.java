/*package com.niit.EcommerceBackEnd.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Query;


import com.niit.EcommerceBackEnd.dao.CartDAO;
import com.niit.EcommerceBackEnd.model.Cart;
import com.niit.EcommerceBackEnd.model.Product;



	@Repository("CartDaoImpl")
	public class CartDAOimpl implements CartDAO {
		
		@Autowired
		SessionFactory sessionFactory;
		
		@Autowired
		public void CartDaoImpl(SessionFactory sessionfactory)
		{
			this.sessionFactory=sessionfactory;
		}	
		
	 public void addcart(Cart cart)
	 {
		 Session ssn=sessionFactory.openSession();
			Transaction t=ssn.getTransaction();
			t.begin();
			ssn.save(cart);
			t.commit();
			ssn.close();
		 
	 }
	 
	 public List<Cart> getcartbyusernmae(String Username) {
		    Session ssn=sessionFactory.openSession();
			Transaction t=ssn.getTransaction();
			t.begin();
			Query q=ssn.createQuery("from Cart where USERNAME='"+Username+"'");
			List<Cart> cat=(List<Cart>)q.list();

	        t.commit();
	        ssn.close();
			return cat;
		}

		public Product getprbyid(int id) {
			
		Session ssn=sessionFactory.openSession();
		Transaction t=ssn.getTransaction();
		t.begin();
		Product l = (Product) ssn.get(Product.class,id);
		
	    t.commit();
	    ssn.close();
	    return l;
	}
		
		
		
		public Cart getcartbyid(int id) {
			Session ssn=sessionFactory.openSession();
			Transaction t=ssn.getTransaction();
			t.begin();
			Cart l = (Cart) ssn.get(Cart.class, id);
			
					
			
		    t.commit();
		    ssn.close();
		    return l;
			
		}
		
		
		public void updatequantity(int cartid, int i) {
			Session ssn=sessionFactory.openSession();
			Transaction t=ssn.getTransaction();
			t.begin();
			
			Query qry1 = ssn.createQuery("update Cart  set quantity="+i+"where CARTID="+cartid);
		    qry1.executeUpdate();
					         				
			
		    t.commit();
		    ssn.close();
			
		}
		
		public void deleteCart(int id){
			Session ssn=sessionFactory.openSession();
			Transaction t=ssn.getTransaction();
			t.begin();
			Cart p = (Cart) ssn.get(Cart.class, id);
			ssn.delete(p);
	        t.commit();
	        ssn.close();
		}
		
		
		public void updateCart(Cart id){
			Session ssn=sessionFactory.openSession();
			Transaction t=ssn.getTransaction();
			t.begin();
			ssn.update(id);
	        t.commit();
	        ssn.close();
		}

		public List<Cart> getcartbyusername(String Username) {
			// TODO Auto-generated method stub
			return null;
		}
	}*/