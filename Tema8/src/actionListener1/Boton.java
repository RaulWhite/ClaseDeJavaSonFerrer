package actionListener1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Boton extends JFrame {

	public static void main(String[] args) {
		
		new Boton();
		
	}
	
	public Boton(){
		
		super("Eventos con Botones");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JButton btnBoton = new JButton("Púlsame");
		btnBoton.addActionListener(new GestorEventos());
		
		JLabel lblMensaje = new JLabel("Aún no has pulsado...");
		
		add(btnBoton);
		add(lblMensaje);
		
		setVisible(true);
		
	}
	
}
