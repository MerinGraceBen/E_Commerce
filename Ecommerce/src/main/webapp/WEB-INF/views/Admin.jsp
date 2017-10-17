<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
     <%@ include file = "Header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<title>Admin</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	

	<div class="container">
  	<ul class="nav nav-tabs">
       	<li class="active"><a data-toggle="tab" href="#cat">Category</a></li>
    	<li><a data-toggle="tab" href="#prod">Product</a></li>  
        <li><a data-toggle="tab" href="#sup">Supplier</a></li>
        <li><a data-toggle="tab" href="#list">Update</a></li>
  	</ul>
	<div class="tab-content">
	   <div id="cat" class="tab-pane fade in active">
   		 <form role="form" action="saveCategory">
      	  <h3>Category</h3>
          <label><b>Category Name</b></label>
            <input type="text"  name="CTYPE" required></br>
            <br>
          <button type="submit" class="btn btn-default" href="Admin">Save</button>
         </form> 
       </div>
    
 	   <div id="prod" class="tab-pane fade in active">
 		<form action="saveProduct"  method="post" "multipart/form-data">
         <h3>Product</h3>
         <label><b>NAME</b></label>
    	   <input type="text" name="DTYPE" id="name" required></br>
    	 <label><b>TITLE</b></label>
           <input type="text" name="TITLE" id="title" required></br>
         <label><b>SHORT_DESCRIPTION</b></label>
    	   <input type="text" name="SHORT_DESCRIPTION" id="short_desc" required></br>
         <label><b>PRICE</b></label>
    	   <input type="number"  name="PRICE" id="price" required></br>
    	 <label><b>STOCK</b></label>
    	   <input type="number" name="STOCK"  id="stock" required></br>
    
         <label><b>Category</b></label>
         <select name="cat">
    	    <c:forEach var ="c" items="${cat_id}"> 
    	    	<option value="${c.id}">${c.ctype}</option>
        	</c:forEach>
         </select>
    <br>
    
         <label><b>Supplier</b></label>
    	 <select name="sup">
    	 	<c:forEach var ="s" items="${sup_id}"> 
    			<option value="${s.id}">${s.s_name}</option>
    		</c:forEach>
    	 </select>
    <br>
    <br>
   		 <button type="submit" class="btn btn-default" href="ad">Save</button>
   		</form>
       </div>
    
    
       <div id="sup" class="tab-pane fade in active">
    	<form  role="form" action="saveSupplier">
      	  <h3>Supplier</h3>
    	  <label><b>Supplier name</b></label>
   			 <input type="text" name="Supplier_Name" id="Supplier_Name" required> <br>
   		  <label><b>Address</b></label>
   			 <input type="text"  name="Supplier_Address" id="Supplier_Address" required> <br><br>
  		  <button type="submit" class="btn btn-default" href="Admin">Save</button>
  		 </form>
  	   </div>
  	   
  	  
  	   
  	   <div id="list" class="tab-pane fade in active">
  	   
      	  <a href="listProduct"><h5>ProductList</h5></a>
      	  <a href="listSupplier"><h5>SupplierList</h5></a>
      	  <a href="listCategory"><h5>CategoryList</h5></a>
      	
      	  
  	   </div>
  	   
  	<!--    
  	   <form action="saveProduct" method="post" enctype="multipart/form-data">
   
    -->
   
     </div>
    </div>
    <%@ include file = "Footer.jsp" %>
</body>
</html>
