/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.sga.cliente.transacciones;

import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import mx.com.gm.sga.domain.Persona;
import mx.com.gm.sga.servicio.PersonaServiceRemote;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author gaboqm
 */


public class PruebaManejoTransacciones {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) throws Exception {
         Properties props = new Properties();
         props.setProperty("org.omg.CORBA.ORBInitialPort", "45109");
        Context jndi = new InitialContext(props);
        PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/sga-jee/PersonaServiceImpl!mx.com.gm.sga.servicio.PersonaServiceRemote");

        log.debug("Iniciando prueba Manejo Transaccional PersonaService");

        //Buscamos un objeto persona
        Persona persona1 = personaService.encontrarPersonaPorId(new Persona(3));

        //Cambiamos la persona
       // persona1.setApellidoMaterno("Cambio con error....................................................................");
        persona1.setApellidoMaterno("Cambio sin errror");

        personaService.modificarPersona(persona1);

        log.debug("Objeto modificado:" + persona1);
        log.debug("Fin prueba EJB PersonaService");

    }
}