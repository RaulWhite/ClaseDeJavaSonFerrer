package ejercicio4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Ejercicio4 extends JFrame {
	
	public static void main(String[] args) {
		
		new Ejercicio4();
		
	}
	
	// Etiqueta global para evento
	private JLabel lblColor;
	
	public Ejercicio4() {
		
		// Propiedades de la ventana
		super("Letras - Colores");
		setSize(250, 80);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		// Inicializar etiqueta
		lblColor = new JLabel("COLOR");
		
		// Añadir listener (método eventoTeclado para usar KeyAdapter)
		addKeyListener(eventoTeclado);
		
		// Añadir la etiqueta a la ventana
		add(lblColor);
		
		// Mostrar ventana
		setVisible(true);
		
	}

	// Método KeyAdapter para pulsación de teclas
	// Se usa KeyAdapter ya que solo se utiliza un método del KeyListener
	KeyAdapter eventoTeclado = new KeyAdapter() {
		
		// Se usa el KeyTyped para indicar letra escrita y no tecla pulsada
		// Esto se hace para mayor compatibilidad (desconozco si en algún caso las letras tendrían otro código)
		@Override
		public void keyTyped(KeyEvent e) {
			
			// Se incluyen letras mayúsculas y minúsculas por si
			// se pulsan con modificador (Bloq. Mayús o Shift)
			
			switch (e.getKeyChar()) {
			// r para Rojo
			case 'r':
			case 'R':
				lblColor.setText("ROJO");
				lblColor.setForeground(Color.RED);
				break;
				
			// v para Verde
			case 'v':
			case 'V':
				lblColor.setText("VERDE");
				lblColor.setForeground(Color.GREEN);
				break;
				
			// a para Azul
			case 'a':
			case 'A':
				lblColor.setText("AZUL");
				lblColor.setForeground(Color.BLUE);
				break;
			}
			
		}
		
	};
	
}
