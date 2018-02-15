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
public class Jugar {
    MatrizDimension mN= new MatrizDimension();
    Scanner reader = new Scanner(System. in);
    private int intento=0;
    
    
    public void jugar ( int nivel){

    switch(nivel){
        case 1:
            //Jugar nivel uno
            intento=0;
            startNivel(3,4);

            
            
           break;
        case 2:
            //Jugar nivel dos
            intento=0;
             startNivel(4,4);
            break;
        case 3:
            //jugar nivel tres
            intento=0;
            startNivel(5,4);
            
            break;
    }
    }
    
   
    public void startNivel(int i, int j){
        
         int [][] matrizOcultos= new int[i][j];
         int [][] matrizJuego=mN.matrizNivel(i, j);
         //test
         
         for (int k = 0; k < i; k++) {
             for (int l = 0; l < j; l++) {
                 System.out.printf("| "+matrizJuego[k][l]+" |");
             }
             System.out.println("");
        }
         
      boolean   terminado=false;
         while(!terminado){
             System.out.printf("Introduce la columna para el primer elemento : -> ");
             int opI1=reader.nextInt();
             System.out.printf("Introduce la fila para el primer elemento: -> ");
              int opI2=reader.nextInt();
             //recorrer avance de la matrizOcultos y el elemento seleccionado en la matriz Juego
             mostrarElementoSeleccionado(matrizOcultos, matrizJuego, opI1-1, opI2-1);
             System.out.printf("Introduce la columna para el segundo elemento: -> ");
             int opF1=reader.nextInt();
             System.out.printf("Introduce la fila para el segundo elemento: -> ");
              int opF2=reader.nextInt();
              //evaluar los elementos seleccionados
              intento++;
              evaluarElementosSeleccionados(matrizOcultos, matrizJuego, opI1-1, opI2-1,opF1-1,opF2-1);
             if (calcularAcierto(matrizOcultos)==(i*j)/2) {
                 terminado=true;
                 System.out.printf("!Felicidades ! Haz conluido! Seleccione otro nivel: ->");
             }
             
         }
         
        
        
    }
     
    
    public void mostrarElementoSeleccionado(int mO[][],int mJ[][], int coo_i, int coo_j){
        for (int i = 0; i < mO.length; i++) {
            for (int j = 0; j < mO[i].length; j++) {
                
                if (i==coo_i && j== coo_j) {
                     System.out.printf("| "+mJ[i][j]+" |");
                }else{
                    if (mO[i][j]==0) {
                        System.out.printf("| "+"*"+" |");
                    }else{
                         System.out.printf("| "+mO[i][j]+" |");
                    }
                }
            }
            System.out.println("");
        }
        
    }
    
    
    
    
    public void evaluarElementosSeleccionados(int mO[][],int mJ[][], int coo_i, int coo_j,int coo_i1, int coo_j2){
        
         for (int i = 0; i < mO.length; i++) {
            for (int j = 0; j < mO[i].length; j++) {
           if (i==coo_i && j== coo_j) {
                     System.out.printf("| "+mJ[i][j]+" |");
                } else if(i==coo_i1 && j== coo_j2){
                     System.out.printf("| "+mJ[i][j]+" |");
                }else{
                    if (mO[i][j]==0) {
                        System.out.printf("| "+"*"+" |");
                    }else{
                         System.out.printf("| "+mO[i][j]+" |");
                    }
                }  
                
            }
             System.out.println("");
         }
        //evaluar si los elementos seleccionado son iguales
         if (mJ[coo_i][coo_j]==mJ[coo_i1][coo_j2]) {
             //si son iguales, marcamos como acertado
             mO[coo_i][coo_j]=mJ[coo_i][coo_j];
             mO[coo_i1][coo_j2]=mJ[coo_i1][coo_j2];
             System.out.println("!Bien hecho!!");
             System.out.println("======= Acierto/Intento = "+calcularAcierto(mO)+" / "+intento);
             System.out.println("");
            
             
            
        }else{
              System.out.println("!:( Intenta de nuevo!!");
              System.out.println("======= Acierto/Intento = "+calcularAcierto(mO)+" / "+intento);
              System.out.println("");
         }
    }
    
    public int calcularAcierto(int mt[][]){
        int a=mt.length;
        int b=mt[0].length;
        int contarAcierto=0;
        for (int i = 0; i < mt.length; i++) {
            for (int j = 0; j < mt[i].length; j++) {

                if (mt[i][j]!=0) {
                    contarAcierto++;
                }
            }
        }
        return contarAcierto/2;
    }
    
    
    
    
}
