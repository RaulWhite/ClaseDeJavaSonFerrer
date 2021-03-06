package parte1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 * @author Raúl Blanco Rama
 */

public class Checkboxes extends JFrame {

	public static void main(String[] args) {
		
		Checkboxes cajasDeChequo = new Checkboxes();
		
	}
	
	public Checkboxes(){
		
		super("Check Boxes");
		setSize(350,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JCheckBox chkOpc1 = new JCheckBox("Coche", true);
		JCheckBox chkOpc2 = new JCheckBox("Moto", false);
		JCheckBox chkOpc3 = new JCheckBox("Autobús", false);
		JCheckBox chkOpc4 = new JCheckBox("Camión", true);
		
		ButtonGroup grupoBotones = new ButtonGroup();
		grupoBotones.add(chkOpc1);
		grupoBotones.add(chkOpc2);
		grupoBotones.add(chkOpc3);
		grupoBotones.add(chkOpc4);
		
		add(chkOpc1);
		add(chkOpc2);
		add(chkOpc3);
		add(chkOpc4);
		
		
		setVisible(true);
		
	}
	
}
