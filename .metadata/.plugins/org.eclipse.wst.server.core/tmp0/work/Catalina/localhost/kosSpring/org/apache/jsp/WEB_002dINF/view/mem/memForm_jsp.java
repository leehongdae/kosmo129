/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-05-22 00:29:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.mem;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class memForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<meta charset=\"UTF-8\">\r\n");
      out.write("		<title>Insert title here</title>\r\n");
      out.write("		\r\n");
      out.write("		<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("		<!-- 디바이스에 최적화된 크기로 출력됨 -->\r\n");
      out.write("		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\r\n");
      out.write("     			maximum-scale=1.0, minimum-scale=1.0, user-scalable=no\">\r\n");
      out.write("		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("		\r\n");
      out.write("		<script src=\"https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js\"></script>\r\n");
      out.write("		<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"></script>\r\n");
      out.write("		<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js\"></script>     	\r\n");
      out.write("     	\r\n");
      out.write("   	\r\n");
      out.write("		<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("		<script src=\"http://dmaps.daum.net/map_js_init/postcode.v2.js\"></script>\r\n");
      out.write("		\r\n");
      out.write("		<script type=\"text/javascript\">\r\n");
      out.write("			\r\n");
      out.write("			alert(\">>> Js In\");\r\n");
      out.write("			\r\n");
      out.write("			$(document).ready(function() {\r\n");
      out.write("				alert(\">>> jQuery In\");\r\n");
      out.write("				\r\n");
      out.write("				// 아이디 비동기 ajax 중복체크\r\n");
      out.write("				$(document).on(\"click\", \"#midbtn\", function() {\r\n");
      out.write("					alert(\">>> midbtn.click() In\");\r\n");
      out.write("					\r\n");
      out.write("					let idCheckURL = \"kosIdCheck.lhd\";\r\n");
      out.write("					let reqType = \"GET\";\r\n");
      out.write("					let dataParam = {mid: $(\"#mid\").val(),};\r\n");
      out.write("					\r\n");
      out.write("					$.ajax({\r\n");
      out.write("						url		: idCheckURL,\r\n");
      out.write("						type	: reqType,\r\n");
      out.write("						data	: dataParam,\r\n");
      out.write("						success : whenSuccess,\r\n");
      out.write("						error	: whenError\r\n");
      out.write("					}); // end of ajax()\r\n");
      out.write("					\r\n");
      out.write("					function whenSuccess(resData) {						\r\n");
      out.write("						alert(\">>> resData : \" + resData);\r\n");
      out.write("						\r\n");
      out.write("						if(\"ID_YES\" == resData) {							\r\n");
      out.write("							alert(\">>> 아이디 사용 가능 : ID_YES\");\r\n");
      out.write("							\r\n");
      out.write("							$(\"#mkid\").css('background-color', 'yellow');\r\n");
      out.write("							$(\"#mid\").attr(\"readonly\", true);\r\n");
      out.write("							$(\"#mpw\").focus();\r\n");
      out.write("						}else {\r\n");
      out.write("							alert(\">>> 아이디 이미 사용중 : ID_NO\");\r\n");
      out.write("							\r\n");
      out.write("							$(\"#mid\").val('');\r\n");
      out.write("							$(\"#mid\").focus();\r\n");
      out.write("						} // end of if-else(id중복체크)\r\n");
      out.write("					} // end of whenSuccess()\r\n");
      out.write("					\r\n");
      out.write("					function whenError(e) {\r\n");
      out.write("						alert(\">>> e : \" + e.responseText);\r\n");
      out.write("					} // end of whenError()\r\n");
      out.write("				}); // end of midbtn.click()\r\n");
      out.write("				\r\n");
      out.write("				// 비밀번호 체크\r\n");
      out.write("				$(\"#pwCheck\").click(function() {\r\n");
      out.write("					alert(\">>> pwCheck.click() In\");\r\n");
      out.write("					\r\n");
      out.write("					var pw = $(\"#mpw\").val();\r\n");
      out.write("					var pw_r = $(\"#mpw_r\").val();\r\n");
      out.write("					alert(\">>> mpw : \" + mpw);\r\n");
      out.write("					alert(\">>> mpw_r : \" + mpw_r);\r\n");
      out.write("					\r\n");
      out.write("					if(pw == pw_r) {\r\n");
      out.write("						alert(\">>> 비밀번호가 같습니다.\");\r\n");
      out.write("						$(\"#mgender\").focus();\r\n");
      out.write("						return;						\r\n");
      out.write("					}else {\r\n");
      out.write("						alert(\">>> 비밀번호가 다릅니다.\");\r\n");
      out.write("						$(\"#mpw\").val('');\r\n");
      out.write("						$(\"#mpw_r\").val('');\r\n");
      out.write("						$(\"#mpw\").focus();\r\n");
      out.write("						return false;						\r\n");
      out.write("					} // end of if-else\r\n");
      out.write("				}); // end of pwCheck.click()\r\n");
      out.write("				\r\n");
      out.write("				// 생년월일\r\n");
      out.write("				$(\"#mbirth\").on(\"input\", function() {\r\n");
      out.write("					\r\n");
      out.write("					var m = $(\"#mbirth\");\r\n");
      out.write("					if(m.val().length > m.maxlength) {\r\n");
      out.write("						m.value = m.value.slice(0, m.maxlength);						\r\n");
      out.write("					}\r\n");
      out.write("				}); // end of mbirth.input()\r\n");
      out.write("				\r\n");
      out.write("				// 월\r\n");
      out.write("				$(\"#mbirth1\").append(\"<option value=''>월---</option>\");\r\n");
      out.write("				   for(var i = 1; i <= 12; i++){\r\n");
      out.write("			        	if (i < 10){ i = '0'+i;}\r\n");
      out.write("			            $(\"#mbirth1\").append(\"<option value='\"+ i +\"'>\"+ i + \"</option>\");\r\n");
      out.write("			        }\r\n");
      out.write("		        \r\n");
      out.write("				// 일\r\n");
      out.write("				$(\"#mbirth2\").append(\"<option value=''>일---</option>\");\r\n");
      out.write("				for(var i=1; i<=31; i++) {\r\n");
      out.write("					if(i<10) { i = '0' + i;}\r\n");
      out.write("					$(\"#mbirth2\").append(\"<option value='\"+i+\"'>\"+i+\"</option>\");\r\n");
      out.write("				}				\r\n");
      out.write("				// email\r\n");
      out.write("				$(\"#memail2\").change(function() {\r\n");
      out.write("					\r\n");
      out.write("					$(\"#memail2 option:selected\").each(function() {\r\n");
      out.write("						if($(this).val() == '1') {\r\n");
      out.write("							var aa = $(\"#memail1\").val();\r\n");
      out.write("							$(\"#memail1\").val('');\r\n");
      out.write("							$(\"#memail1\").attr();\r\n");
      out.write("						}else {\r\n");
      out.write("							$(\"#memail1\").val($(this).text());\r\n");
      out.write("							$(\"#memail1\").attr(\"readonly\", true);							\r\n");
      out.write("						}						\r\n");
      out.write("					}); // end of memail2.each()\r\n");
      out.write("				}); // end memail.2.change()\r\n");
      out.write("				\r\n");
      out.write("				// 우편번호\r\n");
      out.write("				$(\"#mzonecode\").prop('readonly',true);\r\n");
      out.write("				$(\"#mroadaddr\").prop('readonly',true);\r\n");
      out.write("				$(\"#mjibunaddr\").prop('readonly',true);\r\n");
      out.write("				$(\"#zonecode\").click(function() {\r\n");
      out.write("					alert(\">>> zonecode In\");\r\n");
      out.write("					new daum.Postcode({\r\n");
      out.write("						oncomplete: function(data) {\r\n");
      out.write("							$(\"#mzonecode\").val(data.zonecode);\r\n");
      out.write("							$(\"#mroadaddr\").val(data.roadAddress);\r\n");
      out.write("							$(\"#mjibunaddr\").val(data.jibunAddress);\r\n");
      out.write("						}\r\n");
      out.write("						\r\n");
      out.write("					}).open();					\r\n");
      out.write("				}); // zonecode.click()\r\n");
      out.write("				\r\n");
      out.write("				// 폼태그 실행\r\n");
      out.write("				$(document).on(\"click\", \"#btn\", function() {\r\n");
      out.write("					alert(\">>> form In\");\r\n");
      out.write("					\r\n");
      out.write("					$(\"#memForm\").attr({\r\n");
      out.write("						\"action\":\"memInsert.lhd\",\r\n");
      out.write("						\"method\":\"POST\",\r\n");
      out.write("						\"enctype\":\"multipart/form-data\"\r\n");
      out.write("					}).submit();					\r\n");
      out.write("				}); // end of click()\r\n");
      out.write("				\r\n");
      out.write("			}); // end of ready()\r\n");
      out.write("		\r\n");
      out.write("		</script>\r\n");
      out.write("		\r\n");
      out.write("		<style type=\"text/css\">\r\n");
      out.write("			\r\n");
      out.write("			div {\r\n");
      out.write("				margin: 0 auto;\r\n");
      out.write("				border: 1px solid #2E2E2E;\r\n");
      out.write("				display: table;				\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			td, th {\r\n");
      out.write("				padding:5px;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			h3 {\r\n");
      out.write("				text-align: center;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			table, th, td {\r\n");
      out.write("				border: 1px solid black;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.td, .mem {\r\n");
      out.write("				text-align: center;\r\n");
      out.write("				text-color: #2E2E2E;\r\n");
      out.write("				 \r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.tooltiptext:after, tooltiptext:before {\r\n");
      out.write("				top: 100%;\r\n");
      out.write("				left: 20%;\r\n");
      out.write("				border: solid transparent;\r\n");
      out.write("				content:\"\";\r\n");
      out.write("				height: 0;\r\n");
      out.write("				width: 0;\r\n");
      out.write("				position: absolute;\r\n");
      out.write("				pointer-events: none;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.tooltiptext:after, .tooltiptext:before {\r\n");
      out.write("				top: 100%;\r\n");
      out.write("				left: 20%;\r\n");
      out.write("				border: solid transparent;\r\n");
      out.write("				content: \"\";\r\n");
      out.write("				height: 0;\r\n");
      out.write("				width: 0;\r\n");
      out.write("				position: absolute;\r\n");
      out.write("				pointer-events: none;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.tooltiptext:after {\r\n");
      out.write("				border-color: rgba(255, 255, 255, 0);\r\n");
      out.write("				border-top-color: #fff;\r\n");
      out.write("				border-width: 13px;\r\n");
      out.write("				margin-left: -20px;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.tooltiptext:before {\r\n");
      out.write("				border-color: rgba(204, 204, 204, 0);\r\n");
      out.write("				border-top-color: #ccc;\r\n");
      out.write("				border-width: 13px;\r\n");
      out.write("				margin-left: -20px;\r\n");
      out.write("				margin-top: 2px;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.tooltip {\r\n");
      out.write("				position: relative;\r\n");
      out.write("				display: inline-block;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.tooltip .tooltiptext {\r\n");
      out.write("				visibility: hidden;\r\n");
      out.write("				width: 260px;\r\n");
      out.write("				background-color: white;\r\n");
      out.write("				color: #cc5200;\r\n");
      out.write("				text-align: left;\r\n");
      out.write("				border-radius: 6px;\r\n");
      out.write("				padding: 5px 0;\r\n");
      out.write("				font-size: 14px;\r\n");
      out.write("				border: 2px solid #ccc;\r\n");
      out.write("				radius: 8px;\r\n");
      out.write("				\r\n");
      out.write("				position: absolute;\r\n");
      out.write("				bottom: 140%;\r\n");
      out.write("				left: -10%;\r\n");
      out.write("				z-index: 50;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.tooltip:hover .tooltiptext {\r\n");
      out.write("				visibility: visible;				\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			.hr_dash {\r\n");
      out.write("				border:1px dashed #ccc;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			#header {\r\n");
      out.write("				text-align; center;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("			font-family: 'jua', sans-serif;\r\n");
      out.write("		</style>\r\n");
      out.write("	</head>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<body>\r\n");
      out.write("		<h3><font size=\"4\" style=\"color:blue\">SPRING MYBATIS 회원가입</font></h3>\r\n");
      out.write("		<hr>\r\n");
      out.write("		<div>\r\n");
      out.write("			<form name=\"memForm\" id=\"memForm\">\r\n");
      out.write("				<table>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td colspan=\"2\" align=\"center\">\r\n");
      out.write("							<font>KOSMO 129기</font>\r\n");
      out.write("							<img src=\"/kosSpring/img/img_mandu/ase1.gif\" width=\"25\" height=\"25\" alt=\"image\">\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class='td'>회원번호</td>\r\n");
      out.write("						<td><input type=\"text\" name=\"mnum\" id=\"mnum\" style=\"background-color:#E6E6E6;\" readonly></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class='td'>이름</td>\r\n");
      out.write("						<td><input type=\"text\" name=\"mname\" id=\"mname\"></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class='td'>아이디</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"text\" name=\"mid\" id=\"mid\" placeholder=\"아이디체크\" style=\"width:100px\">\r\n");
      out.write("							<input type=\"button\" name=\"midbtn\" id=\"midbtn\" value=\"아이디중복확인\">\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class='td'>패스워드</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<div class=\"tooltip\" margin=\"0px 0px 0px 0px\">\r\n");
      out.write("								<span class=\"tooltiptext\" style=\"font-size:14px; font-family:'jua';\">\r\n");
      out.write("									<span style=\"font-size:16px\">&nbsp;&nbsp; 해당 조건을 만족시켜 주십시오.</span>\r\n");
      out.write("									<hr class=\"hr_dash\">\r\n");
      out.write("									&nbsp;&nbsp;<img src=\"/kosSpring/img/img_ex/notice.png\" width=\"18px\" height=\"17px\">영문자 사용(공백 사용 x)<br>\r\n");
      out.write("									&nbsp;&nbsp;<img src=\"/kosSpring/img/img_ex/notice.png\" width=\"18px\" height=\"17px\">특수문자 사용(공백 사용 x)<br>\r\n");
      out.write("									&nbsp;&nbsp;<img src=\"/kosSpring/img/img_ex/notice.png\" width=\"18px\" height=\"17px\">숫자 사용<br>\r\n");
      out.write("									&nbsp;&nbsp;<img src=\"/kosSpring/img/img_ex/notice.png\" width=\"18px\" height=\"17px\">8글자 이상 ~12자 이하 <br><br>								\r\n");
      out.write("								</span>\r\n");
      out.write("								<input type=\"text\" class=\"imf\" name=\"mpw\" id=\"mpw\" placeholder=\"비밀번호  8자리\" style=\"width:100px\" maxlength=\"8\">\r\n");
      out.write("							</div><br>\r\n");
      out.write("							<input type=\"password\" name=\"mpw_r\" id=\"mpw_r\" placeholder=\"비밀번호확인\" style=\"width:100px\" >\r\n");
      out.write("							<input type=\"button\" id=\"pwCheck\" value=\"비밀번호 확인\">\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class='td'>성별</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"radio\" name=\"mgender\" id=\"mgender_f\" value=\"F\" checked>Female\r\n");
      out.write("							<input type=\"radio\" name=\"mgender\" id=\"mgender_m\" value=\"M\">Male\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class='td'>생년월일</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"text\" name=\"mbirth\" id=\"mbirth\" placeholder=\"년(4자)\" maxlength=\"4\" style=\"width:50px\">\r\n");
      out.write("							<select name=\"mbirth1\" id=\"mbirth1\"></select>\r\n");
      out.write("							<select name=\"mbirth2\" id=\"mbirth2\"></select>\r\n");
      out.write("						</td>						\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class='td'>핸드폰</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<select name=\"mhp\" id=\"mhp\">\r\n");
      out.write("								<option value=\"010\">010</option>\r\n");
      out.write("								<option value=\"011\">011</option>\r\n");
      out.write("								<option value=\"016\">016</option>\r\n");
      out.write("								<option value=\"017\">017</option>\r\n");
      out.write("							</select>\r\n");
      out.write("							-<input type=\"text\" name=\"mhp1\" id=\"mhp1\" size=\"2\">\r\n");
      out.write("							-<input type=\"text\" name=\"mhp2\" id=\"mhp2\" size=\"2\">\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class='td'>전화번호</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<select name=\"mtel\" id=\"mtel\">\r\n");
      out.write("								<option value=\"02\">02</option>\r\n");
      out.write("								<option value=\"031\">031</option>\r\n");
      out.write("								<option value=\"041\">041</option>\r\n");
      out.write("								<option value=\"051\">051</option>\r\n");
      out.write("								<option value=\"061\">061</option>\r\n");
      out.write("							</select>\r\n");
      out.write("							-<input type=\"text\" name=\"mtel1\" id=\"mtel1\" size=\"2\">\r\n");
      out.write("							-<input type=\"text\" name=\"mtel2\" id=\"mtel2\" size=\"2\">\r\n");
      out.write("							\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class='td'>이메일</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"text\" name=\"memail\" id=\"memail\" style=\"width:100px\">\r\n");
      out.write("							@<input type=\"text\" name=\"memail1\" id=\"memail1\" style=\"width:100px\" placeholder=\"직접입력\">\r\n");
      out.write("							<select name=\"memal2\" id=\"memail2\" style=\"width:100px; margin-right=:10px;\">\r\n");
      out.write("								<option value=\"1\" selected>직접입력</option>\r\n");
      out.write("								<option value=\"naver.com\">naver.com</option>\r\n");
      out.write("								<option value=\"gmail.com\">gmail.com</option>\r\n");
      out.write("								<option value=\"daum.net\">daum.net</option>\r\n");
      out.write("							</select>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class=\"mem\">주소</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"text\" name=\"mzonecode\" id=\"mzonecode\" placeholder=\"우편번호\" style=\"width:50px\">\r\n");
      out.write("							<input type=\"button\" name=\"zonecode\" id=\"zonecode\" value=\"우편번호 찾기\"><br>\r\n");
      out.write("							<input type=\"text\" name=\"mroadaddr\" id=\"mroadaddr\" placeholder=\"도로명주소\" style=\"width:250px\"><br>\r\n");
      out.write("							<input type=\"text\" name=\"mroaddetail\" id=\"mroaddetail\" placeholder=\"도로명주소 상세주소\" style=\"width:250px\"><br>\r\n");
      out.write("							<input type=\"text\" name=\"mjibunaddr\" id=\"mjibunaddr\" placeholder=\"지번 주소\" style=\"width:250px\"><br>							\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class='td'>취미</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"checkbox\" name=\"mhobby\" value=\"mh1\">알고리즘\r\n");
      out.write("							<input type=\"checkbox\" name=\"mhobby\" value=\"mh2\">코딩\r\n");
      out.write("							<input type=\"checkbox\" name=\"mhobby\" value=\"mh3\">분석설계<br>\r\n");
      out.write("							<input type=\"checkbox\" name=\"mhobby\" value=\"mh4\">데이터베이스\r\n");
      out.write("							<input type=\"checkbox\" name=\"mhobby\" value=\"mh5\">스크립트							\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class='td'>소개글</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<textarea name=\"minfo\" id=\"minfo\" rows=\"5\" cols=\"50\" >내 소개글\r\n");
      out.write("							</textarea>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td class='td'>사진</td>\r\n");
      out.write("						<td>\r\n");
      out.write("							<input type=\"file\" name=\"mphoto\">\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr >\r\n");
      out.write("						<td colspan=\"2\" align=\"right\">\r\n");
      out.write("							<button type=\"button\" id=\"btn\">보내기</button>\r\n");
      out.write("							<button type=\"reset\" id=\"reset\">다시</button>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
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