$(document).ready(function () {
    $("#doRegister").click(function () {
        var userName = $("#userName").val();
        var password = $("#password").val();
        var cName = $("#cName").val();
        var cemail = $("#cemail").val();
        var phone = $("#phone").val();
        var msg;
        var json = {"userName":userName, "password":password,"cName":cName,"phone":phone,"cemail":cemail};
        
    
        
        $.ajax({
    		type: 'POST',
    		contentType: 'application/json',
    		url: "http://localhost:8080/customers",
    		//dataType: "json",
    		data: JSON.stringify(json),
    		success: function(data){
    			msg = "Registration Successful";
    			window.location = '/login';
    		},
    		error: function(data){
    			msg = "Data entered is incorrect";
    			window.location = '/register';
    		}
    	});
        $("#message2").html(msg);
    });
});