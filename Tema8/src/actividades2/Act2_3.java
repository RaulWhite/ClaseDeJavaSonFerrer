package actividades2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Act2_3 extends JFrame {

	public static void main(String[] args) {
		
		new Act2_3();
		
	}
	
	public Act2_3() {
		
		super("Comentarios");
		setSize(300,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JLabel lblDejar = new JLabel("Deja un comentario");
		
		String comentario = "En un lugar de la mancha, de cuyo nombre no quiero acordarme...";
		
		JTextArea txtComent = new JTextArea(comentario, 5, 20);
		
		JScrollPane scrComent = new JScrollPane(txtComent);
		
		JButton btnEnviar = new JButton("Enviar");
		
		add(lblDejar);
		add(scrComent);
		add(btnEnviar);
		
		setVisible(true);
		
	}
	
}
