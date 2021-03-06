package parte3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Coordenadas extends JFrame implements MouseListener {

	public static void main(String[] args) {
		
		new Coordenadas();
		
	}
	
	private JLabel lblCoor;
	private JLabel lblBtn;
	
	public Coordenadas() {
		
		super("Coordenadas");
		setSize(500, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		lblCoor = new JLabel("Haz clic en la ventana");
		lblBtn = new JLabel("");
		
		addMouseListener(this);
		
		add(lblCoor);
		add(lblBtn);
		
		setVisible(true);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int x = e.getX(), y = e.getY();
		
		lblCoor.setText("Coordenadas: (" + x + ", " + y + ")");
		
		if (e.getButton() == MouseEvent.BUTTON1) {
			lblBtn.setText("Click izquierdo");
		} else if (e.getButton() == MouseEvent.BUTTON2) {
			lblBtn.setText("Click central");
		} else if (e.getButton() == MouseEvent.BUTTON3) {
			lblBtn.setText("Click derecho");
		}
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
	}
	
}
