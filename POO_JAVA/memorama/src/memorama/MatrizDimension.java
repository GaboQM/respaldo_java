/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memorama;

import java.util.Random;

/**
 *
 * @author gaboqm
 */
public class MatrizDimension {
 private int [][] matriz;
    
    public MatrizDimension() {
        
        
    }
    
    
    
    public int aleatorio (int Max){
        Random al= new Random();
        int num=0; 
        
            num=(int) (Math.random() *Max) + 1; 
        return num;
    }
    
    public int  cantidadElemento( int elemento){
       
        int ct=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j]==elemento) {
                    ct++;
                } 
                
            }
            
        }
        
        
        return ct;
    }
    
    public int [][] matrizNivel(int i,int j){
        matriz=new int[i][j];
        for (int k = 0; k < i; k++) {
            int l=0;
            
            while (l<j) {                
                 int a=aleatorio((i*j)/2);
                //System.out.println("Elemnto"+a+" status :"+evaluarCompleto( a));
               // System.out.println("k: "+k+" l: "+l);
                if (cantidadElemento(a)<2) {
                    matriz[k][l]=a;
                    l++;
                    
                }
            }
            
        }
        return  matriz;
    }


      
    
    
}
