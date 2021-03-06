package parte1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class BarraDeHeramientas extends JFrame {

	public static void main(String[] args) {
		
		new BarraDeHeramientas();
		
	}
	
	public BarraDeHeramientas() {
		
		super("Barra de Herramientas");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		new TemaNimbus(this);
		
		JButton btnInicio = new JButton(new ImageIcon("icons/17.png"));
		JButton btnNuevo = new JButton(new ImageIcon("icons/1.png"));
		JButton btnGuardar = new JButton(new ImageIcon("icons/22.png"));
		JButton btnImprimir = new JButton(new ImageIcon("icons/16.png"));
		
		JToolBar barra = new JToolBar();
		barra.add(btnInicio);
		barra.add(btnNuevo);
		barra.add(btnGuardar);
		barra.addSeparator();
		barra.add(btnImprimir);
		
		JTextArea txtArea = new JTextArea("Escribiendo un texto...");
		txtArea.setLineWrap(true);
		
		JScrollPane scrArea = new JScrollPane(txtArea);
		
		add("North", barra);
		add("Center", scrArea);
		
		setVisible(true);
		
	}
	
}
