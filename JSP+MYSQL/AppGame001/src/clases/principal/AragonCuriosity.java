package clases.principal;
import clases.interfaz.PintadoAragonCuriosity;

public class AragonCuriosity {
	

	

public static void main(String[]  args) {
	PintadoAragonCuriosity jugar=new PintadoAragonCuriosity();	
	
	jugar.setVisible(true);

	

	}

	
	}

// La dinamica del juego consiste en dispararle a los marcianos con el laser, 
// cuando los marciano se le dispara por primera ocacion se divide en dos (mitad de su  tamaño original), 
// y en la segunda ocacion, sucede lo mismo, los amrcianos se divide en dos, y hasta en el tercer disparo los marcianos mueren(desaparecen)
// cuando se acaba el numero de marciano,nos pasamos al siguiente nivel.
//por cada nivel se aumenta un marciano
//1er nivel == 1  marciano
//2° nivel==2 marciano
//3° nivel==3 marciano
// ademas por cada nivel los marciano como curiosity aumenta sus velocidades.

