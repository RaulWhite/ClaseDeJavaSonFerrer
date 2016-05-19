package parte3;

import java.awt.*;
import java.awt.event.*;
import java.security.Key;

import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class EjemploKeyListener extends JFrame implements KeyListener {

	public static void main(String[] args) {
		
		new EjemploKeyListener();
		
	}
	
	JLabel lblTeclaPulsada;
	
	public EjemploKeyListener() {
		
		super("Ejemplo con Key Listener");
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		lblTeclaPulsada = new JLabel("Pulsa una tecla");
		
		addKeyListener(this);
		
		add(lblTeclaPulsada);
		
		setVisible(true);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		lblTeclaPulsada.setText("Has pulsado la tecla: " + e.getExtendedKeyCode());
		
		if (e.getExtendedKeyCode() == KeyEvent.VK_CONTROL){
			lblTeclaPulsada.setText("Has pulsado la tecla Ctrl");
		} else if (e.getExtendedKeyCode() == KeyEvent.VK_F1) {
			lblTeclaPulsada.setText("Has pulsado la tecla de ayuda");
		} else {
			lblTeclaPulsada.setText("Has pulsado la tecla código: " + e.getExtendedKeyCode());
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
//		lblTeclaPulsada.setText("Has pulsado: " + e.getKeyChar());
	}
	
}
