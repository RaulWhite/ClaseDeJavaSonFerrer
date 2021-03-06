package actividades4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Act4_1 extends JFrame {

	public static void main(String[] args) {
		
		new Act4_1();
		
	}
	
	JLabel lblFotograma;
	
	ImageIcon img1 = new ImageIcon("pelis/blackrain.jpg");
	ImageIcon img2 = new ImageIcon("pelis/elcasowinslow.jpg");
	ImageIcon img3 = new ImageIcon("pelis/asaltoaldistrito13.jpg");
	ImageIcon img4 = new ImageIcon("pelis/bladerunner.jpg");
	
	public Act4_1() {
		
		super("Fotogramas");
		setSize(600,500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JButton btn1 = new JButton("Black rain");
		JButton btn2 = new JButton("El caso Winslow");
		JButton btn3 = new JButton("Asalto al distrito 13");
		JButton btn4 = new JButton("Blade runner");
		
		lblFotograma = new JLabel(img4);
		
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblFotograma.setIcon(img1);	
			}
		});

		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblFotograma.setIcon(img2);
			}
		});
		
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblFotograma.setIcon(img3);	
			}
		});
		
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				lblFotograma.setIcon(img4);	
			}
		});
		
		JPanel botones = new JPanel(new FlowLayout());		
		
		botones.add(btn1);
		botones.add(btn2);
		botones.add(btn3);
		botones.add(btn4);
		
		add(botones, BorderLayout.NORTH);
		add(lblFotograma, BorderLayout.CENTER);
		
		setVisible(true);
		
		btn4.requestFocus();
		
	}
	
}
