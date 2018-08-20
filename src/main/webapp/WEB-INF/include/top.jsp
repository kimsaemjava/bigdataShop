<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>
  <div class="container text-center">
    <h1>Java World Store</h1>      
    <p>Mission, Vission & Values</p>
  </div>
</div>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="/bigdataShop/index.do">Logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="/bigdataShop/product/list.do?category=all">Home</a></li>
        <li><a href="/bigdataShop/product/list.do?category=dress">DRESS</a></li>
        <li><a href="/bigdataShop/product/list.do?category=outer">OUTER</a></li>
        <li><a href="/bigdataShop/product/list.do?category=top">TOP</a></li>
        <li><a href="/bigdataShop/product/list.do?category=bottom">BOTTOM</a></li>
        <li><a href="/bigdataShop/product/list.do?category=acc">ACC</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
      	<li><a href="/bigdataShop/admin/index.do"><span class="glyphicon glyphicon-user"></span>관리자</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
    </div>
  </div>
</nav>
</body>
</html>