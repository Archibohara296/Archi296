<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="/js/register.js"></script>
</head>
<body>
<div class="jumbotron text-center">
  <h1>Registration</h1>
  <p>A place where you can get anything in the world</p> 
</div>
  
<div class="container">
  <div class="row">
    <div class="col-sm-4">
      <h3>Electronics</h3>
      <p>We have authorized dealers certified by Apple, Microsoft and Google</p>
     
    </div>
    <div class="col-sm-4">
      <h3>Sport goods</h3>
      <p>Our goods provide ultimate services</p>
      <p>Certified by Reebok , Addidas</p>
    </div>
    <div class="col-sm-4">
      <h3>Clothing</h3>        
      <p>Authentic clothing and changes to trend</p>
    </div>
  </div>
</div>
<title>Shopping Service Registration</title>
<h2 id="message" style="color:blue"></h2>
	<div align="center">
		<form action = "doRegister">
		<h2>Customer Registration</h2><br>
			<table>
				<tr>
					<td>UserName</td>
					<td><input type="text" id="userName" required="required" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" id="password" required="required" /></td>
				</tr>
				<tr>
					<td>CustomerName</td>
					<td><input type="text" id="cName" required="required" /></td>
				</tr>
				
				<tr>
					<td>Customer Email</td>
					<td><input type="email" id="cemail" required="required" /></td>
				</tr>
				<tr>
					<td>Phone</td>
					<td><input type="number" id="cphone" required="required" /></td>
				</tr>
			
				<tr>
					<td colspan="2" align="center"><input type="button"
						value="Register" name="doRegister" id="doRegister" /></td>
				</tr>
			</table>
		</form>
		<h2>
			Already Registered?  <a href="/login">click here</a>
		</h2>

	</div>

</body>
</html>