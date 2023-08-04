<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="java.net.URLEncoder" %>
<%@ page import="java.security.SecureRandom" %>
<%@ page import="java.math.BigInteger" %>
<%
	String clientId = "Mydspoo3QVfF6dBYT3uE";
	String redirectURI = URLEncoder.encode("http://localhost:8088/kosSpring/naverCallback.lhd", "UTF-8");
	
	SecureRandom random = new SecureRandom();
	String state = new BigInteger(130,random).toString();
	
	String apiURL = "https://nid.naver.com/oauth2.0/authorize?response_type=code";
	   apiURL += "&client_id=" + clientId;
	   apiURL += "&redirect_uri=" + redirectURI;
	   apiURL += "&state=" + state;
	  
	   
	   System.out.println("jsp :: apiURL >>> : " + apiURL);		   
	   session.setAttribute("state", state);	
%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script src="https://developers.kakao.com/sdk/js/kakao.js"></script>
		<script type="text/javascript">
			alert(">>> Js In");
			
			// kokoo login
			window.Kakao.init('0fe8fb4d3e0da606e92517e5aa02ae06'); // 사용하려는 키값 입력
			function kakaoLoginApi(){
				alert(">>> kakaoLoginApi In");
				console.log(Kakao.isInitialized());
				window.Kakao.Auth.login({
					
					success: function(authObj) {
						alert(">>> kaako api in" );		
						window.Kakao.API.request({
							
							url:'/v2/user/me',
							success: function(res) {
								console.log(">>> res :" + JSON.stringify(res));
								
								let k_id = res.id;
								let k_profile_image = res.properties.profile_image;
								let k_email = res.kakao_account.email;
								let k_gender = res.kakao_account.gender;
								
								console.log(">>> k_id : " + k_id);
								console.log(">>> k_email : " + k_email);
								console.log(">>> k_profile_image : " + k_profile_image);
								console.log(">>> k_gender : " + k_gender);
								
								kakaoLogin(k_id, k_email, k_gender);
							}
						});
					}					
				}); 
			}
			
// 			logger.info(">>> snstype : " + snstype);
// 			logger.info(">>> snsid : " + snsid);
// 			logger.info(">>> snsemail : " + snsemail);
// 			logger.info(">>> mid : " + mid);
// 			logger.info(">>> memail : " + memail);
			
			function kakaoLogin(k_id, k_email, k_gender) {
				alert(">>> kakaoLogin : " + k_id + " : " + k_email );
				var temp = $("#snstype").val();
				
				$.ajax({
					type: 'GET',
					url:'kakaoLogin.lhd',
					data: {
						 'snstype': '01'
						,'snsid':k_id
						,'snsemail':k_email
						,'k_gender':k_gender
						},
				
					error: function(request, status, error) {
						alert(request+" : " + status + " : " + error);
					}
					
				});
				//location.href="/kosSpring/kakaoLogin.lhd?snsype=01&snsid="+k_id+"&snsemail="+k_email;
			}
			
	
			
			
			$(document).ready(function() {
				alert(">>> jQuery In");	
			
				
				$(document).on("click", "#loginBtn", function() {
					
					$('#loginForm').attr({
						'action':"loginCheck.lhd",
						'method':'POST',
						'enctype':'application/x-www-form-urlencoded'
					}).submit();
				});
			
			}); // end of ready()
		
		</script>
		
		<style type="text/css">
			.div1 {
				background: #D8F6CE;
				border: 1px solid #D7DF01;
				width: 300px;
				height: 300px;
				margin: 100px auto;
			}
		</style>
	</head>
	
	
	<body>
		<div class="div1" >
			<h1 align="center">Login</h1>
			<hr>
			<form name="loginForm" id="loginForm">
				<table border="1" align="center">
					<tr>
						<td><input type="text" name="mid" id="mid" style="width:200px;"></td>
					</tr>
					<tr>
						<td><input type="password" name="mpw" id="mpw" style="width:200px;"></td>
					</tr>
					<tr>
						<td>
							<button type="button" id="loginBtn" style="width:208px; background-color:yellow;">로그인</button>
						</td>
					</tr>
					<tr>
						<td align="right">
							<a href="idFindForm.lhd"><font size="2">아이디찾기</font></a>
							<a href="pwFindForm.lhd"><font size="2">아이디찾기</font></a>
						</td>
					</tr>
					<tr>
						<td>
							<a href="javascript:kakaoLoginApi()">
								<img height="30" width="208" src="/kosSpring/img/img_sns/o.jpg">			
							
							</a>
							
						</td>
					</tr>
					<tr>
						<td>
							<a href="<%= apiURL %>>">
								<img height="30" width="208" src="/kosSpring/img/img_sns/naver.PNG">
								<input type="hidden" id="snstype" value="02">
							</a>
						</td>
					</tr>
				</table>
				
			</form>
		</div>
	
	</body>
</html>