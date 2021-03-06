package actividades3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Act3_5 extends JFrame {

	public static void main(String[] args) {
		
		new Act3_5();
		
	}
	
	public Act3_5() {
		
		super("Opciones de la aplicación");
		setSize(350, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		//Panel de pestañas 1
		JPanel panelEditor = new JPanel();
		panelEditor.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JCheckBox chkClave = new JCheckBox("Resaltar palabras clave");
		JCheckBox chkXML = new JCheckBox("Guardar como XML");
		
		panelEditor.add(chkClave);
		panelEditor.add(chkXML);
		
		//Panel de pestañas 2
		JPanel panelVentanas = new JPanel();
		panelVentanas.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JCheckBox chkLaterales = new JCheckBox("Mostrar barras laterales");
		JCheckBox chkMenus = new JCheckBox("Mostrar barra de menús");
		
		panelVentanas.add(chkLaterales);
		panelVentanas.add(chkMenus);
		
		//Panel de pestañas global
		JTabbedPane panelPestanyas = new JTabbedPane();
		
		panelPestanyas.setPreferredSize(new Dimension(320, 140));
		
		panelPestanyas.addTab("Editor", new ImageIcon("icons/73.png"), panelEditor);
		panelPestanyas.addTab("Ventanas", new ImageIcon("icons/65.png"), panelVentanas);
		
		panelPestanyas.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		
		add(panelPestanyas);
		
		setVisible(true);
		
	}
	
}
