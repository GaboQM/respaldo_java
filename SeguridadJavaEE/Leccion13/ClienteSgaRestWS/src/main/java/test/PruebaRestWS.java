/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author gaboqm
 */

import domain.Persona;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

public class PruebaRestWS {

    public static void main(String[] args) {
        
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basicBuilder()
            .nonPreemptive()
            .credentials("admin", "admin")
            .build();

        ClientConfig clientConfig = new ClientConfig();
        clientConfig.register(feature) ;

        Client cliente = ClientBuilder.newClient(clientConfig);

        WebTarget webTarget = cliente.target("http://localhost:45152/SgaJeeWeb/webservice").path("/personas");
        //Proporcionamos un idPersona valido
        Persona persona = webTarget.path("/12").request(MediaType.APPLICATION_XML).get(Persona.class);
        System.out.println("Persona recuperada: " + persona);

    }
}