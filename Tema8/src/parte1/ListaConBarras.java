package parte1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class ListaConBarras extends JFrame {

	public static void main(String[] args) {
		
		new ListaConBarras();
		
	}
	
	public ListaConBarras() {
	
		super("Lista con barras");
		setSize(300, 175);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		String asignaturas[] = { "Programación", "Bases de Datos", "Sistemas informáticos",
								"Lenguajes de marcas", "FOL", "Entornos de Desarrollo"};
		
		JList<String> lstAsignaturas = new JList<>(asignaturas);
		JScrollPane panelAsignaturas = new JScrollPane(lstAsignaturas);
		panelAsignaturas.setPreferredSize(new Dimension(200, 80));
		
		add(panelAsignaturas);
		
		setVisible(true);
		
	}
	
}
