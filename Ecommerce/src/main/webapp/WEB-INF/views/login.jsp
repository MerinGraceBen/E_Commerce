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
		<form action="j_spring_security_check"" method="post">
			<a size=5>Merii Collections</a><br><br>
			Username   <input type="text" name="username"> <br><br>
			Password    <input type="password" name="password"><br><br>
			 <div class="checkbox">
   				 <label><input type="checkbox"> Remember me</label>
 			</div>
			<input type="submit" value="Login">
			<input type="submit" value="Cancel">
		</form>
	</font>
	<%@ include file = "Footer.jsp" %>
</body>
</html>