/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.56
 * Generated at: 2022-02-22 01:26:00 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.app.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1645406415391L));
    _jspx_dependants.put("jar:file:/D:/aigb_0900_hds/jsp/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/boardMVC/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
  }

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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("<!DOCTYPE HTML>\r\n");
      out.write("<!--\r\n");
      out.write("	Altitude by Pixelarity\r\n");
      out.write("	pixelarity.com | hello@pixelarity.com\r\n");
      out.write("	License: pixelarity.com/license\r\n");
      out.write("-->\r\n");
      out.write("<html>\r\n");
      out.write("	<head>\r\n");
      out.write("		<title>Untitled</title>\r\n");
      out.write("		<meta charset=\"utf-8\" />\r\n");
      out.write("		<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\" />\r\n");
      out.write("		<!--\r\n");
      out.write("			상대경로로 작성하게 되면 서버 상태, 서버 환경 등에 따라 경로를 읽지 못할 수 있다.\r\n");
      out.write("			절대경로로 표현할 수 있도록 request객체를 통해 contextPath를 가져와 모든 경로 앞에 추가해준다.\r\n");
      out.write("		-->\r\n");
      out.write("		<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/css/main.css\" />\r\n");
      out.write("		<style>\r\n");
      out.write("			input[type='button'], input[type='submit']{border-radius:0;}\r\n");
      out.write("			textarea{resize:none;}\r\n");
      out.write("			label{margin-top:3%;}\r\n");
      out.write("			div.preview{overflow:hidden;}\r\n");
      out.write("			div.preview img{object-fit:cover;}\r\n");
      out.write("		</style>\r\n");
      out.write("	</head>\r\n");
      out.write("	<body class=\"is-preload\">\r\n");
      out.write("\r\n");
      out.write("		<!-- Page Wrapper -->\r\n");
      out.write("			<div id=\"page-wrapper\">\r\n");
      out.write("\r\n");
      out.write("				<!-- Wrapper -->\r\n");
      out.write("					<div class=\"wrapper\">\r\n");
      out.write("						<div class=\"inner\">\r\n");
      out.write("							");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/app/fix/header.jsp", out, false);
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- Wrapper -->\r\n");
      out.write("					<div class=\"wrapper\">\r\n");
      out.write("						<div class=\"inner\">\r\n");
      out.write("\r\n");
      out.write("							<!-- Main -->\r\n");
      out.write("							<section class=\"main\">\r\n");
      out.write("\r\n");
      out.write("								<header class=\"major\">\r\n");
      out.write("									<a href=\"#\" class=\"image main\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/join01.png\" alt=\"\" /></a>\r\n");
      out.write("									<h1>회원가입</h1>\r\n");
      out.write("									<p>\r\n");
      out.write("										환영합니다 고객님<br>\r\n");
      out.write("										회원가입 후 정상적인 서비스를 이용하실 수 있습니다.\r\n");
      out.write("									</p>\r\n");
      out.write("								</header>\r\n");
      out.write("								<hr />\r\n");
      out.write("								<form method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/member/MemberJoinOk.me\" name=\"joinForm\">\r\n");
      out.write("									<div style=\"display:flex; justify-content:space-around;\">\r\n");
      out.write("										<div style=\"width:40%\">\r\n");
      out.write("											<p style=\"background:#fd3a3a2e\"><span style=\"color:red; font-size:2rem; font-weight:bold;\">*</span>아래 항목은 모두 작성해주세요.</p>\r\n");
      out.write("												<div>\r\n");
      out.write("													<div class=\"col-6 col-12-xsmall\" style=\"width:100%\">\r\n");
      out.write("														<p style=\"margin:0;\">\r\n");
      out.write("															아이디 <span id=\"result\" style=\"font-size:0.7em;\"></span>\r\n");
      out.write("														</p>\r\n");
      out.write("														<input type=\"text\" name=\"memberId\" id=\"memberId\" placeholder=\"6자 이상의 영문 혹은 영문과 숫자를 조합\" />\r\n");
      out.write("														<br>\r\n");
      out.write("														<p style=\"margin:0;\">비밀번호</p>\r\n");
      out.write("														<input type=\"password\" name=\"memberPw\" id=\"memberPw\" placeholder=\"영문 4자 이상, 최대 20자\"/>\r\n");
      out.write("														<br>\r\n");
      out.write("														<div style=\"display:flex; justify-content:space-between;\">\r\n");
      out.write("															<div style=\"width:48%;\">\r\n");
      out.write("																<p style=\"margin:0;\">이름</p>\r\n");
      out.write("																<input type=\"text\" name=\"memberName\" id=\"memberName\"/>\r\n");
      out.write("															</div>\r\n");
      out.write("															<div style=\"width:48%;\">\r\n");
      out.write("																<p style=\"margin:0;\">나이</p>\r\n");
      out.write("																<input type=\"text\" name=\"memberAge\" id=\"memberAge\"/>\r\n");
      out.write("															</div>\r\n");
      out.write("														</div>\r\n");
      out.write("														<hr>\r\n");
      out.write("														<div style=\"margin-top:6%; margin-bottom:6%;\">\r\n");
      out.write("															<input type=\"checkbox\" id=\"term\" name=\"term\">\r\n");
      out.write("															<label for=\"term\" style=\"font-size:1.1em; font-weight:bold;\">전체 동의합니다.</label>\r\n");
      out.write("														</div>\r\n");
      out.write("														<div class=\"col-12\" style=\"display:flex; justify-content:space-between;\">\r\n");
      out.write("															<div>\r\n");
      out.write("																<input type=\"checkbox\" id=\"term1\" name=\"term1\" class=\"terms\">\r\n");
      out.write("																<label for=\"term1\">서비스 이용약관 </label>\r\n");
      out.write("															</div>\r\n");
      out.write("															<div>\r\n");
      out.write("																<a class=\"showTerm\" href=\"term1-content\">펼쳐보기</a>\r\n");
      out.write("															</div>\r\n");
      out.write("														</div>\r\n");
      out.write("														<textarea class=\"term-content\" name=\"term1-content\" id=\"term1-content\" placeholder=\"Enter your message\" rows=\"3\" style=\"display:none;\">안녕하세요</textarea>\r\n");
      out.write("														<br>\r\n");
      out.write("														<div class=\"col-12\" style=\"display:flex; justify-content:space-between;\">\r\n");
      out.write("															<div>\r\n");
      out.write("																<input type=\"checkbox\" id=\"term2\" name=\"term2\" class=\"terms\">\r\n");
      out.write("																<label for=\"term2\">개인정보 수집 및 이용</label>\r\n");
      out.write("															</div>\r\n");
      out.write("															<div>\r\n");
      out.write("																<a class=\"showTerm\" href=\"term2-content\">펼쳐보기</a>\r\n");
      out.write("															</div>\r\n");
      out.write("														</div>\r\n");
      out.write("														<textarea class=\"term-content\" name=\"term2-content\" id=\"term2-content\" placeholder=\"Enter your message\" rows=\"3\" style=\"display:none;\"></textarea>\r\n");
      out.write("														<br>\r\n");
      out.write("													</div>\r\n");
      out.write("												</div>\r\n");
      out.write("												<hr />\r\n");
      out.write("												<p style=\"background:#3a6dfd2e\"><span style=\"color:red; font-size:2rem; font-weight:bold;\"> </span>아래 항목은 선택 사항입니다.</p>\r\n");
      out.write("												<p style=\"margin:0;\">성별</p>\r\n");
      out.write("												<div class=\"col-4 col-12-small\">\r\n");
      out.write("													<input type=\"radio\" id=\"male\" name=\"memberGender\" value=\"남자\" checked>\r\n");
      out.write("													<label for=\"male\">남자</label>\r\n");
      out.write("													<input type=\"radio\" id=\"female\" name=\"memberGender\" value=\"여자\">\r\n");
      out.write("													<label for=\"female\">여자</label>\r\n");
      out.write("													<input type=\"radio\" id=\"none\" name=\"memberGender\" value=\"선택안함\">\r\n");
      out.write("													<label for=\"none\">선택안함</label>\r\n");
      out.write("												</div>\r\n");
      out.write("												<p style=\"margin:0;\">이메일</p>\r\n");
      out.write("												<input type=\"text\" name=\"memberEmail\" id=\"memberEmail\" value=\"\"/>\r\n");
      out.write("												<br>\r\n");
      out.write("												<p style=\"margin:0;\">우편번호</p>\r\n");
      out.write("												<div style=\"display:flex;\">\r\n");
      out.write("													<input type=\"text\" name=\"memberZipcode\" id=\"zipcode\" placeholder=\"우편번호\">\r\n");
      out.write("													<input type=\"button\" onclick=\"find()\" value=\"우편번호 찾기\"><br>\r\n");
      out.write("												</div>\r\n");
      out.write("												<br>\r\n");
      out.write("												<input type=\"text\" name=\"memberAddress\" id=\"address\" placeholder=\"주소\">\r\n");
      out.write("												<input type=\"text\" name=\"memberAddressDetail\" id=\"addressDetail\" placeholder=\"상세주소\">\r\n");
      out.write("												<div class=\"col-12\" style=\"margin-top:8%;\">\r\n");
      out.write("													<ul class=\"actions\" style=\"display:flex; justify-content:center;\">\r\n");
      out.write("														<li><input type=\"button\" value=\"완료\" class=\"primary\" onclick=\"send()\"/></li>\r\n");
      out.write("														<li><input type=\"button\" value=\"취소\" class=\"primary\" onclick=\"history.back()\"/></li>\r\n");
      out.write("													</ul>\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("											<div class=\"preview\" style=\"width:40%\">\r\n");
      out.write("												<div>\r\n");
      out.write("													<h4>광고1</h4>\r\n");
      out.write("													<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/ex01.png\">\r\n");
      out.write("												</div>\r\n");
      out.write("												<hr>\r\n");
      out.write("												<div>\r\n");
      out.write("													<h4>광고2</h4>\r\n");
      out.write("													<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/ex03.png\">\r\n");
      out.write("												</div>\r\n");
      out.write("												<hr>\r\n");
      out.write("												<div>\r\n");
      out.write("													<h4>광고3</h4>\r\n");
      out.write("													<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/images/ex01.png\">\r\n");
      out.write("												</div>\r\n");
      out.write("											</div>\r\n");
      out.write("										</div>\r\n");
      out.write("									</form>\r\n");
      out.write("							</section>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				<!-- Wrapper -->\r\n");
      out.write("					<div class=\"wrapper\">\r\n");
      out.write("						<div class=\"inner\">\r\n");
      out.write("\r\n");
      out.write("							<!-- Footer -->\r\n");
      out.write("								<footer id=\"footer\">\r\n");
      out.write("									<section class=\"links\">\r\n");
      out.write("										<div>\r\n");
      out.write("											<h3>Magna</h3>\r\n");
      out.write("											<ul class=\"plain\">\r\n");
      out.write("												<li><a href=\"#\">Aliquam tempus</a></li>\r\n");
      out.write("												<li><a href=\"#\">Ultrecies nul</a></li>\r\n");
      out.write("												<li><a href=\"#\">Gravida ultricies</a></li>\r\n");
      out.write("												<li><a href=\"#\">Commodo etiam</a></li>\r\n");
      out.write("											</ul>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div>\r\n");
      out.write("											<h3>Feugiat</h3>\r\n");
      out.write("											<ul class=\"plain\">\r\n");
      out.write("												<li><a href=\"#\">Morbi sem lorem</a></li>\r\n");
      out.write("												<li><a href=\"#\">Praes sed dapi</a></li>\r\n");
      out.write("												<li><a href=\"#\">Sed adipis nullam</a></li>\r\n");
      out.write("												<li><a href=\"#\">Fus dolor lacinia</a></li>\r\n");
      out.write("											</ul>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div>\r\n");
      out.write("											<h3>Tempus</h3>\r\n");
      out.write("											<ul class=\"plain\">\r\n");
      out.write("												<li><a href=\"#\">Donecnec etiam</a></li>\r\n");
      out.write("												<li><a href=\"#\">Aapibus sedun</a></li>\r\n");
      out.write("												<li><a href=\"#\">Namnulla tempus</a></li>\r\n");
      out.write("												<li><a href=\"#\">Morbi set amet</a></li>\r\n");
      out.write("											</ul>\r\n");
      out.write("										</div>\r\n");
      out.write("										<div>\r\n");
      out.write("											<h3>Aliquam</h3>\r\n");
      out.write("											<ul class=\"plain\">\r\n");
      out.write("												<li><a href=\"#\">Lorem prasent dia</a></li>\r\n");
      out.write("												<li><a href=\"#\">Nellentes ipsum</a></li>\r\n");
      out.write("												<li><a href=\"#\">Diamsed arcu dolor</a></li>\r\n");
      out.write("												<li><a href=\"#\">Sit amet cursus</a></li>\r\n");
      out.write("											</ul>\r\n");
      out.write("										</div>\r\n");
      out.write("									</section>\r\n");
      out.write("									<ul class=\"contact-icons\">\r\n");
      out.write("										<li class=\"icon solid fa-home\">1234 Fictional Street #5432 Nashville, TN 00000-0000</li>\r\n");
      out.write("										<li class=\"icon solid fa-phone\"><a href=\"#\">(000) 000-0000</a></li>\r\n");
      out.write("										<li class=\"icon solid fa-envelope\"><a href=\"#\">info@untitled.tld</a></li>\r\n");
      out.write("									</ul>\r\n");
      out.write("									<p class=\"copyright\">&copy; Untitled. All rights reserved.</p>\r\n");
      out.write("								</footer>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("			</div>\r\n");
      out.write("	</body>\r\n");
      out.write("	<!-- Scripts -->\r\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("	<script>var contextPath = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";</script>\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/jquery.min.js\"></script>\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/browser.min.js\"></script>\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/breakpoints.min.js\"></script>\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/util.js\"></script>\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/main.js\"></script>\r\n");
      out.write("	<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/assets/js/join.js\"></script>\r\n");
      out.write("	<script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
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
