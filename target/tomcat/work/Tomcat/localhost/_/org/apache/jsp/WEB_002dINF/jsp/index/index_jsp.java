/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-07-20 13:31:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>Vote no restaurante</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<style>\n");
      out.write(".vote-form{\n");
      out.write("display:flex;\n");
      out.write("margin: 0 auto;\n");
      out.write("max-width: 900px;\n");
      out.write("padding: 20px 0;\n");
      out.write("flex-wrap: wrap;\n");
      out.write("text-align: center;\n");
      out.write("}\n");
      out.write(".vote-submit{\n");
      out.write("flex-basis:100%;\n");
      out.write("text-align: center;\n");
      out.write("}\n");
      out.write(".vote-submit input{\n");
      out.write("    padding: 1em 2em;\n");
      out.write("    -webkit-appearance: none;\n");
      out.write("    -moz-appearance: none;\n");
      out.write("    appearance: none;\n");
      out.write("    background-color: white;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    color: #fff;\n");
      out.write("    background-color: #337ab7;\n");
      out.write("    border-color: #2e6da4;\n");
      out.write("    font-weight: 600;\n");
      out.write("    margin-top: 50px;\n");
      out.write("}\n");
      out.write("label{\n");
      out.write("    flex: 1;\n");
      out.write("    border: 1px solid lightgray;\n");
      out.write("    border-radius: 5px;\n");
      out.write("    margin: 0 2em;\n");
      out.write("    padding: 1em;\n");
      out.write("}\n");
      out.write("label img{\n");
      out.write("\tmax-width: 350px;\n");
      out.write("\t    min-height: 350px;\n");
      out.write("}\n");
      out.write(".votes-title{\n");
      out.write("\twidth: 100%;\n");
      out.write("\ttext-align: center;\n");
      out.write("\tfont-size: 2em;\n");
      out.write("\t    text-align: center;\n");
      out.write("    font-family: \"âPalatino Linotypeâ\", \"âBook Antiquaâ\", Palatino, serif;\n");
      out.write("    padding: 1em 0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("<h2 class=\" votes-title\">Escolha seu favorito entre estes dois: </h2>\n");
      out.write("\t<form method=\"post\" action=\"/vote\" class=\"vote-form\">\n");
      out.write("\t\t<input type=\"hidden\" name=\"current\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${handler.getCurrentVoted().getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" >\n");
      out.write("\t\t<label>\n");
      out.write("\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${handler.getCurrentVoted().getLogoUrl()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\n");
      out.write("\t\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${handler.getCurrentVoted().getName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("\t\t\t<input type=\"radio\" name=\"selected\" required value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${handler.getCurrentVoted().getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" >\n");
      out.write("\t\t</label>\n");
      out.write("\t\t<label>\n");
      out.write("\t\t\t<img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${handler.getNext().getLogoUrl()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" />\n");
      out.write("\t\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${handler.getNext().getName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("</p>\n");
      out.write("\t\t\t<input type=\"radio\" name=\"selected\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${handler.getNext().getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" >\n");
      out.write("\t\t</label>\n");
      out.write("\t\t<span class=\"vote-submit\">\n");
      out.write("\t\t\t<input type=\"submit\"  value=\"Votar!\" >\n");
      out.write("\t\t</span>\n");
      out.write("\t</form>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
