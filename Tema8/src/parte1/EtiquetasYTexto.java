package parte1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class EtiquetasYTexto extends JFrame {

	public static void main(String[] args) {
		
		EtiquetasYTexto ventana = new EtiquetasYTexto();
		
	}
	
	public EtiquetasYTexto(){
		
		super("Etiquetas");
		setSize(400,80);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JLabel lblPagina = new JLabel("Dirección de la página web:");
		
		JTextField txtPagina = new JTextField("Escribe aquí...", 30);
		
		add(lblPagina);
		add(txtPagina);
		
		setVisible(true);
		
	}
	
}