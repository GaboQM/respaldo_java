/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos.nodo;

/**
 *
 * @author gaboqm
 */
public class Nodo {
    private char  name;
    private int cntH=0;
    private char  sucesores[];

    public Nodo(char name, int cntH, char sucesores[]) {
        this.name = name;
        this.cntH=cntH;
        this.sucesores=sucesores;
    }

   

    
    
    public char getName() {
        return name;
    }

    public void setName(char name) {
        this.name = name;
    }

    public int getCntH() {
        return cntH;
    }

    public void setCntH(int cntH) {
        this.cntH = cntH;
    }

    public char[] getSucesores() {
        return sucesores;
    }

    public void setSucesores(char[] sucesores) {
        this.sucesores = sucesores;
    }
    
   

  
    
    
    
    
}
