package testclientews;

import java.util.List;

import clientesga.ws.Persona;
import clientesga.ws.PersonaServiceImplService;
import clientesga.ws.PersonaServiceWS;

public class TestPersonaServiceWS {

    public static void main(String[] args) {
        PersonaServiceWS personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
  
        System.out.println("Ejecutando Servicio Listar Personas WS");
        List<Persona> personas = personaService.listarPersonas();
        for (Persona persona : personas) {
            System.out.println("Persona: " + persona.getIdPersona() + " " + persona.getNombre() + " " + persona.getApellidoPaterno() + " " + persona.getApellidoMaterno());
        }
        System.out.println("Fin Servicio Listar Personas WS");

   
        System.out.println("\nEjecutando Servicio Encontrar Persona WS");
        Persona personaAEncontrar = new Persona();
        personaAEncontrar.setIdPersona(11);
        Persona personaEncontrada = personaService.encontrarPersonaPorId(personaAEncontrar);
        System.out.println("Persona encontrada: " + personaEncontrada.getIdPersona() + " " + personaEncontrada.getNombre() + " " + personaEncontrada.getApellidoPaterno());
        System.out.println("Fin Servicio Encontrar Persona WS");
  
        System.out.println("\nEjecutando Servicio Modificar Persona WS");
        personaEncontrada.setApellidoMaterno("Esparza");
        personaService.modificarPersona(personaEncontrada);
        System.out.println("Persona modificada: " + personaEncontrada.getIdPersona() + " " + personaEncontrada.getNombre() + " " + personaEncontrada.getApellidoPaterno());
        System.out.println("Fin Servicio Modificar Persona Persona WS");

        System.out.println("\nEjecutando Servicio Listar Personas WS");
        personas = personaService.listarPersonas();
        for (Persona persona : personas) {
            System.out.println("Persona: " + persona.getIdPersona() + " " + persona.getNombre() + " " + persona.getApellidoPaterno() + " " + persona.getApellidoMaterno());
        }
        System.out.println("Fin Servicio Listar Personas WS");
        
        System.out.println("\nEjecutando Servicio Eliminar Persona WS");
        personaService.eliminarPersona(personaEncontrada);
        System.out.println("Persona eliminada: " + personaEncontrada.getIdPersona() + " " + personaEncontrada.getNombre() + " " + personaEncontrada.getApellidoPaterno());
        System.out.println("Fin Servicio Eliminar Persona Persona WS");
        

        System.out.println("\nEjecutando Servicio Listar Personas WS");
        personas = personaService.listarPersonas();
        for (Persona persona : personas) {
            System.out.println("Persona: " + persona.getIdPersona() + " " + persona.getNombre() + " " + persona.getApellidoPaterno() + " " + persona.getApellidoMaterno());
        }
        System.out.println("Fin Servicio Listar Personas WS");

    }
}
