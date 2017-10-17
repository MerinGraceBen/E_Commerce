<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file = "Header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category_Update</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<form action="saveupdateCategory">
		<table>
			<tr>
 		    <td>Category Id: </td> <td><input type="number" name="id" value="${cat.id}"> </td> </tr>
 			<tr> <td> Category Name:</td> <td> <input type="text" name="CTYPE" value="${cat.ctype}"></td></tr>
  			<tr> <td><input type="submit" value="Save"></td></tr>
 		</table>
	</form>
 <%@ include file = "Footer.jsp" %> 
</body>
</html>