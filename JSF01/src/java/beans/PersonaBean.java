/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author gaboqm
 */
@Named(value = "personaBean")
@RequestScoped
public class PersonaBean {
    private String nombre;
    private String msg;

    /**
     * Creates a new instance of PersonaBean
     */
    public PersonaBean() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getMsg() {
        return msg;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public void saludar(){
        this.msg="Hola, Bienvenido "+this.nombre;
    }
    
}
