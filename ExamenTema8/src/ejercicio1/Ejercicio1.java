package ejercicio1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Ejercicio1 extends JFrame {

	public static void main(String[] args) {
		
		new Ejercicio1();
		
	}
	
	public Ejercicio1() {
		
		// Propiedades de la ventana
		super("Libreoffice");
		setSize(300,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		// Items menú formato
		JMenuItem itmLimpiarFormato = new JMenuItem("Limpiar formato directo");
			// Añadir separador
		JMenuItem itmCaracter = new JMenuItem("Carácter");
		JMenuItem itmParrafo = new JMenuItem("Párrafo");
		JMenuItem itmNumeracion = new JMenuItem("Numeración y viñetas");
			// Añadir separador
		JMenuItem itmPagina = new JMenuItem("Página");
		
		// Menú formato
		JMenu menuFormato = new JMenu("Formato");
		
		// Añadir items al menú formato
		menuFormato.add(itmLimpiarFormato);
		menuFormato.addSeparator(); // Separador
		menuFormato.add(itmCaracter);
		menuFormato.add(itmParrafo);
		menuFormato.add(itmNumeracion);
		menuFormato.addSeparator(); // Separador
		menuFormato.add(itmPagina);
		
		// Items menú tabla
		JMenuItem itmInsertar = new JMenuItem("Insertar");
		JMenuItem itmEliminar = new JMenuItem("Eliminar");
		JMenuItem itmSeleciconar = new JMenuItem("Seleccionar");
			// Separador
		JMenuItem itmUnirCeldas = new JMenuItem("Unir celdas");
		
		// Menú tabla
		JMenu menuTabla = new JMenu("Tabla");
		
		// Añadir items al menú formato
		menuTabla.add(itmInsertar);
		menuTabla.add(itmEliminar);
		menuTabla.add(itmSeleciconar);
		menuTabla.addSeparator(); // Separador
		menuTabla.add(itmUnirCeldas);
		
		// Barra de menus
		JMenuBar barra = new JMenuBar();
		
		// Añadir menús a la barra
		barra.add(menuFormato);
		barra.add(menuTabla);
		
		// Añadir la barra a la ventana
		setJMenuBar(barra);
		
		// Mostrar ventana
		setVisible(true);
		
	}
	
}
