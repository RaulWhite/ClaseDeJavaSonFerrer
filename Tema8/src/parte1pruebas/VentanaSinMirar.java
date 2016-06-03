package parte1pruebas;

import javax.swing.JFrame;

/**
 * @author Raúl Blanco Rama
 */

public class VentanaSinMirar extends JFrame {

	public static void main(String[] args) {
		
		VentanaSinMirar vsm = new VentanaSinMirar();
		
	}
	
	public VentanaSinMirar() {
		super("Ventana sin mirar");
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
