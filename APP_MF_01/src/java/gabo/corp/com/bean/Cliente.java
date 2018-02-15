/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabo.corp.com.bean;

import java.util.List;

/**
 *
 * @author gaboqm
 * clase de control de formulario
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private List<String> valores;
    
    public Cliente(){
        this.nombre="Gabriel";
        this.apellido="Quiroga";
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public List<String> getValores() {
        return valores;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setValores(List<String> valores) {
        this.valores = valores;
    }
    
    
}
