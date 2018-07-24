/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.31
 * Generated at: 2018-06-28 07:25:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import board.BoardDBBean;
import board.BoardDataBean;
import java.text.SimpleDateFormat;

public final class content_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/color.jsp", Long.valueOf(1530074337327L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("board.BoardDataBean");
    _jspx_imports_classes.add("board.BoardDBBean");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
      response.setContentType("text/html; charset=EUC-KR");
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

	String bodyback_c = "#e0ffff";
	String back_c = "#8fbc8f";
	String title_c = "#5f9ea0";
	String value_c = "#b0e0e6";
	String bar = "#778899";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>Post board</title>\r\n");
      out.write("</head>\r\n");

	int num = Integer.parseInt(request.getParameter("num"));
	String pageNum = request.getParameter("pageNum");
	int number = Integer.parseInt(request.getParameter("number"));
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm");
	
	try{
		BoardDBBean dbPro = BoardDBBean.getInstance();
		BoardDataBean article = dbPro.getArticle(num);
		
		int ref = article.getRef();
		int re_step = article.getRe_step();
		int re_level = article.getRe_level();

      out.write("\r\n");
      out.write("<body bgcolor=\"");
      out.print(bodyback_c);
      out.write("\">\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<b>글 내용 보기</b><br>\r\n");
      out.write("\t\t<form>\r\n");
      out.write("\t\t\t<table width = \"555\" border = \"1\" cellspacing=\"0\" cellpadding=\"0\" bgcolor=\"");
      out.print(bodyback_c);
      out.write("\" align=\"center\">\r\n");
      out.write("\t\t\t\t<tr bgcolor=\"30\" align=\"center\" width = \"125\">\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"");
      out.print(value_c);
      out.write("\">글 번호 </td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(number);
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"");
      out.print(value_c);
      out.write("\">조회수</td>\r\n");
      out.write("\t\t\t\t\t<td width =\"180\">");
      out.print(article.getReadcount());
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr height=\"30\" align=\"center\" width =\"125\">\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"");
      out.print(value_c);
      out.write("\">작성자</td>\r\n");
      out.write("\t\t\t\t\t<td>");
      out.print(article.getWriter());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td bgcolor=\"");
      out.print(value_c);
      out.write("\">작성일</td>\r\n");
      out.write("\t\t\t\t\t<td width =\"180\">");
      out.print(sdf.format(article.getReg_date()));
      out.write("</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr height=\"30\">\r\n");
      out.write("\t\t\t\t\t<td align=\"center\" width=\"125\" bgcolor=\"");
      out.print(value_c);
      out.write("\">글제목 </td>\r\n");
      out.write("\t\t\t\t\t<td align=\"left\" colspan=\"3\">&nbsp;");
      out.print(article.getSubject() );
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\t\t\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\" width=\"125\" bgcolor=\"");
      out.print(value_c);
      out.write("\">글내용</td>\r\n");
      out.write("\t\t\t\t\t<td align=\"left\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t<pre>");
      out.print(article.getContent());
      out.write("</pre>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"4\" bgcolor=\"");
      out.print(value_c );
      out.write("\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"button\" value=\"글수정\" onclick=\"document.location.href='updateForm.jsp?num=");
      out.print(article.getNum());
      out.write("&pageNum=");
      out.print(pageNum);
      out.write("'\">\r\n");
      out.write("\t\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<input type = \"button\" value=\"글삭제\" onclick=\"document.location.href='deleteForm.jsp?num=");
      out.print(article.getNum());
      out.write("&pageNum=");
      out.print(pageNum);
      out.write("'\">\r\n");
      out.write("\t\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<input type = \"button\" value=\"답글쓰기\" onclick=\"document.location.href='writeForm.jsp?num=");
      out.print(num);
      out.write("&ref=");
      out.print(ref);
      out.write("&re_step=");
      out.print(re_step);
      out.write("&re_level=");
      out.print(re_level);
      out.write("'\">\r\n");
      out.write("\t\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t<input type = \"button\" value=\"글목록\" onclick=\"document.location.href='list.jsp?pageNum=");
      out.print(pageNum);
      out.write("'\">\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</center>\r\n");
      out.write("</body>\r\n");

	}catch(Exception e){
		
	}
 
      out.write("\r\n");
      out.write("\r\n");
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