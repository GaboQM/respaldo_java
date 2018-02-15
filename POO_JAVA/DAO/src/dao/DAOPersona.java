/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;



/**
 *
 * @author gaboqm
 */
public interface DAOPersona {
    
  
     public void registrar(Persona p) throws Exception;
      public void modificar(Persona p) throws Exception;
       public void eliminar(Persona p) throws Exception;
  public List<Persona> listar() throws Exception;
 
 
    
}
