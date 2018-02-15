/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

/**
 *
 * @author gaboqm
 */
import com.sun.enterprise.security.ee.auth.login.ProgrammaticLogin;
import java.util.List;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServiceRemote;

public class ClientePersonaService {

    public static void main(String[] args) {

        System.out.println("Iniciando llamada al EJB desde el cliente\n");

        String authFile = "login.conf";
        System.setProperty("java.security.auth.login.config", authFile);
       
        ProgrammaticLogin programmaticLogin = new ProgrammaticLogin();
        programmaticLogin.login("admin", "admin".toCharArray());

        try {
            Properties props = new Properties();
             // optional. Puerto por Default 3700. Solo se necesita cambiar si el puerto no es 3700.
            props.setProperty("org.omg.CORBA.ORBInitialPort", "45109");
            Context jndi = new InitialContext(props);
            //Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/SgaJeeWeb/PersonaServiceImpl!mx.com.gm.sga.servicio.PersonaServiceRemote");

            List<Persona> personas = personaService.listarPersonas();

            for (Persona persona : personas) {
                System.out.println(persona);
            }
            System.out.println("\nFin llamada al EJB desde el cliente");
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
}