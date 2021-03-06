<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <body>
<form>
<jsp:include page="Header.jsp"/>
<div class="container">
	<table id="cart" class="table table-hover table-condensed">
    				<thead>
						<tr>
							<th style="width:50%">Product</th>
							<th style="width:10%">Price</th>
							<th></th>
							<th style="width:8%">Quantity</th>
							<th style="width:22%" class="text-center"></th>
							<th style="width:10%"></th>
						</tr>
					</thead>
					<tbody>
					<c:forEach var="c" items="${ca}">
						<tr>
								
							<td data-th="Product">
								<div class="row">
									<div class="col-sm-2 hidden-xs"><img src="${pageContext.request.contextPath}/resources/proimages/${c.product.img}" alt="..." class="img-responsive"/></div>
									<div class="col-sm-10">
										<h4 class="nomargin">${c.product.name}</h4>
									</div>
								</div>
							</td>
							<td data-th="Price">${c.price}</td>
							<td></td>
							<td data-th="Quantity">
								<h5>${c.quantity}</h5>
							</td>
								
								<td><a href="cartdel?prid=${c.cartid}" class="btn btn-danger">Delete</a></td>
								<td><a href="cartup?cartid=${c.cartid}" class="btn btn-success">Update</a></td>
						
							
						</tr></c:forEach>
					</tbody>
					<tfoot>
						
						<tr>
							<td><a href="#" class="btn btn-warning"><i class=" glyphicon glyphicon-shopping-cart"></i> Continue Shopping</a></td>
							<td colspan="2" class="hidden-xs"></td>
							<td class="hidden-xs text-center"><strong>Total:${t}</strong></td>
							<td><a href="order" class="btn btn-success btn-block"><i class=" glyphicon glyphicon-log-out"></i> Checkout</a></td>
						</tr>
					</tfoot>
				</table>
</div>
<jsp:include page="Footer.jsp"/>
</form>
</body>
</html>