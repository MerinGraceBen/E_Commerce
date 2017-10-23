/*package com.niit.Ecommerce.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.EcommerceBackEnd.dao.CategoryDAO;
import com.niit.EcommerceBackEnd.dao.ProductDao;
import com.niit.EcommerceBackEnd.dao.SuppilerDAO;
import com.niit.EcommerceBackEnd.model.Category;
import com.niit.EcommerceBackEnd.model.Product;
import com.niit.EcommerceBackEnd.model.Supplier;

public class AdminController
{
	@Autowired
	SuppilerDAO sdao;
	
	@Autowired
	CategoryDAO cdao;
	
	@Autowired
	ProductDao pdao;
	@RequestMapping(value = "/saveProduct", method = RequestMethod.POST)
	public ModelAndView saveProduct(HttpServletRequest request,@RequestParam("img") MultipartFile file )
	{
		

	ModelAndView mav=new ModelAndView("redirect:/adding");
	int id=request.getParameter("id");
	int cid=request.getParameter("cid");
	int sid=request.getParameter("sid");
	String name=request.getParameter("name");
	String description=request.getParameter("description");
    int price=Integer.valueOf(request.getParameter("price"));
	int stock=Integer.valueOf(request.getParameter("stock"));
	String img=file.getOriginalFilename();
	
	System.out.print(name);
	Category c=cdao.getCategoryById(cid);
	Supplier s=sdao.getSupplierById(sid);
	System.out.println("Category nME : "+c.getCtype());
	System.out.println("Supp nME : "+s.getS_name());
	Product product =new Product();
	product .setId(id);
	product .setDtype(name);
	product .setShortDesc(description);
	product .setPrice(price);
	product .setStock(stock);
    product.setCategory(c);
    product.setSupplier(s);
    product.setImage(img);
    System.out.println(product);
    
    String filepath = request.getSession().getServletContext().getRealPath("/") + "resources/product/" + file.getOriginalFilename();
	
    String filepath1 ="F:/WorkSpace2/Ecommerce/src/main/webapp/Resources/images1" + file.getOriginalFilename();
	
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
	System.out.print(product);
	   pdao.saveProduct(product);
	  
	   return mav;
	   
	   
	}
}
*/