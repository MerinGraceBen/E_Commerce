<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file = "Header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body style="background-color: black">
	<font color="grey">
		<form action="LoginController" method="post">
			<a size=5>Merii Collections</a><br><br>
			Username   <input type="text" name="username"> <br><br>
			Password    <input type="password" name="password"><br><br>
			<input type="submit" value="Login">
			<input type="submit" value="Cancel">
		</form>
		
		<form action="j_spring_security_check"" method="post">
  <div class="form-group">
    <label for="email">Email address:</label> 
    <input type="email" class="form-control" id="email" name="j_username">
  </div>
  <div class="form-group">
    <label for="pwd">Password:</label>
    <input type="password" class="form-control" id="pwd" name="j_password">
  </div>
  <div class="checkbox">
    <label><input type="checkbox"> Remember me</label>
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
</form>
	</font>
	<%@ include file = "Footer.jsp" %>
</body>
</html>