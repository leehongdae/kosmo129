/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-07-28 07:42:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import a.b.c.com.kos.board.vo.KosBoardVO;
import a.b.c.com.common.CodeUtil;
import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public final class boardSelectAll_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.apache.log4j.Logger");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("a.b.c.com.kos.board.vo.KosBoardVO");
    _jspx_imports_classes.add("a.b.c.com.common.CodeUtil");
    _jspx_imports_classes.add("org.apache.log4j.LogManager");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 request.setCharacterEncoding("UTF-8");
      out.write(' ');
      out.write('\r');
      out.write('\n');
	
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

      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<meta charset=\"UTF-8\">\r\n");
      out.write("		<title>SelectAll.jsp</title>\r\n");
      out.write("		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("		<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\">\r\n");
      out.write("		<script src=\"https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js\"></script>\r\n");
      out.write("		<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n");
      out.write("		<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("		  \r\n");
      out.write("		<script type=\"text/javascript\" src=\"/kosmoSpring/js/common.js\"></script>\r\n");
      out.write("		<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("		\r\n");
      out.write("		<script type=\"text/javascript\">\r\n");
      out.write("			alert(\">>> Js In\");\r\n");
      out.write("			\r\n");
      out.write("			$(document).ready(function() {\r\n");
      out.write("				alert(\">>> jQuery In\");\r\n");
      out.write("				\r\n");
      out.write("				$(document).on('click', '#chkAll', function() {\r\n");
      out.write("					alert(\">>> chkAll.click() In\");\r\n");
      out.write("					\r\n");
      out.write("					if($(this).prop('checked')) {\r\n");
      out.write("						$('.bnum').prop('checked', false);\r\n");
      out.write("					}\r\n");
      out.write("				}); // end of chkAll.click()\r\n");
      out.write("				\r\n");
      out.write("// 				// 체크박스 하나만 체크되게 설정\r\n");
      out.write("// 				$(document).on('click', '.bnum', function() {\r\n");
      out.write("					\r\n");
      out.write("// 					if($(this).prop('checked')) {\r\n");
      out.write("// 						$('.bnum').prop('checked', false);\r\n");
      out.write("// 						$(this).prop('checked', true);\r\n");
      out.write("// 					}\r\n");
      out.write("// 				}); // end of chkAll.click()\r\n");
      out.write("\r\n");
      out.write("				$(document).on('click','#bnum', function(){\r\n");
      out.write("					if($(this).prop('checked')) {\r\n");
      out.write("						$('input[type=\"checkbox\"][name=\"bnum\"]').prop('checked', false)\r\n");
      out.write("						$(this).prop('checked', true);\r\n");
      out.write("					}\r\n");
      out.write("				});\r\n");
      out.write("				\r\n");
      out.write("				// I\r\n");
      out.write("				$(document).on('click','#insertBtn', function() {\r\n");
      out.write("					location.href=\"boardForm.lhd\";\r\n");
      out.write("				}); // end of insertBtn.click()\r\n");
      out.write("				\r\n");
      out.write("				// SALL\r\n");
      out.write("				$(document).on('click', '#selectAllBtn',function() {\r\n");
      out.write("					alert('>>> selectAll.click() In');\r\n");
      out.write("					\r\n");
      out.write("					$('#boardList').attr({\r\n");
      out.write("						'method':'GET',\r\n");
      out.write("						'action':'boardSelectAll.lhd'						\r\n");
      out.write("					}).submit();\r\n");
      out.write("				}); // end of seletAll.click()\r\n");
      out.write("				\r\n");
      out.write("				// S\r\n");
      out.write("				$(document).on('click', '#selectBtn', function() {\r\n");
      out.write("					alert(\">>> selectAllBtn.click() In\");\r\n");
      out.write("					\r\n");
      out.write("					if($('.bnum:checked').length == 0) {\r\n");
      out.write("						alert(\">>. 글번호 하나를 체크하시오.\");\r\n");
      out.write("						return;\r\n");
      out.write("					}\r\n");
      out.write("					$('#boardList').attr({'method':'GET','action':'boardSelect.lhd'}).submit();\r\n");
      out.write("				}); // end of selectBtn.click()\r\n");
      out.write("				\r\n");
      out.write("				// 글내용보기\r\n");
      out.write("				$(document).on('click', '#contentsBtn', function() {\r\n");
      out.write("					alert(\">>. contentsBtn.click() In\");\r\n");
      out.write("					\r\n");
      out.write("					if($('.bnum:checked').length == 0) {\r\n");
      out.write("						alert(\">>> 글번호 하나를  선택하세요\");\r\n");
      out.write("						return;\r\n");
      out.write("					}\r\n");
      out.write("					$('#boardList').attr({'method':'GET','action':'boardSelectContents.lhd'}).submit();\r\n");
      out.write("				}); // end of contentsBtn.click()\r\n");
      out.write("				\r\n");
      out.write("				// D\r\n");
      out.write("				$(document).on('click', '#deleteBtn', function() {\r\n");
      out.write("					if($('.bnum:checked').length == 0 ) {\r\n");
      out.write("						alert(\">>> 삭제할 글번호를 선택하시오.\");\r\n");
      out.write("					}\r\n");
      out.write("					$('#boardList').attr({'action':'boardDelete.lhd','method':'GET'}).submit();\r\n");
      out.write("				}); // end of deleteBtn.click()\r\n");
      out.write("				\r\n");
      out.write("		\r\n");
      out.write("			}); // end of ready()\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("		\r\n");
      out.write("		</script>\r\n");
      out.write("		\r\n");
      out.write("		<style type=\"text/css\">\r\n");
      out.write("		\r\n");
      out.write("			td, th {\r\n");
      out.write("			text-alig: center;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			h3 {\r\n");
      out.write("				text-align: center;\r\n");
      out.write("			}\r\n");
      out.write("		</style>\r\n");
      out.write("	</head>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<body>\r\n");
      out.write("		<h3>게시판 전체 검색</h3>\r\n");
      out.write("		<hr>\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<form id=\"boardList\" name=\"boardList\">\r\n");
      out.write("				<table class=\"table table-bordered table-sm\">\r\n");
      out.write("					<thead>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td colspan='7' style='text-align:center'>\r\n");
      out.write("								<h3>게시판</h3>\r\n");
      out.write("								");
      out.print(nCntS );
      out.write("\r\n");
      out.write("							</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<th>\r\n");
      out.write("								<input type=\"checkbox\" class=\"chkAll\" name=\"chkAll\" id=\"chkAll\">\r\n");
      out.write("							</th>\r\n");
      out.write("							<th>글번호</th>\r\n");
      out.write("							<th>글제목</th>\r\n");
      out.write("							<th>이름</th>\r\n");
      out.write("							<th>사진</th>\r\n");
      out.write("							<th>날짜</th>\r\n");
      out.write("							<th>조회수</th>\r\n");
      out.write("						</tr>\r\n");
      out.write("					</thead>\r\n");
      out.write("					");

					for(int i=0; i<nCnt; i++) {
						KosBoardVO _kbvo = list.get(i);
						
						pageSize = Integer.parseInt(pagingKBVO.getPageSize());
						groupSize = Integer.parseInt(pagingKBVO.getGroupSize());
						curPage = Integer.parseInt(pagingKBVO.getCurPage());
						totalCount = Integer.parseInt(_kbvo.getTotalCount());
					
      out.write("\r\n");
      out.write("					<tbody>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td style=\"width:5%\">\r\n");
      out.write("								<input type=\"checkbox\" id=\"bnum\" name=\"bnum\" class=\"bnum\" value=");
      out.print( _kbvo.getBnum() );
      out.write(">\r\n");
      out.write("							</td>\r\n");
      out.write("							<td style=\"width:10%\">");
      out.print( _kbvo.getBnum() );
      out.write(" </td>\r\n");
      out.write("							<td style=\"text-align:left;\">");
      out.print( _kbvo.getBsubject() );
      out.write(" </td>\r\n");
      out.write("							<td style=\"width:10%\">");
      out.print( _kbvo.getBname() );
      out.write(" </td>	\r\n");
      out.write("							<td style=\"width:10%\"><img src=\"/kosSpring/fileupload/board/");
      out.print( _kbvo.getBfile() );
      out.write("\" border=\"1\" width=\"25\" height=\"25\" alt=\"image\"></td>\r\n");
      out.write("							<td style=\"width:10%\">/kosSpring/fileupload/board/");
      out.print( _kbvo.getBfile() );
      out.write("</td>\r\n");
      out.write("							<td style=\"width:10%\">");
      out.print( _kbvo.getUpdatedate() );
      out.write("</td>\r\n");
      out.write("							<td style=\"width:8%\">");
      out.print( _kbvo.getBhit() );
      out.write("</td>	\r\n");
      out.write("						</tr>\r\n");
      out.write("					");

					}
					
      out.write("\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td colspan=\"7\">\r\n");
      out.write("								");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "boardPaging.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("url", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("boardSelectAll.lhd", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("str", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("pageSize", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(pageSize), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("groupSize", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(groupSize), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("curPage", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(curPage), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("totalCount", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(totalCount), request.getCharacterEncoding()), out, true);
      out.write("\r\n");
      out.write("							</td>\r\n");
      out.write("						</tr>	\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td colspan=\"7\" style=\"text-align:right;\">\r\n");
      out.write("								<button type=\"button\" class=\"btn btn-danger\" id=\"insertBtn\">글쓰기</button>\r\n");
      out.write("								<button type=\"button\" class=\"btn btn-primary\" id=\"selectAllBtn\">글목록</button>\r\n");
      out.write("								<button type=\"button\" class=\"btn btn-success btn-sm\" id=\"contentsBtn\">글내용보기</button>\r\n");
      out.write("								<button type=\"button\" class=\"btn btn-warning btn-sm\" id=\"selectBtn\">글수정</button>\r\n");
      out.write("								<button type=\"button\" class=\"btn btn-dark\" id=\"deleteBtn\">글삭제</button>\r\n");
      out.write("							</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("					</tbody>			\r\n");
      out.write("				</table>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
