/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.sga.eis;

/**
 *
 * @author gaboqm
 */
import java.util.List;
import mx.com.gm.sga.domain.Usuario;
public interface UsuarioDao {
    
    public List<Usuario> finAllUsuarios();
    public Usuario finUsuarioById(Usuario usuario);
    public void insertUsuario(Usuario usuario);
    public void updateUsuario(Usuario usuario);
    public void deleteUsuario(Usuario usuario);
    
}
