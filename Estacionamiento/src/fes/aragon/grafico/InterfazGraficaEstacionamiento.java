package fes.aragon.grafico;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.Random;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;


import fes.aragon.aleatorio.GenerarPlaca;
import fes.aragon.cola.Cola;
import fes.aragon.cola.ColaLista;
import fes.aragon.objeto.Auto;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;

import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.Color;

public class InterfazGraficaEstacionamiento extends JFrame implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tiempo;

	private JTextField autorechazado;
	private JTextField AutoEntrando;
	private JTextField autoSaliendo;
	Random random = new Random(); 
	Cola<Auto> cola=new ColaLista<Auto>();
	public int rechazados=0;
	private int tiempoSalida=0;
	private int contenidoEstacionamiento=0;
	private boolean opcionInicion=false;
	Image imgPortada;
	Image auto0;
	Image auto1;
	Image auto2;
	Image auto3;
	Image auto4;
	Image auto5;
	Image auto6;
	Image auto7;
	Image auto8;
	Image auto9;
	Image banderin;
	Image señal;
	public Image[] arreIma=new Image[10];
	public Image[] arreImaC=new Image[10];
	
	
	String [] cadena=new String [10];
	JTextPane texAuto = new JTextPane();

	Auto au=new Auto();
	Auto au1=new Auto();
	Auto au2=new Auto();
	Auto au3=new Auto();
	Auto au4=new Auto();
	Auto au5=new Auto();
	Auto au6=new Auto();
	Auto au7=new Auto();
	Auto au8=new Auto();
	JLabel bienvenido = new JLabel("NO HAY LUGAR");
	

	BufferedImage bi = new BufferedImage(1200,700, BufferedImage.TYPE_3BYTE_BGR);
	Graphics gbi = bi.getGraphics();
	public InterfazGraficaEstacionamiento() {
		cargar();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		ImageIcon img = new ImageIcon(this.getClass().getResource(
				"/fes/aragon/recursos/ico.png"));
		Image imagen = img.getImage();
		setIconImage(imagen);
		setTitle("ESTACIONAMIENTO");
		setResizable(false);
	
		contentPane = new JPanel();
		
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	
		setContentPane(contentPane);
		
		
		JLabel lblTiemposm = new JLabel("TIEMPO (1s=15m)");
		lblTiemposm.setForeground(Color.BLACK);
		lblTiemposm.setHorizontalAlignment(SwingConstants.CENTER);
		lblTiemposm.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		tiempo = new JTextField();
		tiempo.setEditable(false);
		tiempo.setHorizontalAlignment(SwingConstants.CENTER);
		tiempo.setFont(new Font("Franklin Gothic Medium Cond", Font.BOLD, 20));
		tiempo.setColumns(10);
		
		JButton btnIniciarSimulacion = new JButton("INICIAR SIMULACION");
		btnIniciarSimulacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				opcionInicion=true;
			
				
			}
		});
		btnIniciarSimulacion.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JLabel lblAutosRechazados = new JLabel("AUTOS RECHAZADOS");
		lblAutosRechazados.setForeground(Color.BLACK);
		lblAutosRechazados.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutosRechazados.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		autorechazado = new JTextField();
		autorechazado.setEditable(false);
		autorechazado.setHorizontalAlignment(SwingConstants.CENTER);
		autorechazado.setFont(new Font("Franklin Gothic Medium Cond", Font.BOLD, 20));
		autorechazado.setColumns(10);
		
		JLabel lblAutoEntrando = new JLabel("AUTO _ENTR\u00D3");
		lblAutoEntrando.setForeground(Color.BLACK);
		lblAutoEntrando.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutoEntrando.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblAutoSaliendo = new JLabel("AUTO_SAL\u00CDO");
		lblAutoSaliendo.setForeground(Color.BLACK);
		lblAutoSaliendo.setHorizontalAlignment(SwingConstants.CENTER);
		lblAutoSaliendo.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		AutoEntrando = new JTextField();
		AutoEntrando.setEditable(false);
		AutoEntrando.setHorizontalAlignment(SwingConstants.CENTER);
		AutoEntrando.setFont(new Font("Franklin Gothic Medium Cond", Font.BOLD, 20));
		AutoEntrando.setColumns(10);
		
		autoSaliendo = new JTextField();
		autoSaliendo.setEditable(false);
		autoSaliendo.setHorizontalAlignment(SwingConstants.CENTER);
		autoSaliendo.setFont(new Font("Franklin Gothic Medium Cond", Font.BOLD, 20));
		autoSaliendo.setColumns(10);
		
		JButton pararSimulacion = new JButton("PARAR SIMULACION");
		pararSimulacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				opcionInicion=false;
				
					bienvenido.setIcon(new ImageIcon(InterfazGraficaEstacionamiento.class.getResource("/fes/aragon/recursos/rojo.gif")));
				bienvenido.setText("NO HAY LUGAR");
			}
		});
		pararSimulacion.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JLabel NumerosAE = new JLabel("CONTENIDO (AUTOS)");
		NumerosAE.setForeground(Color.BLACK);
		NumerosAE.setHorizontalAlignment(SwingConstants.CENTER);
		NumerosAE.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		autoContedido = new JTextField();
		autoContedido.setHorizontalAlignment(SwingConstants.CENTER);
		autoContedido.setFont(new Font("Franklin Gothic Medium Cond", Font.BOLD, 20));
		autoContedido.setEditable(false);
		autoContedido.setColumns(10);
		
		JLabel lblSacarAutoN = new JLabel(" N\u00B0 DE  AUTO_SACADO");
		lblSacarAutoN.setForeground(Color.BLACK);
		lblSacarAutoN.setHorizontalAlignment(SwingConstants.CENTER);
		lblSacarAutoN.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		autoSacar = new JTextField();
		autoSacar.setHorizontalAlignment(SwingConstants.CENTER);
		autoSacar.setFont(new Font("Franklin Gothic Medium Cond", Font.BOLD, 20));
		autoSacar.setEditable(false);
		autoSacar.setColumns(10);
		texAuto.setEditable(false);
		
		
		texAuto.setFont(new Font("Tahoma", Font.BOLD, 18));
		texAuto.setBackground(SystemColor.menu);
		
		JLabel lblPosicionAuto = new JLabel("[ POSICION                 PLACA AUTO  ]");
		lblPosicionAuto.setForeground(Color.BLACK);
		lblPosicionAuto.setBackground(Color.BLUE);
		lblPosicionAuto.setHorizontalAlignment(SwingConstants.CENTER);
		lblPosicionAuto.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		bienvenido.setFont(new Font("Tahoma", Font.BOLD, 14));
		bienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		
		bienvenido.setIcon(new ImageIcon(InterfazGraficaEstacionamiento.class.getResource("/fes/aragon/recursos/rojo.gif")));
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(613, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblTiemposm, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblAutosRechazados, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblAutoEntrando, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblAutoSaliendo, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
										.addComponent(NumerosAE, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblSacarAutoN, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(autoSaliendo, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
										.addComponent(autoSacar, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
										.addComponent(autoContedido, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
										.addComponent(AutoEntrando, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
										.addComponent(autorechazado, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
										.addComponent(tiempo, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(pararSimulacion, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnIniciarSimulacion, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE)))
							.addGap(21))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPosicionAuto, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)
								.addComponent(texAuto, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE))
							.addGap(51))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(bienvenido, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
							.addGap(55))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(bienvenido, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(17)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tiempo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTiemposm))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(AutoEntrando, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAutoEntrando, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(autoSaliendo, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAutoSaliendo, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(autoContedido, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
									.addGap(6))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(NumerosAE, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(autoSacar, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblSacarAutoN, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(lblPosicionAuto, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(texAuto, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnIniciarSimulacion, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
								.addComponent(pararSimulacion, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(autorechazado, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAutosRechazados, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
							.addGap(529))))
		);
		revizarCola();
	
		contentPane.setLayout(gl_contentPane);
		Thread hilo = new Thread(this);
		hilo.start();
		
		
	}
	
	public void  cargar(){
		Toolkit tk = Toolkit.getDefaultToolkit();
		
				imgPortada = tk.getImage(getClass().getResource(
						"/fes/aragon/recursos/Estacionamiento.png"));	
				auto0 = tk.getImage(getClass().getResource(
						"/fes/aragon/recursos/auto0.png"));	
				auto1 = tk.getImage(getClass().getResource(
						"/fes/aragon/recursos/auto1.png"));	
				auto2 = tk.getImage(getClass().getResource(
						"/fes/aragon/recursos/auto8.png"));
				auto3 = tk.getImage(getClass().getResource(
						"/fes/aragon/recursos/auto2.png"));
				
				auto4 = tk.getImage(getClass().getResource(
						"/fes/aragon/recursos/auto6.png"));
					
					
					
				auto5 = tk.getImage(getClass().getResource(
						"/fes/aragon/recursos/auto4.png"));	
				auto6 = tk.getImage(getClass().getResource(
						"/fes/aragon/recursos/auto5.png"));	
				auto7 = tk.getImage(getClass().getResource(
						"/fes/aragon/recursos/auto7.png"));	
				auto8 = tk.getImage(getClass().getResource(
						"/fes/aragon/recursos/auto3.png"));
				auto9 = tk.getImage(getClass().getResource(
						"/fes/aragon/recursos/auto9.png"));
				
				
			arreImaC[0]=auto0;
			arreImaC[1]=auto1;
			arreImaC[2]=auto2;
			arreImaC[3]=auto3;
			arreImaC[4]=auto4;
			arreImaC[5]=auto5;
			arreImaC[6]=auto6;
			arreImaC[7]=auto7;
			arreImaC[8]=auto8;
			arreImaC[9]=auto9;
			
					
	
	}
	
	
	
public void moverAutos(){
	au.mover();
	au1.mover();
	au2.mover();
	au4.mover();
	au6.mover();
	au7.mover();
	
}
	public void pintarAutoAutopistas( Graphics arg){
	
		arg.drawImage(imgPortada, 0, 0,599, 699,this);
		
		arg.drawImage(auto0,45,au.getY(),45,70,this);
		arg.drawImage(auto1,100,au1.getY(),45,70,this);
		arg.drawImage(auto2,160,au2.getY(),45,70,this);
		arg.drawImage(auto6,220,au6.getY(),45,70,this);
		arg.drawImage(auto7,290,au7.getY(),45,70,this);
		arg.drawImage(auto4,346,au4.getY(),45,70,this);
		
		
	}

public void pintarAutoEstacionamiento(Graphics arg){
	
		
		arg.drawImage(arreIma[0], 430, 30,40, 65,this);
		arg.drawImage(arreIma[1], 430, 98,40, 65,this);
		arg.drawImage(arreIma[2], 430, 163,40, 65,this);
		arg.drawImage(arreIma[3], 430, 228,40, 65,this);
		arg.drawImage(arreIma[4], 430, 293,40, 65,this);
		arg.drawImage(arreIma[5], 430, 358,40, 65,this);
		arg.drawImage(arreIma[6], 430, 423,40, 65,this);
		arg.drawImage(arreIma[7], 430, 488,40, 65,this);
		arg.drawImage(arreIma[8], 430, 553,40, 65,this);
		arg.drawImage(arreIma[9], 430, 618,40, 65,this);
	
	
}

@Override
	public void paint(Graphics arg0) {
	
super.paint(gbi);
		moverAutos();
		pintarAutoAutopistas(gbi);
		pintarAutoEstacionamiento(gbi);

		arg0.drawImage(bi, 0, 0, this);
		
	}

	
	
	public int getTiempoSalida() {
		return tiempoSalida;
	}
	
	Auto sacado = new Auto();
	Auto auxiAuto=new Auto();
	
	 
	 private JTextField autoContedido;
	 private JTextField autoSacar;
	
	public int getRechazados() {
		return rechazados;
	}

	public String[] revizarCola(){
		 int w=0;
			while(w<cola.verTamano()-1){
				
				cadena[w]=cola.primerElemento().getPlaca();
				
				auxiAuto=cola.extraer();
				cola.insertar(auxiAuto);
				w +=1;
			}
			return cadena;
	}
	
	
	
	public void entradaAuto(Auto auto){
		
		if(cola.verTamano()<=10){
			 
			System.out.println(".....................Entrando el Auto "+auto.getPlaca());
			int entero = random.nextInt(10);   
			AutoEntrando.setText(auto.getPlaca());
			cola.insertar(auto);
			
		}
		else{
			
			System.out.println("Estacionamiento lleno");
rechazados +=1;

System.out.println("---------------------------------   "+rechazados+"  numero de autos rechazado");
			return;
		}
		
	}
	

	
	public void mostrarAutos( ){
		
		System.out.println("\n\tAUTO EN MI ESTACIONAMIENTO");
		tiempo.setText(""+tiempoSalida);
		System.out.println("\n\t\t Tiempo:"+tiempoSalida+"\n");
		 int w=0;
		 
		 
		 
		 
		 if(cola.verTamano()<=1){
			 {
					System.out.println("\tEL ESTACIONAMIENTO ESTA VACIO\n");
				}
				
		 }
			if(cola.verTamano()>0){
				String tx="";
				while(w<cola.verTamano()-1){
					
					System.out.println("AUTO"+" "+cola.primerElemento().getPlaca());
					
					tx +="    "+(w+1)+"              "+cola.primerElemento().getPlaca()+" \n";
					arreIma[w]=cola.primerElemento().getImagen();
					auxiAuto=cola.extraer();
					cola.insertar(auxiAuto);
			
					w +=1;
					
				}
				texAuto.setText(tx);
				autoContedido.setText(""+(w));
				
			}
			
				
			
		
	}
	
	public void salidaAuto(){
		for (int i=0;i<10;i++){
			arreIma[i]=null;
		}
		revizarCola();
		int i=0;
		 contenidoEstacionamiento=cola.verTamano()-1;
		//autoContedido.setText(""+contenidoEstacionamiento);
		System.out.println("Numero de auto en mi estacionamiento............"+contenidoEstacionamiento);
		  int entero =(int) (Math.random()*contenidoEstacionamiento); 
		  autoSacar.setText(""+(entero+1));
		 
if(contenidoEstacionamiento>0){
	 System.out.println("el numero de auto que va a salir............"+(entero+1));
	while (i<=cola.verTamano()-1){
		if(cola.primerElemento().getPlaca().compareTo(cadena[entero])==0){
			autoSaliendo.setText(cola.primerElemento().getPlaca());
			System.out.println(" Saliendo Auto "+cola.primerElemento().getPlaca());
			sacado=	cola.extraer();
			
			}else{
				auxiAuto=cola.extraer();
				cola.insertar(auxiAuto);
			}
			
			i++;
		
	}
}else{
	System.out.println("EL ESTACIONAMIENTO ESTA VACIO");
}
		
		
	}
	
	
public void verDisponibilidad(){
	if(cola.verTamano()<=10){
		bienvenido.setIcon(new ImageIcon(InterfazGraficaEstacionamiento.class.getResource("/fes/aragon/recursos/verde.gif")));
	bienvenido.setText("  BIENVENIDO   ");
	}else{
		bienvenido.setIcon(new ImageIcon(InterfazGraficaEstacionamiento.class.getResource("/fes/aragon/recursos/rojo.gif")));
	bienvenido.setText("NO HAY LUGAR");
	}
	
}
	
	
	public void hacer(){
		
		autorechazado.setText(""+rechazados);
		 int entero = random.nextInt((100 - 1 + 1)) + 1; 
		 if(entero>1 && entero <35){
			 int nImagen = random.nextInt(10);   
			// System.out.println("entrando auto");
			
			 entradaAuto(new Auto(GenerarPlaca.placa(),arreImaC[nImagen]));
		 }
		 if(entero>70&&entero<100){
			
			 if((cola.verTamano()-1)>0){
				 System.out.println("saliendo auto");
				 salidaAuto();
			 }
		 }
		 if(entero>50&&entero<70){
			 System.out.println("\n\n"+"no hace nada"+"\n\n");
		 }
	}
	
	

	
	public void simularEstacionamiento(){
		
	
		
		if(opcionInicion==true){
			
			
			
				hacer();
				verDisponibilidad();
				mostrarAutos();
				tiempoSalida +=1;
			
			
			
		}else{
			
			
		}
		
	}

	@Override
	public void run() {
		for (int i = 1; 1 >0 ;i++) {
			try {
 
				  Thread.sleep(100);
				//System.out.println(velocidad);
			} catch (Exception e) {
			}
		
			if(opcionInicion==true){
				repaint();
			}
		if(i%10==0){
				simularEstacionamiento();
			}else{
				if(i>=101){
					i=0;
				}
			}
			
			
					}
		
	}
}
