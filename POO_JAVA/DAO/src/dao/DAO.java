/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author gaboqm
 */
public class DAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Persona p=new Persona();
        //p.setNombre("Naty");
        //p.setEdad(22);
       //p.setId(1);
        // p.setNombre("Gabo");
        //p.setEdad(26);
        //p.setId(1);
        try{
            DAOPersona dao= new DAOPersonaImpl();
           
        //dao.registrar(p);
       //dao.modificar(p);
       //dao.eliminar(p);
            for (Persona p : dao.listar()) {
                System.out.println("ID: "+p.getId()+" Npmbre: "+p.getNombre()+" Edad: "+p.getEdad());
            }
       
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
}
