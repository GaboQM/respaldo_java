/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author gaboqm
 */
public class DAOPersonaImpl extends Conexion implements DAOPersona{

    @Override
    public void registrar(Persona p) throws Exception {
        try{
            this.conectar();
            PreparedStatement st= this.conexion.prepareStatement("INSERT INTO persona (nombre,edad) VALUES(?,?)");
            st.setString(1, p.getNombre());
            st.setInt(2, p.getEdad());
            st.executeUpdate();
            
        }catch(Exception e){
            System.out.println(e);
        }finally{
            this.cerrar();
        }
        
    }

    @Override
    public void modificar(Persona p) throws Exception {
         try{
            this.conectar();
            PreparedStatement st= this.conexion.prepareStatement("UPDATE  persona set nombre=?,edad=? where id=?");
            
            st.setString(1, p.getNombre());
              st.setInt(2, p.getEdad());
               st.setInt(3, p.getId());
            st.executeUpdate();
            
            
        }catch(Exception e){
             System.out.println(e);
        }finally{
            this.cerrar();
        }
    }

    @Override
    public void eliminar(Persona p) throws Exception {
         try{
            this.conectar();
            PreparedStatement st= this.conexion.prepareStatement("DELETE  from persona  where id=?");
            
            st.setInt(1, p.getId());
            st.executeUpdate();
            
            
        }catch(Exception e){
             System.out.println(e);
        }finally{
            this.cerrar();
        }
    }

    
    @Override
    public List<Persona> listar() throws Exception {
        List<Persona> lista=null;
         try{
            this.conectar();
            PreparedStatement st= this.conexion.prepareStatement("SELECT * FROM persona");
            lista=new ArrayList();
             ResultSet rs=st.executeQuery();
             while(rs.next()){
                 Persona p= new Persona();
                 p.setNombre(rs.getString("nombre"));
                 p.setEdad(rs.getInt("edad"));
                 lista.add(p);
             }
            
           rs.close();
           st.close();
            
            
        }catch(Exception e){
             System.out.println(""+e);
        }finally{
            this.cerrar();
        }
        return lista;
        
    }
    
}
