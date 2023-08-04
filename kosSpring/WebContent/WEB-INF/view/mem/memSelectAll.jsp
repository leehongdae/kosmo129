<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="org.apache.log4j.LogManager" %>  
<%@ page import="org.apache.log4j.Logger" %>   

<%@ page import="a.b.c.com.kos.mem.vo.KosMemberVO"%>  
<%@ page import="a.b.c.com.common.CodeUtil"%>

<%@ page import="java.util.ArrayList"%>    
<%@ page import="java.util.List"%>    
    
<% request.setCharacterEncoding("UTF-8"); %>
<%
	Logger logger =LogManager.getLogger(this.getClass());
	logger.info(">>> memSelectAll.jsp : ");
%>    
<%
	Object obj = request.getAttribute("listAll");
	if(obj == null) return;
	
	KosMemberVO search_kvo = (KosMemberVO)request.getAttribute("search_kvo");
	String startDate = search_kvo.getStartDate();
	String endDate = search_kvo.getEndDate();
	String searchFilter = search_kvo.getSearchFilter();
	String keyword = search_kvo.getKeyword();
	
	ArrayList<KosMemberVO> aList = (ArrayList<KosMemberVO>)obj;
	
	int nCnt = aList.size();	
	System.out.println(">>> 조회건수 nCnt : " + nCnt);
%>


