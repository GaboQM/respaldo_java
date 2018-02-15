<%-- 
    Document   : listarProducto
    Created on : 25/12/2017, 11:53:13 PM
    Author     : gaboqm
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Producto"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%  Producto p= new Producto();
            ArrayList lista=p.listaProductos(); %>
            <h3>Lista productos</h3>
            <table border="1">
                <tr>
                    <td>ID</td>
                    <td>Nombre</td>
                    <td>Descripcion</td>
                    <td>Precio</td>
                </tr>
                <% 
                for (int i = 0; i < lista.size(); i++) {
                    p=  (Producto) lista.get(i);
                            out.println("<tr>");
                                out.println("<td>"+p.getId()+"</td>");
                                out.println("<td>"+p.getNombre()+"</td>");
                                 out.println("<td>"+p.getDescripcion()+"</td>");
                                  out.println("<td>"+p.getPrecio()+"</td>");
                            
                            out.println("</tr>");
                    
                  
                    
                    
                    }
                
                    %>
                
                
            </table>
    </body>
</html>
