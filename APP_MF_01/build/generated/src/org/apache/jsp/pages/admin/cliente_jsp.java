package org.apache.jsp.pages.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>ADMINISTRACION DE CLIENTES</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      gabo.corp.com.bean.Cliente cliBean = null;
      synchronized (_jspx_page_context) {
        cliBean = (gabo.corp.com.bean.Cliente) _jspx_page_context.getAttribute("cliBean", PageContext.PAGE_SCOPE);
        if (cliBean == null){
          cliBean = new gabo.corp.com.bean.Cliente();
          _jspx_page_context.setAttribute("cliBean", cliBean, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\n");
      out.write("        <h3>Bienvenido ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((gabo.corp.com.bean.Cliente)_jspx_page_context.findAttribute("cliBean")).getNombre())));
      out.write(' ');
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((gabo.corp.com.bean.Cliente)_jspx_page_context.findAttribute("cliBean")).getApellido())));
      out.write("</h3>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspecthelper(_jspx_page_context.findAttribute("cliBean"), "nombre", "Gabo", null, null, false);
      out.write("\n");
      out.write("        ");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((gabo.corp.com.bean.Cliente)_jspx_page_context.findAttribute("cliBean")).getNombre())));
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
