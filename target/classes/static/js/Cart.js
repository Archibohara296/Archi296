$(document).ready(function () {
    $("#updateQuantity").click(function () {
    	var username = $("#userName").val();
    	var caId = $("#caid").val();
    	var pId = $("#pid").val();
    	var pName = $("#pName").val();
    	var pSupplier = $("#pSupplier").val();
    	var pPrice = $("#pPrice").val();
    	var pquantity = $("#pQuantity").val();
    	var totalPrice = $("#TotalPrice").val();
    	var msg="";
    	var json = {"caId":caid,"products":{"pid":pid,"pName":pName,"pSupplier":pSupplier,"pPrice":pPrice},"pquantity":pquantity,"totalPrice":TotalPrice};
    	$.ajax({
    		type: 'PUT',
    		contentType: 'application/json',
    		url: "http://localhost:8080/updateQuantity/"+caid,
    		//dataType: "json",
    		data:JSON.stringify(json),
    		success: function(data){
    			msg = "Quantity updated successfully";
    			window.location = '/viewCart/'+userName+"?name="+userName;
    			$("#message5").html(msg);
    		},
    		error: function(data){
    			msg = "Data entered is incorrect";
    			window.location = '/viewCart/'+userName+"?name="+userName;
    			$("#message5").html(msg);
    		}
    	});
    });
    $("#deleteProduct").click(function () {
    	var username = $("#userName").val();
    	var cartId = $("#caid").val();
    	var pId = $("#pid").val();
    	var pName = $("#pName").val();
    	var pSupplier = $("#pSupplier").val();
    	var pPrice = $("#pPrice").val();
    	var pquantity = $("#pQuantity").val();
    	var totalPrice = $("#TotalPrice").val();

    	var json = {"cartId":caid,"products":{"pid":pid,"pName":pName,"pSupplier":pSupplier,"pPrice":pPrice},"pquantity":pQuantity,"totalPrice":TotalPrice};
    	var msg="";
    	$.ajax({
    		type: 'DELETE',
    		contentType: 'application/json',
    		url: "http://localhost:8080/deleteProduct/"+username+"/"+cid,
    		data:JSON.stringify(json),
    		success: function(data){
    			msg = "Product removed from the cart";
    			window.location = '/viewCart/'+userName+"?name="+userName;
    			$("#message5").html(msg);
    		},
    		error: function(data){
    			msg = "Data entered is incorrect";
    			window.location = '/viewCart/'+userName+"?name="+userName;
    			$("#message5").html(msg);
    		}
    	});
    });
    
    $("#emptyCart").click(function () {
    	var username = $("#userName").val();

    	var msg="";
    	$.ajax({
    		type: 'DELETE',
    		contentType: 'application/json',
    		url: "http://localhost:8080/emptyCart/"+userName,
    		success: function(){
    			msg = "Cart is deleted for the user";
    			window.location = '/viewCart/'+userName+"?name="+userName;
    			$("#message5").html(msg);
    		},
    		error: function(){
    			msg = "Cart delete unsuccessful";
    			window.location = '/viewCart/'+userName+"?name="+userName;
    			$("#message5").html(msg);
    		}
    	});
    });
});
