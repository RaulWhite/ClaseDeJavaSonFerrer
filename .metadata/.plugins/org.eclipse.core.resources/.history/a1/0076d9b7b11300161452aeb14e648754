package parte1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class BarrasScroll extends JFrame {

	public static void main(String[] args) {
		
		new BarrasScroll();
		
	}
	
	public BarrasScroll(){
		
		super("Barras de Scroll");
		setSize(300,160);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JLabel lblComentario = new JLabel("Deja un comentario");
		
		JTextArea txtComentario = new JTextArea();
		txtComentario.setLineWrap(true);
		
		JButton btnEnviar = new JButton("Enviar");
		
		JScrollPane scrComentario = new JScrollPane(txtComentario);
		scrComentario.setPreferredSize(new Dimension(250,100));
		
		add(lblComentario);
		add(scrComentario);
		add(btnEnviar);
		
		setVisible(true);
		
	}
	
}
