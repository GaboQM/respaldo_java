<%-- 
    Document   : vista
    Created on : 12/01/2018, 01:56:56 PM
    Author     : gaboqm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrando Resultado</title>
    </head>
    <body>
        <h1>Tu infomación son:</h1>
        <p>ip: <%=request.getRemoteAddr() %></p>
        <p>server: <%=request.getServerName()%></p>
        <p>nombre es: <%= request.getParameter("name")%> </p>
        <p>email: <%= request.getParameter("email")%> </p>
          <p>Pais: <%= request.getParameter("pais")%> </p>
          <p>Sexo: <%= request.getParameter("sexo")%> </p>
    </body>
</html>
