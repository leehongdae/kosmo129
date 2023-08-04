<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="a.b.c.com.kos.product.vo.KosProductVO" %> 
<%@ page import="java.util.List" %>  

<%@ page import="a.b.c.com.common.NumUtil" %>

<%@ page import=" org.apache.log4j.LogManager" %>
<%@ page import="org.apache.log4j.Logger" %>

<% request.setCharacterEncoding("UTF-8");%> 
<%
	Logger logger = LogManager.getLogger(this.getClass());
	logger.info(">>> kosProductSelectAll.jsp In");
	
	int pageSize = 0;
	int groupSize = 0;
	int curPage = 0;
	int totalCount = 0;
	
	Object objPaging = request.getAttribute("pagingKpvo");
	KosProductVO pagingKpvo=(KosProductVO)objPaging;
	
	Object obj = request.getAttribute("listAll");
	
	List<KosProductVO> listAll = (List<KosProductVO>)obj;
	int nCnt  = listAll.size();
%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	
	
	<body>
		<form name="productList" id="productList">
			<table border="1" align="center">
				<thead>
					<tr>
						<th>사진</th>
						<th>내용</th>
						<th>가격</th>
					</tr>
				</thead>
				<%
					String kpnum = "";
					String kpprice = "";
					for(int i=0; i<nCnt; i++) {
						KosProductVO _kpvo =listAll.get(i);
						kpnum = _kpvo.getKpnum();
						kpprice = _kpvo.getKpprice();
						kpprice = NumUtil.comma(kpprice);
						
						// 페이징 세팅
						pageSize = Integer.parseInt(pagingKpvo.getPageSize());
						groupSize = Integer.parseInt(pagingKpvo.getGroupSize());
						curPage = Integer.parseInt(pagingKpvo.getCurPage());
						totalCount = Integer.parseInt(_kpvo.getTotalCount());
				%>
				<tbody>
					<tr>
						<td rowspan="4" align="center" style="width:100px;">
							<img src="/kosSpring/fileupload/product/<%= _kpvo.getKpfile()%>" width="50" height="50"><br>
							<%= _kpvo.getKpid() %>
						</td>
						<td align="left" style="width:300px;">상품번호: <%= kpnum %></td>
						<td rowspan="4" align="center" vertical-align="middle" style="width:150px;">
							<%=kpprice %>&nbsp;&nbsp;
							<a href="kosProductSelect.lhd?kpnum=<%= kpnum %>">
								<img src="/kosSpring/img/img_mandu/ase.gif" width="25" height="25" height="25" alt="image">
							</a>
						</td>
					</tr>
					<tr><td><%=_kpvo.getKpdesc() %></td></tr>
					<tr><td><%=_kpvo.getKpcompany() %></td></tr>
					<tr><td>상품 등록일 : <%=_kpvo.getInsertdate() %></td></tr>
				<%
					}
				%>
				</tbody>
				<tfoot>
					<tr>
						<td colspan="3">
							<jsp:include page="productPaging.jsp" flush="true">
								<jsp:param name="url" value="kosProductSelectAll.lhd"/>
								<jsp:param name="str" value=""/>
								<jsp:param name="pageSize" value="<%=pageSize %>"/>
								<jsp:param name="groupSize" value="<%=groupSize %>"/>
								<jsp:param name="curPage" value="<%=curPage %>"/>
								<jsp:param name="totalCount" value="<%=totalCount %>"/>
							</jsp:include>
						</td>
					</tr>
				</tfoot>
				
			</table>
		</form>
		
	
	
	</body>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</html>