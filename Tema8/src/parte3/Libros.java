package parte3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Libros extends JFrame implements ItemListener {

	public static void main(String[] args) {
		
		new Libros();
		
	}
	
	JComboBox comboLibros;
	JLabel lblEscritor;
	
	String[] escritores = { "J. K. Rowling", "George R. R. Martin", "J. R. R. Tolkien" };
	
	public Libros() {
		
		super("Libro y autor");
		setSize(300, 80);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		String[] libros = { "Harry Potter", "Juego de tronos", "El señor de los anillos" };
		comboLibros = new JComboBox(libros);
		
		lblEscritor = new JLabel("Escritor: " + escritores[0]);
		
		comboLibros.addItemListener(this);
		
		add(comboLibros);
		add(lblEscritor);
		
		setVisible(true);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int seleccionado = comboLibros.getSelectedIndex();
		lblEscritor.setText("Escritor: " + escritores[seleccionado]);
	}
	
}
