package parte1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class BarrasDeProgreso extends JFrame {

	public static void main(String[] args) {
		
		new BarrasDeProgreso();
		
	}
	
	public BarrasDeProgreso(){
		
		super("Barra de progreso");
		setSize(250, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JProgressBar prgComlbustible = new JProgressBar(0, 50);
		prgComlbustible.setValue(24);
		prgComlbustible.setStringPainted(true);
		prgComlbustible.setForeground(new Color(0,80,80));
		prgComlbustible.setBackground(new Color(50, 200, 150));
		
		getContentPane().setBackground(new Color(50, 50, 200));
		
		add(prgComlbustible);
		
		setVisible(true);
		
	}
	
}