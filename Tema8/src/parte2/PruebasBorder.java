package parte2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class PruebasBorder extends JFrame {

	public static void main(String[] args) {
		
		new PruebasBorder();
		
	}
	
	public PruebasBorder() {
		
		super("Pruebas con Border Layout");
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JButton btn1 = new JButton("NORTH");
		JButton btn2 = new JButton("WEST");
		JButton btn3 = new JButton("CENTER");
		JButton btn4 = new JButton("EAST");
		JButton btn5 = new JButton("SOUTH");
		
		add(btn1, BorderLayout.NORTH);
		add(btn2, BorderLayout.WEST);
		add(btn3, BorderLayout.CENTER);
		add(btn4, BorderLayout.EAST);
		add(btn5, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}
	
}