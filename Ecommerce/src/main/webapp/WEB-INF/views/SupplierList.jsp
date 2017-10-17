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
	<h3>SUPPLIER LIST</h3>
	
	 
	<table>
	 <thead>
           <tr>
           	  <th>Supplier Id</th>
              <th>Supplier Name</th>
              <th>Supplier Address</th>
              <th> </th>
              <th> </th>
           </tr>
     </thead>
     <c:forEach var="s" items="${su}">
        <tr>
   	       <td class="col-sm-8 col-md-6">
             <h4 class="media-heading"><a href="#">${s.id}</a></h4>
           </td>
       
            <td class="col-sm-1 col-md-1">
             <h5 class="media-heading"> <a href="#">${s.s_name}</a></h5>
             </td>
             
              <td class="col-sm-1 col-md-1">
             <h5 class="media-heading"> <a href="#">${s.address}</a></h5>
             </td>
             
              <td class="col-sm-1 col-md-1">
           <button type="button" class="btn btn-danger">
            <span class="glyphicon glyphicon-edit"></span> <a href="supplierupdate?id=${s.id}">Edit</button></td>
                            
           <td class="col-sm-1 col-md-1">
           <button type="button" class="btn btn-danger">
            <span class="glyphicon glyphicon-remove"></span> <a href="supplierdelete?id=${s.id}">Remove</button></td>
                    </tr>                
       </c:forEach>
  </table>
 
<%@ include file = "Footer.jsp" %>
</body>
</html>