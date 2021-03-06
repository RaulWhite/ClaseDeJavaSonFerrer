package parte3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class TresBotones extends JFrame implements ActionListener {

	public static void main(String[] args) {
		
		new TresBotones();
		
	}
	
	JButton btnRojo;
	JButton btnNegro;
	JButton btnVerde;
	
	JLabel lblInfo;
	
	public TresBotones() {
		
		super("Pulsa un botón");
		setSize(300, 80);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		btnRojo = new JButton("Rojo");
		btnNegro = new JButton("Negro");
		btnVerde = new JButton("Verde");
		
		lblInfo = new JLabel("No has pulsado ningún botón");
		
		btnRojo.addActionListener(this);
		btnNegro.addActionListener(this);
		btnVerde.addActionListener(this);
		
		add(btnRojo);
		add(btnNegro);
		add(btnVerde);
		add(lblInfo);
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton boton = (JButton) e.getSource();
		
		if (boton == btnRojo) {
			lblInfo.setText("Has pulsado el botón Rojo");
		} else if (boton == btnNegro) {
			lblInfo.setText("Has pulsado el botón Negro");
		} else if (boton == btnVerde) {
			lblInfo.setText("Has pulsado el botón Verde");
		}
	}
	
}
