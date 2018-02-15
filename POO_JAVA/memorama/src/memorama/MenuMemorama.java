/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorama;

import java.util.Scanner;

/**
 *
 * @author gaboqm
 */
public class MenuMemorama {
    
   private int option=0; // NIvel-> 1,2, 3 salir ->0
   public void start (){
       Jugar jugar= new  Jugar();
       Scanner reader = new Scanner(System. in);
       System.out.println("Seleccione una opcion:");
       System.out.println("Nivel Uno: ------> 1");
       System.out.println("Nivel Dos: ------> 2");
        System.out.println("Nivel Tres: ------>3");
         System.out.println("Salir: ------>0");
         System.out.printf("-> ");
         
         do  { 
             option =reader.nextInt();
             
             switch (option){
                 case 1:
                     //iniciar nivel 1
                     
                    jugar.jugar(1);
                    break;
                    case 2:
                     //iniciar nivel 2
                        jugar.jugar(2);
                      
                    break;
                    case 3:
                     //iniciar nivel 3
                        jugar.jugar(3);
                      
                        
                    break;
                    
             
                    
                 
             }
                 
             } while (option!=0);
         
       
   } 
   
   
   
  
   
}
