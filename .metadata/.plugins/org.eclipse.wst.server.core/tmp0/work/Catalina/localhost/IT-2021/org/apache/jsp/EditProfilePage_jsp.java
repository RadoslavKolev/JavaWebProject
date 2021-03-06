/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.41
 * Generated at: 2021-05-07 12:44:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import users.User;
import users.Skill;

public final class EditProfilePage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("users.Skill");
    _jspx_imports_classes.add("users.User");
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>????????????</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");

	User user = (User) session.getAttribute("sessionUser");
	
      out.write("\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<div class=\"content\">\r\n");
      out.write("\t\t\t<div class=\"profile_picture\">\r\n");
      out.write("\t\t\t\t<img src=\"images/male.svg\" alt=\"\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<form action=\"user\" method=\"post\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print( user.getId() );
      out.write("\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"my_info\">\r\n");
      out.write("\t\t\t\t\t<h2 style=\"text-align: center\">???????????????? ????????????????????</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<label>??????: </label> \r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"personal_name\" value=\"");
      out.print(user.getPersonalName());
      out.write("\" /> \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label>????????????: </label>\r\n");
      out.write("\t\t\t\t\t<input type=\"text\" name=\"job_title\" value=\"");
      out.print(user.getJobTitle());
      out.write("\" /> \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<label>????????????????: </label>\r\n");
      out.write("\t\t\t\t\t<textarea name=\"description\">");
      out.print(user.getDescription());
      out.write("</textarea>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<h2 class=\"centered\">????????????</h2>\r\n");
      out.write("\t\t\t\t<div id=\"card1\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"card_column_one\">\r\n");
      out.write("\t\t\t\t\t\t<h3>??????????????????????????</h3>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
 int i=0;
						for (Skill skill : user.getProffesionalSkills()) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"profSkillName");
      out.print(i);
      out.write("\" value=\"");
      out.print(skill.getSkillName());
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"range\" min=\"0\" max=\"100\" step=\"10\" name=\"profSkillLevel");
      out.print(i);
      out.write("\" value=\"");
      out.print(skill.getLevel());
      out.write("\" style=\"width:100%\"/>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t");

						i++;
						}
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"card_column_two\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<h3>??????????????????</h3>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t");
 int j=0;
						for (Skill skill : user.getPersonalSkills()) {
						
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" name=\"personalSkillName");
      out.print(j);
      out.write("\" value=\"");
      out.print(skill.getSkillName());
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t<input type=\"range\" min=\"0\" max=\"100\" step=\"10\" name=\"personalSkillLevel");
      out.print(j);
      out.write("\" value=\"");
      out.print(skill.getLevel());
      out.write("\" style=\"width:100%\"/>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t");

						j++;
						}
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<h2 class=\"centered\">????????????????</h2>\r\n");
      out.write("\t\t\t\t<div id=\"card2\">\r\n");
      out.write("\t\t\t\t\t<div class=\"card_column_one\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<label>??????????: </label> <input type=\"text\" name=\"email\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(user.getEmail());
      out.write("\" /> <label>??????????????: </label> <input\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" name=\"phone\" value=\"");
      out.print(user.getPhone());
      out.write("\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"card_column_two\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<label>????????: </label> <input type=\"text\" name=\"city\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(user.getAddress().getCity());
      out.write("\" /> <label>??????????:\r\n");
      out.write("\t\t\t\t\t\t</label> <input type=\"text\" name=\"street\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(user.getAddress().getStreet());
      out.write("\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"???????????? ????????????????????????\" />\r\n");
      out.write("\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<footer> </footer>\r\n");
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
