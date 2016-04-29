package parte1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class AreasTexto extends JFrame {

	public static void main(String[] args) {
		
		new AreasTexto();
		
	}
	
	public AreasTexto(){
		
		super("Áreas de texto");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,200);
		
		setLayout(new FlowLayout());
		
		JTextArea txtMensaje = new JTextArea(10,30);
		txtMensaje.setText("Escribe aquí el comentario...");
		txtMensaje.setBackground(Color.GREEN);
		
		add(txtMensaje);
		
		setVisible(true);
		
	}
	
}
