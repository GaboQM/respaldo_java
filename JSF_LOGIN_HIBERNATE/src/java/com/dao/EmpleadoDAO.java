/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.models.Empleado;
import com.models.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

/**
 *
 * @author gaboqm
 */
public class EmpleadoDAO {
    private Session session;
    private  Transaction trans;
    private List<Empleado> listEmpleado;
    
    public void registrar(Empleado emp) throws Exception{
        try{
            
            session=HibernateUtil.getSessionFactory().openSession();
            trans=session.beginTransaction();
            session.save(emp);
            trans.commit();
            
            
        }catch(Exception e){
            trans.rollback();
            throw e;
            
        }finally{
            session.close();
        }
        
    }
    
    public void eliminar(Empleado emp){
        try{
           
            session=HibernateUtil.getSessionFactory().openSession();
            trans=session.beginTransaction();
            session.delete(emp);
            trans.commit();
            
            
        }catch (Exception e){
             trans.rollback();
            throw e;
        }finally{
            session.close();
        }
    }
       public void modificar(Empleado emp){
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            trans=session.beginTransaction();
            session.update(emp);
            trans.commit();
            
            
        }catch (Exception e){
             trans.rollback();
            throw e;
        }finally{
            session.close();
        }
    }
    
    public List<Empleado> listar(){
        try{
            session=HibernateUtil.getSessionFactory().openSession();
            Criteria cri=session.createCriteria(Empleado.class);
            cri.addOrder(Order.asc("apellidos"));
            listEmpleado=cri.list();
            
        }catch(Exception e){
            throw e;
            
        }
        
        
        return listEmpleado;
    }
    
}
