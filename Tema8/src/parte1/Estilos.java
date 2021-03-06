package parte1;

import java.awt.*;
import java.awt.event.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author Raúl Blanco Rama
 */

public class Estilos extends JFrame {

	public static void main(String[] args) {
		
		Estilos cajasDeChequo = new Estilos();
		
	}
	
	public Estilos(){
		
		super("Check Boxes");
		setSize(225,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (Exception e) {
			System.out.println("El tema de la aplicación no se ha podido cargar...");
		} 
		
		JLabel lblMensaje = new JLabel("Elige tu transporte favorito:");
		
		JCheckBox chkOpc1 = new JCheckBox("Coche", true);
		JCheckBox chkOpc2 = new JCheckBox("Moto", false);
		JCheckBox chkOpc3 = new JCheckBox("Autobús", false);
		JCheckBox chkOpc4 = new JCheckBox("Camión", true);
		
		ButtonGroup grupoBotones = new ButtonGroup();
		grupoBotones.add(chkOpc1);
		grupoBotones.add(chkOpc2);
		grupoBotones.add(chkOpc3);
		grupoBotones.add(chkOpc4);
		
		JButton btnAceptar = new JButton("Aceptar");
		
		add(lblMensaje);
		
		add(chkOpc1);
		add(chkOpc2);
		add(chkOpc3);
		add(chkOpc4);
		
		add(btnAceptar);
		
		
		setVisible(true);
		
	}
	
}
