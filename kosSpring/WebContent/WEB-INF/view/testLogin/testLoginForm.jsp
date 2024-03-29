<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<link href="./css/testLogin.css" rel="stylesheet" type="text/css">
		<script src="https://t1.kakaocdn.net/kakao_js_sdk/2.3.0/kakao.min.js"
  				integrity="sha384-70k0rrouSYPWJt7q9rSTKpiTfX6USlMYjZUtr1Du+9o4cGvhPAWxngdtVZDdErlh" 
  				crossorigin="anonymous">
		</script>
		<script>
			Kakao.init('dc56b6d084d1dfee81139d38127c0d75'); // 사용하려는 앱의 JavaScript 키 입력
		</script>
		
		
		
		<script type="text/javascript">
			
		$(document).ready(function() {
			
			$("#signup").click(function() {
				
				location.href="testSignup.lhd";
			});
			
		}); // end of ready()
		
		function loginWithKakao() {
			Kakao.Auth.authorize({
				redirectUri: 'http://192.168.0.24:8088/testLogin/auth',
			});
		}

	// 아래는 데모를 위한 UI 코드입니다.
		displayToken()
		function displayToken() {
		var token = getCookie('authorize-access-token');
		
			if(token) {
			Kakao.Auth.setAccessToken(token);
				Kakao.Auth.getStatusInfo()
					.then(function(res) {
						if (res.status === 'connected') {
						document.getElementById('token-result').innerText
						= 'login success, token: ' + Kakao.Auth.getAccessToken();
						}
					})
					.catch(function(err) {
						Kakao.Auth.setAccessToken(null);
					});
			}
		}
	
		function getCookie(name) {
			var parts = document.cookie.split(name + '=');
			if (parts.length === 2) { return parts[1].split(';')[0]; }
		}
			
		</script>

	</head>
	
	<body>
	
		<div class="wrapper">
			<div class="content"><h3>SNS Login Test</h3></div>
			<div class="content">
				<div><span>I D  </span></div>
				<div><input type="text" name="testid"></div>
				<div><span>P W</span></div>
				<div><input type="text" name="testpw"></div>
			</div>
			<div class="content">
				<a id="kakao-login-btn" href="javascript:loginWithKakao()">
					<img src="img/img_sns/kakao_login.png" alt="Kakao Login Btn">
				</a>
			</div>
			<div class="content">
				<input type="button" id="signup" value="Sign up">
				<input type="button" id="signin" value="Sign in">
			</div>
		</div>
	</body>
</html>