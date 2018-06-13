$(document).ready(function () {
    $("#updateUser1").click(function () {
        var userName = $("#userName").val();
        var password = $("#password").val();
        var cName = $("#cName").val();
        
        var cemail = $("#cemail").val();
        var cphone = $("#cphone").val();
        var street = $("#street").val();
        var city = $("#city").val();
        var state = $("#state").val();
        var country = $("#country").val();

        var json = {"userName":userName,"password":password,"cName":cName,"cemail":cemail,"cphone":cphone,"Address":{"street":street,"city":city,"state":state,"country":country}}
        $.ajax({
    		type: 'PUT',
    		contentType: 'application/json',
    		url: "http://localhost:8080/updateUser/"+username,
    		data:JSON.stringify(json),
    		success: function(data){
    			msg = "User profile updated";
    			window.location = '/updateUser/'+username+"?name="+username;
    			$("#message6").html(msg);
    		},
    		error: function(data){
    			msg = "Data entered is incorrect";
    			window.location = '/updateUser/'+username+"?name="+username;
    			$("#message6").html(msg);
    		}
    	});
    });
    
    $("#updateAddress1").click(function () {
        var username = $("#username").val();
        var pwd = $("#pwd").val();
        var fName = $("#fName").val();
        var lName= $("#lName").val();
        var email = $("#email").val();
        var phone = $("#phone").val();
        var street = $("#street").val();
        var city = $("#city").val();
        var state = $("#state").val();
        var country = $("#country").val();

        var json = {"username":username,"pwd":pwd,"firstName":fName,"lastName":lName,"email":email,"phone":phone,"address":{"street":street,"city":city,"state":state,"country":country}}
        var msg="";

        $.ajax({
        	type: 'PUT',
        	contentType: 'application/json',
        	url: "http://localhost:8080/updateUserAddress/"+username,
        	data:JSON.stringify(json),
        	success: function(data){
        		msg = "User address updated successfully";
        		window.location = '/updateUser/'+username+"?name="+username;
        		$("#message6").html(msg);
        	},
        	error: function(data){
        		msg = "Data entered is incorrect";
        		window.location = '/updateUser/'+username+"?name="+username;
        		$("#message6").html(msg);
        	}
        });
    });
});