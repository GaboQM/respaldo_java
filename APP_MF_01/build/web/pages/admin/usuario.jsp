<%-- 
    Document   : usuario
    Created on : 10/10/2017, 02:48:17 PM
    Author     : gaboqm
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                <form action="">
            <fieldset>
                <legend>DATOS GENERALES</legend>
                <table>
                    <tr>
                        <td><label>Rol:</label></td>
                        <td><select>
                                <option value="1">Administrador</option>
                                 <option value="2">Contador</option>
                                 <option value="3">Operador</option>
                               
                            </select></td>
                    </tr>
                    <tr>
                        <td><label>Nombre de usuario:</label></td>
                        <td><input type="text" name="user"/></td>
                    </tr>
                    
                    <tr>
                        <td><label>Clave de usuario:</label></td>
                        <td><input type="password" name="key"/></td>
                    </tr>
                    
                </table>
            </fieldset>
                    <fieldset>
                          <legend>LISTAS DE USUARIOS</legend>
                          <table>
                              <tr>
                                  <td>ID</td>
                                  <td>ROL</td>
                                  <td>NOMBRE</td>
                                  <td>CLAVE</td>
                              </tr>
                              
                          </table>
                    </fieldset>
            
        </form>
    </body>
</html>
