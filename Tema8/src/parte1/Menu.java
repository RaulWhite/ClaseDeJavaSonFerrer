package parte1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Menu extends JFrame {

	public static void main(String[] args) {
	
		new Menu();
		
	}
	
	public Menu(){
		
		super("Ejemplo de menú");
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		new TemaNimbus(this);
		
		JMenuItem itemAbrir = new JMenuItem("Abrir");
		JMenuItem itemCerrar = new JMenuItem("Cerrar");
		JMenuItem itemGuardar = new JMenuItem("Guardar");
		JMenuItem itemGuardarComo = new JMenuItem("Guardar como...");
		JMenuItem itemSalir = new JMenuItem("Salir");
		
		JMenu menuArchivo = new JMenu("Archivo");
		menuArchivo.add(itemAbrir);
		menuArchivo.add(itemCerrar);
		menuArchivo.addSeparator();
		menuArchivo.add(itemGuardar);
		menuArchivo.add(itemGuardarComo);
		menuArchivo.addSeparator();
		menuArchivo.add(itemSalir);
		
		JMenuItem itemDeshacer = new JMenuItem("Deshacer");
		JMenuItem itemRehacer = new JMenuItem("Rehacer");
		JMenuItem itemCortar = new JMenuItem("Cortar");
		JMenuItem itemCopiar = new JMenuItem("Copiar");
		JMenuItem itemPegar = new JMenuItem("Pegar");
		
		JMenu menuEditar = new JMenu("Editar");
		menuEditar.add(itemDeshacer);
		menuEditar.add(itemRehacer);
		menuEditar.addSeparator();
		menuEditar.add(itemCortar);
		menuEditar.add(itemCopiar);
		menuEditar.add(itemPegar);
		
		JMenuBar barraMenu = new JMenuBar();
		barraMenu.add(menuArchivo);
		barraMenu.add(menuEditar);
		
		setJMenuBar(barraMenu);
		
		setVisible(true);
		
	}
	
}
