<%-- 
    Document   : index
    Created on : 12/01/2018, 01:44:32 PM
    Author     : gaboqm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>
    <body>
        <h1>REGISTRO</h1>
        <form name="form" action="vista.jsp" method="post">
            <p>
            Nombre:<input type="text" name="name"/>    
            </p>
            <p>
          Email:<input type="text" name="email"/>    
            </p>
            <p>
                Pais: 
                <select name="pais"> 
                    <option value="Mexico">México</option>
                    <option value="Colombia">Colombia</option>
                    <option value="Venezuela">Venezuela</option>
                    <option value="Chile">Chile</option>
                </select>
            </p>
            <p>
                Sexo: M <input type="radio"  value="Masculino" name="sexo"/> F <input type="radio" value="Femenino" name="sexo"/>
            </p>
            
            <p>
            <hr/> 
            <input type="submit" value="enviar"/>
            </p>
            
        </form>
    </body>
</html>
