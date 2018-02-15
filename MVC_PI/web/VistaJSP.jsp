<%-- 
    Document   : VistaJSP
    Created on : 10/10/2017, 01:53:35 AM
    Author     : gaboqm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="temp" items="${listaP}">
            ${temp}<br>
            
        </c:forEach>
    </body>
</html>
