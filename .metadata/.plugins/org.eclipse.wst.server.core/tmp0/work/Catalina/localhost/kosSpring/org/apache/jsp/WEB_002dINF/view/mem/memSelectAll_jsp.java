/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-06-26 07:06:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.mem;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import a.b.c.com.kos.mem.vo.KosMemberVO;
import a.b.c.com.common.CodeUtil;
import java.util.ArrayList;
import java.util.List;

public final class memSelectAll_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("a.b.c.com.common.CodeUtil");
    _jspx_imports_classes.add("org.apache.log4j.LogManager");
    _jspx_imports_classes.add("a.b.c.com.kos.mem.vo.KosMemberVO");
    _jspx_imports_classes.add("java.util.ArrayList");
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
      out.write("  \r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
 request.setCharacterEncoding("UTF-8"); 
      out.write('\r');
      out.write('\n');

	Logger logger =LogManager.getLogger(this.getClass());
	logger.info(">>> memSelectAll.jsp : ");

      out.write("    \r\n");

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<meta charset=\"UTF-8\">\r\n");
      out.write("		<title>Insert title here</title>\r\n");
      out.write("		<link rel=\"stylesheet\" href=\"http://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css\">\r\n");
      out.write("		<script src=\"https://code.jquery.com/jquery-1.12.4.js\"></script>\r\n");
      out.write("		<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>		\r\n");
      out.write("		<script type=\"text/javascript\">\r\n");
      out.write("			alert(\">>> Js in\");\r\n");
      out.write("			\r\n");
      out.write("			$(document).ready(function() {\r\n");
      out.write("				alert(\">>> jQuery In\");\r\n");
      out.write("				\r\n");
      out.write("				// 체크박스 1개의 데이터 선택 시 다른 체크박스 해제\r\n");
      out.write("				$(document).on(\"click\",\"#mnum\", function() {\r\n");
      out.write("					\r\n");
      out.write("					if($(this).prop(\"checked\")) {\r\n");
      out.write("						$(\".mnum\").prop('checked', false);\r\n");
      out.write("						$(this).prop('checked', true);							\r\n");
      out.write("					}else {\r\n");
      out.write("						$(\".mnum\").prop(\"checked\", false);\r\n");
      out.write("						$(\"#chkAll\").prop(\"checked\", false);\r\n");
      out.write("					}\r\n");
      out.write("				}); // end of mnum.click()\r\n");
      out.write("\r\n");
      out.write("				// chkAll\r\n");
      out.write("				$(document).on(\"click\", \"#chkAll\", function() {\r\n");
      out.write("					\r\n");
      out.write("					if($(this).prop(\"checked\")){					\r\n");
      out.write("					\r\n");
      out.write("						$(\".mnum\").prop(\"checked\", true);\r\n");
      out.write("					}else {\r\n");
      out.write("						$(\".mnum\").prop(\"checked\", false);						\r\n");
      out.write("						\r\n");
      out.write("					}					\r\n");
      out.write("				}); // end of searchBtn.click()\r\n");
      out.write("				\r\n");
      out.write("				// 검색 버튼\r\n");
      out.write("				$(document).on(\"click\", \"#searchBtn\", function() {\r\n");
      out.write("					alert(\">>> searchBtn.click() In\");\r\n");
      out.write("					\r\n");
      out.write("					$(\"#memFormAll\").attr({\r\n");
      out.write("						'action':'memSelectAll.lhd',\r\n");
      out.write("						'method':'GET'						\r\n");
      out.write("					}).submit();\r\n");
      out.write("				}); // end of searchBtn.click()\r\n");
      out.write("				\r\n");
      out.write("				var searchFilter = \"");
      out.print( searchFilter);
      out.write("\";\r\n");
      out.write("				var keyword = \"");
      out.print( keyword );
      out.write("\";\r\n");
      out.write("				\r\n");
      out.write("				if(searchFilter == null || searchFilter == \"null\" || searchFilter == \"\" || searchFilter == undefined) {\r\n");
      out.write("					$(\"#searchFilter\").val(\"key1\");					\r\n");
      out.write("				}else {\r\n");
      out.write("					$(\"#searchFilter\").val(searchFilter);\r\n");
      out.write("				}\r\n");
      out.write("				if(keyword == null || keyword == \"null\" || keyword == \"\" || keyword == undefined) {\r\n");
      out.write("					$(\"#keyword\").val(\"\");					\r\n");
      out.write("				}else {\r\n");
      out.write("					$(\"#keyword\").val(keyword);\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				var startDate = \"");
      out.print(startDate);
      out.write("\";\r\n");
      out.write("				var endDate = \"");
      out.print(endDate);
      out.write("\";\r\n");
      out.write("				\r\n");
      out.write("				if(startDate == null || startDate == \"null\" || startDate == \"\" || startDate == undefined) {\r\n");
      out.write("					$(\"#startDate\").val(\"\");					\r\n");
      out.write("				}else {\r\n");
      out.write("					$(\"#startDate\").val(startDate);\r\n");
      out.write("				}\r\n");
      out.write("				if(endDate == null || endDate == \"null\" || endDate == \"\" || endDate == undefined) {\r\n");
      out.write("					$(\"#endDate\").val(\"\");					\r\n");
      out.write("				}else {\r\n");
      out.write("					$(\"#endDate\").val(keyword);\r\n");
      out.write("				}\r\n");
      out.write("				\r\n");
      out.write("				$(\"#startDate\").datepicker({\r\n");
      out.write("					showOn: \"button\",\r\n");
      out.write("					buttonImage: \"/kosSpring/common/img/cal_0.gif\",\r\n");
      out.write("					buttonImageOnly: true,\r\n");
      out.write("					buttonText: \"날짜선택\",\r\n");
      out.write("					dateFormat: \"yy-mm-dd\",\r\n");
      out.write("					changeMonth: true,\r\n");
      out.write("					onClose: function(selectedDate) {\r\n");
      out.write("						$(\"#endDate\").datepicker(\"option\", \"minDate\", selectedDate);\r\n");
      out.write("					}\r\n");
      out.write("				});\r\n");
      out.write("				\r\n");
      out.write("				$(\"#endDate\").datepicker({\r\n");
      out.write("					showOn: \"button\",\r\n");
      out.write("					buttonImage: \"/kosSpring/common/img/cal_0.gif\",\r\n");
      out.write("					buttonImageOnly: true,\r\n");
      out.write("					buttonText: \"날짜선택\",\r\n");
      out.write("					dateFormat: \"yy-mm-dd\",\r\n");
      out.write("					changeMonth: true,\r\n");
      out.write("					onClose: function(selectedDate) {\r\n");
      out.write("						$(\"#startdate\").datepicker(\"option\", \"minDate\", selectedDate);\r\n");
      out.write("					}\r\n");
      out.write("				});\r\n");
      out.write("				\r\n");
      out.write("				$(document).on(\"click\", \"#I\", function() {\r\n");
      out.write("					location.href=\"memForm.lhd\"\r\n");
      out.write("				});\r\n");
      out.write("				\r\n");
      out.write("				$(document).on(\"click\", \"#SALL\", function() {\r\n");
      out.write("					location.href=\"memSelectAll.lhd\"\r\n");
      out.write("				});\r\n");
      out.write("				\r\n");
      out.write("				$(document).on(\"click\", \"#U\", function() {\r\n");
      out.write("\r\n");
      out.write("					if($(\".mnum:checked\").length == 0) {\r\n");
      out.write("						alert(\">>> 수정할 글번호 하나를 선택하세요.\");\r\n");
      out.write("						return;						\r\n");
      out.write("					}\r\n");
      out.write("					$(\"#memFormAll\").attr({\r\n");
      out.write("						\"action\":\"memSelect.lhd\",\r\n");
      out.write("						\"method\":\"POST\",\r\n");
      out.write("					}).submit();\r\n");
      out.write("				});\r\n");
      out.write("				\r\n");
      out.write("				$(document).on(\"click\", \"#D\", function() {\r\n");
      out.write("					\r\n");
      out.write("					if($(\".munm:checked\").length == 0) {\r\n");
      out.write("						alert(\">>> 삭제할 글번호 하나를 선택하세요.\");\r\n");
      out.write("						return;						\r\n");
      out.write("					}\r\n");
      out.write("					$(\"#memFormAll\").attr({\r\n");
      out.write("						\"action\":\"memDelect.lhd\",\r\n");
      out.write("						\"method\":\"GET\",\r\n");
      out.write("					}).submit();\r\n");
      out.write("				});\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("				// searchBtn.click() \r\n");
      out.write("				$(document).on('click', 'searchBtn', function() {\r\n");
      out.write("					alert(\">>> searchBtn.click() In\");\r\n");
      out.write("					\r\n");
      out.write("					$(memFormAll).atrr({\r\n");
      out.write("						'action':'memSelect.lhd',\r\n");
      out.write("						'method':'GET',\r\n");
      out.write("						'enctype':'application/x-www-form-urlencoded'						\r\n");
      out.write("					}).submit;					\r\n");
      out.write("				}); // end of searchBtn.click()	\r\n");
      out.write("				\r\n");
      out.write("			}); //end of ready()		\r\n");
      out.write("		\r\n");
      out.write("		</script>\r\n");
      out.write("		<style type=\"text/css\">\r\n");
      out.write("		\r\n");
      out.write("			div {\r\n");
      out.write("				margin: 0 uato;\r\n");
      out.write("				border: 1px solid #6d82f3;\r\n");
      out.write("				display: table;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			td, th {\r\n");
      out.write("				paddng: 5px;\r\n");
      out.write("			} \r\n");
      out.write("			\r\n");
      out.write("			h3 {\r\n");
      out.write("				text-align: center;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			table, th, td {\r\n");
      out.write("				border: 1px solid black;\r\n");
      out.write("				text-align: center;\r\n");
      out.write("			}\r\n");
      out.write("\r\n");
      out.write("		</style>\r\n");
      out.write("	</head>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<body>\r\n");
      out.write("\r\n");
      out.write("		<h3>MEMBER SELECT ALL</h3>\r\n");
      out.write("		<hr>\r\n");
      out.write("		<div>\r\n");
      out.write("			<form name=\"memFormAll\" id=\"memFormAll\">\r\n");
      out.write("				<table>\r\n");
      out.write("					<thead>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td colspan=\"10\" align=\"center\">\r\n");
      out.write("								<h3>회원정보</h3>\r\n");
      out.write("								");
      out.print( "조회건수 ::: " + nCnt );
      out.write("\r\n");
      out.write("							</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td colspan=\"10\" style=\"text-align:left;\">\r\n");
      out.write("								<select id=\"searchFilter\" name='searchFilter'>\r\n");
      out.write("									<option value='key1' selected>전체------------</option>\r\n");
      out.write("									<option value='key2'>회원번호</option>\r\n");
      out.write("									<option value='key3'>이름</option>\r\n");
      out.write("									<option value='key4'>아이디</option>\r\n");
      out.write("								</select>\r\n");
      out.write("								<label for=\"keyword\">검색어</label>\r\n");
      out.write("								<input type=\"text\" id=\"keyword\" name=\"keyword\" size=\"15\" placeholder=\"검색어 입력\"><br>\r\n");
      out.write("								<input type=\"text\" id=\"startDate\" name=\"startDate\" size=\"12\" placeholder=\"시작일\">~\r\n");
      out.write("								<input type=\"text\" id=\"endDate\" name=\"endDate\" size=\"12\" placeholder=\"종료일\">&nbsp;&nbsp;\r\n");
      out.write("								<button type=\"button\" id=\"searchBtn\">검색</button>\r\n");
      out.write("								<button type=\"reset\" id=\"resetBtn\">다시</button>\r\n");
      out.write("							</td>							\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>							\r\n");
      out.write("							<th><input type=\"checkbox\" name=\"chkAll\" id=\"chkAll\"></th>\r\n");
      out.write("							<th>회원번호</th>\r\n");
      out.write("							<th>이름</th>\r\n");
      out.write("							<th>아이디</th>\r\n");
      out.write("							<th>성별</th>\r\n");
      out.write("							<th>이메일</th>\r\n");
      out.write("							<th>우편번호</th>\r\n");
      out.write("							<th>주소</th>\r\n");
      out.write("							<th>수정일</th>\r\n");
      out.write("							<th>사진</th>							\r\n");
      out.write("						</tr>\r\n");
      out.write("					</thead>\r\n");
      out.write("						");

						
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
					
						
      out.write("\r\n");
      out.write("					<tbody>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td>\r\n");
      out.write("								<input type=\"checkbox\" class=\"mnum\" name=\"mnum\" id=\"mnum\" value=");
      out.print( kvo.getMnum() );
      out.write(">\r\n");
      out.write("							</td>\r\n");
      out.write("							<td>");
      out.print( kvo.getMnum() );
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print( kvo.getMname() );
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print( kvo.getMid() );
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print( CodeUtil.gender(kvo.getMgender()) );
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print( kvo.getMemail() );
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print( kvo.getMzonecode() );
      out.write("</td>\r\n");
      out.write("							<td style=\"text-align:left;\">");
      out.print( kvo.getMroadaddr().concat(" ").concat(kvo.getMroaddetail()) );
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print( kvo.getUpdatedate() );
      out.write("</td>\r\n");
      out.write("							<td><img src=\"/kosSpring/fileupload/mem/");
      out.print( kvo.getMphoto() );
      out.write("\" border=\"1\" \r\n");
      out.write("							width=\"50\" height=\"50\" alt=\"error\" onerror=\"this.onerror=null; this.src='/kosSpring/img/img_ex/notice.png'\"></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						");

							}
						
      out.write("						\r\n");
      out.write("						<!--페이지 처리 부분	 -->\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td colspan=\"10\">\r\n");
      out.write("								");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "kosPaging.jsp" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("url", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("memSelectAll.lhd", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("str", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("", request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("pageSize", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(pageSize ), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("groupSize", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(groupSize ), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("curPage", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(curPage ), request.getCharacterEncoding()) + "&" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("totalCount", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(totalCount ), request.getCharacterEncoding()), out, true);
      out.write("\r\n");
      out.write("							</td>							\r\n");
      out.write("						</tr>\r\n");
      out.write("						");
		
						}//end of if
						
      out.write("							\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td colspan=\"10\" style=\"text-align:right;\">\r\n");
      out.write("								<input type=\"button\" value=\"글쓰기\" id=\"I\">\r\n");
      out.write("								<input type=\"button\" value=\"글목록\" id=\"SALL\">\r\n");
      out.write("								<input type=\"button\" value=\"글수정\" id=\"U\">\r\n");
      out.write("								<input type=\"button\" value=\"글삭제\" id=\"D\">\r\n");
      out.write("							</td>\r\n");
      out.write("						</tr>			\r\n");
      out.write("					</tbody>\r\n");
      out.write("				</table>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>	\r\n");
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