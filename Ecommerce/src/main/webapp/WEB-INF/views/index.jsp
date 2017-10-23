<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  
</head>
<body style="background-color: black">
<jsp:include page="Header.jsp"></jsp:include>
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