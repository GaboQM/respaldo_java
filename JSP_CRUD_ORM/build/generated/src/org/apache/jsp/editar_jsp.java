package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta  charset=\"UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" crossorigin=\"anonymous\">\n");
      out.write("       \n");
      out.write("        <title>Agregar USUARIO</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"breadcrumb\">\n");
      out.write("  <a class=\"breadcrumb-item\" href=\"");
      out.print(request.getContextPath() );
      out.write("/user\">Home</a>\n");
      out.write("  <span class=\"breadcrumb-item active\">Agregar Usuario</span>\n");
      out.write("</nav>\n");
      out.write("         <div class=\"container\">\n");
      out.write("            <h3><center>AGREGAR USUARIOS</center></h3>\n");
      out.write("            <form name=\"form\" action=\"");
      out.print(request.getContextPath() );
      out.write("/agregar_post\" method=\"post\">\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputEmail1\">USUARIO:</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"user\" name=\"user\" aria-describedby=\"emailHelp\" placeholder=\"Nombre de usuario\">\n");
      out.write("   \n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleInputEmail1\">Password</label>\n");
      out.write("    <input type=\"email\"  name=\"correo\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Email\">\n");
      out.write("     <small id=\"emailHelp\"  class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("</form>\n");
      out.write("          \n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
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
