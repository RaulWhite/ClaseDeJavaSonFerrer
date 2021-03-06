package parte1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class BotonesGraficos extends JFrame {

	public static void main(String[] args) {
		
		new BotonesGraficos();
		
	}
	
	public BotonesGraficos(){
		
		super("Botones Gráficos");
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		new TemaNimbus(this);
		
		setLayout(new FlowLayout());
		
		ImageIcon img1 = new ImageIcon("icons/10.png");
		
		JButton btn1 = new JButton(img1);
		JButton btn2 = new JButton("Gráfica", new ImageIcon("icons/74.png"));
		
		add(btn1);
		add(btn2);
		
		setVisible(true);
		
	}
	
}
