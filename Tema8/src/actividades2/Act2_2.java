package actividades2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Act2_2 extends JFrame {

	public static void main(String[] args) {
		
		new Act2_2();
		
	}
	
	public Act2_2() {
		
		super("Termostato");
		setSize(220,220);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JSlider sldTemp = new JSlider(JSlider.VERTICAL, 0, 25, 17);
		sldTemp.setMajorTickSpacing(5);
		sldTemp.setMinorTickSpacing(1);
		sldTemp.setPaintLabels(true);
		sldTemp.setPaintTicks(true);
		sldTemp.setPaintTrack(true);
		
		JLabel lblTemp = new JLabel("Temperatura (ºC)");
		
		add(sldTemp);
		add(lblTemp);
		
		setVisible(true);
		
	}
	
}
