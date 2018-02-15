/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;


/**
 *
 * @author gaboqm
 */
@Named

@RequestScoped
public class Candidato {

  //Logger log = LogManager.getRootLogger();

    private String nombre = "Introduce tu nombre";
    private String apellido = "Introduce tu Apellido";
    private int sueldoDeseado;
    private Date fechaNacimiento;

    public Candidato() {
       // log.info("Creando el objeto Candidato");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
       // log.info("Modificando la propiedad nombre:" + this.nombre);
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
       // log.info("Modificando la propiedad apellido:" + this.apellido);
    }

    public int getSueldoDeseado() {
        return sueldoDeseado;
    }

    public void setSueldoDeseado(int sueldoDeseado) {
        this.sueldoDeseado = sueldoDeseado;
       // log.info("Modificando la propiedad sueldoDeseado:" + this.sueldoDeseado);
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    
}