/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escribirobjetos;

import com.entidades.Empleado;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author gaboqm
 */
public class EscribirObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
         String ruta = "empleado.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        Empleado  empleado=new Empleado();
        empleado.setId(1);
        empleado.setNombre("Gabo");
        empleado.setMatricula("GQM01212");
        
        // SE PUEDE CREAR MÁS EMPLEADO Y ALMACENAR EN UN ARREGLO
        
        
        // EN ESE CASP SE RE RECPRRERIAL ELA ARREGLO DE EMPLEADO E IR AÑADIENDO AL ARCHIVO
            bw = new BufferedWriter(new FileWriter(archivo));
            String text="----------------LISTA EMPLEADO----------- \n";
            text+=" ID: "+empleado.getId()+"\n";
            text+=" Nombre: "+empleado.getNombre()+"\n";
            text+=" Matricula: "+empleado.getMatricula()+"\n";
           bw.write(text);
       
          
        bw.close();
    }
    
}
