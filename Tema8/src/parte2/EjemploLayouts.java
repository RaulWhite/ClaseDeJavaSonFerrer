package parte2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class EjemploLayouts extends JFrame {
	
	public static void main(String[] args) {
		
		new EjemploLayouts();
		
	}
	
	public EjemploLayouts() {
		super("Biblioteca");
		setSize(400,120);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(1,2));
		
		//Panel a la izquierda
		
		JPanel panelEntrada = new JPanel();
		panelEntrada.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel lblTitulo = new JLabel("Título");
		JTextField txtTitulo = new JTextField(15);
		JLabel lblAutor = new JLabel("Autor");
		JTextField txtAutor = new JTextField(15);
		
		panelEntrada.add(lblTitulo);
		panelEntrada.add(txtTitulo);
		panelEntrada.add(lblAutor);
		panelEntrada.add(txtAutor);
		
		//Botón a la derecha
		
		JButton btnAlta = new JButton("Alta");
		
		add(panelEntrada);
		add(btnAlta);
		
		setVisible(true);		
	}
	
}
