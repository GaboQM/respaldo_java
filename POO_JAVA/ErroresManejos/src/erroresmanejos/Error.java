/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erroresmanejos;

import javax.swing.JOptionPane;

/**
 *
 * @author gaboqm
 */
public class Error {

    /**
     * @param args the command line arguments
     */
    //
    public static void main(String[] args) {
        // TODO code application logic here
        int []  matriz= new int [5];
        matriz[0]=1;
        matriz[1]=-234;
        matriz[2]=34;
        matriz[3]=67;
        matriz[4]=12;
        //matriz[5]=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Posicion"+i+" ="+matriz[i]);
        }
        
        
        String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("Introduce tu edad"));
        System.out.println("Tu nombre es: "+nombre+" Edad:"+edad ); // error a ingresar string o char
    }
    
}
