<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file = "Header.jsp" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sign_Up</title>
</head>
<body style="background-color: black">
 <font color="grey">
        <form role="form" action="saveUser" method="post">
            <center>
            <table border="1" width="30%" cellpadding="5" bordercolor="grey"  >
                <thead>
                    <tr>
                        <th colspan="2">Didn't Sign Up!!!!Sign Up Here</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>First Name</td>
                        <td><input type="text" name="fname" id="firstname" value="" /></td>
                    </tr>
                     <tr>
                        <td>Middle Name</td>
                        <td><input type="text" name="mname" id="secondname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><input type="text" name="lname" id="lastname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Email</td>
                        <td><input type="text" name="umail" id="email" value="" /></td>
                    </tr>
                     <tr>
                        <td>Mobile No</td>
                        <td><input type="number" name="mob" id="phn" value="" /></td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td><input type="text" name="add" id="address" value="" /></td>
                    </tr>
                    <tr>
                        <td>User Name</td>
                        <td><input type="text" name="username" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pass" value="" /></td>
                    </tr>
                    <tr>
                       <!--  <td><input type="image" src="orange-submission-button.png" alt="Submit" /></td> -->
                        <td><input type="submit" value="Submit" /> </td>
                        <td><input type="reset" value="Reset" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">Already registered!! <a href="login.jsp">Login Here</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
        </form>
   </font>
   <%@ include file = "Footer.jsp" %>     
</body>
</html>