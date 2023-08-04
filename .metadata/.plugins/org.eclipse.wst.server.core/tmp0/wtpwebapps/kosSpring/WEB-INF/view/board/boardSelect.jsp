<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<%@ page import="a.b.c.com.kos.board.vo.KosBoardVO" %> 
<%@ page import="a.b.c.com.common.CodeUtil" %> 
<%@ page import="java.util.List" %> 

<% request.setCharacterEncoding("UTF-8");%> 
<%	
	Object obj = request.getAttribute("listS");
	if (obj == null) return;

	List<KosBoardVO> list = (List<KosBoardVO>)obj;	
	int nCnt = list.size();
	
	KosBoardVO _kbvo = null;
	if (nCnt == 1){
		_kbvo = list.get(0);
	}	
%> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
		<script type="text/javascript">
			
			$(document).ready(function() {
				
				
				
				//$('#fileName').text(testName);
				
				$(document).on('change', '#in_file', function() {
					alert(">>> change");
					var testName = $('#in_file').val();
					var testName01 = testName.split("\\");
					$('#fileName').text(testName01[2]);
				});
				
				$(document).on('click', '#pwbtn', function() {
					alert(">>> pwbtn.click() in");
					
					let pwcheckURL = "boardPwCheck.lhd";
					let reqType ="POST";
					let dataParam = {
						bnum: $("#bnum").val(),
						bpw: $("#bpw").val(),
					};
					console.log(">>> dataparam : " + dataParam);
					
					$.ajax({
						url: pwcheckURL,
						type: reqType,
						data: dataParam,
						success: whenSuccess,
						error: whenError
					});
					
					function whenSuccess(reqData){
						console.log(">>> reqData : " + reqData);
						if("PW_YES" == reqData) {
							alert(">>> 비밀번호 good.");
							$("#U").css('background-color', 'yellow');							
						}else if ("PW_NO" == reqData){
							alert(">>> 비밀번호 bad.");
							return;
						}
					}
					function whenError(e) {
						console.log(">>> e : " + e.respobnseText);
					}	
					
				}); // end of pwbtn.click()
				
				// U
				$(document).on('click', '#U', function(e) {
					alert("U");
					e.preventDefault();
					$("#boardUpdateForm").attr({'method':'GET', 'action':'boardUpdate.lhd'}).submit();
				});
				
				// D
				$(document).on('click', '#D', function(e) {
					alert("D");
					e.preventDefault();
					$('#boardUpdateForm').attr({'method':'GET', 'action':'boardDelete.lhd'}).submit();
				});
				
			}); // end of ready()
			
			
		</script>
		<style type="text/css">
	
			div {		 
				margin: 0 auto; 		
				border:1px solid #6d82f3;
				display:table;
			}			
		
			table, h3 {		
				border: 1px;
			}
			
			table {
			   width: 100%;
			   border: 1px solid #444;
			   border-collapse: collapse;
		  	}
			
			th, td {
			   border: 1px solid #444;
			   padding: 10px;
			}	
			.mem{ text-align: center;}
			
			.input-file-button{
				padding: 2px 5px;
				margin: 2px 2px;
				background-color:#FF6600;
				border-radius: 4px;
				color: white;
				cursor: pointer;
				}
		</style>
	</head>
	<body>
	<h3 style="text-align:center;">게시글 내용</h3>
	<hr>
		<div>
			<form name="boardUpdateForm" id="boardUpdateForm">
				<table>
					<tr>
						<td colspan="2" align="center">게시판 글수정하기</td>
						</tr>
						<tr>
						<td class="mem">글번호</td>
						<td><input type="text" name="bnum" id="bnum" value="<%= _kbvo.getBnum() %>" readonly/></td>
					</tr>
					
					<tr>
						<td class="mem">제목</td>
						<td>
						<input type="text" name="bsubject" id="bsubject" value="<%= _kbvo.getBsubject() %>" style="width:100px"  readonly/>
						</td>
						</tr>
						<tr>
						<td class="mem">이름</td>
						<td><input type="text" name="bname" id="bname" value="<%=  _kbvo.getBname() %>" readonly/></td>
					</tr>				
				 
					<tr>
						<td class="mem">소개글</td>
						<td>
						<textarea name="bcontent" id="bcontent" rows="5" cols="50"><%= _kbvo.getBcontent() %>					
						</textarea>
						</td>
						</tr>
						<tr>
						<td class="mem">사진</td>
						<td> 
							<label for="in_file" class="input-file-button" id="input-file-button">
								UPLOAD
								<input type='file' id='in_file' style="display:none;">
							</label>
							<span id="fileName"><%=  _kbvo.getBfile() %></span>
						</td>
					</tr>
					<tr>
						<td class="mem">등록일</td>
						<td> 
						<input type="text" name="sbinsertdate" id="sbinsertdate" value="<%= _kbvo.getInsertdate() %>" readonly />		      
						</td>
					</tr>
					<tr>	 
						<td class="mem">수정일</td>
						<td>
						<input type="text" name="sbupdatedate" id="sbupdatedate" value="<%= _kbvo.getUpdatedate() %>" readonly />		      
						</td>
					</tr>
					<tr>
						<td class="mem">패스워드</td>
						<td>
						<input type="text" name="bpw" id="bpw" />
						<button type="button" id="pwbtn">비밀번호</button>
						
					</td>	 	 
					<tr>
						<td colspan="2" align="right"> 		
						<button type="button" id="U">수정</button>
						<button type="button" id="D">삭제</button>
						</td>				
					</tr>
				</table>
			</form>
		</div>
<!-- 	<!-- 댓글 처리 하는 루틴  -->
<%-- 	<jsp:include page="/rboardForm.lhd"> --%>
<%-- 		<jsp:param value="<%=_kbvo.getBnum()%>" name="bnum"/> --%>
<%-- 	</jsp:include> --%>
	</body>
</html>
