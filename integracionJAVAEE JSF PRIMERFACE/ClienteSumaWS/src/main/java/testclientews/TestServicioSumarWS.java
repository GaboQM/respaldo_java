/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclientews;

import clientews.servicio.ServicioSumarImplService;
import clientews.servicio.ServicioSumarWS;

/**
 *
 * @author gaboqm
 */
public class TestServicioSumarWS {
        
    public static void main( String [] arg){
        ServicioSumarWS servicioSumar=new ServicioSumarImplService().getServicioSumarImplPort();
        System.out.println("Ejecutando servicio sumar ws");
        int x=1;
        int y=3;
        System.out.println("Sumar: "+x+" + "+y+" = "+servicioSumar.sumar(x, y));
        System.out.println("Fin servicio sumar WS");
    
    }
    
}
