<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet"
	href="https://bootswatch.com/lumen/bootstrap.min.css">
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>

<script type="text/javascript"></script>

<title>ECommerce Portal</title>
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
<script src="/js/user.js"></script>

</head>
<body>
<br>
	<h2 align="center">Shopping Service Home Page</h2>
	<br>
	<h2 id="message6"></h2><br>
	
	<div id="menuList">
		<ul>
			<li><input type="button" value="home" id="home"></li>
			<li><input type="button" value="viewCart" id="viewCart"></li>
			<li><input type="button" value="viewOrders" id="viewOrders"></li>
			<li><input type="button" value="Update CustomerProfile" id="updateCustomer"></li>
			<li><input type="button" value="Update Customer Address" id="updateAddress"></li>
			<li><input type="button" value="Logout" id="logout"></li>
		</ul>
	</div><br>
	<div align="left">
		<form>
			<table align="center">
				<tr><td>userName </td><td><input type="text" id="userName" value="${Customers.userName}"></input></td></tr>
				<tr><td>password </td><td><input type="text" id="pwd" value="${Customers.password}"></input></td></tr>
				<tr><td>cName </td><td><input type="text" id="fName" value="${Customers.cName}"></input></td></tr>

				<tr><td>Email Address</td><td><input type="text" id="email" value="${Customers.cemail}"></input></td></tr>				
				<tr><td>Phone</td><td><input type="number" id="phone" value="${Customers.cphone}"></input></td></tr>				
				<tr><td>Street</td><td><input type="text" id="street" value="${Customers.Address.street}"></input></td></tr>				
				<tr><td>City</td><td><input type="text" id="city" value="${Customers.Address.city}"></input></td></tr>				
				<tr><td>State</td><td><input type="text" id="state" value="${Customers.Address.state}"></input></td></tr>				
				<tr><td>Country</td><td><input type="text" id="country" value="${Customers.Address.country}"></input></td></tr>
				<tr><td><input type="button" value="Update Customer Profile" id="updateCustomer1"></td>
					<td><input type="button" value="Update Customer Address" id="updateAddress1"></td></tr>
			</table>
				<br><br>				
		</form>
	</div>
</body>
</html>
 --%>