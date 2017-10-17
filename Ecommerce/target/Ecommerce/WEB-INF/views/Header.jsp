<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>HOME</title>
 	<meta name="viewport" content="width=device-width, initial-scale=1">
 	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
 	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
 	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 	<link rel="stylesheet" type="text/css" href="project.css">
</head>
<body style="background-color: black">
	<nav>
	  <div class="navbar  navbar-inverse">
        <div class="container-fluid">
          <div class="navbar-header">
            <ul>
            <li><a class="navbar-brand" href="#">Merii Collections</a></li>
            </ul>
           </div>
           <div>
             <ul class="nav navbar-nav navbar-right">
       		   <li><a href=" "><span class="glyphicon glyphicon-home"></span>Home</a></li>
       		  
              <c:if test="${pageContext.request.userPrincipal.name  == 'admin123@gmail.com'}">
              <li>  
               <a href="admin/adding">Admin</a>              
              </li>  
            </c:if> 
             <c:if test="${pageContext.request.userPrincipal.name  != 'admin123@gmail.com'}">
            <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">Category List
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
        <c:forEach var="c" items="${clist}" >
          <li><a href="categoryProductlist?id=<c:out value='${c.cid}'/>"><c:out value="${c.name}"/></a></li>
       </c:forEach>
          </ul>
          </li>
          </c:if>
           <c:if test="${pageContext.request.userPrincipal.name != null && pageContext.request.userPrincipal.name  != 'admin123@gmail.com'}">
            <li>       
            <a href="checkout">My Cart<i class="fa fa-shopping-cart" ></i></a> 
            </li> 
            </c:if> 
            <li>  
             <c:if test="${pageContext.request.userPrincipal.name == null }">
                <a href="register">Register</a>  
                </c:if>
            </li>  
            <li>  
            <c:if test="${pageContext.request.userPrincipal.name == null }">
                <a href="login">Login</a>
            </c:if>    
            </li>  
             <li>  
            <c:if test="${pageContext.request.userPrincipal.name  != null}">
					<li><a>Welcome: ${pageContext.request.userPrincipal.name}</a></li>
					<li><a href='<c:url value="/j_spring_security_logout" />'>Logout</a></li>
				</c:if>
            </li>  
        </ul>
       		</ul>
       	   </div>
          </div>
        </div>
    </nav>
</body>
</html>
     