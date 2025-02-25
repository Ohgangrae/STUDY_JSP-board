/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.56
 * Generated at: 2022-02-17 02:22:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginOk_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');
request.setCharacterEncoding("UTF-8"); 
      out.write('\r');
      out.write('\n');
      com.member.beans.MemberVO member = null;
      member = (com.member.beans.MemberVO) _jspx_page_context.getAttribute("member", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (member == null){
        member = new com.member.beans.MemberVO();
        _jspx_page_context.setAttribute("member", member, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      com.member.beans.MemberDAO dao = null;
      dao = (com.member.beans.MemberDAO) _jspx_page_context.getAttribute("dao", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (dao == null){
        dao = new com.member.beans.MemberDAO();
        _jspx_page_context.setAttribute("dao", dao, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("member"), request);
      out.write('\r');
      out.write('\n');

	int memberNum = dao.login(member.getMemberId(), member.getMemberPw());
	if(memberNum == 0){

      out.write("\r\n");
      out.write("	<script>\r\n");
      out.write("		alert(\"로그인 실패\");\r\n");
      out.write("		location.href = \"login.jsp\";\r\n");
      out.write("	</script>\r\n");

	}else{ //로그인 성공 시
		
		// 세션에 회원 번호 저장 후 로그인 상태 유지
		session.setAttribute("memberNum", memberNum);
	
		if(request.getParameter("saveId") != null){ //아이디 저장이 체크되었다면
			//쿠키에 로그인된 사용자의 아이디 저장
			Cookie cookieId = new Cookie("memberId", member.getMemberId());
			//아이디 저장 체크 저장
			Cookie cookieCheckbox = new Cookie("saveId", "true");
			
			//1년의 기간동안 쿠키 유지
			cookieId.setMaxAge(60*60*24*365);
			cookieCheckbox.setMaxAge(60*60*24*365);
			
			//응답 데이터 저장
			response.addCookie(cookieId);
			response.addCookie(cookieCheckbox);
			
		}else{ // 아이디 저장이 체크되지 않았다면
			String cookieCheck = request.getHeader("Cookie");
			if(cookieCheck != null){
				Cookie[] cookies = request.getCookies();
				for(Cookie cookie : cookies){
					// 기존에 있던 쿠키 전부 삭제
					cookie.setMaxAge(0);
					response.addCookie(cookie);
				}
			}
		}
		
		if(request.getParameter("autoLogin") != null){ //자동 로그인이 체크되었다면
			
			//로그인 된 사용자의 아이디 쿠키에 저장
			Cookie cookieId = new Cookie("memberId", member.getMemberId());
			//로그인 된 사용자의 암호화된 비밀번호 쿠키에 저장(여기서 복호화 하면 해킹 바로 당함).
			Cookie cookiePw = new Cookie("memberPw", member.getMemberPw());
			//자동 로그인 체크 저장
			Cookie cookieCheckbox = new Cookie("autoLogin", "true");
			
			//1년의 기간동안 쿠키 유지
			cookieId.setMaxAge(60*60*24*365);
			cookiePw.setMaxAge(60*60*24*365);
			cookieCheckbox.setMaxAge(60*60*24*365);
			
			//응답 데이터 저장
			response.addCookie(cookieId);
			response.addCookie(cookiePw);
			response.addCookie(cookieCheckbox);
			
		}else{ // 자동 로그인이 체크되지 않았다면
			String cookieCheck = request.getHeader("Cookie");
			if(cookieCheck != null){
				Cookie[] cookies = request.getCookies();
				for(Cookie cookie : cookies){
					// 쿠키 전체 삭제
					cookie.setMaxAge(0);
					response.addCookie(cookie);
				}
			}
		}
		
		response.sendRedirect("index.jsp");
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
