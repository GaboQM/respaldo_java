package clases.elementos;

public class Marciano {
	private int x;
	private int y;
	private double dx;//direccion x
	private double dy;//direccion y
	private int tam; //tamaño del marciano

	
	//primer constructor arranque inicial del marciano(marciano original)
	public Marciano() {
		x = (int) (Math.random() * 700 + 50); //posicion aleatoeria en x que va de 50 a 700
		y = (int) (Math.random() * 100 + 50); //posicion aleatoria en y que va de 50 a 100
		dx = 5;//inicialmente se deplazara a 5 pixiles en x
		dy = 0; //0 en y
		tam = 40;//tamaño  inicial del marciano
	}

	
	//este segundo  constructor sera para las nuevas generacion de los marcionos
	public Marciano(int xI, int yI, double dxI, int tamI) {
		x = xI; // recibira posicio nuevo a partise
		y = yI;// recibira posicio nuevo a partise
		dx = dxI;// recibira direccion de dezplazamiento a partirse
		tam = tamI;// el tamaño dependera ala generracion de del marciano, (inicial =40, 
	//	1° generacion=20,1°=10,3°=5 y muere jiiii
	
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getDx() {
		return dx;
	}

	public double getDy() {
		return dy;
	}

	public int getTam() {
		return tam;
	}

	public void mover(int suelo[]) {
		int dif;

		// x se le va sumando al valor de dx
		x += dx;
		// y se  le va sumando al valor de dy
		y += dy;
		
		
		dy += 0.9;//efecto de gravedad
		//System.out.println(y);
		dif = x + tam - 799;
		//System.out.println(x);
		//System.out.println(dif);
		//conctacto (rebote)  borde derecho
if (dif >= 0 && dx > 0) {
//			//x=799-dif;
//			System.out.println(x);
// 			//x = 799 - tam;
			dx = -dx;
	}
//contacto (rebote) borde izquierdo
		dif = x - tam;
		//System.out.println(dif);
		if (dif < 0 && dx < 0) {
			//x=799-dif;
			x = tam;
			dx = -dx;
		}
		
		
		//contacto (rebote) suelo
		
		dif = y + tam - suelo[x];
		//System.out.println(dif);
		if (dif > 0 && dy > 0) {
			//y=suelo[x]-dif;
			y = suelo[x] - tam;
			//para primera generacion de marciano
			if (tam > 20) {
				dy = -20;
				
			}
			//para segunda generacion de marciano
			else if (tam > 10) {
				dy = -18;
			}
			//para tercera generacion de marciano
			else {
				dy = -15;
			}

		}
	}
}
