<%-- 
    Document   : administracion
    Created on : 02-nov-2015, 8:48:36
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
        <h1>Panel de administracion</h1>
        <% ControladorProductos cp = new ControladorProductos();%>
        <%=cp.getPanelView() %>
        
        <br>
        <div><a href="crearproducto.jsp">Nuevo Producto</a></div>
        
    </body>
</html>
