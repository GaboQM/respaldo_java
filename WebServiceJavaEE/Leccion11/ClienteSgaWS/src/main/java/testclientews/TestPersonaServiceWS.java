/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclientews;

import clientesga.ws.Persona;
import clientesga.ws.PersonaServiceImplService;
import clientesga.ws.PersonaServiceWS;
import java.util.List;

/**
 *
 * @author gaboqm
 */
public class TestPersonaServiceWS {
    
    public static void main(String [] arg){
        PersonaServiceWS personaService= new PersonaServiceImplService().getPersonaServiceImplPort();
        System.out.println("Ejecutando servicio listar personas WS. iniciando consumo");
        List<Persona> personas=personaService.listarPersonas();
        for (Persona persona : personas) {
            System.out.println("Persona: "+persona.getNombre()+" "+persona.getApellidoPaterno());
        }
        System.out.println("Fin servicio Listar Personas WS");
        
    }
    
}
