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
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JTextArea txtComentario = new JTextArea();
		txtComentario.setLineWrap(true);
		
		JScrollPane scrComentario = new JScrollPane(txtComentario);
		scrComentario.setPreferredSize(new Dimension(400, 350));
		
		add(scrComentario);
		
		setVisible(true);
		
	}
	
}
