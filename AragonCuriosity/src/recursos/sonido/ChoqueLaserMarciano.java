package recursos.sonido;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class ChoqueLaserMarciano implements Runnable {
	private BufferedInputStream buffer = null;
	private Player player = null;

	public ChoqueLaserMarciano() {

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			FileInputStream archivo = new FileInputStream(this
					.getClass()
					.getResource(
							"/recursos/sonido/SonidoChoqueLaserMarciano.mp3")
					.toURI().getPath());
			buffer = new BufferedInputStream(archivo);
			player = new Player(buffer);
			player.play();

			archivo.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void choqueLaserMarciano() {
		ChoqueLaserMarciano CLMarciano = new ChoqueLaserMarciano();
		Thread hilo = new Thread(CLMarciano);
		hilo.start();
	}

}
