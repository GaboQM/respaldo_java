<%-- 
    Document   : agregar
    Created on : 14/10/2017, 02:10:58 AM
    Author     : gaboqm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta  charset="UTF-8">
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" crossorigin="anonymous">
       
        <title>Agregar USUARIO</title>
    </head>
    <body>
        <nav class="breadcrumb">
  <a class="breadcrumb-item" href="<%=request.getContextPath() %>/user">Home</a>
  <span class="breadcrumb-item active">Agregar Usuario</span>
</nav>
         <div class="container">
            <h3><center>AGREGAR USUARIOS</center></h3>
            <form name="form" action="<%=request.getContextPath() %>/agregar_post" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">USUARIO:</label>
    <input type="text" class="form-control" id="user" name="user" aria-describedby="emailHelp" placeholder="Nombre de usuario">
   
  <div class="form-group">
    <label for="exampleInputEmail1">Correo</label>
    <input type="email"  name="correo" class="form-control" id="exampleInputPassword1" placeholder="Email">
     <small id="emailHelp"  class="form-text text-muted">We'll never share your email with anyone else.</small>
  </div>
  </div>
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
          


        </div>
    </body>
</html>
