/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-06-28 09:59:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.math.BigInteger;

public final class loginForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.security.SecureRandom");
    _jspx_imports_classes.add("java.net.URLEncoder");
    _jspx_imports_classes.add("java.math.BigInteger");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	String clientId = "Mydspoo3QVfF6dBYT3uE";
	String redirectURI = URLEncoder.encode("http://localhost:8088/kosSpring/naverCallback.lhd", "UTF-8");
	
	SecureRandom random = new SecureRandom();
	String state = new BigInteger(130,random).toString();
	
	String apiURL = "https://nid.naver.com/oauth2.0/authorize?response_type=code";
	   apiURL += "&client_id=" + clientId;
	   apiURL += "&redirect_uri=" + redirectURI;
	   apiURL += "&state=" + state;
	  
	   
	   System.out.println("jsp :: apiURL >>> : " + apiURL);		   
	   session.setAttribute("state", state);	

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<meta charset=\"UTF-8\">\r\n");
      out.write("		<title>Insert title here</title>\r\n");
      out.write("		<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("		<script src=\"https://developers.kakao.com/sdk/js/kakao.js\"></script>\r\n");
      out.write("		<script type=\"text/javascript\">\r\n");
      out.write("			alert(\">>> Js In\");\r\n");
      out.write("			\r\n");
      out.write("			// kokoo login\r\n");
      out.write("			window.Kakao.init('0fe8fb4d3e0da606e92517e5aa02ae06'); // 사용하려는 키값 입력\r\n");
      out.write("			function kakaoLoginApi(){\r\n");
      out.write("				alert(\">>> kakaoLoginApi In\");\r\n");
      out.write("				console.log(Kakao.isInitialized());\r\n");
      out.write("				window.Kakao.Auth.login({\r\n");
      out.write("					\r\n");
      out.write("					success: function(authObj) {\r\n");
      out.write("						alert(\">>> kaako api in\" );		\r\n");
      out.write("						window.Kakao.API.request({\r\n");
      out.write("							\r\n");
      out.write("							url:'/v2/user/me',\r\n");
      out.write("							success: function(res) {\r\n");
      out.write("								console.log(\">>> res :\" + JSON.stringify(res));\r\n");
      out.write("								\r\n");
      out.write("								let k_id = res.id;\r\n");
      out.write("								let k_profile_image = res.properties.profile_image;\r\n");
      out.write("								let k_email = res.kakao_account.email;\r\n");
      out.write("								let k_gender = res.kakao_account.gender;\r\n");
      out.write("								\r\n");
      out.write("								console.log(\">>> k_id : \" + k_id);\r\n");
      out.write("								console.log(\">>> k_email : \" + k_email);\r\n");
      out.write("								console.log(\">>> k_profile_image : \" + k_profile_image);\r\n");
      out.write("								console.log(\">>> k_gender : \" + k_gender);\r\n");
      out.write("								\r\n");
      out.write("								kakaoLogin(k_id, k_email, k_gender);\r\n");
      out.write("							}\r\n");
      out.write("						});\r\n");
      out.write("					}					\r\n");
      out.write("				}); \r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("// 			logger.info(\">>> snstype : \" + snstype);\r\n");
      out.write("// 			logger.info(\">>> snsid : \" + snsid);\r\n");
      out.write("// 			logger.info(\">>> snsemail : \" + snsemail);\r\n");
      out.write("// 			logger.info(\">>> mid : \" + mid);\r\n");
      out.write("// 			logger.info(\">>> memail : \" + memail);\r\n");
      out.write("			\r\n");
      out.write("			function kakaoLogin(k_id, k_email, k_gender) {\r\n");
      out.write("				alert(\">>> kakaoLogin : \" + k_id + \" : \" + k_email );\r\n");
      out.write("				var temp = $(\"#snstype\").val();\r\n");
      out.write("				\r\n");
      out.write("				$.ajax({\r\n");
      out.write("					type: 'GET',\r\n");
      out.write("					url:'kakaoLogin.lhd',\r\n");
      out.write("					data: {\r\n");
      out.write("						 'snstype': '01'\r\n");
      out.write("						,'snsid':k_id\r\n");
      out.write("						,'snsemail':k_email\r\n");
      out.write("						,'k_gender':k_gender\r\n");
      out.write("						},\r\n");
      out.write("				\r\n");
      out.write("					error: function(request, status, error) {\r\n");
      out.write("						alert(request+\" : \" + status + \" : \" + error);\r\n");
      out.write("					}\r\n");
      out.write("					\r\n");
      out.write("				});\r\n");
      out.write("				//location.href=\"/kosSpring/kakaoLogin.lhd?snsype=01&snsid=\"+k_id+\"&snsemail=\"+k_email;\r\n");
      out.write("			}\r\n");
      out.write("			\r\n");
      out.write("	\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			$(document).ready(function() {\r\n");
      out.write("				alert(\">>> jQuery In\");	\r\n");
      out.write("			\r\n");
      out.write("				\r\n");
      out.write("				$(document).on(\"click\", \"#loginBtn\", function() {\r\n");
      out.write("					\r\n");
      out.write("					$('#loginForm').attr({\r\n");
      out.write("						'action':\"loginCheck.lhd\",\r\n");
      out.write("						'method':'POST',\r\n");
      out.write("						'enctype':'application/x-www-form-urlencoded'\r\n");
      out.write("					}).submit();\r\n");
      out.write("				});\r\n");
      out.write("			\r\n");
      out.write("			}); // end of ready()\r\n");
      out.write("		\r\n");
      out.write("		</script>\r\n");
      out.write("		\r\n");
      out.write("		<style type=\"text/css\">\r\n");
      out.write("			.div1 {\r\n");
      out.write("				background: #D8F6CE;\r\n");
      out.write("				border: 1px solid #D7DF01;\r\n");
      out.write("				width: 300px;\r\n");
      out.write("				height: 300px;\r\n");
      out.write("				margin: 100px auto;\r\n");
      out.write("			}\r\n");
      out.write("		</style>\r\n");
      out.write("	</head>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<body>\r\n");
      out.write("		<div class=\"div1\" >\r\n");
      out.write("			<h1 align=\"center\">Login</h1>\r\n");
      out.write("			<hr>\r\n");
      out.write("			<form name=\"loginForm\" id=\"loginForm\">\r\n");
      out.write("				<table border=\"1\" align=\"center\">\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td><input type=\"text\" name=\"mid\" id=\"mid\" style=\"width:200px;\"></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td><input type=\"password\" name=\"mpw\" id=\"mpw\" style=\"width:200px;\"></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>\r\n");
      out.write("							<button type=\"button\" id=\"loginBtn\" style=\"width:208px; background-color:yellow;\">로그인</button>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td align=\"right\">\r\n");
      out.write("							<a href=\"idFindForm.lhd\"><font size=\"2\">아이디찾기</font></a>\r\n");
      out.write("							<a href=\"pwFindForm.lhd\"><font size=\"2\">아이디찾기</font></a>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>\r\n");
      out.write("							<a href=\"javascript:kakaoLoginApi()\">\r\n");
      out.write("								<img height=\"30\" width=\"208\" src=\"/kosSpring/img/img_sns/o.jpg\">			\r\n");
      out.write("							\r\n");
      out.write("							</a>\r\n");
      out.write("							\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>\r\n");
      out.write("							<a href=\"");
      out.print( apiURL );
      out.write(">\">\r\n");
      out.write("								<img height=\"30\" width=\"208\" src=\"/kosSpring/img/img_sns/naver.PNG\">\r\n");
      out.write("								<input type=\"hidden\" id=\"snstype\" value=\"02\">\r\n");
      out.write("							</a>\r\n");
      out.write("						</td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</table>\r\n");
      out.write("				\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
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
