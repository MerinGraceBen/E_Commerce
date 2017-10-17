<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file = "Header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Supplier_Update</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<form action="saveupdateSupplier">
		<table>
		
			<td>Supplier Id: </td> <td><input type="number" name="id" value="${sup.id}"> </td> </tr>
			<tr> <td> Supplier Name:</td> <td> <input type="text" name="Supplier_Name" value="${sup.s_name}"></td></tr>
			<tr> <td> Supplier Name:</td> <td> <input type="text" name="Supplier_Address" value="${sup.address}"></td></tr>
			<tr> <td><input type="submit" value="Save"></td></tr>
  		</table>
	</form>
	 <%@ include file = "Footer.jsp" %> 
</body>
</html>