
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="https://bootswatch.com/lumen/bootstrap.min.css">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

<script type="text/javascript"></script>

<title>Shopping Service Portal</title>
<style>
#menuList ul li {
	display: inline;
	position: relative;
	text-decoration: none;
}
h2 {
	font-size: 80px;
	margin: 2px 0 -20px 0 !important;
}
table {
    border-collapse: collapse;
}
th, td {
    text-align: left;
    padding: 8px;
}
tr:nth-child(even){background-color: #f2f2f2}
th {
    background-color: #4CAF50;
    color: white;
}
</style>
<script src="/js/home.js"></script>
<script src="/js/Cart.js"></script>

</head>
<body>
	<br>
	<h2 align="center">Shopping Cart Home Page</h2>
	<br>
	<h2 id="message5"></h2><br>
	
	<div id="menuList">
		<ul>
			<li><input type="button" value="home" id="home"></li>
			<li><input type="button" value="viewCart" id="viewCart"></li>
			<li><input type="button" value="viewOrders" id="viewOrders"></li>
			<li><input type="button" value="Update Customer Profile" id="updateCustomer"></li>
			

			<li><input type="button" value="Logout" id="logout"></li>
		</ul>
	</div>
	<br>
	<div align="left">
		<form>
			<input type="hidden" id="userName" value="<%=request.getParameter("name")%>"></input>

			<c:forEach var="Cart_Items" items="${Items2}">
				<input type="hidden" id="cartId" value="${Cart.caid}"></input>
				<input type="hidden" id="pid" value="${Cart_Items.products.pid}"></input>
				<input type="hidden" id="pName" value="${Cart_Items.products.pName}"></input>
				<input type="hidden" id="pSupplier" value="${Cart_Items.products.pSupplier}"></input>
				<input type="hidden" id="pPrice" value="${Cart_Items.products.pPrice}"></input>				
				<input type="hidden" id="quantity" value="${Cart_Items.quantity}"></input>				
				<input type="hidden" id="totalPrice" value="${Cart_Items.totalPrice}"></input>				
				
			<ul>
				
					<li><img src="/images/${Cart_Items.products.caid}.jpg" width="500" height="500"></li>
					<li>Cart ID : ${Cart.caid}</li>
					<li>Product ID : ${Cart_Items.products.pid}</li>
					<li>Product Name : ${Cart_Items.products.pName}</li>
					<li>Product Supplier : ${Cart_Items.products.psupplier}</li>
					<li>Product Price : ${Cart_Items.products.pPrice}</li>
					<li>Quantity : ${Cart_Items.quantity}</li>
					<li>Price : ${Cart_Items.totalPrice}</li>
					<li><input type="number" id="quantity"></input>&nbsp &nbsp			
					<input type ="button" value="Update Cart_Items" id="updateQuantity"></input></li>
					<li><input type ="button" value="Delete Product" id="deleteProduct"></li>
					<p>-------------------------------------------------------------------------------------------------</p>
			</ul>
		</c:forEach>
			<br><input type ="button" value="emptyCart" id="deleteCart">
			<br><input type ="button" value="Checkout" id="Checkout">
		</form>
	</div>

</body>
</html>