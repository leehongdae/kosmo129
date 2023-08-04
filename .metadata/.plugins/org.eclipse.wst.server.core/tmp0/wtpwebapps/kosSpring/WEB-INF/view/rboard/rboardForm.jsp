<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="a.b.c.com.kos.board.vo.KosBoardVO" %> 
<%@ page import="a.b.c.com.kos.rboard.vo.KosRboardVO" %> 
<%@ page import = "java.util.List" %>
<%@ page import = "java.util.ArrayList" %>

<%@ page import=" org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			alert(">>> Js In");
			
			$(document).ready(function() {
				
				$("#rkbcontent").keyup(function() {
					cut_200(this);
				}); // rkbcontent.keyup()
				
				// 댓글 전체 불러오기
				selectAll();
				
				// 댓글 등록
				$(document).on('click', '#rinsertBtn', function(){
					console.log(">>> insertBtn In");
					
					let insertURL = "rboardInsert.lhd";
					let method = "POST";
					let dataParam = $("#rboardForm").serialize();
					console.log(">>> dataParam" + dataParam);
					
					$.ajax({
						url: insertURL,
						type: method,
						data: dataParam,
						success: whenSuccess,
						error: whenError
					});
					function whenSuccess(resData) {
						alert(">>> resData : " + resData);
						if("GOOD" == resData) {
							
							rboardFormData();
							location.reload();
							selectAll();
						}						
					}
					function whenError(e) {
						alert(">>> e : "+ e.reponseText);
					}
				});
				
				// 댓글 삭제
				$(document).on('click', '.deleteBtn', function() {
					console.log(">>> D : ");
					
					var rbnumV = $(this).parents("li").attr("dataNum");
					alert(">>> rbnumV : " + rbnumV);
					var target = $(this).parents(".rbmemoItem");
					console.log(">>> target : "+ target);
					
					let deleteURL = "rboardDelete.lhd";
					let method = "POST";
					let dataParam = {
							rkbnum: $('#rbnum').val(rbnumV),
					};
					dataParam = $("#rboardForm").serialize();
					console.log(">>> dataParam : " + dataParam);
					
					$.ajax({
						url: deleteURL,
						type: method,
						data: dataParam,
						success: whenSuccess,
						error: whenError
					});
					
					function whenSuccess(resData) {
						console.log(">>> resDAta : " + resData);
						if("GOOD" == resData) {
							alert("댓글이 삭제되었습니다.");
							target.remove();
						}
					}
					function whenError(e) {
						console.log(">>> e : " + e.responseText);
					}					
				});				
			}); // end of ready()
			
			// 게시글 번호로 댓글 전체조회
			function selectAll() {
				console.log(">>> SALL In");
				
				let selectALLURL = "rboardSelectAll.lhd";
				let method = "POST";
				let dataParam = {
						bnum: $("#bnum").val(),						
				};
				dataParam = $("#rboardForm").serialize();
				console.log(">>> dataParam : " + dataParam);
				
				$.ajax({
					url: selectALLURL,
					type: method,
					data: dataParam,
					success: whenSuccess,
					error: whenError
				});
				
				function whenSuccess(resData) {
					console.log(">>> resData : " + resData);
					//output >>> resData : RB0001,111,test01,2023-06-02 15:12:56&

					
					if(isEmpty(resData)) {
						return false;
					}
					
					
					let v = resData.split("&");
					console.log(">>> v.length : " + v.length);
					let sLen = v.length;
					console.log(">>> sLen : " + sLen);
					console.log(">>> v[sLen] : " + v[sLen]);
					console.log(">>> typeof(v[sLen]) : " + typeof(v[sLen]));
					for(let i=0; i< v.length; i++) {
						console.log(">>>> v[i] : " + v[i]);
						let vv = v[i].split(",");
						let j=0;
						for(; j < vv.length; j++) {
							console.log(">>> vv[0]" + vv[0]);
							console.log(">>> vv[1]" + vv[1]);
							console.log(">>> vv[2]" + vv[2]);
							console.log(">>> vv[3]" + vv[3]);
						}
						addNewItem(vv[0], vv[1], vv[2], vv[3]);
					}
				}
				
				function whenError(e) {
					console.log(">>> e : " + e.responseText);
				}
			}
			
			// 게시글 번호로 댓글 전체조회
			
			// 새로운 글 화면에 추가
			function addNewItem(num, writer, content, datetime) {
				
				if(isEmpty(num)) return false;
				
				var newLi = $("<li>");
				newLi.attr("dataNum",num);
				newLi.addClass("rbmemoItem");
				
				var writerP = $("<p>");
				writerP.addClass("writer");
				
				var nameSpan = $("<span>");
				nameSpan.addClass("name");
				nameSpan.html(decodeURIComponent(writer) + "님");
				
				var dateSpan = $("<span>");
				dateSpan.html("/" + datetime + " ");
				
				var delInput = $("<input>");
				delInput.attr({"type":"button", "value":"삭제하기"});
				delInput.addClass("deleteBtn");
				
				var contentP = $("<p>");
				contentP.html(decodeURIComponent(content));
				
				writerP.append(nameSpan).append(dateSpan).append(delInput);
				newLi.append(writerP).append(contentP);
				$("#rboardlist").append(newLi);				
			}
			// 새로운 글 화면에 추가
			
			// 댓글 길이 체크
			// 한글 포함 문자열 길이
			function getTextLength(s) {
				var len = 0;
				for(var i=0; i< s.length; i++) {
					if(escape(s.charAt(i)).length == 6) {
						len++;
					}
					len++;
				}
				return len;
			}
			function cut_200(obj) {
				var t = $(obj).val();
				var l = t.length;
				while(getTextLength(t) > 200) {
					l--;
					t = t.substring(0, 1);					
				}
				$(obj).val(t);
				$('.bytes').text(getTextLength(t));
			}
			
			// 댓글 길이 체크
			
			// 댓글 등록 후 입력창 초기화
			function rboardFormData() {
				$("#rbname").val("");
				$("#rbcontent").val("");
			}
			
			//데이터 체크
			function isEmpty(val) {
				if(typeof val =="undefined" || val==null || val=="") {
					return true;
				}else {
					return false;
				}
			}
		
		</script>
	</head>
	<body>
		<h3 style="text-align:center">댓글</h3>
		<hr>
		<% request.setCharacterEncoding("UTF-8"); %>
		<%
			Logger logger = LogManager.getLogger(this.getClass());
			logger.info("rboardForm.jsp 페이지 >>> : ");
		
			String bnum = request.getParameter("bnum");
			// bnum = "B0004";rboard
			logger.info("rboardForm.jsp bnum >>> : " + bnum);
		%>
		<div id="rbwriterdiv">
			<form name="rboardForm" id="rboardForm">
			<table>
				<tr>
						<td>작성자</td>
						<td>
							<input type="text" name="rbname" id="rbname"/>
							<input type="hidden" name="bnum" id="bnum" value="<%=bnum%>">
							<input type="hidden" name="rbnum" id="rbnum">
							<input type="button" value="저장하기" id="rinsertBtn">
						</td>
				</tr>
				<tr>
						<td>덧글 내용</td>
						<td>
							<textarea name="rbcontent" id="rkbcontent" rows="5" cols="50" style="resize: none"></textarea>	
							<div><span class="bytes">0</span>bytes</div>
						</td>	
				</tr>
			</table>
					<hr>
					<ul name="rboardlist" id="rboardlist">
						<!-- 여기에 동적 생성 요소가 들어온다. -->
				</ul>
			</form>
		</div>
	</body>
</html>