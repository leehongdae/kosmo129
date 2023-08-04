<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="a.b.c.com.kos.board.vo.KosBoardVO" %> 
<%@ page import="a.b.c.com.common.CodeUtil" %> 
<%@ page import="java.util.List" %> 

<%@ page import=" org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>

<% request.setCharacterEncoding("UTF-8");%> 
<%	
	Logger logger = LogManager.getLogger(this.getClass());
	logger.info("kosBoardSelectAll.jsp 페이지 >>> : ");
	
	//페이징 변수 세팅
	int pageSize = 0;
	int groupSize = 0;
	int curPage = 0;
	int totalCount = 0;

	Object objPaging = request.getAttribute("pagingKBVO");
	KosBoardVO pagingKBVO = (KosBoardVO)objPaging;
	
	Object obj = request.getAttribute("listAll");
	List<KosBoardVO> list = (List<KosBoardVO>)obj;
	
	int nCnt = list.size();
	String nCntS = ":::: 전체 조회 건수  " + nCnt + " 건";	
%>    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>SelectAll.jsp</title>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
		<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
		  
		<script type="text/javascript" src="/kosmoSpring/js/common.js"></script>
		<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
		
		<script type="text/javascript">
			alert(">>> Js In");
			
			$(document).ready(function() {
				alert(">>> jQuery In");
				
				$(document).on('click', '#chkAll', function() {
					alert(">>> chkAll.click() In");
					
					if($(this).prop('checked')) {
						$('.bnum').prop('checked', false);
					}
				}); // end of chkAll.click()
				
// 				// 체크박스 하나만 체크되게 설정
// 				$(document).on('click', '.bnum', function() {
					
// 					if($(this).prop('checked')) {
// 						$('.bnum').prop('checked', false);
// 						$(this).prop('checked', true);
// 					}
// 				}); // end of chkAll.click()

				$(document).on('click','#bnum', function(){
					if($(this).prop('checked')) {
						$('input[type="checkbox"][name="bnum"]').prop('checked', false)
						$(this).prop('checked', true);
					}
				});
				
				// I
				$(document).on('click','#insertBtn', function() {
					location.href="boardForm.lhd";
				}); // end of insertBtn.click()
				
				// SALL
				$(document).on('click', '#selectAllBtn',function() {
					alert('>>> selectAll.click() In');
					
					$('#boardList').attr({
						'method':'GET',
						'action':'boardSelectAll.lhd'						
					}).submit();
				}); // end of seletAll.click()
				
				// S
				$(document).on('click', '#selectBtn', function() {
					alert(">>> selectAllBtn.click() In");
					
					if($('.bnum:checked').length == 0) {
						alert(">>. 글번호 하나를 체크하시오.");
						return;
					}
					$('#boardList').attr({'method':'GET','action':'boardSelect.lhd'}).submit();
				}); // end of selectBtn.click()
				
				// 글내용보기
				$(document).on('click', '#contentsBtn', function() {
					alert(">>. contentsBtn.click() In");
					
					if($('.bnum:checked').length == 0) {
						alert(">>> 글번호 하나를  선택하세요");
						return;
					}
					$('#boardList').attr({'method':'GET','action':'boardSelectContents.lhd'}).submit();
				}); // end of contentsBtn.click()
				
				// D
				$(document).on('click', '#deleteBtn', function() {
					if($('.bnum:checked').length == 0 ) {
						alert(">>> 삭제할 글번호를 선택하시오.");
					}
					$('#boardList').attr({'action':'boardDelete.lhd','method':'GET'}).submit();
				}); // end of deleteBtn.click()
				
		
			}); // end of ready()
			
			
			
		
		</script>
		
		<style type="text/css">
		
			td, th {
			text-alig: center;
			}
			
			h3 {
				text-align: center;
			}
		</style>
	</head>
	
	
	<body>
		<h3>게시판 전체 검색</h3>
		<hr>
		<div class="container">
			<form id="boardList" name="boardList">
				<table class="table table-bordered table-sm">
					<thead>
						<tr>
							<td colspan='7' style='text-align:center'>
								<h3>게시판</h3>
								<%=nCntS %>
							</td>
						</tr>
						<tr>
							<th>
								<input type="checkbox" class="chkAll" name="chkAll" id="chkAll">
							</th>
							<th>글번호</th>
							<th>글제목</th>
							<th>이름</th>
							<th>사진</th>
							<th>날짜</th>
							<th>조회수</th>
						</tr>
					</thead>
					<%
					for(int i=0; i<nCnt; i++) {
						KosBoardVO _kbvo = list.get(i);
						
						pageSize = Integer.parseInt(pagingKBVO.getPageSize());
						groupSize = Integer.parseInt(pagingKBVO.getGroupSize());
						curPage = Integer.parseInt(pagingKBVO.getCurPage());
						totalCount = Integer.parseInt(_kbvo.getTotalCount());
					%>
					<tbody>
						<tr>
							<td style="width:5%">
								<input type="checkbox" id="bnum" name="bnum" class="bnum" value=<%= _kbvo.getBnum() %>>
							</td>
							<td style="width:10%"><%= _kbvo.getBnum() %> </td>
							<td style="text-align:left;"><%= _kbvo.getBsubject() %> </td>
							<td style="width:10%"><%= _kbvo.getBname() %> </td>	
							<td style="width:10%"><img src="/kosSpring/fileupload/board/<%= _kbvo.getBfile() %>" border="1" width="25" height="25" alt="image"></td>
							<td style="width:10%">/kosSpring/fileupload/board/<%= _kbvo.getBfile() %></td>
							<td style="width:10%"><%= _kbvo.getUpdatedate() %></td>
							<td style="width:8%"><%= _kbvo.getBhit() %></td>	
						</tr>
					<%
					}
					%>
						<tr>
							<td colspan="7">
								<jsp:include page="boardPaging.jsp" flush="true">
									<jsp:param name="url" value="boardSelectAll.lhd"/>
									<jsp:param name="str" value=""/>
									<jsp:param name="pageSize" value="<%=pageSize%>"/>
									<jsp:param name="groupSize" value="<%=groupSize%>"/>
									<jsp:param name="curPage" value="<%=curPage%>"/>
									<jsp:param name="totalCount" value="<%=totalCount%>"/>
								</jsp:include>
							</td>
						</tr>	
						<tr>
							<td colspan="7" style="text-align:right;">
								<button type="button" class="btn btn-danger" id="insertBtn">글쓰기</button>
								<button type="button" class="btn btn-primary" id="selectAllBtn">글목록</button>
								<button type="button" class="btn btn-success btn-sm" id="contentsBtn">글내용보기</button>
								<button type="button" class="btn btn-warning btn-sm" id="selectBtn">글수정</button>
								<button type="button" class="btn btn-dark" id="deleteBtn">글삭제</button>
							</td>
						</tr>
					</tbody>			
				</table>
			</form>
		</div>
	</body>
</html>