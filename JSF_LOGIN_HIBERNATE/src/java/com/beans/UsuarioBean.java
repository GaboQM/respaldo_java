/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beans;

import com.dao.UsuarioDAO;
import com.models.Usuario;
import javax.inject.Named;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author gaboqm
 */
@Named(value = "usuarioBean")
@RequestScoped
public class UsuarioBean {
    private Usuario usuario=new Usuario();
    /**
     * Creates a new instance of UsuarioBean
     */
    public UsuarioBean() {
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String verificarDatos() throws Exception{
        UsuarioDAO usrDAO=new UsuarioDAO();
        Usuario us;
        String resultado;
        try{
            
            us=usrDAO.verificarDatos(this.usuario);
            if(us != null){
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario",us);
                resultado="exito";
            }else{
                resultado="error";
            }
            
        }catch(Exception e){
            throw e;
        }
        
        return resultado;
    }
    
    public boolean verificarSession(){
        boolean estado;
        if(FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario")==null){
            estado=false;
            
        }else{
            estado=true;
            
        }
        
        
        return estado;
    }
    
    
    public String cerrarSession(){
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "index?faces-redirect=true";
    }
}
