<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.List"%>
<%@ page import="a.b.c.com.kos.mem.vo.KosMemberVO"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Log In</title>
	</head>
	
	<body>
		<h3>Login Session Testing :: LOGIN SUCCESS</h3>
		<hr>
		<% request.setCharacterEncoding("UTF-8");%>
		<%
			Object obj = request.getAttribute("listLogin");
			if(obj == null) return;
			
			List<KosMemberVO> list = (List<KosMemberVO>)obj;
			int nCnt = list.size();
			
			if(nCnt == 1) {
				String mid = list.get(0).getMid();
		%>
			<script>
				alert(">>> <%= mid %> 님 로그인 성공");
			</script>
			<div>
				<a href="logout.lhd?mid=<%= mid %>">로그아웃하기</a>
			</div>
		<%
			}
					
		%>	
	</body>
</html>