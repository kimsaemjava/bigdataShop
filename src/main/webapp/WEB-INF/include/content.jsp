<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
.carousel-inner>.item>img, .carousel-inner>.item>a>img {
	width: 70%;
	margin: auto;
}
</style>
</head>
<body>
	<br>
	<div class="row">
		<div id="myCarousel" class="carousel slide" data-ride="carousel">
			<!-- Indicators -->
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
				<li data-target="#myCarousel" data-slide-to="3"></li>
			</ol>
	
			<!-- Wrapper for slides -->
			<div class="carousel-inner" role="listbox">
				<div class="item active" style="height: 250px">
					<img src="/bigdataShop/resources/images/product/dress_images1.jpg" alt="Chania" >
				</div>
	
				<div class="item" style="height: 250px">
					<img src="/bigdataShop/resources/images/product/acc_image5.jpg" alt="Chania" width="460" height="345">
				</div>
	
				<div class="item" style="height: 250px">
					<img src="/bigdataShop/resources/images/product/bottom_image3.jpg" alt="Flower" width="460" height="345">
				</div>
	
				<div class="item" style="height: 250px">
					<img src="/bigdataShop/resources/images/product/outer_image5.gif" alt="Flower" width="460" height="345">
				</div>
			</div>
	
			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" role="button"
				data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
				aria-hidden="true"></span> <span class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel" role="button"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
				<span class="sr-only">Next</span>
			</a>
		</div>
	</div>
	<br />
	<br />
	<div class="row">
		<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading">원피스1</div>
					<div class="panel-body">
						<a href="#"><img
							src="/bigdataShop/resources/images/product/dress_images1.jpg"
							class="img-responsive" style="width: 70%; height: 70%" alt="Image"></a>
					</div>
					<div class="panel-footer">판매금액:27000</div>
				</div>
		</div>
		<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading">원피스2</div>
					<div class="panel-body">
						<a href="#"><img
							src="/bigdataShop/resources/images/product/dress_images3.jpg"
							class="img-responsive" style="width: 70%; height: 70%" alt="Image"></a>
					</div>
					<div class="panel-footer">판매금액:27000</div>
				</div>
		</div>
		<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading">원피스3</div>
					<div class="panel-body">
						<a href="#"><img
							src="/bigdataShop/resources/images/product/dress_images2.jpg"
							class="img-responsive" style="width: 70%; height: 70%" alt="Image"></a>
					</div>
					<div class="panel-footer">판매금액:27000</div>
				</div>
		</div>
	</div>
</body>
</html>