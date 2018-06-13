<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {
    background-image: url("https://www.google.com/search?q=background+images+css&source=lnms&tbm=isch&sa=X&ved=0ahUKEwi_l8LivLvUAhUMaFAKHcKNB-UQ_AUICigB&biw=1600&bih=780#imgdii=pNdeu9U4LnsALM:&imgrc=Cj_582UJXCTL4M:");
    background-color: #cccccc;
}
</style>
      <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
   

    <script type="text/javascript">
window.history.forward();
function noBack(){
	window.history.forward();
        }
    </script>

    
    <script src="js/login1.js"></script>
    
    <title>Shopping Service</title>
</head>

<body onLoad="noBack();">
    <h1 align="center"> Shopping Service Portal</h1>
    <h2 align="center">Customer Login Page:</h2>
    <h2 id="message" style="color:red"></h2>
    <h2 id="message2" style="color:green"></h2>
    <div align="center">
        <table>
            <tr>
                <td>User Name: </td>
                <td><input type="text" id="userName", name="userName" placeholder="Enter username here" size="30" required="required" /></td>
            </tr>
            
            <tr>
                <td>Password: </td>
                <td><input type="password" id="password" name="password" placeholder="Enter password here" size="30" required="required" /></td>
            </tr>

            <tr>
                <td><input type="button" value="Login" name="doLogin" id="doLogin" /></td>
            </tr>
           
        </table>
    </div>
        <h3><font>New Customer? <a href="/register"> Register</a></font></h3>
   
</body>
</html>