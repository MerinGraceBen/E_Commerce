
 	  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
 	  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" type="text/css" href="project.css">

 <nav>
<div class="navbar  navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="./">Merii Collections</a>
    </div>
    <ul class="nav navbar-nav">
     
     
         <c:if test="${pageContext.request.userPrincipal.name  != 'admin123@gmail.com'}">
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Category<span class="caret"></span></a>
        <ul class="dropdown-menu">
        	 <c:forEach var ="c" items="${clist}"> 
    	    	<%-- <option>${c.ctype}</option> --%>
    	    	 <li><a href="categoryid?id=${c.id}">${c.ctype}</a></li>   
        	</c:forEach>
        </ul>
        
        </li>
        </c:if>
         
         <c:if test="${pageContext.request.userPrincipal.name  == 'admin123@gmail.com'}">
              <li>  
               <a href="add">Admin</a>          
              </li>  
            </c:if> 
        
    </ul>
       <ul class="nav navbar-nav navbar-right">
        <c:if test="${pageContext.request.userPrincipal.name  != 'admin123@gmail.com' && pageContext.request.userPrincipal.name  !=null}">
      
      <li class="active"><a href="car"><span class="glyphicon glyphicon-shopping-cart"></span>Cart</a></li>
     </c:if> 
       		
         <c:if test="${pageContext.request.userPrincipal.name == null }">
            <li><a href="SignUp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
            </c:if>
            <c:if test="${pageContext.request.userPrincipal.name == null }">
            
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            </c:if>
            <c:if test="${pageContext.request.userPrincipal.name  != null}">
					<li><a href='<c:url value="/j_spring_security_logout" />'>Logout</a></li>
				</c:if>                  
          
       </li>
    </ul>
  </div>
  </div>
</nav>