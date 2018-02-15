/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.sga.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import mx.com.gm.sga.domain.Usuario;
import mx.com.gm.sga.eis.UsuarioDao;

/**
 *
 * @author gaboqm
 */

@Stateless
public class UsuarioServiceImpl implements UsuarioService,UsuarioServiceRemote{
    @Inject
    private UsuarioDao usuarioDAO;
    
            @Override
    public List<Usuario> listarUsuarios() {
        return   usuarioDAO.finAllUsuarios();
    }

    @Override
    public Usuario encontrarUsuarioId(Usuario usuario) {
        
        return usuarioDAO.finUsuarioById(usuario);
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        usuarioDAO.insertUsuario(usuario);
    }

    @Override
    public void modificarUsuario(Usuario usuario) {
        usuarioDAO.updateUsuario(usuario);
    }

    @Override
    public void eliminarUsuario(Usuario usuario) {
        usuarioDAO.deleteUsuario(usuario);
    }
    
}
