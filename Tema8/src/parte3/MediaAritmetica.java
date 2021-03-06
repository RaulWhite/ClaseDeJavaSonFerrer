package parte3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class MediaAritmetica extends JFrame implements FocusListener {

	public static void main(String[] args) {
		
		new MediaAritmetica();
		
	}
	
	JTextField txtMedia1;
	JTextField txtMedia2;
	JTextField txtMedia3;
	
	JLabel lblMedia;
	
	public MediaAritmetica() {
		
		super("Promedios");
		setSize(250, 50);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		txtMedia1 = new JTextField("0", 5);
		txtMedia2 = new JTextField("0", 5);
		txtMedia3 = new JTextField("0", 5);
		
		lblMedia = new JLabel();
		
		txtMedia1.addFocusListener(this);
		txtMedia2.addFocusListener(this);
		txtMedia3.addFocusListener(this);
		
		add(txtMedia1);
		add(txtMedia2);
		add(txtMedia3);
		add(lblMedia);
		
		setVisible(true);
		
	}

	@Override
	public void focusGained(FocusEvent e) {
		try {
			double num1 = Double.parseDouble(txtMedia1.getText());
			double num2 = Double.parseDouble(txtMedia2.getText());
			double num3 = Double.parseDouble(txtMedia3.getText());
			
			double promedio = (num1 + num2 + num3) / 3;
			
			lblMedia.setText("La media es " + promedio);
		} catch (NumberFormatException nfe) {
			lblMedia.setText("Error de entrada");
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		
	}
	
}
