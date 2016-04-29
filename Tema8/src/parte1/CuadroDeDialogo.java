package parte1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class CuadroDeDialogo extends JFrame {

	public static void main(String[] args) {
		
		new CuadroDeDialogo();
		
	}

	public CuadroDeDialogo(){
		
		super("Pruebas con cuadros de diálogo");
		setSize(350,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JButton btnMostrar = new JButton("Mostrar");
		
		btnMostrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Se han guardado los últimos cambios.");
			}
		});
		
		add(btnMostrar);
		
		setVisible(true);
		
	}
	
}
