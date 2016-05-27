package ejercicio2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Ejercicio2 extends JFrame {
	
	public static void main(String[] args) {
		
		new Ejercicio2();
		
	}
	
	public Ejercicio2() {
		
		// Propiedades de la ventana
		super("Emoticonos");
		setSize(500,250);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout()); // Border Layout para incluir la barra en la parte superior
		
		// Emoticonos
		JButton btnEmj1 = new JButton(new ImageIcon("iconos/5.png"));
		JButton btnEmj2 = new JButton(new ImageIcon("iconos/6.png"));
			// Añadir separador
		JButton btnEmj3 = new JButton(new ImageIcon("iconos/7.png"));
		JButton btnEmj4 = new JButton(new ImageIcon("iconos/8.png"));
			// Añadir separador
		JButton btnEmj5 = new JButton(new ImageIcon("iconos/9.png"));
		JButton btnEmj6 = new JButton(new ImageIcon("iconos/10.png"));
		
		// Barra de emoticonos
		JToolBar tlbEmoji = new JToolBar();
		
		// Añadir emoticonos a la barra
		tlbEmoji.add(btnEmj1);
		tlbEmoji.add(btnEmj2);
		tlbEmoji.addSeparator(); // Separador
		tlbEmoji.add(btnEmj3);
		tlbEmoji.add(btnEmj4);
		tlbEmoji.addSeparator(); // Separador
		tlbEmoji.add(btnEmj5);
		tlbEmoji.add(btnEmj6);
		
		// Área de texto
		JTextArea txtArea = new JTextArea("Esto es un cuadro para introducir texto con barras laterales.");
		
		// Scroll en el área de texto
		JScrollPane scrArea = new JScrollPane(txtArea);
		
		// Añadir las cosas a la ventana
		add(tlbEmoji, BorderLayout.NORTH);
		add(scrArea, BorderLayout.CENTER);
		
		// Mostrar ventana
		setVisible(true);
		
	}

}
