/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author gaboqm
 */
@WebService(serviceName = "ServicioTest")
public class ServicioTest {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getEjemplo")
    public String getEjemplo(@WebParam(name = "texto1") String texto1, @WebParam(name = "texto2") String texto2) {
        //TODO write your implementation code here:
        return "Texto 1 =: "+texto1+ "<br /> texto 2: "+texto2;
    }
    
}
