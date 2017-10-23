%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
     <!DOCTYPE html>
<html lang="en">
  <head>
    
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title> Product Detail</title>
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:400,700" rel="stylesheet">

  </head>

  <body>
	

<%@ include file = "Header.jsp" %>
<div class="container" id="product-section">
  <div class="row">
   <div class="col-md-6">
   <img  src="${pageContext.request.contextPath}/Resources/images1/${pr.image}" class="image-responsive" style='width:100%;' />
   </div>
   
   <div class="col-md-6">
     <div class="row">
  <div class="col-md-12">
   <h1 style="color:white;">${pr.dtype}</h1>
 </div>
</div><!-- end row-->

<div class="row">
 <div class="col-md-12">
  <p class="description">
 ${pr.shortDesc}
  </p>
 </div>
</div><!-- end row -->

<div class="row">
 <div class="col-md-3">
  <span class="sr-only">Four out of Five Stars</span>
  <span class="glyphicon glyphicon-star" aria-hidden="true" style="color: #e67e22;"></span>
  <span class="glyphicon glyphicon-star" aria-hidden="true" style="color: #e67e22;"></span>
  <span class="glyphicon glyphicon-star" aria-hidden="true" style="color: #e67e22;"></span>
  <span class="glyphicon glyphicon-star" aria-hidden="true" style="color:#e67e22;"></span>
  <span class="glyphicon glyphicon-star-empty" aria-hidden="true" style="color:#e67e22;"></span>
  <span class="label label-success">61</span>
 </div>
 <div class="col-md-3">
  <span class="monospaced">Write a Review</span>
 </div>
</div><!-- end row -->


<div class="row">
 <div class="col-md-12 bottom-rule">
  <h2 class="product-price"> ${pr.price }</h2>
 </div>
</div><!-- end row -->
<c:if test="${pageContext.request.userPrincipal.name != null && pageContext.request.userPrincipal.name  != 'admin123@gmail.com'}">
          
<div class="form-group">
<form action="catr" method="POST">
<div class="row add-to-cart">
 <div class="col-md-5 product-qty">
 <input type='button' value='-' class='qtyminus' field='quantity' style="background-color: #4CAF50;"/>
    <input type='text' name='quantity' value='1' class='qty'  min='1' />
 
    <input type='button' value='+' class='qtyplus' field='quantity' style="background-color: #4CAF50;" />

 </div>
 <input name="id" type="hidden" value=${produc.id}>
 <div class="col-md-4">
   <button class="btn btn-success" type="submit">
   Add to Cart
  </button>
  
 </div>
</div><!-- end row -->
</form>
</div>
</c:if>
 <c:if test="${pageContext.request.userPrincipal.name == null }">
 <a href="login" class="btn btn-success">Log in to add items to cart</a>
 
 </c:if>
 
  <c:if test="${pageContext.request.userPrincipal.name != null }">
 <a href="#" class="btn btn-success">Add to cart</a>
  </c:if>
  
<div class="row">
 <div class="col-md-4 text-center">
  <span class="monospaced">${produc.stock } <br> Left </span>
 </div>
 
</div><!-- end row -->
<div class="row">
 <div class="col-md-12 bottom-rule top-10"></div>
</div><!-- end row -->

<div class="row">
 <div class="col-md-12 top-10">
  <p>To order by telephone,please call 1-800-555-1212</p>
 </div>
</div><!-- end row -->



   </div>
    </div><!-- end row -->
 </div><!-- end container -->
 
 <br>
 <%-- <h2>YOU MAY LIKE THESE</h2>
   <div class="row">

                    <div id="carousel-content" class="carousel slide" data-ride="carousel">
                     
                      <!-- Wrapper for slides -->
                      <div class="carousel-inner">
                        <div class="item active">
                        		 <c:forEach var="design" items="${productli}">
                        		 	<c:if test="${design.id != produc.id}">
                                        <!-- SINGLE SERVICE -->
                                        <div class="col-md-4 col-sm-6 col-xs-12" data-wow-offset="10" data-wow-duration="1.5s" style="visibility: visible;
                                         -webkit-animation-duration: 1.5s;">
                                           <a href="prolis?id=${design.id}&c_id=${design.category.c_id}"><img src="resources/img/${design.img }" 
                                           class="img-responsive" style=" width: 100%; height: 50vh;"></a>
                                        </div>
                                        <!-- /END SINGLE SERVICE -->
                                        </c:if>
                                 </c:forEach>
                         </div>
                                        
                      </div>

                      
                    </div>

            </div>
     
 --%>   
  
<%@ include file = "Footer.jsp" %>
</body>
</html>