<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
		<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
		<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>		
		<script type="text/javascript">
			alert(">>> Js in");
			
			$(document).ready(function() {
				alert(">>> jQuery In");
				
				// 체크박스 1개의 데이터 선택 시 다른 체크박스 해제
				$(document).on("click","#mnum", function() {
					
					if($(this).prop("checked")) {
						$(".mnum").prop('checked', false);
						$(this).prop('checked', true);							
					}else {
						$(".mnum").prop("checked", false);
						$("#chkAll").prop("checked", false);
					}
				}); // end of mnum.click()

				// chkAll
				$(document).on("click", "#chkAll", function() {
					
					if($(this).prop("checked")){					
					
						$(".mnum").prop("checked", true);
					}else {
						$(".mnum").prop("checked", false);						
						
					}					
				}); // end of searchBtn.click()
				
				// 검색 버튼
				$(document).on("click", "#searchBtn", function() {
					alert(">>> searchBtn.click() In");
					
					$("#memFormAll").attr({
						'action':'memSelectAll.lhd',
						'method':'GET'						
					}).submit();
				}); // end of searchBtn.click()
				
				var searchFilter = "<%= searchFilter%>";
				var keyword = "<%= keyword %>";
				
				if(searchFilter == null || searchFilter == "null" || searchFilter == "" || searchFilter == undefined) {
					$("#searchFilter").val("key1");					
				}else {
					$("#searchFilter").val(searchFilter);
				}
				if(keyword == null || keyword == "null" || keyword == "" || keyword == undefined) {
					$("#keyword").val("");					
				}else {
					$("#keyword").val(keyword);
				}
				
				var startDate = "<%=startDate%>";
				var endDate = "<%=endDate%>";
				
				if(startDate == null || startDate == "null" || startDate == "" || startDate == undefined) {
					$("#startDate").val("");					
				}else {
					$("#startDate").val(startDate);
				}
				if(endDate == null || endDate == "null" || endDate == "" || endDate == undefined) {
					$("#endDate").val("");					
				}else {
					$("#endDate").val(keyword);
				}
				
				$("#startDate").datepicker({
					showOn: "button",
					buttonImage: "/kosSpring/common/img/cal_0.gif",
					buttonImageOnly: true,
					buttonText: "날짜선택",
					dateFormat: "yy-mm-dd",
					changeMonth: true,
					onClose: function(selectedDate) {
						$("#endDate").datepicker("option", "minDate", selectedDate);
					}
				});
				
				$("#endDate").datepicker({
					showOn: "button",
					buttonImage: "/kosSpring/common/img/cal_0.gif",
					buttonImageOnly: true,
					buttonText: "날짜선택",
					dateFormat: "yy-mm-dd",
					changeMonth: true,
					onClose: function(selectedDate) {
						$("#startdate").datepicker("option", "minDate", selectedDate);
					}
				});
				
				$(document).on("click", "#I", function() {
					location.href="memForm.lhd"
				});
				
				$(document).on("click", "#SALL", function() {
					location.href="memSelectAll.lhd"
				});
				
				$(document).on("click", "#U", function() {

					if($(".mnum:checked").length == 0) {
						alert(">>> 수정할 글번호 하나를 선택하세요.");
						return;						
					}
					$("#memFormAll").attr({
						"action":"memSelect.lhd",
						"method":"POST",
					}).submit();
				});
				
				$(document).on("click", "#D", function() {
					
					if($(".munm:checked").length == 0) {
						alert(">>> 삭제할 글번호 하나를 선택하세요.");
						return;						
					}
					$("#memFormAll").attr({
						"action":"memDelect.lhd",
						"method":"GET",
					}).submit();
				});
				
				
				// searchBtn.click() 
				$(document).on('click', 'searchBtn', function() {
					alert(">>> searchBtn.click() In");
					
					$(memFormAll).atrr({
						'action':'memSelect.lhd',
						'method':'GET',
						'enctype':'application/x-www-form-urlencoded'						
					}).submit;					
				}); // end of searchBtn.click()	
				
			}); //end of ready()		
		
		</script>
		<style type="text/css">
		
			div {
				margin: 0 uato;
				border: 1px solid #6d82f3;
				display: table;
			}
			
			td, th {
				paddng: 5px;
			} 
			
			h3 {
				text-align: center;
			}
			
			table, th, td {
				border: 1px solid black;
				text-align: center;
			}

		</style>
	</head>
	
	
	<body>

		<h3>MEMBER SELECT ALL</h3>
		<hr>
		<div>
			<form name="memFormAll" id="memFormAll">
				<table>
					<thead>
						<tr>
							<td colspan="10" align="center">
								<h3>회원정보</h3>
								<%= "조회건수 ::: " + nCnt %>
							</td>
						</tr>
						<tr>
							<td colspan="10" style="text-align:left;">
								<select id="searchFilter" name='searchFilter'>
									<option value='key1' selected>전체------------</option>
									<option value='key2'>회원번호</option>
									<option value='key3'>이름</option>
									<option value='key4'>아이디</option>
								</select>
								<label for="keyword">검색어</label>
								<input type="text" id="keyword" name="keyword" size="15" placeholder="검색어 입력"><br>
								<input type="text" id="startDate" name="startDate" size="12" placeholder="시작일">~
								<input type="text" id="endDate" name="endDate" size="12" placeholder="종료일">&nbsp;&nbsp;
								<button type="button" id="searchBtn">검색</button>
								<button type="reset" id="resetBtn">다시</button>
							</td>							
						</tr>
						<tr>							
							<th><input type="checkbox" name="chkAll" id="chkAll"></th>
							<th>회원번호</th>
							<th>이름</th>
							<th>아이디</th>
							<th>성별</th>
							<th>이메일</th>
							<th>우편번호</th>
							<th>주소</th>
							<th>수정일</th>
							<th>사진</th>							
						</tr>
					</thead>
						<%
						
						//페이징 변수 세팅
						int pageSize = 0;
						int groupSize = 0;
						int curPage = 0;
						int totalCount = 0;

						Object objPaging = request.getAttribute("search_kvo");
						KosMemberVO pagingKPVO = (KosMemberVO)objPaging;
						
						Object obj01 = request.getAttribute("listAll");
						if (obj == null){ return; }
						
						List<KosMemberVO> list = (List<KosMemberVO>)obj01;
						if (list.size() > 0){
							logger.info(">>> list.size() : " + list.size());
							for (int i=0; i < list.size(); i++){
								KosMemberVO kvo = list.get(i);
								
								// 페이징 세팅
								pageSize = Integer.parseInt(pagingKPVO.getPageSize());
								groupSize = Integer.parseInt(pagingKPVO.getGroupSize());
								curPage = Integer.parseInt(pagingKPVO.getCurPage());
								totalCount = Integer.parseInt(kvo.getTotalCount());
					
						%>
					<tbody>
						<tr>
							<td>
								<input type="checkbox" class="mnum" name="mnum" id="mnum" value=<%= kvo.getMnum() %>>
							</td>
							<td><%= kvo.getMnum() %></td>
							<td><%= kvo.getMname() %></td>
							<td><%= kvo.getMid() %></td>
							<td><%= CodeUtil.gender(kvo.getMgender()) %></td>
							<td><%= kvo.getMemail() %></td>
							<td><%= kvo.getMzonecode() %></td>
							<td style="text-align:left;"><%= kvo.getMroadaddr().concat(" ").concat(kvo.getMroaddetail()) %></td>
							<td><%= kvo.getUpdatedate() %></td>
							<td><img src="/kosSpring/fileupload/mem/<%= kvo.getMphoto() %>" border="1" 
							width="50" height="50" alt="error" onerror="this.onerror=null; this.src='/kosSpring/img/img_ex/notice.png'"></td>
						</tr>
						<%
							}
						%>						
						<!--페이지 처리 부분	 -->
						<tr>
							<td colspan="10">
								<jsp:include page="kosPaging.jsp" flush="true">
									<jsp:param name="url" value="memSelectAll.lhd"/>
									<jsp:param name="str" value=""/>
									<jsp:param name="pageSize" value="<%=pageSize %>"/>
									<jsp:param name="groupSize" value="<%=groupSize %>"/>
									<jsp:param name="curPage" value="<%=curPage %>"/>
									<jsp:param name="totalCount" value="<%=totalCount %>"/>
								</jsp:include>
							</td>							
						</tr>
						<%		
						}//end of if
						%>							
						<tr>
							<td colspan="10" style="text-align:right;">
								<input type="button" value="글쓰기" id="I">
								<input type="button" value="글목록" id="SALL">
								<input type="button" value="글수정" id="U">
								<input type="button" value="글삭제" id="D">
							</td>
						</tr>			
					</tbody>
				</table>
			</form>
		</div>	
	</body>
</html>