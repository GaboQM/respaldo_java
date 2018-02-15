package clases.interfaz;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.awt.Font;


import javax.swing.JFrame;


import clases.central.LogicaCentral;
import clases.elementos.Marciano;

public class PintadoAragonCuriosity extends JFrame implements Runnable {

	Image imgMarciano;
	Image imgCuriosity;
	Image imgPantallas[] = new Image[4];
	Image imgPortada;
	
	/* 
	 ---algoritmo--
	 frame
	 gameloop
	 update()
	 pintar()
	 sleep()
	 
	 */

	LogicaCentral base = new LogicaCentral();

	BufferedImage bi = new BufferedImage(800, 600, BufferedImage.TYPE_3BYTE_BGR);
	Graphics gbi = bi.getGraphics();

	// Etapa 2
	public void cargarImagenes() {
		base.pedirUsuario();

		Toolkit tk = Toolkit.getDefaultToolkit();

		imgMarciano = tk.getImage(getClass().getResource(
				"/recursos/grafico/Marciano.png"));
		imgCuriosity = tk.getImage(getClass().getResource(
				"/recursos/grafico/Curiosity.gif"));
		for (int n = 0; n < 4; n++)
			imgPantallas[n] = tk.getImage(getClass().getResource(
					"/recursos/grafico/Pantalla0" + (n + 1) + ".jpg"));
		imgPortada = tk.getImage(getClass().getResource(
				"/recursos/grafico/Portada.jpg"));

		// System.out.println(imgPantallas);

	}

	public void pintarCuriosity(Graphics g) {
		int x = base.getX(); // valor definido en la clase logica central,x=400, se coloca en medio
		int y[] = base.getYSuelo();//el valor de y se obtiene del suelo
		float ang[] = base.getAnguloSuelo(); //el mismo angulo que el de suelo
		BufferedImage biCuriosity = new BufferedImage(200, 150,
				BufferedImage.TYPE_4BYTE_ABGR);// creamos buffer imagen
		//para poder rotar usamos Graphis2D
		Graphics2D g2d = (Graphics2D) biCuriosity.getGraphics();
		g2d.rotate(ang[x], 100, 100); //rotamos 
		//dibujamos curiosity
		g2d.drawImage(imgCuriosity, 50, 0, this);
		//dibujasmo en el graphics general
		g.drawImage(biCuriosity, x - 100, y[x] + 15 - 100, this);

		// cordenada de curiosity
		// System.out.println((x-100)+","+( y[x] + 15-100));

	}

	public void pintarPuntaje(Graphics g) {
		
		//imagenes de fondo de puntaje(trasparente)
		Toolkit tk2 = Toolkit.getDefaultToolkit();
		Image puntuacion = tk2.getImage(getClass().getResource(
				"/recursos/grafico/puntaje.png"));
		g.drawImage(puntuacion, 145, 565, this);
//font nos permite personalizar los texto
		Font fuente = new Font("Arial", Font.BOLD, 18);
		g.setFont(fuente);
		g.setColor(Color.YELLOW);
		String texto = "JUGADOR:                            "
				+ "NIVEL:                 " + "PUNTAJE:                    ";
		g.drawString(texto, 170, 590);
		g.setColor(Color.WHITE);

		String jugadorNombre = base.getJugador();
		g.drawString(jugadorNombre, 270, 590);
		String numeroNivel = "" + (base.getNivel() + 1);
		g.drawString(numeroNivel, 470, 590);
		String numeroPuntaje = "" + (base.getPuntaje());

		g.drawString(numeroPuntaje, 645, 590);

	}

public void pintarMarcianos(Graphics g) {
	
		ArrayList<Marciano> marcianos = base.getMarcianos();
		//recorremos el ArrayList marciano
		for (Marciano marc : marcianos) {
			int tam = marc.getTam();
			//dibujamos un  marciano por cada ciclo
			g.drawImage(imgMarciano, marc.getX() - tam, marc.getY() - tam,
					tam * 2, tam * 2, this);
		
		}
	}

	public void pintarDisparo(Graphics g) {

		int dis = base.getDisDisparo(); //distancia de disparo
		if (dis > 0) {
			int x = base.getXDisparo();
			float ang = base.getAngDisparo();
			int suelo[] = base.getYSuelo();
			int xI = x;// inicion del dispro en x
			int yI = suelo[x];// inicion de disparo en y de acuerdo al posicion x
			int xF = (int) (xI + Math.cos(ang) * dis); //x final
			int yF = (int) ((yI - 50) + Math.sin(ang) * dis);// y final

			for (int n = 0; n < 6; n++) {
				if (n % 2 == 0) {
					// Color color1=new Color(255,40,37);
				// colores para  las lineas (pares)
					g.setColor(Color.red);
				
					// g.setColor(color1);
				} else {
					Color color2 = new Color(244, 91, 89);
//pintamos las lineas impares
					g.setColor(color2);

				}
				g.drawLine(xI + n - 2, yI - 35, xF, yF);
			}
			


		}

	}

