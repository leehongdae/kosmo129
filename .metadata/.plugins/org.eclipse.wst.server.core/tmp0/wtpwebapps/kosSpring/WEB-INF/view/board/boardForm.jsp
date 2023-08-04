<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Board : 게시판 : 글쓰기</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		
		<script type="text/javascript">
			alert(">>> Js In");
			
			$(document).ready(function(){
				alert(">>> jQuerty In");
				
				$(document).on('click', '#sendBtn', function() {
					alert(">>> sendBtn.click() In");
					
					$("#boardForm").attr({
						"action":"boardInsert.lhd",
						"method":"POST",
						"enctype":"multipart/form-data"
					}).submit(); // end of boardForm.att()
					
				}); // end of click()
				
			}); // end of ready()		
		
		</script>
		
		<style type="text/css">
		
			div {
				margin: 0 auto;
				border: 1px solid #2E2E2E;
				display: table;				
			}	
	
		</style>
	</head>	
	
	<body>
		<h3 align="center">게시판 입력</h3>
		<hr>
		<div>
			<form id="boardForm" name="boardForm">
				<table border="1" align="center">
					<tr>
						<td colspan="2" align="center">게시판 글쓰기</td>
					</tr>			
					<tr>
						<td>번호</td>
						<td><input type="text" id="bnum" name="bnum" style="width:100px;background-color:gray;" readonly></td>
					</tr>
					<tr>
						<td>제목</td>
						<td><input type="text" id="bsubject" name="bsubject" style="width:100px;"></td>
					</tr>
					<tr>
						<td>글쓴이</td>
						<td><input type="text" id="bname" name="bname" style="width:100px;"></td>
					</tr>
					<tr>
						<td>내용</td>
						<td><textarea name="bcontent" id="bcontent" cols="50" rows="10" ></textarea></td>
					</tr>
					<tr>
						<td>첨부파일</td>
						<td><input type="file" id="bfile" name="bfile" ></td>
					</tr>
					<tr>
						<td>패스워드</td>
						<td><input type="password" id="bpw" name="bpw" style="width:100px;"  maxlength="12"></td>
					</tr>
					<tr>
						<td colspan="2" align="right">
							<input type="button" id="sendBtn" value="Send">
							<input type="reset" id="resetBtn" value="Reset">
						</td>
						
					</tr>
				</table>
			</form>	
		</div>
	</body>
</html>