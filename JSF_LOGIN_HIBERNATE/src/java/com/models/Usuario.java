package com.models;
// Generated 25/10/2017 01:07:16 AM by Hibernate Tools 4.3.1



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer codUser;
     private String nombre;
     private String clave;

    public Usuario() {
    }

    public Usuario(String nombre, String clave) {
       this.nombre = nombre;
       this.clave = clave;
    }
   
    public Integer getCodUser() {
        return this.codUser;
    }
    
    public void setCodUser(Integer codUser) {
        this.codUser = codUser;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }




}


