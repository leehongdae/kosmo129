/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-05-23 12:02:16 UTC
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
import java.util.List;

public final class memSelect_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \r\n");
      out.write("    \r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
 request.setCharacterEncoding("UTF-8");
      out.write(' ');
      out.write('\r');
      out.write('\n');

	Logger logger = LogManager.getLogger(this.getClass());
	logger.info("memSelect.jsp >>> : ");

      out.write("\r\n");
      out.write("\r\n");

	Object obj = request.getAttribute("list");
	if(obj == null) return;
	
	List<KosMemberVO> list = (List<KosMemberVO>)obj;
	int nCnt = list.size();
	
	String mpw= "";
	String mbirth= "";
	String mbirth0= "";
	String mbirth1= "";
	String mbirth2= "";
	String mhp = "";
	String mhp0 = "";
	String mhp1 = "";
	String mhp2 = "";
	String mtel = "";
	String mtel0 = "";
	String mtel1 = "";
	String mtel2 = "";
	String memail= "";
	String memails[]= null;
	String mhobby= "";
	
	KosMemberVO _kvo = null;
	_kvo = list.get(0);
	
	mbirth = CodeUtil.birth(_kvo.getMbirth());
	String birth[] = mbirth.split("-");
	mbirth0 = birth[0];
	mbirth1 = birth[1];
	mbirth2 = birth[2];
	
	mhp = CodeUtil.hp(_kvo.getMhp());
	String hp[] = mhp.split("-");
	mhp0 = hp[0];
	mhp1 = hp[1];
	mhp2 = hp[2];

	mtel = CodeUtil.tel(_kvo.getMtel());
	String tel[] = mtel.split("-");
	mtel0 = tel[0];
	mtel1 = tel[1];
	mtel2 = tel[2];
	logger.info(">>> mtel0 : " + mtel0);
	logger.info(">>> mtel1 : " + mtel1);
	logger.info(">>> mtel2 : " + mtel2);
	
	memail = _kvo.getMemail();
	memails = memail.split("@");
	
	mhobby = _kvo.getMhobby();	

      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<meta charset=\"UTF-8\">\r\n");
      out.write("		<title>SELECT</title>\r\n");
      out.write("		<script  src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("		<script src=\"http://dmaps.daum.net/map_js_init/postcode.v2.js\"></script>\r\n");
      out.write("		<script type=\"text/javascript\">\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("		$(document).ready(function(){	\r\n");
      out.write("			\r\n");
      out.write("			// 이메일 \r\n");
      out.write("			$('#memail2').change(function(){	\r\n");
      out.write("				$(\"#memail2 option:selected\").each(function () {\r\n");
      out.write("					if($(this).val()== '1'){ //직접입력일 경우 \r\n");
      out.write("							var aa = $(\"#memail1\").val();						\r\n");
      out.write("							$(\"#memail1\").val(''); //값 초기화 \r\n");
      out.write("							$(\"#memail1\").attr(\"readonly\",false); //활성화 				\r\n");
      out.write("					}else{ //직접입력이 아닐경우 \r\n");
      out.write("							$(\"#memail1\").val($(this).text()); //선택값 입력 \r\n");
      out.write("							$(\"#memail1\").attr(\"readonly\",true); //비활성화 \r\n");
      out.write("					}\r\n");
      out.write("				}); \r\n");
      out.write("			}); 	\r\n");
      out.write("			\r\n");
      out.write("			// 우편번호	\r\n");
      out.write("			$(\"#zonecode\").click(function(){\r\n");
      out.write("				console.log(\"zonecode >>> : \");\r\n");
      out.write("				new daum.Postcode({\r\n");
      out.write("					oncomplete: function(data) {\r\n");
      out.write("					    $(\"#mzonecode\").val(data.zonecode); 		//5자리 새우편번호 사용\r\n");
      out.write("					    $(\"#mroadaddr\").val(data.roadAddress); 		//도로명 주소\r\n");
      out.write("					    $(\"#mroaddetail\").val(''); 					// 도로명 상세주소\r\n");
      out.write("					    $(\"#mjibunaddr\").val(data.jibunAddress); 	//지번주소			\r\n");
      out.write("					}\r\n");
      out.write("				}).open();\r\n");
      out.write("			});\r\n");
      out.write("			\r\n");
      out.write("			// 취미들\r\n");
      out.write("			var mhobbys = '");
      out.print( mhobby );
      out.write("';\r\n");
      out.write("			mhobbys = mhobbys.split(',');\r\n");
      out.write("			console.log(\"mhobbys >>> : \" + mhobbys);\r\n");
      out.write("		\r\n");
      out.write("			for (var i=0; i < mhobbys.length; i++){\r\n");
      out.write("				let mhobby = mhobbys[i]\r\n");
      out.write("				console.log(mhobby);				\r\n");
      out.write("				\r\n");
      out.write("				$(\".mhobby\").each(function(){\r\n");
      out.write("					if($(this).val() == mhobby){\r\n");
      out.write("						$(this).prop(\"checked\", true);\r\n");
      out.write("					}\r\n");
      out.write("				});\r\n");
      out.write("			}	\r\n");
      out.write("			//  updateBtn\r\n");
      out.write("			$(document).on(\"click\", \"#updateBtn\", function(){\r\n");
      out.write("				//alert(\"U >>> : \");		\r\n");
      out.write("				$(\"#memUpdateForm\").attr({ \"method\":\"GET\"\r\n");
      out.write("					                      ,\"action\":\"memUpdate.lhd\"}).submit();\r\n");
      out.write("			});\r\n");
      out.write("		});\r\n");
      out.write("\r\n");
      out.write("		\r\n");
      out.write("			\r\n");
      out.write("		</script>\r\n");
      out.write("		<style type=\"text/css\">\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	div {		 \r\n");
      out.write("		margin: 0 auto; 		\r\n");
      out.write("		border:1px solid #6d82f3;\r\n");
      out.write("		display:table;\r\n");
      out.write("	}			\r\n");
      out.write("\r\n");
      out.write("	td, th {\r\n");
      out.write("		 padding: 5px;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	h3 {\r\n");
      out.write("		text-align: center;\r\n");
      out.write("	}	\r\n");
      out.write("	\r\n");
      out.write("	table, th, td {\r\n");
      out.write("  		border: 1px solid black;  		\r\n");
      out.write("	}\r\n");
      out.write("	.photo {\r\n");
      out.write("		border:1px solid red;		\r\n");
      out.write("		width: 180px;\r\n");
      out.write("		height: 180px;		\r\n");
      out.write("		display: block;\r\n");
      out.write("		/*\r\n");
      out.write("			margin-reft: auto;\r\n");
      out.write("			margin-rigth; auto;\r\n");
      out.write("		*/		\r\n");
      out.write("		border-radius: 50%;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	.tt {\r\n");
      out.write("		color: red;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("	</head>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<body>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<h3>회원정보</h3>\r\n");
      out.write("<hr>\r\n");
      out.write("<div>\r\n");
      out.write("<form name=\"memUpdateForm\" id=\"memUpdateForm\">	\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");
      out.write("	<td colspan=\"3\" align=\"center\">					\r\n");
      out.write("		<font size=\"4\" style=\"color:blue;\">수정 && 삭제</font>					\r\n");
      out.write("		<img src=\"/kosSpring/img/img_mandu/ase.gif\" width=\"25\" height=\"25\" alt=\"image\">\r\n");
      out.write("	</td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("	<td>회원번호</td>\r\n");
      out.write("	<td>\r\n");
      out.write("		<input type=\"text\" name=\"mnum\" id=\"mnum\" value=\"");
      out.print( _kvo.getMnum() );
      out.write("\" readonly/>\r\n");
      out.write("	</td>\r\n");
      out.write("	<td rowspan=\"5\"> \r\n");
      out.write("		<img class=\"photo\" src=\"/kosSpring/fileupload/mem/");
      out.print( _kvo.getMphoto() );
      out.write("\" alt=\"image\">\r\n");
      out.write("    </td>\r\n");
      out.write("</tr>\r\n");
      out.write("<tr>\r\n");
      out.write("	<td>이름</td>\r\n");
      out.write("	<td><input type=\"text\" name=\"mname\" id=\"mname\" value=\"");
      out.print( _kvo.getMname() );
      out.write("\" readonly/></td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("	<td>아이디</td>\r\n");
      out.write("	<td>\r\n");
      out.write("		<input type=\"text\" name=\"mid\" id=\"mid\" placeholder=\"아이디체크\" style=\"width:100px\" value=\"");
      out.print( _kvo.getMid() );
      out.write("\" readonly />		\r\n");
      out.write("	</td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("	<td>패스워드</td>\r\n");
      out.write("	<td>\r\n");
      out.write("		<input type=\"password\" name=\"mpw\" id=\"mpw\" style=\"width:100px\" value=\"");
      out.print( mpw );
      out.write("\" readonly /><br/>\r\n");
      out.write("	</td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("	<td>성별</td>\r\n");
      out.write("	<td> \r\n");
      out.write("		<input type=\"radio\" name=\"mgender\" id=\"mgender_f\" value=\"F\" checked onclick=\"return(false);\" /> 여자\r\n");
      out.write("      	<input type=\"radio\" name=\"mgender\" id=\"mgender_m\" value=\"M\" onclick=\"return(false);\" /> 남자\r\n");
      out.write("    </td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("	<td>생년월일</td>\r\n");
      out.write("	<td  colspan=\"2\">		\r\n");
      out.write("		<input type=\"text\" name=\"mbirth\" id=mbirth placeholder=\"년(4자)\" value=\"");
      out.print( mbirth0 );
      out.write("\" maxlength=\"4\" style=\"width:50px\" readonly />\r\n");
      out.write("		<input type=\"text\" name=\"mbirth1\" id=\"mbirth1\" value=\"");
      out.print( mbirth1 );
      out.write("\" style=\"width:20px\" readonly >\r\n");
      out.write("        <input type=\"text\" name=\"mbirth2\" id=\"mbirth2\" value=\"");
      out.print( mbirth2 );
      out.write("\" style=\"width:20px\" readonly >\r\n");
      out.write("	</td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("	<td class=\"tt\">핸드폰</td>\r\n");
      out.write("	<td colspan=\"2\">\r\n");
      out.write("		<select name=\"mhp\" id=\"mhp\" style=\"width:50px;\">\r\n");
      out.write("        	<option value=\"010\">010</option>\r\n");
      out.write("        	<option value=\"011\">011</option>\r\n");
      out.write("        	<option value=\"016\">016</option>\r\n");
      out.write("        	<option value=\"017\">017</option>		        	\r\n");
      out.write("         </select>\r\n");
      out.write("         - <input type=\"text\" name=\"mhp1\" id=\"mhp1\" value=\"");
      out.print( mhp1 );
      out.write("\" maxlength=\"4\" style=\"width:50px;\"/>\r\n");
      out.write("         - <input type=\"text\" name=\"mhp2\" id=\"mhp2\" value=\"");
      out.print( mhp2 );
      out.write("\" maxlength=\"4\" style=\"width:50px;\"/>\r\n");
      out.write("	</td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("	<td class=\"tt\">전화번호</td>\r\n");
      out.write("	<td colspan=\"2\">\r\n");
      out.write("		<select name=\"mtel\" id=\"mtel\">\r\n");
      out.write("        	<option value=\"02\">02</option>\r\n");
      out.write("        	<option value=\"031\">031</option>\r\n");
      out.write("        	<option value=\"041\">041</option>\r\n");
      out.write("        	<option value=\"051\">051</option>\r\n");
      out.write("        	<option value=\"061\">061</option>	        			       \r\n");
      out.write("         </select>\r\n");
      out.write("		- <input type=\"text\" name=\"mtel1\" id=\"mtel1\" value=\"");
      out.print( mtel1 );
      out.write("\" style=\"width:50px;\"/>\r\n");
      out.write("		- <input type=\"text\" name=\"mtel2\" id=\"mtel2\" value=\"");
      out.print( mtel2 );
      out.write("\" style=\"width:50px;\"/>\r\n");
      out.write("	</td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("	<td class=\"tt\">이메일</td>\r\n");
      out.write("	<td colspan=\"2\">		\r\n");
      out.write("		<input type=\"text\" name=\"memail\" id=memail style=\"width:100px\" value=\"");
      out.print( memails[0] );
      out.write("\" />\r\n");
      out.write("		@ <input type=\"text\" name=\"memail1\" id=memail1 style=\"width:100px\" value=\"");
      out.print( memails[1] );
      out.write("\" placeholder=\"직접입력\" />\r\n");
      out.write("		<select name=\"memail2\" id=\"memail2\" style=\"width:100px;margin-right:10px\">\r\n");
      out.write("        	 <option value=\"1\" selected>직접입력</option>\r\n");
      out.write("       		 <option value=\"naver.com\">naver.com</option>	       	   \r\n");
      out.write("      		 <option value=\"gmail.com\">gmail.com</option>\r\n");
      out.write("      		 <option value=\"daum.net\">daum.net</option>	       	   \r\n");
      out.write("         </select>\r\n");
      out.write("	</td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" <tr>\r\n");
      out.write(" 	<td class=\"tt\">주소</td>\r\n");
      out.write(" 	<td colspan=\"2\">\r\n");
      out.write(" 		<input type=\"text\" name=\"mzonecode\" id=\"mzonecode\" \r\n");
      out.write(" 			placeholder=\"우편번호\" style=\"width:50px\" value=\"");
      out.print( _kvo.getMzonecode() );
      out.write("\">\r\n");
      out.write(" 		<input type=\"button\" name=\"zonecode\" id=\"zonecode\" value=\"우편번호 찾기\"><br>	 	\r\n");
      out.write(" 		<input type=\"text\" name=\"mroadaddr\" id=\"mroadaddr\" \r\n");
      out.write(" 			placeholder=\"도로명주소\" style=\"width:300px\" value=\"");
      out.print( _kvo.getMroadaddr() );
      out.write("\"><br>	 	\r\n");
      out.write(" 		<input type=\"text\" name=\"mroaddetail\" id=\"mroaddetail\" \r\n");
      out.write(" 			placeholder=\"도로명주소 상세주소\" style=\"width:300px\" value=\"");
      out.print( _kvo.getMroaddetail() );
      out.write("\"><br>	 	\r\n");
      out.write(" 		<input type=\"text\" name=\"mjibunaddr\" id=\"mjibunaddr\" \r\n");
      out.write(" 			placeholder=\"지번주소\" style=\"width:300px\" value=\"");
      out.print( _kvo.getMjibunaddr() );
      out.write("\">\r\n");
      out.write(" 	</td>\r\n");
      out.write(" </tr>	 \r\n");
      out.write(" <tr>\r\n");
      out.write("	<td class=\"tt\">취미</td>\r\n");
      out.write("	<td colspan=\"2\"> \r\n");
      out.write("		<input type=\"checkbox\" class=\"mhobby\" name=\"mhobby\" value=\"mh1\" />알고리즘		      \r\n");
      out.write("        <input type=\"checkbox\" class=\"mhobby\" name=\"mhobby\" value=\"mh2\" />코딩\r\n");
      out.write("        <input type=\"checkbox\" class=\"mhobby\" name=\"mhobby\" value=\"mh3\" />분석설계<br>\r\n");
      out.write("        <input type=\"checkbox\" class=\"mhobby\" name=\"mhobby\" value=\"mh4\" />데이터베이스\r\n");
      out.write("        <input type=\"checkbox\" class=\"mhobby\" name=\"mhobby\" value=\"mh5\" />스크립트\r\n");
      out.write("    </td>\r\n");
      out.write(" </tr>	 \r\n");
      out.write(" <tr>\r\n");
      out.write("	<td class=\"tt\">소개글</td>\r\n");
      out.write("	<td  colspan=\"2\">\r\n");
      out.write("		<textarea name=\"minfo\" id=\"minfo\" rows=\"5\" cols=\"50\">");
      out.print( _kvo.getMinfo() );
      out.write("				\r\n");
      out.write("		</textarea>\r\n");
      out.write("	</td>\r\n");
      out.write(" </tr>\r\n");
      out.write(" <tr>\r\n");
      out.write("	<td colspan=\"3\"> 			\r\n");
      out.write("		<button type=\"button\" id=\"updateBtn\">수정</button>\r\n");
      out.write("		<button type=\"reset\">다시 </button>\r\n");
      out.write("	</td>				\r\n");
      out.write(" </tr>\r\n");
      out.write(" </table>				 		        		     \r\n");
      out.write("</form>	\r\n");
      out.write("</div>	\r\n");
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
