<%-- 
    Document   : cliente
    Created on : 11/10/2017, 02:46:14 PM
    Author     : gaboqm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADMINISTRACION DE CLIENTES</title>
    </head>
    <body>
        <jsp:useBean id="cliBean" class="gabo.corp.com.bean.Cliente"></jsp:useBean>
        <h3>Bienvenido <jsp:getProperty property="nombre" name="cliBean"/> <jsp:getProperty property="apellido" name="cliBean"/></h3>
        <jsp:setProperty property="nombre" name="cliBean" value="Gabo" />
        <jsp:getProperty property="nombre" name="cliBean"/>
    </body>
</html>
