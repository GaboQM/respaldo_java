/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabo.corp.com.models;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author gaboqm
 */
@Named(value = "saludo")
@RequestScoped
public class Saludo {

    /**
     * Creates a new instance of Saludo
     */
        private String texto="Hola! Aqui probando desde Managed Beans";

    /**
     * Get the value of texto
     *
     * @return the value of texto
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Set the value of texto
     *
     * @param texto new value of texto
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Saludo() {
        
    }
    
}
