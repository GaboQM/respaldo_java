package fes.aragon.aleatorio;
import java.util.Random;



public class GenerarPlaca { 
 
    public static String placa() { 
        Random random = new Random(); 
        String seriePlaca = ""; 
        for (int i = 0; i < 5; i++) { 
            int entero = random.nextInt((90 - 65 + 1)) + 65; 
            char simbolo = (char) entero; 
            seriePlaca +=simbolo; 
        } 
        seriePlaca=seriePlaca+"-";
        for (int i = 0; i < 3; i++) { 
            int entero = random.nextInt(10);             
            seriePlaca +=entero; 
        } 
         
        return seriePlaca; 
    }     
} 