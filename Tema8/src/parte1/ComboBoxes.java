package parte1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class ComboBoxes extends JFrame {

	public static void main(String[] args) {
		
		new ComboBoxes();
		
	}
	
	public ComboBoxes(){
		
		super("Elige tu vehículo");
		setSize(300,70);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JComboBox<String> desplegable = new JComboBox<>();
		desplegable.addItem("Coche");
		desplegable.addItem("Moto");
		desplegable.addItem("Autobús");
		desplegable.addItem("Camión");
		
		add(desplegable);
		
		setVisible(true);
		
	}
	
}
