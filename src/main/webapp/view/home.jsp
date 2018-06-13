<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="https://bootswatch.com/lumen/bootstrap.min.css">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

<script type="text/javascript">
	window.history.forward();
	function noBack() {
		window.history.forward();
	}
</script>
	<title>Customer Page</title>
<script src="/js/addCart.js"></script>
</head>
<body onLoad="noBack();">
	<h1>Welcome <%=request.getParameter("name") %></h1><br><br>
	<div align="left">
	<form>
	<input type="hidden" id="username" value="<%=request.getParameter("name") %>">
		   <ul>
		   		<c:forEach var="products" items="${list}">
		   		
		   			<li><img src = "/images/${products.pid}.jpg"></li>
		   			<li>Product Id: ${products.pid} &nbsp</li>
		   			<li>Product Name:${products.pName}&nbsp</li>
		   			<li>Product Supplier:${products.pSupplier}&nbsp</li>
		   			<li>Product Price:${products.pPrice}&nbsp</li>
		   			<li><input type="text" name="quantity" placeholder = "Enter quantity required here" id="quantity"></li>
		   			<li><input type="button" value="Add To Cart" name="AddToCart" id="AddToCart"></li>
		   		</c:forEach>
		   		
		   </ul>
		  </form>			    
	</div>
</body>
</html>