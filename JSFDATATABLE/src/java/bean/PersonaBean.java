/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import clases.Persona;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author gaboqm
 */
@Named(value = "personaBean")
@RequestScoped
public class PersonaBean {

    /**
     * Creates a new instance of PersonaBean
     */
    private Persona psna = new Persona();
    private static List<Persona> listPersonas = new ArrayList();

    public PersonaBean() {
    }

    public Persona getPsna() {
        return psna;
    }

    public void setPsna(Persona psna) {
        this.psna = psna;
    }

    public List<Persona> getListPersonas() {
        return listPersonas;
    }

    public void setListPersonas(List<Persona> listPersonas) {
        PersonaBean.listPersonas = listPersonas;
    }
    
    public void agregarPersona(){
        PersonaBean.listPersonas.add(this.psna);
    }
    public void eliminarPersona(Persona psn){
        PersonaBean.listPersonas.remove(psn);
    }

}
