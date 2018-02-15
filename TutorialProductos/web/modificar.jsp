<%-- 
    Document   : modificar.jsp
    Created on : 02-nov-2015, 9:59:14
    Author     : Jonathan
--%>

<%@page import="Controlador.ControladorProductos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script src="js/jquery.min.js"></script>
        <script src="js/paneladministracion.js"></script>
    </head>
    <body>
        <h1>Modificar producto</h1>
        
        <% ControladorProductos cp = new ControladorProductos();
           int idProducto = Integer.parseInt(request.getParameter("id"));
        %>
        <%= cp.getEditViewProducto(idProducto)%>
        
        <a href="administracion.jsp">Ver productos</a>
        
    </body>
</html>
