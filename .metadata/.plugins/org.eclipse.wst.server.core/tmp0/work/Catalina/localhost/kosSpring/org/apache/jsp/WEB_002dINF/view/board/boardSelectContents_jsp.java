/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-06-02 00:34:38 UTC
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

public final class boardSelectContents_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1667440146000L));
    _jspx_dependants.put("jar:file:/C:/00.KOSMO129/30.web/el_kos_spring_work/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/kosSpring/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("a.b.c.com.kos.board.vo.KosBoardVO");
    _jspx_imports_classes.add("a.b.c.com.common.CodeUtil");
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
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");
 request.setCharacterEncoding("UTF-8"); 
      out.write('\r');
      out.write('\n');

	Object obj = request.getAttribute("listS");
	if(obj == null) return;
	
	List<KosBoardVO> list = (List<KosBoardVO>)obj;
	int nCnt = list.size();
	
	KosBoardVO _kbvo = null;
	if(nCnt == 1) {
		_kbvo = list.get(0);		
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("	<meta charset=\"UTF-8\">\r\n");
      out.write("	<title>Insert title here</title>\r\n");
      out.write("	</head>\r\n");
      out.write("	<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("	\r\n");
      out.write("		$(document).ready(function() {\r\n");
      out.write("			alert(\">>> ready() In\");\r\n");
      out.write("			\r\n");
      out.write("			$(document).on('click', '#pwBtn', function() {\r\n");
      out.write("				let input_kbpw = prompt(\"비밀번호를 입력하세요\", 'aaa');\r\n");
      out.write("				\r\n");
      out.write("				if(input_kbpw.length > 0) {\r\n");
      out.write("					console.log(input_kbpw);\r\n");
      out.write("					\r\n");
      out.write("					let pwcheckURL = \"boardPwCheck.lhd\";\r\n");
      out.write("					let reqType= \"POST\";\r\n");
      out.write("					let dataParam = {\r\n");
      out.write("							kbnum: $(\"#kbnum\").val(),\r\n");
      out.write("							kbpw: input_kbpw,							\r\n");
      out.write("					};\r\n");
      out.write("					console.log(\"dataParam\" + dataParam);\r\n");
      out.write("					\r\n");
      out.write("					$.ajax({\r\n");
      out.write("						url : pwcheckUrl,\r\n");
      out.write("						type : reqType,\r\n");
      out.write("						data : dataParam,\r\n");
      out.write("						success : whenSuccess,\r\n");
      out.write("						error : whenError\r\n");
      out.write("					});\r\n");
      out.write("					\r\n");
      out.write("					function whenSucess(resData){\r\n");
      out.write("						console.log(\">>> resData : \" + resData);\r\n");
      out.write("						if(\"ID_YES\" == resData) {\r\n");
      out.write("							alert(\"비밀번호 good\");\r\n");
      out.write("							$(\"#updateBtn\").css('background-color', 'yellow');\r\n");
      out.write("							if($(\"#updateBtn\").prop(\"disabled\") == true) {\r\n");
      out.write("								$(\"#updateBtn\").attr(\"disabled\", false);								\r\n");
      out.write("							}							\r\n");
      out.write("						}else if(\"ID_NO\" == resDataFlag) {\r\n");
      out.write("							alert(\"비밀번호 BAD\")\r\n");
      out.write("							return;\r\n");
      out.write("						};\r\n");
      out.write("					}\r\n");
      out.write("					function whenError(e) {\r\n");
      out.write("						console.log(\">>> e : \" + e.responseText);\r\n");
      out.write("					}\r\n");
      out.write("				}\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			// like_1 버튼 \r\n");
      out.write("			$(document).on(\"click\", \"#like_1\", function(e){\r\n");
      out.write("				alert(\"like_1 버튼 클릭 >>> : \");\r\n");
      out.write("				var i = $(\"#bnum\").val();\r\n");
      out.write("				alert(\"like_1 버튼 클릭 >>> : bnum \" + i);\r\n");
      out.write("				\r\n");
      out.write("				\r\n");
      out.write("				let boardLikeURL = \"like_cnt_1.lhd\";\r\n");
      out.write("				let reqType = \"GET\";\r\n");
      out.write("				let dataParam = {\r\n");
      out.write("					like_cnt_1: $(this).val(),\r\n");
      out.write("					mnum: $(\"#mnum\").val(\"M202211090004\"),\r\n");
      out.write("					bnum: $(\"#bnum\").val(),\r\n");
      out.write("				};		\r\n");
      out.write("				//dataParam = $(\"#boardUpdateForm\").serialize();\r\n");
      out.write("				console.log(\"dataParam >>> : \" + dataParam);\r\n");
      out.write("				\r\n");
      out.write("				$.ajax({\r\n");
      out.write("					url: boardLikeURL,\r\n");
      out.write("					type: reqType,								\r\n");
      out.write("					data: dataParam,	            \r\n");
      out.write("					success: whenSuccess				\r\n");
      out.write("				});\r\n");
      out.write("				\r\n");
      out.write("				function whenSuccess(resData){\r\n");
      out.write("					alert(\"resData >>> : \" + resData);\r\n");
      out.write("					console.log(\"resData >>> : \" + resData);			\r\n");
      out.write("					$(\"#disp_cnt_recom\").text(resData).val();				\r\n");
      out.write("				}	\r\n");
      out.write("				\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			// like_2 버튼 \r\n");
      out.write("			$(document).on(\"click\", \"#like_2\", function(e){\r\n");
      out.write("				alert(\"like_2 버튼 클릭 >>> : \");\r\n");
      out.write("				\r\n");
      out.write("				let boardLikeURL = \"like_cnt_2.lhd\";\r\n");
      out.write("				let reqType = \"GET\";\r\n");
      out.write("				let dataParam = {\r\n");
      out.write("					like_cnt_1: $(this).val(),\r\n");
      out.write("					mnum: $(\"mnum\").val(\"M202211090004\"),\r\n");
      out.write("					bnum: $(\"bnum\").val(),\r\n");
      out.write("				};		\r\n");
      out.write("				dataParam = $(\"#boardUpdateForm\").serialize();\r\n");
      out.write("				console.log(\"dataParam >>> : \" + dataParam);\r\n");
      out.write("				\r\n");
      out.write("				$.ajax({\r\n");
      out.write("					url: boardLikeURL,\r\n");
      out.write("					type: reqType,								\r\n");
      out.write("					data: dataParam,	            \r\n");
      out.write("					success: whenSuccess				\r\n");
      out.write("				});\r\n");
      out.write("				\r\n");
      out.write("				function whenSuccess(resData){\r\n");
      out.write("					alert(\"resData >>> : \" + resData);\r\n");
      out.write("					console.log(\"resData >>> : \" + resData);			\r\n");
      out.write("					$(\"#disp_cnt_stop\").text(resData).val();				\r\n");
      out.write("				}	\r\n");
      out.write("				\r\n");
      out.write("			});\r\n");
      out.write("		\r\n");
      out.write("			// like_3 버튼 \r\n");
      out.write("			$(document).on(\"click\", \"#like_3\", function(e){\r\n");
      out.write("				alert(\"like_3 버튼 클릭 >>> : 준비 중 입니다.\");			\r\n");
      out.write("			});\r\n");
      out.write("		\r\n");
      out.write("			//  insertBtn\r\n");
      out.write("			$(document).on(\"click\", \"#insertBtn\", function(){\r\n");
      out.write("				location.href=\"boardForm.lhd\";\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			// selectBtn\r\n");
      out.write("			$(document).on(\"click\", \"#selectAllBtn\", function(){		\r\n");
      out.write("				$(\"#boardUpdateForm\").attr({\"method\":\"GET\", \"action\":\"boardSelectAll.lhd\"}).submit();		\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			//  updateBtn\r\n");
      out.write("			$(document).on(\"click\", \"#updateBtn\", function(){\r\n");
      out.write("				alert(\"updateBtn\");\r\n");
      out.write("				$(\"#boardUpdateForm\").attr({ \"method\":\"GET\", \"action\":\"#boardUpdate.lhd\"}).submit();\r\n");
      out.write("			});			\r\n");
      out.write("		\r\n");
      out.write("		}); // end of ready()	\r\n");
      out.write("	</script>	\r\n");
      out.write("	\r\n");
      out.write("	<style type=\"text/css\">\r\n");
      out.write("	\r\n");
      out.write("	div {		 \r\n");
      out.write("		margin: 0 auto; 		\r\n");
      out.write("		border:1px solid #6d82f3;\r\n");
      out.write("		display:table;\r\n");
      out.write("	}			\r\n");
      out.write("\r\n");
      out.write("	table, hd, h3 {\r\n");
      out.write("		text-align: center;\r\n");
      out.write("		border: 1px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	table {\r\n");
      out.write("	   width: 100%;\r\n");
      out.write("	   border: 1px solid #444;\r\n");
      out.write("	   border-collapse: collapse;\r\n");
      out.write("  	}\r\n");
      out.write("	\r\n");
      out.write("	th, td {\r\n");
      out.write("	   border: 1px solid #444;\r\n");
      out.write("	   padding: 10px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.td_1 {\r\n");
      out.write("		font-size: 12px;\r\n");
      out.write("		color: black;		\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.td_2 {\r\n");
      out.write("		font-size: 12px;\r\n");
      out.write("		color: black;\r\n");
      out.write("		text-align:right;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("	\r\n");
      out.write("	<body>\r\n");
      out.write("		<h3>게시글 내용</h3>\r\n");
      out.write("		<hr>\r\n");
      out.write("			<div>\r\n");
      out.write("				<form name=\"boardUpdateForm\" id=\"boardUpdateForm\">\r\n");
      out.write("					<table>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td>제목</td>\r\n");
      out.write("							<!--\r\n");
      out.write("							***********************************************************************************************************************\r\n");
      out.write("									현재 bnum, mnum값을 가지고 와야하는 로직을 구현해야한다 셀렉트에서 글내용보기 click 시 vo를 추가해서 데이터를 가지고와야한다\r\n");
      out.write("									코드 작성시 추가해야함 !!!!!!!!!!!\r\n");
      out.write("							***********************************************************************************************************************\r\n");
      out.write("							-->\r\n");
      out.write("							<td colspan=\"4\" style=\"text-align:left;width:400;\">\r\n");
      out.write("								<font size=\"4\" style=\"color:black;\">");
      out.print( _kbvo.getBsubject() );
      out.write("</font>\r\n");
      out.write("								<input type=\"hidden\" name=\"bnum\" id=\"bnum\" value=\"");
      out.print( _kbvo.getBnum() );
      out.write("\" />\r\n");
      out.write("								<input type=\"hidden\" name=\"mnum\" id=\"mnum\" value=\"");
      out.print( "M202211090004" );
      out.write("\" />\r\n");
      out.write("							</td>\r\n");
      out.write("							<td  class=\"td_2\"> 추천 ");
      out.print( _kbvo.getLike_cnt_1() );
      out.write("&nbsp; 조회 ");
      out.print( _kbvo.getBhit() );
      out.write(" &nbsp; 작성일자 : ");
      out.print( _kbvo.getUpdatedate() );
      out.write("</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td>작성자</td>\r\n");
      out.write("							<td>");
      out.print(  _kbvo.getBname() );
      out.write("</td>\r\n");
      out.write("							<td>카테고리</td><td class=\"td_1\">");
      out.print( "업체 후기" );
      out.write("</td>\r\n");
      out.write("							<td>상세</td><td class=\"td_1\">");
      out.print( "충청북도 청주시 흥덕구 > 카페/식당" );
      out.write("</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td colspan=\"6\" style=\"text-align:left\"> \r\n");
      out.write("								<img src=\"/kosSpring/fileupload/board/");
      out.print( _kbvo.getBfile() );
      out.write("\" border=\"1\" width=\"100\" height=\"100\" alt=\"image\"><br>\r\n");
      out.write("								<img src=\"/kosSpring/fileupload/board/");
      out.print( _kbvo.getBfile() );
      out.write("\" border=\"1\" width=\"200\" height=\"100\" alt=\"image\"><br>\r\n");
      out.write("							</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td colspan=\"6\" style=\"text-align:left\">\r\n");
      out.write("								<textarea name=\"kbcontent\" id=\"kbcontent\" rows=\"5\" cols=\"100\">");
      out.print( _kbvo.getBcontent() );
      out.write("					\r\n");
      out.write("								</textarea>\r\n");
      out.write("							</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td colspan=\"6\" style=\"text-align:center\">\r\n");
      out.write("							<button type=\"button\" class=\"like_1\" name=\"like_1\" id=\"like_1\">추천\r\n");
      out.write("							<p>\r\n");
      out.write("								<img src='/kosSpring/img/img_board/heart.png' style='width:12px; margin:3px 3px 0 0;'>\r\n");
      out.write("								<span id=\"disp_cnt_recom\">");
      out.print( _kbvo.getLike_cnt_1() );
      out.write("</span>\r\n");
      out.write("							</p>\r\n");
      out.write("							</button>\r\n");
      out.write("							<button type=\"button\" class=\"like_2\" name=\"like_2\" id=\"like_2\">반대\r\n");
      out.write("							<p>\r\n");
      out.write("							<img src='/kosSpring/img/img_board/thumb_rev.png' style='width:12px; margin:3px 3px 0 0;'>\r\n");
      out.write("							<span id=\"disp_cnt_stop\">");
      out.print( _kbvo.getLike_cnt_2() );
      out.write("</span>\r\n");
      out.write("							</p>\r\n");
      out.write("							</button>\r\n");
      out.write("							<button type=\"button\" class=\"like_3\" name=\"like_3\" id=\"like_3\">신고\r\n");
      out.write("							<p>\r\n");
      out.write("							<img src='/kosSpring/img/img_board/alarm.png' style='width:18px; margin-top:1px; '>\r\n");
      out.write("							</p>\r\n");
      out.write("							</button>\r\n");
      out.write("							</td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td colspan=\"6\" align=\"center\"> \r\n");
      out.write("							<button type=\"button\" id=\"insertBtn\">글쓰기</button>\r\n");
      out.write("							<button type=\"button\" id=\"selectAllBtn\">글목록</button>\r\n");
      out.write("							</td>				\r\n");
      out.write("						</tr>\r\n");
      out.write("					</table>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		<!-- 댓글 처리 하는 루틴   -->\r\n");
      out.write("		");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/rboardForm.lhd" + "?" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode("bnum", request.getCharacterEncoding())+ "=" + org.apache.jasper.runtime.JspRuntimeLibrary.URLEncode(String.valueOf(_kbvo.getBnum()), request.getCharacterEncoding()), out, false);
      out.write("	\r\n");
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