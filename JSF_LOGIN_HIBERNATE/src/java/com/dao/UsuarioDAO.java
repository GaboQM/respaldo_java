/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.models.HibernateUtil;
import com.models.Usuario;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author gaboqm
 */
public class UsuarioDAO {
    private Session session;
    public Usuario verificarDatos(Usuario usuario) throws Exception{
       Usuario us=null;
       
       try{
           session=HibernateUtil.getSessionFactory().openSession();
           String hql="FROM Usuario WHERE nombre='"+usuario.getNombre()+"'AND clave='"+usuario.getClave()+"'";
          //String hql="FROM Usuario WHERE nombre='gabo' and clave='123'";
            Query query=session.createQuery(hql);
            if(!query.list().isEmpty()){
                us=(Usuario) query.list().get(0);
            }
            
           
           
       }catch (Exception e){
           throw  e;
       }
        
        
        return  us;
    }
    
}
