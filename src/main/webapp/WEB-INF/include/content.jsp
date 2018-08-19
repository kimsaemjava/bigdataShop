<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
				<c:forEach var="hitprd" items="${hitproduct}">
					<c:choose>
						<c:when test="${hitprd==hitproduct.get(0)}">
							<div class="item active" style="height: 250px">
								<img
									src="/bigdataShop/resources/images/product/${hitprd.img_gen_file_nm}"
									alt="${hitprd.prd_nm }">
							</div>
						</c:when>
						<c:otherwise>
							<div class="item" style="height: 250px">
								<img
									src="/bigdataShop/resources/images/product/${hitprd.img_gen_file_nm}"
									alt="${hitprd.prd_nm }" width="460" height="345">
							</div>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</div>

			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" role="button"
				data-slide="prev"> <span
				class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
				<span class="sr-only">Previous</span>
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
		<c:forEach var="newprd" items="${newproduct}">

			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading">${newprd.prd_nm }</div>
					<div class="panel-body">
						<a href="#"> <img
							src="/bigdataShop/resources/images/product/${newprd.img_gen_file_nm }"
							class="img-responsive" style="width: 70%; height: 70%"
							alt="${newprd.prd_nm }"></a>
					</div>
					<div class="panel-footer">판매금액:${newprd.sell_prc_unit }</div>
				</div>
			</div>
		</c:forEach>

	</div>
</body>
</html>