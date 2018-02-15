//package fes.aragon.grafico;
//
//import java.awt.Graphics;
//import java.awt.Image;
//import java.awt.Toolkit;
//import java.awt.image.BufferedImage;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//import fes.aragon.objeto.Auto;
//
//public class Preuba extends JPanel{
//	
//	Auto au=new Auto();
//	public Preuba(){
//		cargar();
//		
//		setSize(599, 699);
//	}
//
//	Image imgPortada;
//	Image auto;
//	
//public void  cargar(){
//	Toolkit tk = Toolkit.getDefaultToolkit();
//	
//			imgPortada = tk.getImage(getClass().getResource(
//					"/fes/aragon/grafico/Estacionamiento2.png"));	
//			auto = tk.getImage(getClass().getResource(
//					"/fes/aragon/grafico/Carro1.png"));	
//	}
//	@Override
//	
//	public void paint(Graphics arg0) {
//		
//		int y=400;
//		y +=3;
//		
//		super.paint(arg0);
//		arg0.drawImage(imgPortada, 0, 0,599, 699,this);
//		arg0.drawImage(auto,300,au.getY(),this);
//		System.out.println(au.getY());
//		
//	}
//
//	public void update(Graphics g) {
//		//repintar
//		paint(g);
//	}
//	
//	public void iniciar(){
//	
//for(int i=0; i<702;i++){
//	tiempo(1);	
//	au.mover();
//	
//		repaint();
//}
//
//		
//	}
//
//	public static void tiempo(int tiempo) {
//		 
//		try{Thread.sleep(tiempo);
//		}catch(Exception err){}
//
//	}
////	public static void main(String []arg){
////		JFrame marcgo=new JFrame();
////		Preuba jpa=new Preuba();
////		
////			marcgo.setBounds(0, 0, 455, 677);
////			marcgo.setVisible(true);
////		marcgo.add(jpa);
////		int i=0;
////		while(i<1){
////			tiempo(40);
////			jpa.iniciar();
////		}
//		
//		
//		
//}
//}
