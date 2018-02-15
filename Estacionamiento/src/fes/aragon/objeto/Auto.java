package fes.aragon.objeto;

import java.awt.Image;
import java.util.Random;

public class Auto {
		private int x;
		private int y;
		private String placa;
		private Image imagen;
	
		
	
		Random random=new Random();
		
		public Auto(int X, int Y){
			this.x=X;
			this.y=Y;
			
			
		}
		
		public Image getImagen() {
			return imagen;
		}

		public void setImagen(Image imagen) {
			this.imagen = imagen;
		}

		public Auto (String placaAuto,Image i){
			this.placa=placaAuto;
			this.imagen=i;
		
		}

		public Auto() {
			// TODO Auto-generated constructor stub
		}
		public void mover() {
			int p =  random.nextInt((8 - 1 + 1)) + 1; 
		
			y = y +(-8-p);// es la velocidad con la se mueven los carros
			if (y < -50) {// delimita donde se repinta el carro
				
				y =  random.nextInt((1500 - 701 + 1)) + 701; 
			
		}
																	
			}
			
			
		public int getX() {
			return x;
		}

		public void setX(int x) {
			this.x = x;
		}

		public int getY() {
			return y;
		}

		public void setY(int y) {
			this.y = y;
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		
		
		

}
