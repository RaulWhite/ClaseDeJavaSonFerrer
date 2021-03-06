package parte1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Sliders extends JFrame {

	public static void main(String[] args) {
		
		new Sliders();
		
	}
	
	public Sliders(){
		
		super("Slider");
		setSize(500,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JSlider sldDeslizador = new JSlider(JSlider.HORIZONTAL, -50, 50, 20);
		sldDeslizador.setMajorTickSpacing(20);
		sldDeslizador.setMinorTickSpacing(2);
		sldDeslizador.setPaintLabels(true);
		sldDeslizador.setPaintTicks(true);
		sldDeslizador.setPreferredSize(new Dimension(490, 85));
		
		add(sldDeslizador);
		
		setVisible(true);
		
	}
	
}
