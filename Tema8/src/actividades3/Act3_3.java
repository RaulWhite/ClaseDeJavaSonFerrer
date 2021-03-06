package actividades3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Act3_3 extends JFrame {

	public static void main(String[] args) {
		
		new Act3_3();
		
	}
	
	public Act3_3() {
		
		super("Parámetros críticos");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JProgressBar prgCombustible = new JProgressBar(0, 100);
		prgCombustible.setValue(20);
		prgCombustible.setStringPainted(true);
		if (prgCombustible.getValue() <= 25){
			prgCombustible.setForeground(new Color(255, 0, 0));
		} else {
			prgCombustible.setForeground(new Color(0, 180, 0));
		}
		
		JProgressBar prgPresion1 = new JProgressBar(0, 100);
		prgPresion1.setValue(75);
		prgPresion1.setStringPainted(true);
		if (prgPresion1.getValue() <= 60){
			prgPresion1.setForeground(new Color(255, 0, 0));
		} else {
			prgPresion1.setForeground(new Color(0, 180, 0));
		}
		
		JProgressBar prgPresion2 = new JProgressBar(0, 100);
		prgPresion2.setValue(75);
		prgPresion2.setStringPainted(true);
		if (prgPresion2.getValue() <= 60){
			prgPresion2.setForeground(new Color(255, 0, 0));
		} else {
			prgPresion2.setForeground(new Color(0, 180, 0));
		}
		
		add(prgCombustible);
		add(new JLabel("Combustible"));
		add(prgPresion1);
		add(new JLabel("Presión motor 1"));
		add(prgPresion2);
		add(new JLabel("Presión motor 2"));
		
		setVisible(true);
		
	}
	
}
