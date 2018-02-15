/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.sga.cliente;

import java.util.List;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import mx.com.gm.sga.domain.Usuario;
import mx.com.gm.sga.servicio.UsuarioServiceRemote;

/**
 *
 * @author gaboqm
 */
public class ClienteUsuarioService {
     public static void main(String[] args) {

        System.out.println("Iniciando llamada al EJB desde el cliente\n");
        try {
             Properties props = new Properties();
            props.setProperty("java.naming.factory.initial", "com.sun.enterprise.naming.SerialInitContextFactory");
            props.setProperty("java.naming.factory.url.pkgs", "com.sun.enterprise.naming");
            props.setProperty("java.naming.factory.state", "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");

           
            // optional. Default localhost. Aqui se cambia la IP del servidor donde está Glassfish
            props.setProperty("org.omg.CORBA.ORBInitialHost", "127.0.0.1");

            // optional. Puerto por Default 3700. Solo se necesita cambiar si el puerto no es 3700.
            props.setProperty("org.omg.CORBA.ORBInitialPort", "45109");
            Context jndi = new InitialContext(props);
           // Context jndi = new InitialContext();
            
            UsuarioServiceRemote usuarioService = (UsuarioServiceRemote) jndi.lookup("java:global/sga-jee/UsuarioServiceImpl!mx.com.gm.sga.servicio.UsuarioServiceRemote");

            List<Usuario> usuarios = usuarioService.listarUsuarios();

            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
            }
            System.out.println("\nFin llamada al EJB desde el cliente");
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
