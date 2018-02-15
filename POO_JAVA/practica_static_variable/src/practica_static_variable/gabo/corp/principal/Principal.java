/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_static_variable.gabo.corp.principal;

import practica_static_variable.gabo.corp.cliente.Cliente;

/**
 *
 * @author gaboqm
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente c1= new Cliente("Juan","Maquinaria1");
         Cliente c2= new Cliente("Juana","Maquinaria2");
          Cliente c3= new Cliente("Juanito","Maquinaria3");
           Cliente c4= new Cliente("Juanes","Maquinaria4");
           
           
           
           System.out.println("Cliente: "+c1.getNombre()+" Puesto: "+c1.getPuesto()+" ID:"+c1.getID());
            System.out.println("Cliente: "+c2.getNombre()+" Puesto: "+c2.getPuesto()+" ID:"+c2.getID());
             System.out.println("Cliente: "+c3.getNombre()+" Puesto: "+c3.getPuesto()+" ID:"+c3.getID());
              System.out.println("Cliente: "+c4.getNombre()+" Puesto: "+c4.getPuesto()+" ID:"+c4.getID());
            
    }
    
}
