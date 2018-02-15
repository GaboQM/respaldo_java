/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author gaboqm
 */
public class Conexion {
    private String URL="jdbc:mysql://localhost:3306/tutorial001";
    private String Driver="com.mysql.jdbc.Driver";
    private String User="root";
    private String pass="";
    
    private  Connection conexion;
    
    public void conectar() throws ClassNotFoundException, SQLException{
        Class.forName(Driver);
        conexion= (Connection) DriverManager.getConnection(URL, User, pass);
        
    }
    
    public void desconectar() throws SQLException{
    conexion.close();
    }
    
    public Connection geConnection(){
        
        return  conexion;
    }
}
