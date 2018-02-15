/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso01_hibernate;

import com.gabo.entidades.DetalleUsuario;
import org.hibernate.Session;

/**
 *
 * @author gaboqm
 */
public class Curso01_Hibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DetalleUsuario usuario= new DetalleUsuario();
         usuario.setUser("Gabo");
         usuario.setAp("Quiros");
               
        Session session = HibernateUtil.getSessionfactory().getCurrentSession();
        
        session.beginTransaction();
        session.save(usuario);
        session.getTransaction().commit();        
        HibernateUtil.getSessionfactory().close();
    }
    
}
