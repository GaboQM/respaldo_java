/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.PreparedStatement;
import conexion.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gaboqm
 */
public class Producto {
    private int id;
    private String nombre;
    private String descripcion;
    private float  precio;

    public Producto(int id, String nombre, String descripcion, float precio) {
        this.id = id;
        this.nombre=nombre;
        this.descripcion= descripcion;
        this.precio=precio;
    }

    public Producto(String nombre, String descripcion, float precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public Producto() {
    }

    public int getId() { 
        return id;
    }

    public void setId(int id) {
        this.nombre = nombre.toUpperCase();
        this.descripcion = descripcion.toUpperCase();
        this.precio = precio;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public boolean registrarProducto(){
        boolean ok=false;
        Conexion con= new Conexion();
        
        String query="INSERT INTO producto (nombre, descripcion,precio) VALUES (?,?,?)";
        
        try {
            con.conectar();
            PreparedStatement st=(PreparedStatement) con.geConnection().prepareCall(query);
            st.setString(1,nombre);
            st.setString(2, descripcion);
            st.setFloat(3, precio);
            st.executeUpdate();
            ok=true;
            con.desconectar();
            
        } catch (ClassNotFoundException | SQLException ex) {
           
        }
        
        
        
        return  ok;
    }
    public ArrayList listaProductos(){
        ArrayList listProduc= new ArrayList();
            Conexion con= new Conexion();
            String query="SELECT * FROM producto";
        try {
            
            con.conectar();
            PreparedStatement st= (PreparedStatement) con.geConnection().prepareCall(query);
            ResultSet rs=st.executeQuery();
            
            while (rs.next()) {                
                listProduc.add(new Producto(rs.getInt(1),rs.getString(2), rs.getString(3),rs.getFloat(4)));
            }
            con.desconectar();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            return listProduc;
    }
    
    
}
