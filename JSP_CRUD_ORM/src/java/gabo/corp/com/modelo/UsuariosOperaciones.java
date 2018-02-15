/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gabo.corp.com.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author gaboqm
 */
public class UsuariosOperaciones {
    
    public ArrayList<Usuarios> gerUsuarios(){
        SessionFactory sesion=HibernateUtil_.getSessionFactory();
        Session session=sesion.openSession();
        Transaction tx=session.beginTransaction();
        ArrayList<Usuarios> arreglo=new ArrayList();
        Query q=session.createQuery("from Usuarios");
        List<Usuarios> lista=q.list();
        Iterator<Usuarios> iter=lista.iterator();
        tx.commit();
        session.close();
        
        while(iter.hasNext()){
            Usuarios noti=(Usuarios) iter.next();
            arreglo.add(noti);
            
            
        }
        
        return  arreglo;
    }
    public Usuarios getUsuariosPorId(int id){
         SessionFactory sesion=HibernateUtil_.getSessionFactory();
        Session session=sesion.openSession();
        Transaction tx=session.beginTransaction();
        Usuarios usr=(Usuarios) session.get(Usuarios.class, id);
        tx.commit();
        session.close();
        return  usr;
    }
    
    public void updateUsuario(int id,String usuario,String correo){
        
        SessionFactory factory=HibernateUtil_.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        Usuarios usr=(Usuarios) session.get(Usuarios.class, id);
        usr.setUsuario(usuario);
        usr.setCorreo(correo);
        session.update(usr);
        tx.commit();
        session.close();
    }
    public void deleteusuario(int id){
        SessionFactory factory=HibernateUtil_.getSessionFactory();
                Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        Usuarios usr=(Usuarios) session.get(Usuarios.class, id);
        session.delete(usr);
        tx.commit();
        session.close();
        
    }
    public  void  addUsuario(Usuarios user){
         SessionFactory factory=HibernateUtil_.getSessionFactory();
         Session session=factory.openSession();
         Transaction tx=session.beginTransaction();
         session.save(user);
         tx.commit();
         session.close();
         
        
    }
    
    
    
    
    
}
