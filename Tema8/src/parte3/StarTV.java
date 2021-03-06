package parte3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class StarTV extends JFrame implements KeyListener {

	public static void main(String[] args) {
		
		new StarTV();
		
	}
	
	int x = 50, y = 50;
	JLabel lblMovil;
	
	public StarTV() {
		
		super("StarTV");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		ImageIcon imgMovil = new ImageIcon("icons/67.png");
		lblMovil = new JLabel(imgMovil);
		lblMovil.setBounds(x, y, 24, 24);
		
		addKeyListener(this);
		
		add(lblMovil);
		
		setVisible(true);
		
	}

	@Override
	public void keyPressed(KeyEvent e) {		
		switch (e.getExtendedKeyCode()) {
		case KeyEvent.VK_UP:
		case KeyEvent.VK_W:
			y-=5;
			break;
		case KeyEvent.VK_DOWN:
		case KeyEvent.VK_S:
			y+=5;
			break;
		case KeyEvent.VK_LEFT:
		case KeyEvent.VK_A:
			x-=5;
			break;
		case KeyEvent.VK_RIGHT:
		case KeyEvent.VK_D:
			x+=5;
			break;
		}
		
		lblMovil.setBounds(x, y, 24, 24);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
//		char pulsado = e.getKeyChar();
//		System.out.println(pulsado);
//		switch (pulsado) {
//		case 'w':
//			y-=5;
//			break;
//		case 's':
//			y+=5;
//			break;
//		case 'a':
//			x-=5;
//			break;
//		case 'd':
//			x+=5;
//			break;
//		}
//		
//		lblMovil.setBounds(x, y, 24, 24);
	}
	
}
