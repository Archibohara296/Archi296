$(document).ready(function () {
$("#AddToCart").click(function () {
    	var username = $("#username").val();
    	var quantity = $("#quantity").val();
    	var id = $("#caid").val();
    	var name = $("#NAME").val();
    	var supplier = $("#Supplier").val();
    	var price = $("#Price").val();
    	var json = {"product":{"pid":pid,"pName":pName,"pSupplier":pSupplier,"pPrice":pPrice},"quantity":quantity};
    	$.ajax({
    		type: 'POST',
    		contentType: 'application/json',
    		url: "http://localhost:8080/addProductToCart/"+username,
    		data:JSON.stringify(json),
    		success: function(data){
    			msg = "Product added to the cart";
    			window.location = "/home"+"?name="+userName;
    			$("#message4").html(msg);
    		},
    		error: function(data){
    			msg = "Data entered is incorrect";
    			window.location = "/viewProduct/"+id+"?name="+userName;
    			$("#message4").html(msg);
    		}
    	});
    });
});