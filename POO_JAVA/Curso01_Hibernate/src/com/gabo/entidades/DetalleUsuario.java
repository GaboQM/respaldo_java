/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gabo.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author gaboqm
 */
@Entity
public class DetalleUsuario {
    @Id
    private int id;
    private String user;
    private String ap;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }
    
    
}
