<%-- 
    Document   : index
    Created on : 12/01/2016, 01:26:11 PM
    Author     : gaboqm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <%!private String msg; %>
    <% msg="Saludando desde un Scriptlet";%>
    <body>
        <h1><%= msg%> </h1>
    </body>
</html>
