/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.87
 * Generated at: 2023-07-28 02:18:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import a.b.c.com.kos.mem.vo.KosMemberVO;
import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public final class mainPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/view/main/k_map_7.html", Long.valueOf(1684746501594L));
    _jspx_dependants.put("/WEB-INF/view/main/01_barChart.html", Long.valueOf(1684746501575L));
  }

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("  \r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
 request.setCharacterEncoding("UTF-8"); 
      out.write('\r');
      out.write('\n');

	Logger logger = LogManager.getLogger(this.getClass());
	logger.info("kosmoMainPage.jsp 진입 >>> : ");		

      out.write(" \r\n");
      out.write("      \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>MAIN PAGE</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> \r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"/kosSpring/js/common.js\"></script>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/kosSpring/include/css/mainstyle.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/kosSpring/css/main.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	\r\n");
      out.write("	$(document).ready(function(){\r\n");
      out.write("		\r\n");
      out.write("		\r\n");
      out.write("		$(function(){\r\n");
      out.write("			// 현재 시간 \r\n");
      out.write("			function printTime(){\r\n");
      out.write("				let days = [\"일\", \"월\", \"화\", \"수\", \"목\", \"금\", \"토\"];\r\n");
      out.write("				let md = new Date();\r\n");
      out.write("				\r\n");
      out.write("				let yy = md.getFullYear();\r\n");
      out.write("				let mm = md.getMonth() + 1;\r\n");
      out.write("				let dd = md.getDate();\r\n");
      out.write("				let ii = md.getDay();\r\n");
      out.write("				let di = days[ii];\r\n");
      out.write("				let hh = md.getHours();\r\n");
      out.write("				let mi = md.getMinutes();\r\n");
      out.write("				let ss = md.getSeconds();\r\n");
      out.write("				\r\n");
      out.write("				let time = 	yy + \"년\" +\r\n");
      out.write("							numpad(mm) + \"월\" +\r\n");
      out.write("							numpad(dd) + \"일\" +\r\n");
      out.write("							di + \"요일\" +\r\n");
      out.write("							numpad(hh) + \":\" +\r\n");
      out.write("							numpad(mi) + \":\" +\r\n");
      out.write("							numpad(ss);\r\n");
      out.write("				document.getElementById(\"timer\").innerHTML=time;\r\n");
      out.write("			}\r\n");
      out.write("			setInterval(printTime, 1000);\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			\r\n");
      out.write("			// 수료일	\r\n");
      out.write("			function getDay(y, m, d) {\r\n");
      out.write("				let today = new Date();\r\n");
      out.write("				let dday = new Date(y, m-1, d);\r\n");
      out.write("				let cnt = dday.getTime() - today.getTime();\r\n");
      out.write("				let n = Math.ceil(cnt / (24 * 60 * 60 * 1000));\r\n");
      out.write("				return n;\r\n");
      out.write("			}			\r\n");
      out.write("			let dday = getDay(2023, 1, 18);			\r\n");
      out.write("			console.log(\"dday >>> : \" + dday);\r\n");
      out.write("			document.getElementById(\"dday\").innerHTML=dday;\r\n");
      out.write("		});\r\n");
      out.write("	\r\n");
      out.write("		// 상품 이벤트 \r\n");
      out.write("		$(document).on('click', '#img_1', function(){\r\n");
      out.write("			alert(\"#상품아이디가지고 상품검색하기\");			\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	\r\n");
      out.write("	.m {\r\n");
      out.write("		text-align: center;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	table{\r\n");
      out.write("		margin : auto;\r\n");
      out.write("		border-collapse: separate;\r\n");
      out.write("		border-spacing: 20px 40px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	img {\r\n");
      out.write("		width:200px;\r\n");
      out.write("		height:250px;\r\n");
      out.write("	}\r\n");
      out.write("	\r\n");
      out.write("	a {\r\n");
      out.write("	  	text-decoration-line: none;\r\n");
      out.write("		/*   text-decoration-line: underline; */\r\n");
      out.write("		/*   text-decoration-line: overline; */\r\n");
      out.write("		/*   text-decoration-line: line-through; */\r\n");
      out.write("		/*   text-decoration-line: underline line-through overline; */\r\n");
      out.write("	}		\r\n");
      out.write("	\r\n");
      out.write("	<!--\r\n");
      out.write("		슬라이드 메뉴 \r\n");
      out.write("	-->\r\n");
      out.write("	#header { width: 100%; height: 52px; background: #447e65; position: relative; overflow: hidden; }\r\n");
      out.write("	#mask { width: 100%; height: 100%; position: fixed; top: 0; left: 0; background: #000; -ms-filter: \"progid:DXImageTransform.Microsoft.Alpha(Opacity=50)\"; filter: alpha(opacity=50); zoom: 1; opacity: 0.5; z-index: 9998; display: none; }\r\n");
      out.write("	.logo { font-size: 25px; color: #fff; position: absolute; top: 5px; left: 15px; }\r\n");
      out.write("	.btn_menu_open { background: none; border: 0; font-size: 15px; color: #fff; position: absolute; top: 15px; right: 15px; cursor: pointer; }\r\n");
      out.write("	.slide_menu { width: 80%; height: 100%; max-width: 360px; background: #fff; position: fixed; top: 0; right: 0; overflow-y: scroll; z-index: 9999; display: none; }\r\n");
      out.write("	.slide_menu .menu_close { width: 100%; height: 52px; background: #447e65; position: relative; }\r\n");
      out.write("	.slide_menu .btn_menu_close { background: none; border: 0; font-size: 15px; color: #fff; position: absolute; top: 15px; right: 15px; cursor: pointer; }\r\n");
      out.write("	.slide_menu .menu_list li { padding: 15px; border-bottom:1px solid #ccc; list-style: none; }\r\n");
      out.write("	.slide_menu .menu_list li a { font-size: 15px; color: #333; }\r\n");
      out.write("	</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<!-- 상단바와 내용 -->\r\n");
      out.write("<div id=\"sitearea\">\r\n");
      out.write("	<!-- 상단바 -->\r\n");
      out.write("	<header id=\"topbar\">\r\n");
      out.write("		<div class=\"wrapper\">\r\n");
      out.write("			<!-- 상단바 로고영역(로고, 검색) -->\r\n");
      out.write("			<div id=\"logoarea\">\r\n");
      out.write("				<!-- 로고 -->\r\n");
      out.write("				<div id=\"toplogo\">\r\n");
      out.write("					<a href=\"/kosSpring/index.jsp\">\r\n");
      out.write("						<!-- 로고이미지 위치 확정되면 변경 -->\r\n");
      out.write("						<img src=\"/kosSpring/include/img/1__(3).png\" id=\"sitelogo\">\r\n");
      out.write("					</a>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- 검색바 -->\r\n");
      out.write("				<div id=\"searchbar\">\r\n");
      out.write("					<form>오후 2:38\r\n");
      out.write("						<!-- 드롭다운 -->\r\n");
      out.write("						<select>\r\n");
      out.write("							<option>검색_1</option>\r\n");
      out.write("							<option>검색_2</option>\r\n");
      out.write("							<option>검색_3</option>\r\n");
      out.write("						</select>\r\n");
      out.write("						<!-- 텍스트필드 -->\r\n");
      out.write("						<div id=\"searchtext\">\r\n");
      out.write("							<input type=\"text\">\r\n");
      out.write("						</div>\r\n");
      out.write("						<!-- 검색버튼 -->\r\n");
      out.write("						<input type=\"submit\" value=\"검색\" id=\"searchbtn\">\r\n");
      out.write("					</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div id=\"btnarea\">\r\n");

	String mid = "";
	Object obj = request.getAttribute("listLogin");
	
	if (obj !=null) {
		List<KosMemberVO> list = (List<KosMemberVO>)obj;
		int nCnt = list.size();			
		if (nCnt == 1) {
			mid = list.get(0).getMid();	
		}	

      out.write("\r\n");
      out.write("		<p align=\"right\">\r\n");
      out.write("			");
      out.print( mid );
      out.write(" 님 로그인 중 <a href=\"logout.k\" class=\"sitebtn\">로그아웃</a>\r\n");
      out.write("			<a href=\"javascript:alert('준비중입니다.');\" onfocus=\"this.blur()\" class=\"sitebtn\">마이페이지</a>\r\n");
      out.write("			<a href=\"javascript:alert('준비중입니다.');\" onfocus=\"this.blur()\" class=\"sitebtn\">글쓰기</a>\r\n");
      out.write("		</p>\r\n");

	}else{

      out.write("\r\n");
      out.write("		<p align=\"right\">\r\n");
      out.write("			<a href=\"loginForm.lhd\" class=\"sitebtn\">로그인</a>\r\n");
      out.write("			<a href=\"javascript:alert('준비중입니다.');\" onfocus=\"this.blur()\" class=\"sitebtn\">회원가입</a>\r\n");
      out.write("		</p>	\r\n");

	}		

      out.write("\r\n");
      out.write("<h3 class=\"m\">MAIN PAGE :   \r\n");
      out.write("	<span style=\"color:red\">수료일 D-</span>\r\n");
      out.write("	<span id=\"dday\" style=\"color:red\"></span>\r\n");
      out.write("	: <span id=\"timer\"></span>\r\n");
      out.write("</h3>\r\n");
      out.write("						\r\n");
      out.write("		</div>\r\n");
      out.write("		</div>\r\n");
      out.write("		<!-- 메뉴 -->		\r\n");
      out.write("		<div id=\"naviarea\">\r\n");
      out.write("			<ul class=\"wrapper\">\r\n");
      out.write("				<!-- 메뉴버튼들 -->				\r\n");
      out.write("				<li>\r\n");
      out.write("					<a href=\"javascript:alert('준비중입니다.');\" onfocus=\"this.blur()\">\r\n");
      out.write("						<div class=\"nav_btn\">\r\n");
      out.write("							게시판\r\n");
      out.write("						</div>\r\n");
      out.write("					</a>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li>\r\n");
      out.write("					<a href=\"javascript:alert('준비중입니다.');\" onfocus=\"this.blur()\">\r\n");
      out.write("						<div class=\"nav_btn\">\r\n");
      out.write("							상품\r\n");
      out.write("						</div>\r\n");
      out.write("					</a>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li>\r\n");
      out.write("					<a href=\"javascript:alert('준비중입니다.');\" onfocus=\"this.blur()\">\r\n");
      out.write("						<div class=\"nav_btn\">\r\n");
      out.write("							키오스크\r\n");
      out.write("						</div>\r\n");
      out.write("					</a>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li>\r\n");
      out.write("					<a href=\"javascript:alert('준비중입니다.');\" onfocus=\"this.blur()\">\r\n");
      out.write("						<div class=\"nav_btn\">\r\n");
      out.write("							당근마켓\r\n");
      out.write("						</div>\r\n");
      out.write("					</a>\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>		\r\n");
      out.write("	</header>\r\n");
      out.write("	<div id=\"contents\">\r\n");
      out.write("  		<h1>KOSMO 120기</h1>      \r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- 내용 -->\r\n");
      out.write("	<div id=\"sitecontent\">\r\n");
      out.write("		<div class=\"wrapper\">\r\n");
      out.write("			<div>\r\n");
      out.write("				[차트]\r\n");
      out.write("				");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>ColumnChart1</title>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("	//êµ¬ê¸ ìê°í APIë¥¼ ë¡ë©íë ë©ìë\r\n");
      out.write("	google.charts.load('current', {packages: ['corechart']});\r\n");
      out.write("	\r\n");
      out.write("	// êµ¬ê¸ ìê°í APIê° ë¡ë©ì´ ìë£ëë©´,\r\n");
      out.write("	// ì¸ìë¡ ì ë¬ë ì½ë°±í¨ìë¥¼ ë´ë¶ì ì¼ë¡ í¸ì¶íì¬ ì°¨í¸ë¥¼ ê·¸ë¦¬ë ë©ìë\r\n");
      out.write("	// íë©´ì´ ì¤íë ë í¨ê» ì¤íëë¤.\r\n");
      out.write("	google.charts.setOnLoadCallback(columnChart1);\r\n");
      out.write("	\r\n");
      out.write("	// ë¬¶ì ì¸ë¡ ë§ëí ì°¨í¸ 1\r\n");
      out.write("	function columnChart1() {\r\n");
      out.write("	\r\n");
      out.write("		// ë²í¼ í´ë¦­ ì ajaxë¥¼ ì¬ì©íì¬ ìë²ë¡ë¶í° json ë°°ì´ ê°ì²´ë¥¼ ê°ì ¸ìë¤ê³  ê°ì í¨\r\n");
      out.write("		var arr = [\r\n");
      out.write("					['YEAR', 'AMOUNT', 'COST'],\r\n");
      out.write("					['2014', 1000, 400],\r\n");
      out.write("					['2015', 1170, 460],\r\n");
      out.write("					['2016', 660, 1120],\r\n");
      out.write("					['2017', 1030, 540],\r\n");
      out.write("					['2018', 660, 1120],\r\n");
      out.write("					['2019', 1030, 540],\r\n");
      out.write("				  ];\r\n");
      out.write("		\r\n");
      out.write("		// ì¤ ë°ì´í°ë¥¼ ê°ì§ ë°ì´í°íì´ë¸ ê°ì²´ë¥¼ ë°ííë ë©ìë\r\n");
      out.write("		var dataTable = google.visualization.arrayToDataTable(arr);\r\n");
      out.write("		\r\n");
      out.write("		// ìµìê°ì²´ ì¤ë¹\r\n");
      out.write("		var options = {\r\n");
      out.write("						title: 'COMPANY AMOUNT',\r\n");
      out.write("						hAxis: {\r\n");
      out.write("								title: 'YEAR',\r\n");
      out.write("								titleTextStyle: {color: 'red'}\r\n");
      out.write("						}\r\n");
      out.write("					  };\r\n");
      out.write("		\r\n");
      out.write("		// ì°¨í¸ë¥¼ ê·¸ë¦´ ìì­ì¸ div ê°ì²´ë¥¼ ê°ì ¸ì´\r\n");
      out.write("		var objDiv = document.getElementById('column_chart_div1');\r\n");
      out.write("		\r\n");
      out.write("		// ì¸ìë¡ ì ë¬í div ê°ì²´ì ìì­ì ì»¬ë¼ì°¨í¸ë¥¼ ê·¸ë¦´ì ìë ì°¨í¸ê°ì²´ë¥¼ ë°í\r\n");
      out.write("		var chart = new google.visualization.ColumnChart(objDiv);\r\n");
      out.write("		\r\n");
      out.write("		// ì°¨í¸ê°ì²´ì ë°ì´í°íì´ë¸ê³¼ ìµì ê°ì²´ë¥¼ ì¸ìë¡ ì ë¬íì¬ ì°¨í¸ ê·¸ë¦¬ë ë©ìë\r\n");
      out.write("		chart.draw(dataTable, options);\r\n");
      out.write("		\r\n");
      out.write("	} // columnChart1()ì ë\r\n");
      out.write("\r\n");
      out.write("	</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div id=\"column_chart_div1\" style=\"width: 900px; height: 500px;\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("		\r\n");
      out.write("				[내용]\r\n");
      out.write("				<table>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td><img src=\"/kosSpring/img/img_book/book0.jpg\" id=\"img_1\"><br>\r\n");
      out.write("							<a href=\"void(0);\" onclick=\"alert('상품아이디가지고 상품검색하기');return false;\">책 1</a>\r\n");
      out.write("						</td>\r\n");
      out.write("						<td><img src=\"/kosSpring/img/img_book/book1.jpg\"><br><a href=\"#\">책 2</a></td>\r\n");
      out.write("						<td><img src=\"/kosSpring/img/img_book/book2.jpg\"><br><a href=\"#\">책 3</a></td>\r\n");
      out.write("						<td><img src=\"/kosSpring/img/img_book/book3.jpg\"><br><a href=\"#\">책 4</a></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td><img src=\"/kosSpring/img/img_kakaofriends/04 (2).png\"><br><a href=\"#\">친구 1</a></td>\r\n");
      out.write("						<td><img src=\"/kosSpring/img/img_kakaofriends/08.png\"><br><a href=\"#\">친구 2</a></td>\r\n");
      out.write("						<td><img src=\"/kosSpring/img/img_kakaofriends/1__(3).png\"><br><a href=\"#\">친구 3</a></td>\r\n");
      out.write("						<td><img src=\"/kosSpring/img/img_kakaofriends/2 (3).png\"><br><a href=\"#\">친구 4</a></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td><img src=\"/kosSpring/img/img_css/bear.jpg\"><br><a href=\"#\">이미지 1</a></td>\r\n");
      out.write("						<td><img src=\"/kosSpring/img/img_css/guitar-bg.jpg\"><br><a href=\"#\">이미지 2</a></td>\r\n");
      out.write("						<td><img src=\"/kosSpring/img/img_css/cat.jpg\"><br><a href=\"#\">이미지 3</a></td>\r\n");
      out.write("						<td><img src=\"/kosSpring/img/img_css/photo.jpg\"><br><a href=\"#\">이미지 4</a></td>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</table>\r\n");
      out.write("				[지도]\r\n");
      out.write("				");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>ë¡ëë·° ëë¡ë¥¼ ì´ì©íì¬ ë¡ëë·° ìì±íê¸°</title>\r\n");
      out.write("    <style>\r\n");
      out.write("    .map_wrap {overflow:hidden;height:330px}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"map_wrap\">\r\n");
      out.write("    <div id=\"mapWrapper\" style=\"width:50%;height:300px;float:left\">\r\n");
      out.write("        <div id=\"map\" style=\"width:100%;height:100%\"></div> <!-- ì§ëë¥¼ íìí  div ìëë¤ -->\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"rvWrapper\" style=\"width:50%;height:300px;float:left\">\r\n");
      out.write("        <div id=\"roadview\" style=\"width:100%;height:100%\"></div> <!-- ë¡ëë·°ë¥¼ íìí  div ìëë¤ -->\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=7ba50d45d025f6f02a5ac1b2483828c8\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("var mapWrapper = document.getElementById('mapWrapper'); //ì§ëë¥¼ ê°ì¸ê³  ìë DIVíê·¸\r\n");
      out.write("\r\n");
      out.write("var mapContainer = document.getElementById('map'), // ì§ëë¥¼ íìí  div \r\n");
      out.write("    // mapCenter = new kakao.maps.LatLng(33.450422139819736 , 126.5709139924533), // ì§ëì ê°ì´ë° ì¢í\r\n");
      out.write("    // í´ë¦­í ìì¹ì ìëë 37.47885372567819 ì´ê³ , ê²½ëë 126.87936740782715 ìëë¤\r\n");
      out.write("    // mapCenter = new kakao.maps.LatLng(37.47885372567819 , 126.87936740782715), // ì§ëì ê°ì´ë° ì¢í\r\n");
      out.write("    mapCenter = new kakao.maps.LatLng(37.478853, 126.879367), // ì§ëì ê°ì´ë° ì¢í\r\n");
      out.write("    // center: new kakao.maps.LatLng(37.478853, 126.879367), // ê°ì° ìëë©ë¥´ëì\r\n");
      out.write("    mapOption = {\r\n");
      out.write("        center: mapCenter, // ì§ëì ì¤ì¬ì¢í\r\n");
      out.write("        level: 3 // ì§ëì íë ë ë²¨\r\n");
      out.write("    };\r\n");
      out.write("\r\n");
      out.write("// ì§ëë¥¼ íìí  divì  ì§ë ìµìì¼ë¡  ì§ëë¥¼ ìì±í©ëë¤\r\n");
      out.write("var map = new kakao.maps.Map(mapContainer, mapOption);\r\n");
      out.write("map.addOverlayMapTypeId(kakao.maps.MapTypeId.ROADVIEW); //ì§ë ìì ë¡ëë·° ëë¡ ì¬ë¦¬ê¸°\r\n");
      out.write("\r\n");
      out.write("var rvContainer = document.getElementById('roadview'); //ë¡ëë·°ë¥¼ íìí  div\r\n");
      out.write("var rv = new kakao.maps.Roadview(rvContainer); //ë¡ëë·° ê°ì²´\r\n");
      out.write("var rvClient = new kakao.maps.RoadviewClient(); //ì¢íë¡ë¶í° ë¡ëë·° íë¸IDë¥¼ ê°ì ¸ì¬ ë¡ëë·° helperê°ì²´\r\n");
      out.write("\r\n");
      out.write("toggleRoadview(mapCenter);\r\n");
      out.write("\r\n");
      out.write("// ë§ì»¤ ì´ë¯¸ì§ë¥¼ ìì±í©ëë¤.\r\n");
      out.write("var markImage = new kakao.maps.MarkerImage(\r\n");
      out.write("    'https://t1.daumcdn.net/localimg/localimages/07/2018/pc/roadview_minimap_wk_2018.png',\r\n");
      out.write("    new kakao.maps.Size(26, 46),\r\n");
      out.write("    {\r\n");
      out.write("        // ì¤íë¼ì´í¸ ì´ë¯¸ì§ë¥¼ ì¬ì©í©ëë¤.\r\n");
      out.write("        // ì¤íë¼ì´í¸ ì´ë¯¸ì§ ì ì²´ì í¬ê¸°ë¥¼ ì§ì íê³ \r\n");
      out.write("        spriteSize: new kakao.maps.Size(1666, 168),\r\n");
      out.write("        // ì¬ì©íê³  ì¶ì ìì­ì ì¢ìë¨ ì¢íë¥¼ ìë ¥í©ëë¤.\r\n");
      out.write("        // background-positionì¼ë¡ ì§ì íë ê°ì´ë©° ë¶í¸ë ë°ëìëë¤.\r\n");
      out.write("        spriteOrigin: new kakao.maps.Point(705, 114),\r\n");
      out.write("        offset: new kakao.maps.Point(13, 46)\r\n");
      out.write("    }\r\n");
      out.write(");\r\n");
      out.write("\r\n");
      out.write("// ëëê·¸ê° ê°ë¥í ë§ì»¤ë¥¼ ìì±í©ëë¤.\r\n");
      out.write("var rvMarker = new kakao.maps.Marker({\r\n");
      out.write("    image : markImage,\r\n");
      out.write("    position: mapCenter,\r\n");
      out.write("    draggable: true,\r\n");
      out.write("    map: map\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("//ë§ì»¤ì dragend ì´ë²¤í¸ë¥¼ í ë¹í©ëë¤\r\n");
      out.write("kakao.maps.event.addListener(rvMarker, 'dragend', function(mouseEvent) {\r\n");
      out.write("    var position = rvMarker.getPosition(); //íì¬ ë§ì»¤ê° ëì¸ ìë¦¬ì ì¢í\r\n");
      out.write("    toggleRoadview(position); //ë¡ëë·°ë¥¼ í ê¸í©ëë¤\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("//ì§ëì í´ë¦­ ì´ë²¤í¸ë¥¼ í ë¹í©ëë¤\r\n");
      out.write("kakao.maps.event.addListener(map, 'click', function(mouseEvent){\r\n");
      out.write("    \r\n");
      out.write("    // íì¬ í´ë¦­í ë¶ë¶ì ì¢íë¥¼ ë¦¬í´ \r\n");
      out.write("    var position = mouseEvent.latLng; \r\n");
      out.write("\r\n");
      out.write("    rvMarker.setPosition(position);\r\n");
      out.write("    toggleRoadview(position); //ë¡ëë·°ë¥¼ í ê¸í©ëë¤\r\n");
      out.write("});\r\n");
      out.write("\r\n");
      out.write("//ë¡ëë·° toggleí¨ì\r\n");
      out.write("function toggleRoadview(position){\r\n");
      out.write("\r\n");
      out.write("    //ì ë¬ë°ì ì¢í(position)ì ê°ê¹ì´ ë¡ëë·°ì panoIdë¥¼ ì¶ì¶íì¬ ë¡ëë·°ë¥¼ ëìëë¤\r\n");
      out.write("    rvClient.getNearestPanoId(position, 50, function(panoId) {\r\n");
      out.write("        if (panoId === null) {\r\n");
      out.write("            rvContainer.style.display = 'none'; //ë¡ëë·°ë¥¼ ë£ì ì»¨íì´ëë¥¼ ì¨ê¹ëë¤\r\n");
      out.write("            mapWrapper.style.width = '100%';\r\n");
      out.write("            map.relayout();\r\n");
      out.write("        } else {\r\n");
      out.write("            mapWrapper.style.width = '50%';\r\n");
      out.write("            map.relayout(); //ì§ëë¥¼ ê°ì¸ê³  ìë ìì­ì´ ë³ê²½ë¨ì ë°ë¼, ì§ëë¥¼ ì¬ë°°ì´í©ëë¤\r\n");
      out.write("            rvContainer.style.display = 'block'; //ë¡ëë·°ë¥¼ ë£ì ì»¨íì´ëë¥¼ ë³´ì´ê²í©ëë¤\r\n");
      out.write("            rv.setPanoId(panoId, position); //panoIdë¥¼ íµí ë¡ëë·° ì¤í\r\n");
      out.write("            rv.relayout(); //ë¡ëë·°ë¥¼ ê°ì¸ê³  ìë ìì­ì´ ë³ê²½ë¨ì ë°ë¼, ë¡ëë·°ë¥¼ ì¬ë°°ì´í©ëë¤\r\n");
      out.write("        }\r\n");
      out.write("    });\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<!-- 하단바 -->\r\n");
      out.write("<footer id=\"footerarea\">\r\n");
      out.write("	<div class=\"wrapper\">\r\n");
      out.write("		<div>\r\n");
      out.write("			[하단바]\r\n");
      out.write("			<br>아이콘 제작자 :\r\n");
      out.write("			<a href=\"http://www.freepik.com/\" title=\"Freepik\">Freepik</a>\r\n");
      out.write("			from\r\n");
      out.write("			<a href=\"https://www.flaticon.com/kr/\" title=\"Flaticon\"> www.flaticon.com</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
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
