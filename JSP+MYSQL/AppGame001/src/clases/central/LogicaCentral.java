package clases.central;

import java.util.ArrayList;
import java.util.Hashtable;

import javax.swing.JOptionPane;


import clases.elementos.Marciano;


public class LogicaCentral {
	//http://help.adobe.com/es_ES/AS2LCR/Flash_10.0/help.html?content=00000525.html valores de codigo de los teclado estandar
	// Ecuaciones de graficacion (suelo y laser)
	//http://www.tec-digital.itcr.ac.cr/revistamatematica/HERRAmInternet/Graficador-Swing-java2D/index.html
	
	
	final int TECLA_ESPACIO=32;//cambiar de estado portada - juego y game Over a portada
	final  int TECLA_IZQUIERDA=37;// controla el movimiento de  curiosity a la izquierda
	final  int TECLA_ARRIBA=38;//dispara el laser
	final  int TECLA_DERECHA=39;// controla el movimiento de  curiosity a la derecha
	
	final  int TECLA_INTRO=10;
	final  int TECLA_ESC=27;// salimos del aplicaion
	private int punto=0;
	private String jugador;
	
	
	
	private int nEstado=0; // portada-- jugando-- gameOver
	private int nNivel=0; //0-n
	 
	
	private int y[]=new int[800];
	private float ang[]= new float[800];
	//posicion inicial en x para curiosity
	private int x=400;
	
	
	private ArrayList<Marciano> marcianos=new ArrayList();
	
	
	private int xDisparo=0;
	private float angDisparo=0;
	private int disDisparo=0;
	
	
	
	public LogicaCentral() {
		
	}
	
	
	
	
//	Hashtable s una estructura de datos que utiliza una funci�n hash para identificar datos mediante una llave o clave
	Hashtable teclas=new Hashtable();

	public int getX(){
	
		return x;
	}
//retorna el valor de los elementos del arreglo y del suelo
	public int[] getYSuelo(){
		return y;
	}
	//retorna el valor de los elementos del arrelgo angulo del suelo
	public float[] getAnguloSuelo(){
		return ang;
	}
	
	public int getEstado(){
		return nEstado;
	}
	
	public int getNivel(){
		return nNivel;
	}

	public int getXDisparo(){
		return xDisparo;
	}
	
	public int getDisDisparo(){
		return disDisparo;
	}

	public float getAngDisparo(){
		return angDisparo;
	}

	public void guardarTeclaPulsada(int codigoTecla){
		
			teclas.put(codigoTecla,"vacio");
			
		
	}
	
	public void romoverTeclaPulsada(int codigoTecla){
		
			teclas.remove(codigoTecla);
		
	}
	
	//containsKey se utiliza para la prueba si el objeto especificado es un elemento clave en esta tabla hash
	// estado inicial portada-bienvenido
	public void accionesEstado0(){
		
		
				
		
		
		if (teclas.containsKey(TECLA_ESPACIO)){
			nEstado=1;
			nNivel=0;
			disenandoSuelo();
		}
		
		if (teclas.containsKey( TECLA_ESC )){
			//salir de juego
			salir();
	}
		}
	
	
	
	//estado 1..... en accion
	public void accionesEstado1(){
		//coordenada x curiosity, movemos hacia izquierda
		if (teclas.containsKey(TECLA_IZQUIERDA)){
			x=Math.max(x-10,20);
		}		
		
		if (teclas.containsKey( TECLA_ESC )){
			
			salir();
			
}		
		
		//coordenada x curiosity, movemos hacia derecha
		if (teclas.containsKey(TECLA_DERECHA)){
			x=Math.min(x+10,780);
		}
		//
		//if (teclas.containsKey(TECLA_INTRO)){
			//nNivel++;
		//	dise�andoSuelo();
	 //}
		//dispararar
		if ( teclas.containsKey(TECLA_ARRIBA)){
			if (disDisparo==0){
				disDisparo=1;
				// posicion x de curiosity es = al de disparo
				xDisparo=x;
				angDisparo=(float)(ang[x]-Math.PI/2);
				
			}
			if (teclas.containsKey(TECLA_ESPACIO) ){
				if (disDisparo==0){
					disDisparo=1;
					xDisparo=x;
					angDisparo=(float)(ang[x]-Math.PI/2);
					
				}
			}
		}
	}
// estado 3 perdido
	public void accionesEstado2(){
		disDisparo=0; 
		
		if (teclas.containsKey(TECLA_ESPACIO)){
			
			
			nEstado=1;
			nNivel=0;
			disenandoSuelo();
			punto=0;
			
		}	
		
	if (teclas.containsKey( TECLA_ESC )){
			
			salir();
			
			
}		
	}
//se encarga de crear el orden de ejecuion de acuerdo al estado del juego
	public void acciones(){
		
		switch(nEstado){
			case 0:
				//portada llamando al metodo accionesEstado0();
				accionesEstado0();
				
				break;
				//jugando
			case 1:
				// llamando al metodo accionesEstado1();
				accionesEstado1();
				
				break;
				//juego perdido
				// llamando al metodo accionesEstado2();
			case 2:
				accionesEstado2();

		
				
				break;
		}
	}
	
	
	public void iniciarJuego(){
		//llamamos a al metodo acciones
		acciones();
		if (nEstado==1){
			for(Marciano m:marcianos){
				m.mover(y);
			}
			if (disDisparo>0 ){
				//aumento en disparo
				disDisparo+=55;
				if (Math.sin(angDisparo)*disDisparo+y[xDisparo] <50){
				//	float prueba_=(float) (Math.sin(angDisparo)*disDisparo+y[xDisparo]);
					//System.out.println(prueba_);
					disDisparo=0;
				}
			}
			//llamamos al metodo detectar coliciones
			detectarColisiones();
		}
		
	}
	
