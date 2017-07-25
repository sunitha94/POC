$(document).ready(function() {
	$(document).on("click", ".signupbtn", function(e) {
		alert("Hi");
		$.ajax({
			type : 'GET',
			url : "/save-registraition-form",
			success : function(data) {
			alert("success");
			},
			error : function(textStatus, errorThrown) {
				alert(errorThrown);
			}
		});
	});
});
