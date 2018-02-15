/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import com.controller.CocheJpaController;
import com.entity.Coche;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author gaboqm
 */
@Named(value = "controladorCoches")
@SessionScoped
public class ControladorCoches implements Serializable {

    /**
     * Creates a new instance of ControladorCoches
     */
    Coche coche; 
    
    @PersistenceContext(unitName = "Clase12JPAPU")
    private EntityManager em;
    @Resource
    private javax.transaction.UserTransaction utx;
    CocheJpaController ccar=null;
    public ControladorCoches() {
        this.coche=new Coche();
    }
    
    public Coche getCoche(){
        
        return  coche;
    }
    
    public void crearCoche() throws Exception{
        ccar=new CocheJpaController(utx, em.getEntityManagerFactory());
        Coche car=ccar.findCoche(coche.getId());
        if(car!=null){
            
        }else{
             ccar.create(coche);
        }
       
    
    }

    public void persist(Object object) {
        try {
            utx.begin();
            em.persist(object);
            utx.commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            throw new RuntimeException(e);
        }
    }
    
}
