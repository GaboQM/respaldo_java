/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_static_variable.gabo.corp.cliente;

/**
 *
 * @author gaboqm
 */
public class Cliente {
    
    private String nombre;
    private String puesto;
    private int ID;
    private static int IDControl=1;

    public Cliente(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.ID=IDControl;
        IDControl++;
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public int getID() {
        return ID;
    }
    
    
    
    
}
