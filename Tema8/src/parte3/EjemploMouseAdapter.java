package parte3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class EjemploMouseAdapter extends JFrame {

	public static void main(String[] args) {
		
		new EjemploMouseAdapter();
		
	}
	
	private JLabel lblMensaje;
	
	public EjemploMouseAdapter() {
		
		super("Ejemplo de MouseAdapter");
		setSize(400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		lblMensaje = new JLabel("Clícame");
		
		addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblMensaje.setText("Has hecho click");
			}
			
		});
		
		add(lblMensaje);
		
		setVisible(true);
		
	}
	
}
