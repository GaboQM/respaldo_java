package test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import model.Persona;

public class HolaMundoHibernate {

    public static void main(String[] args) {
        String hql = "SELECT p FROM Persona p ";
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("HibernateEjemplo1");
        EntityManager entityManager = fabrica.createEntityManager();
        Query query = entityManager.createQuery(hql);
        List<Persona> list = query.getResultList();
        for (Persona p : list) {
            System.out.println("persona:" + p);
        }
    }
}
