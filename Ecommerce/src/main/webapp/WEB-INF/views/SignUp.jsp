<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
      
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign_Up</title>
</head>
<body style="background-color: black">
<%@ include file = "Header.jsp" %>
 <font color="grey">
   <center>
    
          
   
     <div class="container" style="margin-top:40px">
	  <div class="row">
	   <div class="col-sm-6 col-md-4 col-md-offset-4">
		<div class="panel panel-default">
	     <div class="panel-heading">
		  <strong> Sign Up</strong>
		 </div>
		 <div class="panel-body">
		 
		   <fieldset>
							<!-- <div class="row">
									<div class="center-block">
										<img class="profile-img"
											src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=120" alt="">
									</div>
							</div> -->
			<div class="row">
			 <div class="col-sm-12 col-md-10  col-md-offset-1 ">
			     <form action="saveUser" method="post">
			  <div class="form-group">
				<div class="input-group">
				 <span class="input-group-addon">
				  <i class="glyphicon glyphicon-user"></i>
				 </span> 
				 <input type="text" name="fname" id="firstname"  class="form-control" placeholder="First Name" autofocus>
				</div>
			  </div>
			  <div class="form-group">
			   <div class="input-group">
				<span class="input-group-addon">
				 <i class="glyphicon glyphicon-user"></i>
				</span> 
				<input input type="text" name="mname" id="secondname" class="form-control" placeholder="Middle Name" autofocus>
			   </div>
		      </div>
			  <div class="form-group">
			   <div class="input-group">
				<span class="input-group-addon">
				 <i class="glyphicon glyphicon-user"></i>
				</span> 
				<input type="text" name="lname" id="lastname" class="form-control" placeholder="Last Name" autofocus>
			   </div>
			  </div>
	          <div class="form-group">
			   <div class="input-group">
				<span class="input-group-addon">
				 <i class="glyphicon glyphicon-envelope"></i>
				</span> 
				<input type="email" name="umail" id="email" class="form-control" placeholder="Email" autofocus>
			   </div>
			  </div>
			  <div class="form-group">
			   <div class="input-group">
				<span class="input-group-addon">
				 <i class="glyphicon glyphicon-lock"></i>
				</span>
				<input type="password" name="pass" class="form-control" placeholder="Password"  value="">
			   </div>
			  </div>
			  <div class="form-group">
			   <div class="input-group">
				<span class="input-group-addon">
				 <i class="glyphicon glyphicon-phone"></i>
				</span> 
				<input  type="number" name="mob" id="phn"  class="form-control" placeholder="Mobile No" autofocus>
			   </div>
			  </div>
			  <div class="form-group">
			   <div class="input-group">
				<span class="input-group-addon">
				 <i class="glyphicon glyphicon-home"></i>
				</span> 
				<input type="text" name="add" id="address" class="form-control" placeholder="Address" autofocus>
			   </div>
			  </div>
			  <div class="form-group">
			   <input type="submit" class="btn btn-lg btn-primary btn-block" value="Sign Up">
			  </div>
			  
			  
			  
			  
			 <!--  <div class="page-alerts">
			  <div class="alert alert-success page-alert" id="alert-1">
        <button type="button" class="close"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
        <strong>Well done!</strong> You have successfully signed in.
    </div>
    </div> -->
    
    
			 </div>
			</div>
		   </fieldset>
		  </form>
    	</div>
		<div class="panel-footer ">
			Do have an account! <a href="login" onClick=""> Login Here </a>
		</div>
       </div>
	  </div>
	 </div>
	</div>
   </form>
   </center>
  </font>
  <%@ include file = "Footer.jsp" %>     
</body>
</html>