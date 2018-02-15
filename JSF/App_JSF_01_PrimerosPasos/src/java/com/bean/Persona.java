/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author gaboqm
 */
@Named(value = "persona")
@RequestScoped
public class Persona {

    /**
     * Creates a new instance of Persona
     */
    private String nombre;
    private String mensaje;
    
    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    public void saludar(){
        this.mensaje="Es un gusto saludarte:"+this.nombre;
    }
}
