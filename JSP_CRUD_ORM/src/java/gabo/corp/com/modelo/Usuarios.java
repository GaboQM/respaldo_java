package gabo.corp.com.modelo;
// Generated 14/10/2017 12:45:35 AM by Hibernate Tools 4.3.1



/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private Integer id;
     private String usuario;
     private String correo;

    public Usuarios() {
    }

    public Usuarios(String usuario, String correo) {
       this.usuario = usuario;
       this.correo = correo;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }




}

