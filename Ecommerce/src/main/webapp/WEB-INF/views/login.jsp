<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body style="background-color: black">

     <%@ include file = "Header.jsp" %>
     <form action="j_spring_security_check"" method="post">
      <div class="container" style="margin-top:40px">
	  <div class="row">
	   <div class="col-sm-6 col-md-4 col-md-offset-4">
		<div class="panel panel-default">
	     <div class="panel-heading">
		  <strong> Log In</strong>
		 </div>
		 <div class="panel-body">
		  
		   <fieldset>
            <div class="row">
			 <div class="col-sm-12 col-md-10  col-md-offset-1 ">
			  <div class="form-group">
				<div class="input-group">
				 <span class="input-group-addon">
				  <i class="glyphicon glyphicon-envelope"></i>
				 </span> 
				 <input type="text" name="j_username" class="form-control" placeholder="Email" autofocus>
				</div>
			  </div>
			  <div class="form-group">
			   <div class="input-group">
			    <span class="input-group-addon">
				 <i class="glyphicon glyphicon-lock"></i>
				</span> 
				<input type="password" name="j_password" class="form-control" placeholder="Password" autofocus>
			   </div>
			  </div>
			  <div class="checkbox">
   			   <label><input type="checkbox"> Remember me</label>
 			  </div>
			  <div class="form-group">
			   <input type="submit" class="btn btn-lg btn-primary btn-block" value="Log in">
			  </div>
			 </div>
			</div>
		   </fieldset>
		
		 </div>
		</div>
	   </div>
	  </div>
	 </div>
	   </form>
	<%@ include file = "Footer.jsp" %>
   </body>
</html>