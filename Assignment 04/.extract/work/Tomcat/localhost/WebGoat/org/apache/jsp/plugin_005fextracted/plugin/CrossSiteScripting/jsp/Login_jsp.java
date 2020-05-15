/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.59
 * Generated at: 2019-11-09 19:18:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.plugin_005fextracted.plugin.CrossSiteScripting.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.owasp.webgoat.plugin.GoatHillsFinancial.EmployeeStub;
import org.owasp.webgoat.plugin.crosssitescripting.CrossSiteScripting;
import org.owasp.webgoat.session.WebSession;
import java.util.Iterator;
import java.util.List;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"lesson_login\">\n");
      out.write("\t\t<div id=\"lesson_login_txt\">\n");
      out.write("\t\t\t");
 
			WebSession webSession = ((WebSession)session.getAttribute("websession"));
			
      out.write("\n");
      out.write("\t\t\t<form id=\"form1\" name=\"form1\" method=\"post\" action=\"");
      out.print(webSession.getCurrentLesson().getFormAction());
      out.write("\">\n");
      out.write("\t\t\t    \t<label>\n");
      out.write("\t\t\t      \t<select name=\"");
      out.print(CrossSiteScripting.EMPLOYEE_ID);
      out.write("\">\n");
      out.write("\t\t\t      \t");

			      	//System.out.println("Retrieving employees list");
			      	List employees = (List) session.getAttribute("CrossSiteScripting." + CrossSiteScripting.STAFF_ATTRIBUTE_KEY);
			      	Iterator i = employees.iterator();
					while (i.hasNext())
					{
						EmployeeStub stub = (EmployeeStub) i.next();
					
      out.write("\n");
      out.write("\t\t\t      \t<option value=\"");
      out.print(Integer.toString(stub.getId()));
      out.write('"');
      out.write('>');
      out.print(stub.getFirstName() + " " + stub.getLastName() + " (" + stub.getRole() + ")");
      out.write("</option>\n");
      out.write("\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t                </select>\n");
      out.write("\t\t        </label>\n");
      out.write("\t\t\t\t<br>\n");
      out.write("\t\t\t    \t<label>Password\n");
      out.write("\t\t\t    \t\t<input name=\"password\" type=\"password\" size=\"10\" maxlength=\"8\" />\n");
      out.write("\t\t\t    </label>\n");
      out.write("\t\t\t\t<br>\n");
      out.write("\t\t\t\t<input type=\"submit\" name=\"action\" value=\"");
      out.print(CrossSiteScripting.LOGIN_ACTION);
      out.write("\"/>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>");
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
