<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		
		<script type="text/javascript">
		
			$(document).ready(function() {
				
				$(document).on('click', '#seoul', function() {
					alert('>>> 서울 날씨 선택')
					console.log("seoul.click() in")
					
					var urlV = "http://127.0.0.1:5000/seoul";
					var mType = "GET";
					
					$.ajax({
						url: urlV,
						type: mType,
						success: success,
						error: error,
						
					});	
					
					function success(res) {
						alert(">>> res : " + res);
					}
					function error(xtr, status, error) {
						alert(xtr + " : " + status + " : " + error );
					}
				}); // seoul.click()
				
				
				$(document).on('click', '#seoul', function() {
					alert('>>> 서울 날씨 선택')
					
					
					$.ajax({
						
					});					
				}); // seoul.click()	
				
			});
		</script>
	</head>
	
	<body>
		<input type="button" id="seoul" value="서울날씨"><br>
		<input type="button" id="london" value="런던날씨">	
	</body>
</html>