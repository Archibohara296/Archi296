$(document).ready(function () {
    $("#AddToCart").click(function () {
    	var username = request.getParameter("userName");
    	var quantity = $("#quantity").val();
    	var json = {"products":{},"quantity":quantity};
    	$.ajax({
    		type: 'POST',
    		contentType: 'application/json',
    		url: "http://localhost:8080/cart"+"/"+userName,
    		//dataType: "json",
    		data:JSON.stringify(json)
    		success: function(data){
    			msg = "Product added to the cart";
    			window.location = '/home';
    			$("#message").html(msg);
    		},
    		error: function(data){
    			msg = "Data entered is incorrect";
    			window.location = '/home';
    			$("#message").html(msg);
    		}
    	});
    });
});

