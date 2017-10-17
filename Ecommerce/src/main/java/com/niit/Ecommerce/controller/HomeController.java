package com.niit.Ecommerce.controller;
	
	import java.util.List;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;

	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.servlet.ModelAndView;

import com.niit.EcommerceBackEnd.dao.CartDAO;
import com.niit.EcommerceBackEnd.dao.CategoryDAO;
	import com.niit.EcommerceBackEnd.dao.ProductDao;
	import com.niit.EcommerceBackEnd.dao.SuppilerDAO;
	import com.niit.EcommerceBackEnd.dao.UserDAO;
import com.niit.EcommerceBackEnd.model.Cart;
import com.niit.EcommerceBackEnd.model.Category;
	import com.niit.EcommerceBackEnd.model.Product;
	import com.niit.EcommerceBackEnd.model.Supplier;
	import com.niit.EcommerceBackEnd.model.User;
	 
    @Controller 
	public class HomeController
	{
		
		@Autowired
		UserDAO udao;
	
		@Autowired
		SuppilerDAO sdao;
		
		@Autowired
		CategoryDAO cdao;
		
		@Autowired
		ProductDao pdao;
		
		@Autowired
		CartDAO cartdao;
		
		/*@Autowired
		UserDAOimpl userDaoImpl;
		
		@Autowired
		SupplierDAOimpl supplierDaoImpl;
		
		@Autowired
		CategoryDAOimpl categoryDaoImpl;
		
		@Autowired
		ProductDAOimpl productDaoImpl;*/
		
		String message = "Welcome to Spring MVC!";

		private String shortDesc;
	 
		@RequestMapping("/")
		public ModelAndView showMessage()
		{
			System.out.println("in controller");
	 
			ModelAndView mv = new ModelAndView("index");
			
			return mv;
			
			
		}
		
		
		@RequestMapping("/login")
		public ModelAndView loginMessage()
		{
			System.out.println("in login controller");
	 
			ModelAndView mv = new ModelAndView("login");
			
			return mv;
		}
		
		@RequestMapping("/Admin")
		public ModelAndView AdminMessage()
		{
			System.out.println("in admincontroller");
	 
			ModelAndView mv = new ModelAndView("Admin");
			
			List<Category> l=(List<Category>)cdao.getAllCategory();
			System.out.println("Category List : "+l);
			mv.addObject("cat_id",l);
			
			List<Supplier> ll=(List<Supplier>)sdao.getAllSupplier();
			System.out.println("Supplier List : "+ll);
			mv.addObject("sup_id",ll);
			
			return mv;
		}

	/*	@RequestMapping("/cart")
		public ModelAndView cartMessage()
		{
			ModelAndView mv1 = new ModelAndView("Cart");
			List<Category> l=(List<Category>)cdao.getAllCategory();
			mv1.addObject("cate",l);
			String Username=SecurityContextHolder.getContext().getAuthentication().getName();
			List<Cart> ll=(List<Cart>)cartdao.getcartbyusernmae(Username);
			mv1.addObject("ca",ll);
			int total=0;
			for(Cart cart:ll)
			{
				int sum=cart.getPrice()*cart.getQuantity();
				total=total+sum;	
			}
			mv1.addObject("t",total);
			return mv1;
		}
		*/
		@RequestMapping(value="/saveUser",method=RequestMethod.POST)
		public ModelAndView saveU(@RequestParam("fname") String ufname, @RequestParam("mname") String umname,@RequestParam("lname") String ulname, @RequestParam("umail") String uemail,@RequestParam("mob") int uno,@RequestParam("add") String uadd, @RequestParam("username") String uusername, @RequestParam("pass") String upassword)
		{
			System.out.println("in registration ...");
			System.out.println(ufname+umname+ulname+uemail+uno+uadd+uusername+upassword);
			
			User p=new User();
			p.setName(ufname);
			p.setMob(uno);
			p.setAddress(uadd);
			p.setEmail(uemail);
			udao.saveUser(p);
	 
			ModelAndView mv = new ModelAndView("login");
			
			return mv;
		}

		
		@RequestMapping("/SignUp")
		public ModelAndView SignUpMessage()
		{
			System.out.println("in SignUp controller");
			
			ModelAndView mv = new ModelAndView("SignUp");
			
			return mv;
		}
		
		@RequestMapping("/saveSupplier")
		public ModelAndView supplier(@RequestParam("Supplier_Name") String sname,@RequestParam("Supplier_Address") String sadd) {
			System.out.println("in controller");
			System.out.println(sname+sadd);
			Supplier s=new Supplier();
			s.setS_name(sname);
			s.setAddress(sadd);
			sdao.saveSupplier(s);
			ModelAndView mv1 = new ModelAndView("Admin");
			
			return mv1;
		}
		
		@RequestMapping("/saveCategory")
		public ModelAndView cate(@RequestParam("CTYPE") String ctype) {
			System.out.println("in  Category__controller");
			System.out.println(ctype);
			Category c=new Category();
			c.setCtype(ctype);
			cdao.saveCategory(c);	
			ModelAndView mv1 = new ModelAndView("Admin");
		
			return mv1;
		}
		
		
		@RequestMapping("/saveProduct")
		public ModelAndView pro(@RequestParam("DTYPE") String dtype ,@RequestParam("TITLE") String title,@RequestParam("SHORT_DESCRIPTION") String shortdes,@RequestParam("PRICE") float price,@RequestParam("STOCK") int stock,@RequestParam("cat") int cid,@RequestParam("sup") int sid) {
			System.out.println("in Product_controller");
			System.out.println(dtype+title+shortdes+price);
			Product pr=new Product();
			
			pr.setDtype(dtype);
			pr.setTitle(title);
			pr.setShortDesc(shortdes);
			pr.setPrice(price);
			pr.setStock(stock);
			
			Category c=cdao.getCategoryById(cid);
			pr.setCategory(c);
			Supplier s=sdao.getSupplierById(sid);
			pr.setSupplier(s);
			
			pdao.saveProduct(pr);
					
			ModelAndView mv1 = new ModelAndView("Admin");
			List<Category> l=(List<Category>)cdao.getAllCategory();
			System.out.println("Category List : "+l);
			mv1.addObject("cat_id",l);
			
			List<Supplier> ll=(List<Supplier>)sdao.getAllSupplier();
			System.out.println("Supplier List : "+ll);
			mv1.addObject("sup_id",ll);
			
			
			
			
			return mv1;
		}  
		
		@RequestMapping("/savecart")
		public ModelAndView cart(@RequestParam("id") int id,@RequestParam("PRODID") int prodid,@RequestParam("Quantity") int quantity,@RequestParam("PRICE") int price,@RequestParam("PRODNAME") String prodname,@RequestParam("USERDNAME") String username) {
			System.out.println("in controller");
			Cart ca = new Cart();
			ca.getId();
			ca.getProdid();
			ca.getProdname();
			ca.getPrice();
			ca.getQuantity();
			ModelAndView mv1 = new ModelAndView("Cart");
			return mv1;
		}
		

		
		 @RequestMapping("/categoryupdate")
		 	public ModelAndView catupdate(@RequestParam("id") int id) 
		  {
			  System.out.println("in category update controller");
			  System.out.println(id);
			  Category c=cdao.getCategoryById(id);
			  ModelAndView mv1 = new ModelAndView("UpdateCategory");
			  System.out.println(c);
			  mv1.addObject("cat", c);
		      return mv1;
		  }
		 		
		 @RequestMapping("/saveupdateCategory")
			public ModelAndView saveupcat(@RequestParam("id") int id,@RequestParam("CTYPE") String ctype)
		 {
				System.out.println("in  Save_Update_Category__controller");
				System.out.println(id);
				Category c=new Category();
				c.setId(id);
				c.setCtype(ctype);
				cdao.updateCategory(c);	
				ModelAndView mv1 = new ModelAndView("CategoryList");
			
				return mv1;
			}
			
		 @RequestMapping("/categorydelete")
			public ModelAndView catdelete(@RequestParam("id") int cad)
		 {
			 System.out.println("in controller"+cad);
				List<Category> c = (List<Category>)cdao.getAllCategory();
				cdao.deleteCategory(cad);
				ModelAndView mv1 = new ModelAndView("CategoryList");
				List<Category> cat=(List<Category>)cdao.getAllCategory();
				System.out.println(cat);
				mv1.addObject("ca",cat);
				mv1.addObject("categ",c);
				
				return mv1;
				
			}
		 @RequestMapping("/supplierupdate")
		 	public ModelAndView supupdate(@RequestParam("id") int id) 
		  {
			  System.out.println("in supplier update controller");
			  System.out.println(id);
			  Supplier s=sdao.getSupplierById(id);
			  ModelAndView mv1=new ModelAndView("UpdateSupplier");
			  System.out.println(s);
		      mv1.addObject("sup",s);
		      return mv1;
		  }
		 	
	 		
			 @RequestMapping("/saveupdateSupplier")
				public ModelAndView saveupsup(@RequestParam("id") int id,@RequestParam("Supplier_Name") String sname,@RequestParam("Supplier_Address") String sadd)
			 {
					System.out.println("in  Save_Update_Supplier_Controller");
					System.out.println(id);
					Supplier s=new Supplier();
					s.setId(id);
					s.setS_name(sname);
					s.setAddress(sadd);
					sdao.updateSupplier(s);	
					ModelAndView mv1 = new ModelAndView("SupplierList");
				
					return mv1;
				}
				
		 @RequestMapping("/supplierdelete")
			public ModelAndView supdelete(@RequestParam("id") int sad)
		 {
				System.out.println("in controller"+sad);
				List<Supplier> s = (List<Supplier>)sdao.getAllSupplier();
				sdao.deleteSupplier(sad);
				ModelAndView mv1 = new ModelAndView("SupplierList");
				List<Supplier> sup=(List<Supplier>)sdao.getAllSupplier();
				mv1.addObject("su",sup);
			
				mv1.addObject("pros",s);
				
				return mv1;
				
			}
		 @RequestMapping("/productupdate")
		 	public ModelAndView proupdate(@RequestParam("id") int id) 
		  {
			  System.out.println("in product update controller");
			  System.out.println(id);
			  Product p=pdao.getProductById(id);
			  ModelAndView mv1 = new ModelAndView("UpdateProduct");
			  System.out.println(p);
		      mv1.addObject("pro", p);
		      return mv1;
		  }
		 		
		 @RequestMapping("/saveupdateProduct")
			public ModelAndView saveupprod(@RequestParam("id") int id,@RequestParam("DTYPE") String dtype ,@RequestParam("TITLE") String title,@RequestParam("SHORT_DESCRIPTION") String shortdes,@RequestParam("PRICE") float price,@RequestParam("STOCK") int stock)
		 {
				System.out.println("in  Save_Update_Product_Controller");
				System.out.println(id);
				Product p=new Product();
				p.setId(id);
				p.setDtype(dtype);
				p.setTitle(title);
				p.setShortDesc(shortDesc);
				p.setPrice(price);
				p.setStock(stock);
				pdao.updateProduct(p);	
				ModelAndView mv1 = new ModelAndView("ProductList");
			
				return mv1;
			}
			
		 @RequestMapping("/productdelete")
			public ModelAndView prodelete(@RequestParam("id") int pad)
		 {
				System.out.println("in controller"+pad);
				List<Product> p = (List<Product>)pdao.getAllProducts();
				pdao.deleteProduct(pad);
				ModelAndView mv1 = new ModelAndView("ProductList");
				List<Product> pro=(List<Product>)pdao.getAllProducts();
				System.out.println(pro);
				mv1.addObject("pr",pro);
				mv1.addObject("pros",p);
				
				return mv1;
				
			}
		 @RequestMapping("/listCategory")
			public ModelAndView listC()
			{

				System.out.println("list Category");
				
				ModelAndView mv = new ModelAndView("CategoryList");
				List<Category> cat=(List<Category>)cdao.getAllCategory();
				System.out.println("category*****"+cat);
				mv.addObject("ca",cat);
			
				return mv;
			}
		 
		 @RequestMapping("/listProduct")
			public ModelAndView listP()
			{

				System.out.println("list Product");
				
				ModelAndView mv = new ModelAndView("ProductList");
				List<Product> pro=(List<Product>)pdao.getAllProducts();
				System.out.println(pro);
				mv.addObject("pr",pro);
			
				return mv;
			}
		 
		 @RequestMapping("/listSupplier")
			public ModelAndView listS()
			{

				System.out.println("list Supplier");
				
				ModelAndView mv = new ModelAndView("SupplierList");
				List<Supplier> sup=(List<Supplier>)sdao.getAllSupplier();
				mv.addObject("su",sup);
			
				return mv;
			}
		  
	
	}

