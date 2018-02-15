/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import beans.HolaMundoEJB;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import org.junit.After;
import org.junit.AfterClass;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author gaboqm
 */
public class HolaMundoJUnitTest {
    private static EJBContainer conetenedor;
    private static Context contexto;
    private static HolaMundoEJB  ejb;
    
    
    public HolaMundoJUnitTest() {
    }
    
    @Before
    public void iniciarContenedor() throws Exception{
        System.out.println("Iniciando EJB Container");
        conetenedor=EJBContainer.createEJBContainer();
        contexto=conetenedor.getContext();
        ejb=(HolaMundoEJB) contexto.lookup("java:global/classes/HolaMundoEJB!beans.HolaMundoEJB");
        }
    
    
    
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    // public void hello() {}
    
    public void testAddNumbers() throws Exception{
        int dato1=3;
        int dato2=5;
        int resultado=ejb.sumar(dato1, dato2);
        assertEquals((dato1+dato2),resultado);
        
        System.out.println("\n Operacion terminada, resultado  "+resultado+"\n");
    }
}