	public ArrayList<Marciano> getMarcianos(){
		return marcianos;
	}
	
	public void disenandoSuelo(){
		//medianet esta formula calculamos el valor de y inicial aleatoriamente entre 350 a 530
		//yI=0*200+350=350 ------maxima altura inicial del suelo lado izquierdo
		//y1=1*200+350------550---altura inicial minima del suelo lado izquierdo
		double yI=(Math.random()*200)+350;
		//System.out.println(yI);
		
		//obtenemos el angulo aleatoriamente entre  -0.25 a 0.25
		double angI=(float)(Math.random()*0.5-0.25);
	//	System.out.println(angI);
		
		for (int n=0;n<800;n++){
		
		//llenamos el arreglo y[n] del suelo	
			y[n]=(int)yI;
			//llenamos el ang
			ang[n]=(float)angI;
		
			//adaptamos al angulo
			angI=angI+Math.random()*0.1-0.05;
			//evitamos estar debajo del angulo  -0.25
			// obtemos el angulo mayor
			angI=Math.max(angI,-0.25);
			//evitamos estar por encima del angulo 0.25
			// obtemos el angulo menor
	      	angI=Math.min(angI,0.25);
	      	//racalculamos los puntos en y, en funcion de seno del angulo
			yI=yI+Math.sin(angI);
			//limitamos el y1, para que no este por debajo de los 600
			yI=Math.min(yI, 600);
		}
		//vaciamos el ArrayList de marciano
		marcianos.clear();
		//Agregamos marcianos  de acuerdo ala nivel
		// cada ciclo se agrega un marciano
		for (int n=0;n<=nNivel;n++){
			marcianos.add(new Marciano());
		}
		
	}
	
	
	//metodo para calcular la distancia entre dos puntos
	//distancia=la raiz cuadrada de (x2-x1)^2 +(y2-y1)^2
	public int distancia(int x, int y, int x2, int y2){
		return (int)(Math.sqrt(Math.pow(x2-x, 2)+Math.pow(y2-y,2)));
		
	}
	
	public void  detectarColisiones(){
		
		
	
		if (nEstado==1)
		for (int n=marcianos.size()-1;n>=0;n--){
			Marciano marc=marcianos.get(n);
			
			//calculando y evaluando doistancia entre el marciano y curiosity
			if (distancia(marc.getX(),marc.getY(),x,y[x])<marc.getTam()+20){
			//System.out.println(marc.getTam());
			
				
				nEstado=2;
			
				  
				
				
			
			}
			int xDis=xDisparo;
			int yDis=y[xDis];
			boolean mEliminarMarciano=false;
			//calinlanfo el las posiciones de cada uno de los puntos del laser.
			for (int m=0;m<disDisparo;m+=1){
//				for (int m=0;m<disDisparo;m+=5){// cada cinco puntos
				xDis=(int)(xDisparo+Math.cos(angDisparo)*m);
				//System.out.println(xDis);
				
				yDis=(int)(y[xDisparo]+Math.sin(angDisparo)*m);
				//System.out.println(yDis);
				//colicion marciano disparo
				if (distancia(marc.getX(),marc.getY(),xDis,yDis)<marc.getTam()){
					mEliminarMarciano=true;
					disDisparo=0;
					
				}
			}
			if (mEliminarMarciano){
				int tam=marc.getTam();
				punto=  punto+1;
				//System.out.println(punto);
				
				//reproduciendo_sonido de choque laser-marciano
				
				;
				
				
				
				 
				if (tam>10){
					// de acuerdo a la conticion
					//dividimos el marciano en dos nuevos a la miatad de su tama�o
					tam=tam/2;
					//el primer marciano se direcciona hacia la derecha
					// el segundo hacia la izquierda
					marcianos.add(new Marciano(marc.getX(), marc.getY(), 6, tam));
					marcianos.add(new Marciano(marc.getX(), marc.getY(), -6, tam));
					
					
				}
					
					
					marcianos.remove(n);
				
				
				if (marcianos.size()==0){
					nNivel++;
					
					disenandoSuelo();
					
				}
			}
			
		}
		
		
	
		
	}
	
	
	
	public int getPuntaje(){
		return punto;
	}
	

	
public void pedirUsuario(){
		
		jugador = JOptionPane.showInputDialog("\t    BIENVENID@ A AragonCuriosity   \n\n           NOMBRE DE USUARIO : " );
	
		if(jugador==null){
			System.exit(0);
		}
		
	}
	public String getJugador(){
		return jugador;
	}
	public void salir(){
		String avizoSalir=String.format("!!!!Saliendo de AragonCuriosity!!!!");
		JOptionPane.showMessageDialog(null,avizoSalir);
		System.exit(0); 
	}
	
	
	

}
