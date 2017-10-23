<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file = "Header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product_Update</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

	<form action="saveupdateProduct" method="post" enctype="multipart/form-data">
		<table>
		
			<td>Product Id: </td> <td><input type="number" name="id" value="${pro.id}"> </td> </tr>
			<tr> <td> Product Name:</td> <td> <input type="text" name="DTYPE" value="${pro.dtype}"></td></tr>
			<td>Product Title: </td> <td><input type="text" name="TITLE" value="${pro.title}"> </td> </tr>
			<tr> <td> Product Description:</td> <td> <input type="text" name="SHORT_DESCRIPTION" value="${pro.shortDesc}"></td></tr>
			<td>Product Price: </td> <td><input type="number" name="PRICE" value="${pro.price}"> </td> </tr>
			<tr> <td> Product Stock:</td> <td> <input type="text" name="STOCK" value="${pro.stock}"></td></tr>
			 
			 
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
    <input type="file" name="img" >
    <br>
   		 <button type="submit" class="btn btn-default" href="ad">Update</button>
   		</form>

  		</table>

	 <%@ include file = "Footer.jsp" %> 
</body>
</html>