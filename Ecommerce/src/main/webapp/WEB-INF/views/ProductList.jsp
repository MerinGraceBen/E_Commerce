<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>listP</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<%@ include file = "Header.jsp" %>
	<h3>PRODUCT LIST</h3>
	
	 
	<table>
	 <thead>
           <tr>
              <th>Product</th>
              <th>Quantity</th>
              <th class="text-center">Price</th>
              <th> </th>
              <th> </th>
           </tr>
     </thead>
     
     <c:forEach var="p" items="${pr}">
        <tr>
   	       <td class="col-sm-8 col-md-6">
             <div class="media">
              <a class="thumbnail pull-left" href="#"> <img class="media-object" src="http://icons.iconarchive.com/icons/custom-icon-design/flatastic-2/72/product-icon.png" style="width: 72px; height: 72px;"> </a>
               <div class="media-body">
                <h4 class="media-heading">  <a href="#">${p.id}</a></h4>
                <h4 class="media-heading">  <a href="#">${p.dtype}</a></h4>
                <h5 class="media-heading"> by <a href="#">${p.supplier.s_name}</a></h5>
                <h5 class="media-heading"> in <a href="#">${p.category.ctype}</a></h5>
               <!--  <span>Status: </span><span class="text-success"><strong>In Stock</strong></span> -->
              </div>
             </div>
           </td>
           <td class="col-sm-1 col-md-1" style="text-align: center"><%-- <strong>${p.stock}</strong> --%>
            <input type="number" class="form-control" value="${p.stock}">
           </td>
           
           <td class="col-sm-1 col-md-1 text-center"><strong>${p.price}</strong></td>
           
              <td class="col-sm-1 col-md-1">
           <button type="button" class="btn btn-danger">
            <span class="glyphicon glyphicon-edit"></span><a href="productupdate?id=${p.id}"> Edit</button></td>
                            
           <td class="col-sm-1 col-md-1">
           <button type="button" class="btn btn-danger">
            <span class="glyphicon glyphicon-remove"></span><a href="productdelete?id=${p.id}"> Remove</a></button></td>
            </tr>   
             
      
 
  </c:forEach>
   </table>
<%@ include file = "Footer.jsp" %>
</body>
</html>