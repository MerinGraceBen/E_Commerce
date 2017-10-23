package com.niit.Ecommerce.controller;
	
	import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
	
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;

	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
/*
import com.niit.EcommerceBackEnd.dao.CartDAO;*/
import com.niit.EcommerceBackEnd.dao.CategoryDAO;
	import com.niit.EcommerceBackEnd.dao.ProductDao;
	import com.niit.EcommerceBackEnd.dao.SuppilerDAO;
	import com.niit.EcommerceBackEnd.dao.UserDAO;

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
		/*
		@Autowired
		CartDAO cartdao;*/
		
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
			List<Category> clist=cdao.getAllCategory();
			System.out.println("Category : "+clist);
			mv.addObject("clist",clist);
			return mv;
			
			
		}
		
		
		@RequestMapping("/login")
		public ModelAndView loginMessage()
		{
			System.out.println("in login controller");
	 
			ModelAndView mv = new ModelAndView("login");
			List<Category> clist=cdao.getAllCategory();
			System.out.println("Category : "+clist);
			mv.addObject("clist",clist);
			return mv;
		}
		
		@RequestMapping("/invalid")
		public ModelAndView invalidMessage()
		{
			System.out.println("in login controller");
	 
			ModelAndView mv = new ModelAndView("Error");
			List<Category> clist=cdao.getAllCategory();
			System.out.println("Category : "+clist);
			mv.addObject("clist",clist);
			return mv;
		}
		
		@RequestMapping("/admin/add")
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

		@RequestMapping("/add")
		public ModelAndView Admin()
		{
			System.out.println("in admincontroller");
	 
			ModelAndView mv = new ModelAndView("redirect:/admin/add");
			
			
			return mv;
		}
		
		@RequestMapping("/categoryid")
		public ModelAndView ca(@RequestParam("id") int id) {
		List<Product> p=(List<Product>)pdao.getprbycatid(id);

		ModelAndView mv1 = new ModelAndView("ProdByCateg");
		List<Category> cat=(List<Category>)cdao.getAllCategory();
		mv1.addObject("cat",cat);
		mv1.addObject("pro",p);
		return mv1;

		}
		
		
		@RequestMapping("/ViewProduct")
		public ModelAndView ViewProduct(@RequestParam("id") int id)
		{
		  Product p =pdao.getProductById(id);
		  ModelAndView mv1 = new ModelAndView("ViewProduct");
		  mv1.addObject("pr",p);
		  return mv1;
		  
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
		public ModelAndView saveU(@RequestParam("fname") String ufname, @RequestParam("mname") String umname,@RequestParam("lname") String ulname, @RequestParam("umail") String uemail,@RequestParam("mob") int uno,@RequestParam("add") String uadd, @RequestParam("pass") String upassword)
		{
			System.out.println("in registration ...");
			System.out.println(ufname+umname+ulname+uemail+uno+uadd+upassword);
			
			User p=new User();
			p.setName(ufname+" "+umname+" "+ulname);
			p.setMob(uno);
			p.setAddress(uadd);
			p.setEmail(uemail);
			p.setPassword(upassword);
			p.setRole("ROLE_USER");
			udao.saveUser(p);
	 
			ModelAndView mv = new ModelAndView("redirect:/login");
			
			return mv;
		}

		
		@RequestMapping("/SignUp")
		public ModelAndView SignUpMessage()
		{
			System.out.println("in SignUp controller");
			
			ModelAndView mv = new ModelAndView("SignUp");
			List<Category> clist=cdao.getAllCategory();
			System.out.println("Category : "+clist);
			mv.addObject("clist",clist);
			return mv;
		}
		
		
	
		
		
		
		/*@RequestMapping("/savecart")
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
		}*/
		
		/*@RequestMapping("/cart")
		public ModelAndView addcart(@RequestParam("id") int id)
		{ 
			 org.springframework.security.core.Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		     String name = auth.getName();
		     Cart cart=new Cart();
		     int count=0,cartid=0;
		     List<Cart> car=new ArrayList<Cart>();
		     car=cartdao.getcartbyusername(name);
		     for(Cart c:car )
		     {
		    	 Product ppp=c.getProdid();
		    	 if(ppp.getId()==id)
		    	 {
		    		 count=1;
		    		 cartid=c.getId();
		    	 }
		     }	
		     if(count==1)
		     {
		    	 Cart c=cartdao.getcartbyid(cartid);
		    	 int quantity=c.getQuantity();
		    	 quantity=quantity+1;
		    	 cartdao.updatequantity(cartid,quantity);
		     }
		     else
		     {
		    	 cart.setUsername(name);
		    	 cart.setQuantity(1);
		    	 Product p=new Product();
		    	 p=cartdao.getprbyid(id);
			     cart.setPrice(p.getPrice());
			     cart.setProdname(p);
			//cart.setStatus("NP");
			     cartdao.addcart(cart);
			}
		    ModelAndView mv1 = new ModelAndView("productlist1");
			Product ll=new Product();
			ll=pdao.getProductById(id);
			mv1.addObject("sup",ll);
			List<Category> cat1=(List<Category>)cdao.getAllCategory();
			mv1.addObject("cate",cat1);
			return mv1;
		}
		
		@RequestMapping("car")
		public ModelAndView car()
		{
		    ModelAndView mv1 = new ModelAndView("cart");
			List<Category> l=(List<Category>)cdao.getAllCategory();
			mv1.addObject("cate",l);
			String Username=SecurityContextHolder.getContext().getAuthentication().getName();
			List<Cart> ll=(List<Cart>)cartdao.getcartbyusername(Username);
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
		
		
		@RequestMapping("/cartdel")
		public ModelAndView cartdelete(@RequestParam("prid") int carid) {
			
			cartdao.deleteCart(carid);
			ModelAndView mv1 = new ModelAndView("redirect:/car");
			List<Category> l=(List<Category>)cdao.getAllCategory();
			mv1.addObject("cate",l);
			String Username=SecurityContextHolder.getContext().getAuthentication().getName();
			
			List<Cart> ll=(List<Cart>)cdao.getcartbyusernmae(Username);
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
	
		@RequestMapping("/cartup")
		public ModelAndView cartupdate(@RequestParam("cartid") int cartid) {
			
			ModelAndView mv1 = new ModelAndView("updatecart");
			List<Category> l=(List<Category>)cdao.getAllCategory();
			mv1.addObject("cate",l);
			Cart c= new Cart();
			c=cartdao.getcartbyid(cartid);
			mv1.addObject("ca",c);
			return mv1;
	}

		@RequestMapping("/cartupdate")
		public ModelAndView cartupda(@RequestParam("cid") int cartid, @RequestParam("quantity") int quantity) {
			System.out.println(cartid);
			ModelAndView mv1 = new ModelAndView("cart");
			List<Category> l=(List<Category>)cdao.getAllCategory();
			mv1.addObject("cate",l);
		    Cart c= new Cart();
			String Username=SecurityContextHolder.getContext().getAuthentication().getName();
			c.setUsername(Username);
			c.setQuantity(quantity);
			cartdao.updatequantity(cartid,quantity);
			List<Cart> ll=(List<Cart>)cartdao.getcartbyusername(Username);
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
		@RequestMapping(value="/admin/saveCategory",method=RequestMethod.POST)
		public ModelAndView cate(@RequestParam("CTYPE") String ctype) {
			System.out.println("in  Category__controller");
			System.out.println(ctype);
			Category c=new Category();
			c.setCtype(ctype);
			cdao.saveCategory(c);	
			ModelAndView mv1 = new ModelAndView("redirect:/admin/add");
		
			return mv1;
		}
		
		 @RequestMapping("/admin/categoryupdate")
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
		 		
		 @RequestMapping(value="/admin/saveupdateCategory",method=RequestMethod.POST)
			public ModelAndView saveupcat(@RequestParam("id") int id,@RequestParam("CTYPE") String ctype)
		 {
				System.out.println("in  Save_Update_Category__controller");
				System.out.println(id);
				Category c=new Category();
				c.setId(id);
				c.setCtype(ctype);
				cdao.updateCategory(c);	
				ModelAndView mv1 = new ModelAndView("redirect:/admin/listCategory");
			
				return mv1;
			}
			
		 @RequestMapping(value="/admin/categorydelete",method=RequestMethod.POST)
			public ModelAndView catdelete(@RequestParam("id") int cad)
		 {
			 System.out.println("in controller"+cad);
				List<Category> c = (List<Category>)cdao.getAllCategory();
				cdao.deleteCategory(cad);
				ModelAndView mv1 = new ModelAndView("redirect:/admin/listCategory");
				List<Category> cat=(List<Category>)cdao.getAllCategory();
				System.out.println(cat);
				mv1.addObject("ca",cat);
				mv1.addObject("categ",c);
				
				return mv1;
				
			}
		 
		 @RequestMapping(value="/admin/saveSupplier",method=RequestMethod.POST)
			public ModelAndView supplier(@RequestParam("Supplier_Name") String sname,@RequestParam("Supplier_Address") String sadd) {
				System.out.println("in controller");
				System.out.println(sname+sadd);
				Supplier s=new Supplier();
				s.setS_name(sname);
				s.setAddress(sadd);
				sdao.saveSupplier(s);
				ModelAndView mv1 = new ModelAndView("redirect:/admin/add");
				
				return mv1;
			}
			
		 @RequestMapping("/admin/supplierupdate")
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
		 	
	 		
			 @RequestMapping(value="/admin/saveupdateSupplier",method=RequestMethod.POST)
				public ModelAndView saveupsup(@RequestParam("id") int id,@RequestParam("Supplier_Name") String sname,@RequestParam("Supplier_Address") String sadd)
			 {
					System.out.println("in  Save_Update_Supplier_Controller");
					System.out.println(id);
					Supplier s=sdao.getSupplierById(id);
					
					s.setS_name(sname);
					s.setAddress(sadd);
					sdao.updateSupplier(s);	
					ModelAndView mv1 = new ModelAndView("redirect:/admin/listSupplier");
				
					return mv1;
				}
				
		 @RequestMapping(value="/admin/supplierdelete",method=RequestMethod.POST)
			public ModelAndView supdelete(@RequestParam("id") int sad)
		 {
				System.out.println("in controller"+sad);
				List<Supplier> s = (List<Supplier>)sdao.getAllSupplier();
				sdao.deleteSupplier(sad);
				ModelAndView mv1 = new ModelAndView("redirect:/admin/listSupplier");
				List<Supplier> sup=(List<Supplier>)sdao.getAllSupplier();
				mv1.addObject("su",sup);
			
				mv1.addObject("pros",s);
				
				return mv1;
				
			}
		 
		 @RequestMapping(value="/admin/saveProduct",method=RequestMethod.POST)
			public ModelAndView pro(@RequestParam("DTYPE") String dtype ,@RequestParam("TITLE") String title,@RequestParam("SHORT_DESCRIPTION") String shortdes,@RequestParam("PRICE") int price,@RequestParam("STOCK") int stock,@RequestParam("cat") int cid,@RequestParam("sup") int sid,@RequestParam("img") MultipartFile file ) {
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
				
				String img=file.getOriginalFilename();
				
			    pr.setImage(img);
				
				pdao.saveProduct(pr);
				//Saving Image to Folder
				
			    String filepath1 ="E:/Users/user/workspace/E_commerce/E_commerce/Ecommerce/src/main/webapp/Resources/images1/" + file.getOriginalFilename();
				
				System.out.println(filepath1);
				try {
					byte imagebyte[] = file.getBytes();
					BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filepath1));
					fos.write(imagebyte);
					fos.close();
					} catch (IOException e) {
					e.printStackTrace();
					} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
				System.out.print("Image : "+pr.getImage());
				
				
				
				
				ModelAndView mv1 = new ModelAndView("redirect:/add");
				List<Category> l=(List<Category>)cdao.getAllCategory();
				System.out.println("Category List : "+l);
				mv1.addObject("cat_id",l);
				
				List<Supplier> ll=(List<Supplier>)sdao.getAllSupplier();
				System.out.println("Supplier List : "+ll);
				mv1.addObject("sup_id",ll);
				return mv1;
			}  
		 
		 @RequestMapping("/admin/productupdate")
		 	public ModelAndView proupdate(@RequestParam("id") int id) 
		  {
			  System.out.println("in product update controller");
			  System.out.println(id);
			  Product p=pdao.getProductById(id);
			  
			  
			  ModelAndView mv1 = new ModelAndView("UpdateProduct");
			  List<Category> l=(List<Category>)cdao.getAllCategory();
				System.out.println("Category List : "+l);
				mv1.addObject("cat_id",l);
				
				List<Supplier> ll=(List<Supplier>)sdao.getAllSupplier();
				System.out.println("Supplier List : "+ll);
				mv1.addObject("sup_id",ll);
			  System.out.println(p);
		      mv1.addObject("pro", p);
		      return mv1;
		  }
		 		
		 @RequestMapping(value="/admin/saveupdateProduct",method=RequestMethod.POST)
			public ModelAndView saveupprod(@RequestParam("id") int id,@RequestParam("sup") int sid,@RequestParam("cat") int cid,@RequestParam("DTYPE") String dtype ,@RequestParam("TITLE") String title,@RequestParam("SHORT_DESCRIPTION") String shortdes,@RequestParam("PRICE") int price,@RequestParam("STOCK") int stock,@RequestParam("img") MultipartFile file)
		 {
				System.out.println("in  Save_Update_Product_Controller");
				System.out.println(id);
				Product p=pdao.getProductById(id);
				Supplier s=sdao.getSupplierById(sid);
				Category c=cdao.getCategoryById(cid);
				p.setCategory(c);
				p.setSupplier(s);
				p.setDtype(dtype);
				p.setTitle(title);
				p.setShortDesc(shortdes);
				p.setPrice(price);
				p.setStock(stock);
				pdao.updateProduct(p);	
				
				
				String img=file.getOriginalFilename();
				
			    p.setImage(img);
				
				pdao.saveProduct(p);
				//Saving Image to Folder
				
			    String filepath1 ="E:/Users/user/workspace/E_commerce/E_commerce/Ecommerce/src/main/webapp/Resources/images1/" + file.getOriginalFilename();
				
				System.out.println(filepath1);
				try {
					byte imagebyte[] = file.getBytes();
					BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(filepath1));
					fos.write(imagebyte);
					fos.close();
					} catch (IOException e) {
					e.printStackTrace();
					} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
				System.out.print("Image : "+p.getImage());
				
				
				
				ModelAndView mv1 = new ModelAndView("redirect:/admin/listProduct");
			
				return mv1;
			}
			
		 @RequestMapping(value="/admin/productdelete")
			public ModelAndView prodelete(@RequestParam("id") int pad)
		 {
				System.out.println("in controller"+pad);
				List<Product> p = (List<Product>)pdao.getAllProducts();
				pdao.deleteProduct(pad);
				ModelAndView mv1 = new ModelAndView("redirect:/admin/listProduct");
				List<Product> pro=(List<Product>)pdao.getAllProducts();
				System.out.println(pro);
				mv1.addObject("pr",pro);
				mv1.addObject("pros",p);
				
				return mv1;
				
			}
		 @RequestMapping("/admin/listCategory")
			public ModelAndView listC()
			{

				System.out.println("list Category");
				
				ModelAndView mv = new ModelAndView("CategoryList");
				List<Category> cat=(List<Category>)cdao.getAllCategory();
				System.out.println("category*****"+cat);
				mv.addObject("ca",cat);
			
				return mv;
			}
		 
		 @RequestMapping("/admin/listProduct")
			public ModelAndView listP()
			{

				System.out.println("list Product");
				
				ModelAndView mv = new ModelAndView("ProductList");
				List<Product> pro=(List<Product>)pdao.getAllProducts();
				System.out.println(pro);
				mv.addObject("pr",pro);
			
				return mv;
			}
		 
		 @RequestMapping("/admin/listSupplier")
			public ModelAndView listS()
			{

				System.out.println("list Supplier");
				
				ModelAndView mv = new ModelAndView("SupplierList");
				List<Supplier> sup=(List<Supplier>)sdao.getAllSupplier();
				mv.addObject("su",sup);
			
				return mv;
			}
		  
	
	}