	public void pintarSuelo(Graphics g) {

		// añadimos nuestros propios colores RGB
		Color marron = new Color(146, 76, 25);
		Color cafe = new Color(139, 69, 19);
		int y[] = base.getYSuelo();

		// colocamos la imagen paisajaes a 250 mas alto que la posicion y[300]
		// del suelo.
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image img = tk.getImage(getClass().getResource(
				"/recursos/grafico/Paisaje.png"));
		g.drawImage(img, 0, y[300] - 250, this);
		for (int n = 0; n < 800; n++) {
			// dibujamos el suelo mediante linea
			// dibujamos la primera parte del suelo la mas alta(un poco claro)
			g.setColor(marron);
			g.drawLine(n, 600, n, y[n]);
			// encimamos a 30 pixiles menos el suelo con color mas fuerte para
			// generar el efecto del suelo
			g.setColor(cafe);
			g.drawLine(n, 600, n, y[n] + 30);

		}

	}

	public void pintarScort(Graphics g) {

		if (base.getEstado() == 2) {
			Toolkit tk2 = Toolkit.getDefaultToolkit();
			Image puntuacion = tk2.getImage(getClass().getResource(
					"/recursos/grafico/puntuacion.png"));
			// g.drawImage(img,-30,-80, this);
			g.drawImage(puntuacion, 150, 100, this);
			Font fuente = new Font("Arial", Font.BOLD, 16);
			g.setFont(fuente);
			g.setColor(Color.YELLOW);
			String jugadorPuntuacion = base.getJugador()
					+ "                                               "
					+ base.getPuntaje();
			g.drawString(jugadorPuntuacion, 260, 300);
			String nivel = "Nivel : "+"                                                "+(base.getNivel()+1);
		
                           g.drawString(nivel, 260, 320);
			
                                String despedida=" Gracias por jugar ,";
                                String despedida1="      espero que te haya gustado      ";
                                String despedida2="  la batalla";
			
			g.drawString(despedida, 270, 380);
			g.drawString(despedida1, 280, 400);
			g.drawString(despedida2, 490, 420);
			
			g.setColor(Color.WHITE);
			Font fuente2 = new Font("Arial", Font.BOLD, 14);
			g.setFont(fuente2);
                                String indica="   [ PULSA LA TECLA ESPACIO PARA";
                                String indica2="      CONTINUAR O ESC PARA SALIR]";
			g.drawString(indica, 280, 460);
			g.drawString(indica2, 280, 474);
		} else {

		}

	}

	public void pintarNodrisa(Graphics g) {

		Toolkit tk = Toolkit.getDefaultToolkit();
		//ruta de nodrisas
		Image nodrisa1 = tk.getImage(getClass().getResource(
				"/recursos/grafico/nodrisa.png"));
		Image nodrisa2 = tk.getImage(getClass().getResource(
				"/recursos/grafico/nodrisa2.png"));
		Image nodrisa3 = tk.getImage(getClass().getResource(
				"/recursos/grafico/nodrisa3.png"));
		// g.drawImage(img,-30,-80, this);
		//dibujamos nodrisa
		g.drawImage(nodrisa1, -160, -40, this);
		g.drawImage(nodrisa2, 300, 60, this);
		g.drawImage(nodrisa3, 550, -30, this);

	}

	public void update(Graphics g) {
		//repintar
		paint(g);
	}

	// etapa3, cargar portada
	public void paint(Graphics g) {
		// estado, pregutamos el estado,para saber que pintar
		switch (base.getEstado()) {
		case 0:
			//cargando todas las imagenes
			 for (int n = 0; n < imgPantallas.length; n++){
			gbi.drawImage(imgPantallas[n], 0, 0, this);

			 }
			gbi.drawImage(imgPortada, 0, 0, this);
			break;
		case 1:
		case 2:
			gbi.drawImage(imgPantallas[base.getNivel() % 4], 0, 0, this);
			// System.out.println(0%4);=0
			// System.out.println(1%4);=1
			// System.out.println(2%4);=2
			// System.out.println(3%4);=3
			// System.out.println(4%4);=0
			// ......
//pintado
			pintarSuelo(gbi);

			pintarNodrisa(gbi);
			
			pintarDisparo(gbi);
			pintarPuntaje(gbi);
			pintarCuriosity(gbi);
			pintarMarcianos(gbi);
			
			pintarScort(gbi);
			break;
		}
		g.drawImage(bi, 0, 0, this);
	}

	public PintadoAragonCuriosity() {
		Toolkit herram = Toolkit.getDefaultToolkit();
		Dimension tamanoPanta = herram.getScreenSize();
		int posicionX = tamanoPanta.height;
		int posicionY = tamanoPanta.width;
		// this.setResizable(false);

		this.setSize(800, 600);
		this.setLocation(posicionX / 3, posicionY / 10);
		this.setUndecorated(true);
		this.setTitle("AragonCuriosity");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		cargarImagenes();

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyPressed(e);
				//
				base.guardarTeclaPulsada(e.getKeyCode());
				// codigo pulsado
				// System.out.println(e.getKeyCode());
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				super.keyReleased(e);

				// al liberar o solar tecla, remover de hastable
				base.romoverTeclaPulsada(e.getKeyCode());
			}
		});

		Thread hilo = new Thread(this);
		hilo.start();

		

	}

	public void run() {

		// ciclo infinito que mantiene activo la ejecucion
		for (int i = 0; i < 10;) {
			try {
 int velocidad=70 - (base.getNivel() * 4);
				  Thread.sleep(velocidad);
				//System.out.println(velocidad);
			} catch (Exception e) {
			}
			base.iniciarJuego();
			repaint();
		}
	}
}
