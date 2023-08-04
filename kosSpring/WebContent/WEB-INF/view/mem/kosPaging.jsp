<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.io.File" %>
<%@ page import ="java.util.ArrayList" %>
<%@ page import ="java.util.Collection" %>

<%
	String url = null;
	String str = null;
	
	url = request.getParameter("url");
	System.out.println(">>> url : " + url);
	
	str = request.getParameter("str");
	System.out.println(">>> str : " + str);
	
	if(str != null && str.length() > 0) {
		str =str + "&";
		System.out.println(">>> str + & : " + str);		
	}
%>

<%
	int pageSize = 0;
	int groupSize = 0;
	int totalCount = 0;
	int curPage = 0;
	int pageCount = 0;
	
	if(request.getParameter("pageSize") !=null) {
		pageSize = Integer.parseInt(request.getParameter("pageSize"));
		System.out.println(">>> pagesize : " + pageSize);
	}
	
	if(request.getParameter("groupSize") !=null) {
		groupSize = Integer.parseInt(request.getParameter("groupSize"));
		System.out.println(">>> groupSize : " + groupSize);
	}
	
	if(request.getParameter("curPage") !=null) {
		curPage = Integer.parseInt(request.getParameter("curPage"));
		System.out.println(">>> curPage : " + curPage);
	}
	
	if(request.getParameter("totalCount") !=null) {
		totalCount = Integer.parseInt(request.getParameter("totalCount"));
		System.out.println(">>> totalCount : " + totalCount);
	}
	
	pageCount = (int)Math.ceil(totalCount / (double)groupSize);
	System.out.println(">>> pageCoutn : " + pageCount);
	
	int curGroup= (curPage-1) / groupSize;
	System.out.println(">>> curGroup : " + curGroup);
	
	int linkPage = curGroup*groupSize;
	System.out.println(">>> linkPage : " + linkPage);
%>
<p align="right">
<%
	if(curGroup > 0) {
%>
		<a href="<%=url%>?<%=str%>curPage=1">◁◁</a>&nbsp;&nbsp;&nbsp;
		<a href="<%=url%>?<%=str%>curPage=<%=linkPage%>">◀</a>&nbsp;&nbsp;&nbsp;
<%		
	}else {
%>
				◁◁&nbsp;&nbsp;&nbsp;◀&nbsp;&nbsp;&nbsp;
<%
	}
	
	linkPage++;
	System.out.println(">>> linkPage ++ : " + linkPage);
	
	int loopCount = groupSize;
	System.out.println(">>> loopcount : " + loopCount);
	
	while((loopCount > 0) && (linkPage <= pageCount)) {
		
		if(linkPage == curPage) {
			System.out.println("그룹범위내에서 페이지 링크 if");
%>
		<%=linkPage%>
<%
		}else {
			System.out.println("그룹범위내에서 페이지 링크 else");
%>
		[<a href="<%=url%>?<%=str%>curPage=<%=linkPage%>"><%=linkPage%></a>]&nbsp;
<%
		}
		linkPage++;
		loopCount--;
	} 
	
	if(linkPage <= pageCount) {
		System.out.println(">>> 다음그룹이 있는 경우 linkPage : " + linkPage);
		System.out.println(">>> 다음그룹이 있는 경우 pagecount : " + pageCount);
%>
	<a href="<%=url%>?<%=str%>curPage=<%=linkPage %>">▶</a>&nbsp;&nbsp;&nbsp;
	<a href="<%=url%>?<%=str%>curPage=<%=pageCount %>">▷▷</a>&nbsp;&nbsp;&nbsp;
<%
	}else {
		System.out.println("다음 그룹이 있는 경우linkPage : " + linkPage);
		System.out.println("다음 그룹이 있는 경우 pageCount : " + pageCount);
		System.out.println("다음 그룹이 있는 경우 _else : ");
%>
	▶&nbsp;&nbsp;&nbsp;▷▷&nbsp;&nbsp;&nbsp;
<%
	}
%>
</p>

