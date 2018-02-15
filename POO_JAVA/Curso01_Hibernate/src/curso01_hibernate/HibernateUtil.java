/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso01_hibernate;

import javax.imageio.spi.ServiceRegistry;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory object.
 *
 * @author gaboqm
 */
public class HibernateUtil {

    private static final SessionFactory sessionfactory = buildSessionFactory();
        
private static SessionFactory buildSessionFactory() {
        
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            ServiceRegistry serviceregistry = (ServiceRegistry) new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();                    
            SessionFactory sessionfactory = configuration.buildSessionFactory((org.hibernate.service.ServiceRegistry) serviceregistry);
            return sessionfactory;
        } catch (Throwable e) {
            System.out.println("La creación de Session Factory a fallado "+e) ;
            throw new ExceptionInInitializerError();
        }        
    }

    public static SessionFactory getSessionfactory() {
        return sessionfactory;
    }
}
