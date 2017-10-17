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
      <a class="navbar-brand" href="#">Merii Collections</a>
    </div>
    <ul class="nav navbar-nav">
     
     
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Category<span class="caret"></span></a>
        <ul class="dropdown-menu">
        	 <c:forEach var ="c" items="${cat_id}"> 
    	    	<option>${c.ctype}</option>
        	</c:forEach>
        </ul>
         <li><a href="#">Today's Offers</a></li>
         <li><a href="Admin">Admin</a>
    </ul>
       <ul class="nav navbar-nav navbar-right">
       		<li><a href="Cart"><span class="glyphicon glyphicon-shopping-cart"></span>Cart</a></li>
         <li><a href="SignUp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="login"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
  </div>
</nav>
  <div class="container">

  <div id="myCarousel" class="carousel slide "  data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="4"></li>
      <li data-target="#myCarousel" data-slide-to="5"></li>
      
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
    <img src="Resources/images1/bracelet1.jpg" alt="t1" style="width:100%; height: 500px;">
      </div>

      <div class="item">
         <img src="Resources/images1/chain1.jpg" alt="t2" style="width:100%; height: 500px;">
      </div>
    
      <div class="item">
      <img src="Resources/images1/earring1.jpg" alt="t3" style="width:100%; height: 500px;">
      </div>
    
    <div class="item">
      <img src="Resources/images1/cosmetics1.png" alt="t4" style="width:100%; height: 500px;">
      </div>
    
    
    <div class="item">
      <img src="Resources/images1/perfume1.jpg" alt="t5" style="width:100%; height: 500px;">
      </div>
    
    
     <div class="item">
      <img src="Resources/images1/gifts1.jpg" alt="t6" style="width:100%; height: 500px;">
      </div>
      
      <div class="item">
      <img src="Resources/images1/bag1.jpg" alt="t7" style="width:100%; height: 500px;">
      </div>
    
    
    <div class="item">
      <img src="Resources/images1/crockery1.jpg" alt="t8" style="width:100%; height: 500px;">
      </div>
    
    
     <div class="item">
      <img src="Resources/images1/stationery1.jpg" alt="t9" style="width:100%; height: 500px;">
      </div>
      
      <div class="item">
      <img src="Resources/images1/watch2.jpg" alt="t10" style="width:100%; height: 500px;">
      </div>
    </div>
    

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
<footer color="white">
  <p>Posted by: Fashion Gift Center, Irinjalakuda</p>
  <p>Contact information: <a href="e-fashion@gmail.com">e-fashion@gmail.com</a></p>
</footer>

 <%@ include file = "Footer.jsp" %> 

</body>
</html>