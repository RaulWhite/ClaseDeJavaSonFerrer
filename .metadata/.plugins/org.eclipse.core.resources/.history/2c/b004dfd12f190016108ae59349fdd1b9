package actividades2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Act2_4 extends JFrame {

	public static void main(String[] args) {
		
		new Act2_4();
		
	}
	
	public Act2_4() {
		
		super("Suscripción");
		setSize(250,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JLabel lblNombre = new JLabel("Nombre");
		
		JTextField txtNombre = new JTextField(20);
		
		JLabel lblEmail = new JLabel("Email");
		
		JTextField txtEmail = new JTextField(20);
		
		JLabel lblMotivo = new JLabel("Motivo por el que te suscribes");
		
		JTextArea txtMotivo = new JTextArea(7, 20);
		JScrollPane scrMotivo = new JScrollPane(txtMotivo);
		
		JButton btnEnviar = new JButton("Enviar");
		
		JCheckBox chkCorreo = new JCheckBox("Recibir información por correo", true);
		
		add(lblNombre);
		add(txtNombre);
		
		add(lblEmail);
		add(txtEmail);
		
		add(lblMotivo);
		add(scrMotivo);
		
		add(chkCorreo);
		add(btnEnviar);
		
		setVisible(true);
		
	}
	
}
