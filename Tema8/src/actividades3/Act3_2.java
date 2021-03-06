package actividades3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Act3_2 extends JFrame {

	public static void main(String[] args) {
		
		new Act3_2();
		
	}
	
	public Act3_2() {
		
		super("Selección de modelo");
		setSize(300, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		String[] modelos = {"Peugeot", "Volkswagen", "Renault", "Seat", "Ferrari", "Porsche", "Jaguar", "Dacia", "Land Rover"};
		
		JList<String> lstModelos = new JList<>(modelos);
		JScrollPane scrModelos = new JScrollPane(lstModelos);
		
		add(scrModelos);
		add(new JLabel("Modelo?"));
		
		setVisible(true);
		
	}
	
}
