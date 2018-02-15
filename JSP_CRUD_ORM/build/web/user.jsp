<%-- 
    Document   : user
    Created on : 14/10/2017, 12:48:30 AM
    Author     : gaboqm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
    <head>
        <meta  charset="UTF-8">
        <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" crossorigin="anonymous">
    
    <script type="text/javascript" src="<%=request.getContextPath() %>/resource/js/delete.js" ></script>
    <title>CRUD_JSP_HIBERNATE</title>
    </head>
    <body>
               <nav class="breadcrumb">
  <a class="breadcrumb-item" href="<%=request.getContextPath() %>/user">Home</a>
  <span class="breadcrumb-item active">Agregar Usuario</span>
</nav>
        <div class="container">
            <h3><center>USUARIOS</center></h3>
            <p>
                <a href="<%=request.getContextPath() %>/agregar" class="btn btn-success"> Agregar</a>
            </p>
        <table class="table">
  <thead class="thead-inverse">
   
    <tr>
      <th>ID</th>
      <th>USUARIO</th>
      <th>CORREO</th>
      <th>ACCION</th>
    </tr>
  </thead>
  <tbody>
         <c:forEach var="user" items="${users}">
          <tr>
     
      <td><c:out value="${user.getId()}"/></td>
      <td><c:out value="${user.getUsuario()}"/></td>
      <td><c:out value="${user.getCorreo()}"/></td>
      <td><a href="<%=request.getContextPath() %>/update?id=<c:out value="${user.getId()}"/>"><span class="fa fa-pencil " aria-hidden="true" >EDITAR</span> </a>
          <a href="javascript:void(0)" onclick="elim()">ELIMINAR</a>
      </td>
      
      
    </tr>
          
          
      </c:forEach>
    
   
   
  </tbody>
</table>


        </div>
    </body>
</html>
