<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<title>Insert title here</title>
	<style type="text/css">
		.wrapper {
			margin: 0 auto;
			width: 1200px;
			height: 100%;
		}
		
		.content {
			background-color: aliceblue;
		}
		
		.wrpper>.cotent:nth-child(1) {
			background-color: aqua;
			height: 300px;
		}
		
		.section {
			background-color: antiquewhite;
		}
	</style>
</head>

<body>
	<div class="wrapper">
		<div class="head">
			<div class="section"></div>
			<div class="section"></div>
			<div class="section"></div>
		</div>
		<div class="content"></div>
		<div class="content"></div>
	</div>
</body>
</html>
