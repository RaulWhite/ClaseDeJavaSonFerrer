package ejercicio3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Ejercicio3 extends JFrame implements FocusListener {

	public static void main(String[] args) {
		
		new Ejercicio3();
		
	}
	
	// Campos de texto globales para evento
	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	
	public Ejercicio3() {
		
		// Propiedades de la ventana
		super("Texto decorado");
		setSize(350,50);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		// Inicializar campos de texto
		txt1 = new JTextField(8);
		txt2 = new JTextField(8);
		txt3 = new JTextField(8);
		
		// Añadir el listener de foco
		txt1.addFocusListener(this);
		txt2.addFocusListener(this);
		txt3.addFocusListener(this);
		
		// Añadir los camps de texto a la ventana
		add(txt1);
		add(txt2);
		add(txt3);
		
		// Mostrar ventana
		setVisible(true);
		
	}

	// Método para foco ganado (fondo amarillo)
	@Override
	public void focusGained(FocusEvent e) {
		JTextField txtFoco = (JTextField)e.getSource();
		txtFoco.setBackground(Color.YELLOW);
	}

	// Método para foco perdido (fondo blanco)
	@Override
	public void focusLost(FocusEvent e) {
		JTextField txtNoFoco = (JTextField)e.getSource();
		txtNoFoco.setBackground(Color.WHITE);
	}
	
}
