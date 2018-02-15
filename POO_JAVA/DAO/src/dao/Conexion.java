/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gaboqm
 */
public class Conexion {
    protected Connection conexion;
    
    private final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    private  final String DB_URL="jdbc:mysql://localhost:3306/patron_dao";
   private final  String USER="root";
   private final String PASS="";

   public void  conectar() throws ClassNotFoundException{
       try{
           
           conexion=DriverManager.getConnection(DB_URL,USER,PASS);
           Class.forName(JDBC_DRIVER);
           
       }catch(SQLException e){
           System.out.println(e);
           
       }
   }
    
   public  void cerrar() throws SQLException{
       if(conexion != null){
           if (!conexion.isClosed()) {
               conexion.close();
           }
           
       }
       
   }
    
    
    
    
}
