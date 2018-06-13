

$(document).ready(function ()  {
	

	$("#doLogin").click(function () {
		var userName = $("#userName").val();
        var password = $("#password").val();
        
	    var url = "http://localhost:8080/customers/"+userName;
	   
	    
	    $.get(url, function(data, status) {
	    	if(data.userName==userName && data.password==password) {
	    		window.location = "/home?name="+userName; 
	    	}
	    	else{
	    		alert("Invalid userName/password");
	    	}
	    	
	    });
	});
});