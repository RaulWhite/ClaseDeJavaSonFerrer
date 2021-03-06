package actividades2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Act2_1 extends JFrame {

	public static void main(String[] args) {
		
		new Act2_1();
		
	}
	
	public Act2_1() {
		
		super("Velocidad de crucero");
		setSize(320,80);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JSlider sldVelocidad = new JSlider(10, 120, 90);
		sldVelocidad.setMajorTickSpacing(20);
		sldVelocidad.setMinorTickSpacing(5);
		sldVelocidad.setPaintLabels(true);
		sldVelocidad.setPaintTicks(true);
		sldVelocidad.setPaintTrack(true);
		
		add(sldVelocidad);
		
		setVisible(true);
		
	}
	
}
