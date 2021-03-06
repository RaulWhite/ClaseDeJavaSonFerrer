package parte3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class DosBotones extends JFrame implements ActionListener {

	public static void main(String[] args) {
		
		new DosBotones();
		
	}
	
	JButton btnRojo;
	JButton btnAzul;
	JLabel lblInfo;
	
	public DosBotones() {
		
		super("Pulsa un botón");
		setSize(250,80)	;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		btnRojo = new JButton("Rojo");
		btnAzul = new JButton("Azul");
		lblInfo = new JLabel("No has pulsado todavía");
		
		btnRojo.addActionListener(this);
		btnAzul.addActionListener(this);
		
		add(btnRojo);
		add(btnAzul);
		add(lblInfo);
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton) e.getSource();
		
		if (boton == btnRojo){
			lblInfo.setText("Se ha pulsado un botón Rojo");
		} else if (boton == btnAzul) {
			lblInfo.setText("Se ha pulsado un botón Azul");
		}
	}
	
}
