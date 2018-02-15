package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Controlador.ControladorProductos;

public final class detalles_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!--A Design by W3layouts\n");
      out.write("Author: W3layout\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("<title>Detalles</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/form.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function() {\n");
      out.write("            $(\".dropdown img.flag\").addClass(\"flagvisibility\");\n");
      out.write("\n");
      out.write("            $(\".dropdown dt a\").click(function() {\n");
      out.write("                $(\".dropdown dd ul\").toggle();\n");
      out.write("            });\n");
      out.write("                        \n");
      out.write("            $(\".dropdown dd ul li a\").click(function() {\n");
      out.write("                var text = $(this).html();\n");
      out.write("                $(\".dropdown dt a span\").html(text);\n");
      out.write("                $(\".dropdown dd ul\").hide();\n");
      out.write("                $(\"#result\").html(\"Selected value is: \" + getSelectedValue(\"sample\"));\n");
      out.write("            });\n");
      out.write("                        \n");
      out.write("            function getSelectedValue(id) {\n");
      out.write("                return $(\"#\" + id).find(\"dt a span.value\").html();\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            $(document).bind('click', function(e) {\n");
      out.write("                var $clicked = $(e.target);\n");
      out.write("                if (! $clicked.parents().hasClass(\"dropdown\"))\n");
      out.write("                    $(\".dropdown dd ul\").hide();\n");
      out.write("            });\n");
      out.write("\n");
      out.write("\n");
      out.write("            $(\"#flagSwitcher\").click(function() {\n");
      out.write("                $(\".dropdown img.flag\").toggleClass(\"flagvisibility\");\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("     </script>\n");
      out.write("<!-- start menu -->     \n");
      out.write("<link href=\"css/megamenu.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<script type=\"text/javascript\" src=\"js/megamenu.js\"></script>\n");
      out.write("<script>$(document).ready(function(){$(\".megamenu\").megamenu();});</script>\n");
      out.write("<!-- end menu -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.jscrollpane.min.js\"></script>\n");
      out.write("\t\t<script type=\"text/javascript\" id=\"sourcecode\">\n");
      out.write("\t\t\t$(function()\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\t$('.scroll-pane').jScrollPane();\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("<!----details-product-slider--->\n");
      out.write("\t\t\t\t<!-- Include the Etalage files -->\n");
      out.write("\t\t\t\t\t<link rel=\"stylesheet\" href=\"css/etalage.css\">\n");
      out.write("\t\t\t\t\t<script src=\"js/jquery.etalage.min.js\"></script>\n");
      out.write("\t\t\t\t<!-- Include the Etalage files -->\n");
      out.write("\t\t\t\t<script>\n");
      out.write("\t\t\t\t\t\tjQuery(document).ready(function($){\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t\t\t\t$('#etalage').etalage({\n");
      out.write("\t\t\t\t\t\t\t\tthumb_image_width: 300,\n");
      out.write("\t\t\t\t\t\t\t\tthumb_image_height: 400,\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\tshow_hint: true,\n");
      out.write("\t\t\t\t\t\t\t\tclick_callback: function(image_anchor, instance_id){\n");
      out.write("\t\t\t\t\t\t\t\t\talert('Callback example:\\nYou clicked on an image with the anchor: \"'+image_anchor+'\"\\n(in Etalage instance: \"'+instance_id+'\")');\n");
      out.write("\t\t\t\t\t\t\t\t}\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t\t// This is for the dropdown list example:\n");
      out.write("\t\t\t\t\t\t\t$('.dropdownlist').change(function(){\n");
      out.write("\t\t\t\t\t\t\t\tetalage_show( $(this).find('option:selected').attr('class') );\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t</script>\n");
      out.write("\t\t\t\t<!----//details-product-slider--->\t\n");
      out.write("<!-- top scrolling -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("   <script type=\"text/javascript\">\n");
      out.write("\t\t\n");
      out.write("\t</script>\t\t\t\t\t\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  \n");
      out.write("       ");
 ControladorProductos cp = new ControladorProductos();
      out.write("\n");
      out.write("       ");
      out.print( cp.getDetallesProductos(Integer.parseInt(request.getParameter("idproducto"))));
      out.write("\n");
      out.write("           \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\t\t $(window).load(function() {\n");
      out.write("\t\t\t$(\"#flexiselDemo1\").flexisel();\n");
      out.write("\t\t\t$(\"#flexiselDemo2\").flexisel({\n");
      out.write("\t\t\t\tenableResponsiveBreakpoints: true,\n");
      out.write("\t\t    \tresponsiveBreakpoints: { \n");
      out.write("\t\t    \t\tportrait: { \n");
      out.write("\t\t    \t\t\tchangePoint:480,\n");
      out.write("\t\t    \t\t\tvisibleItems: 1\n");
      out.write("\t\t    \t\t}, \n");
      out.write("\t\t    \t\tlandscape: { \n");
      out.write("\t\t    \t\t\tchangePoint:640,\n");
      out.write("\t\t    \t\t\tvisibleItems: 2\n");
      out.write("\t\t    \t\t},\n");
      out.write("\t\t    \t\ttablet: { \n");
      out.write("\t\t    \t\t\tchangePoint:768,\n");
      out.write("\t\t    \t\t\tvisibleItems: 3\n");
      out.write("\t\t    \t\t}\n");
      out.write("\t\t    \t}\n");
      out.write("\t\t    });\n");
      out.write("\t\t\n");
      out.write("\t\t\t$(\"#flexiselDemo3\").flexisel({\n");
      out.write("\t\t\t\tvisibleItems: 5,\n");
      out.write("\t\t\t\tanimationSpeed: 1000,\n");
      out.write("\t\t\t\tautoPlay: true,\n");
      out.write("\t\t\t\tautoPlaySpeed: 3000,    \t\t\n");
      out.write("\t\t\t\tpauseOnHover: true,\n");
      out.write("\t\t\t\tenableResponsiveBreakpoints: true,\n");
      out.write("\t\t    \tresponsiveBreakpoints: { \n");
      out.write("\t\t    \t\tportrait: { \n");
      out.write("\t\t    \t\t\tchangePoint:480,\n");
      out.write("\t\t    \t\t\tvisibleItems: 1\n");
      out.write("\t\t    \t\t}, \n");
      out.write("\t\t    \t\tlandscape: { \n");
      out.write("\t\t    \t\t\tchangePoint:640,\n");
      out.write("\t\t    \t\t\tvisibleItems: 2\n");
      out.write("\t\t    \t\t},\n");
      out.write("\t\t    \t\ttablet: { \n");
      out.write("\t\t    \t\t\tchangePoint:768,\n");
      out.write("\t\t    \t\t\tvisibleItems: 3\n");
      out.write("\t\t    \t\t}\n");
      out.write("\t\t    \t}\n");
      out.write("\t\t    });\n");
      out.write("\t\t    \n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.flexisel.js\"></script>\n");
      out.write("       <script type=\"text/javascript\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t</script>\n");
      out.write("      \n");
      out.write("</body>\n");
      out.write("</html>");
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
