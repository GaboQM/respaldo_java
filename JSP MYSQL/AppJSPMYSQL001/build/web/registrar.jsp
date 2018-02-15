<%-- 
    Document   : registrar
    Created on : 25/12/2017, 11:52:44 PM
    Author     : gaboqm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% String msg= (String)request.getAttribute("msg"); 

        if(msg==null){
            msg="";
        }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Registrar producto</h3>
        <form action="registro.do" method="post">
        <table>
            <tr>
                <td>Nombre:</td>
                <td><input type="text" name="nombre"/> </td>
             </tr>
             <tr>
                 <td>Descripcion:</td>
                <td><input type="text"  name="descripcion"/> </td>
                 
             </tr>
             <tr>
                 <td>Precio:</td>
                 <td><input type="text" name="precio" /> </td>
             </tr>
             <tr>
                 <td colspan="2"  align="right" > <input type="submit" name="nombre" value="Registrar"/> </td>
             </tr>
                
                
            
            
        </table>
        </form>
        <%=msg%>
    </body>
</html>
