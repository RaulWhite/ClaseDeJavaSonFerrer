package actividades1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Actividades1 extends JFrame{

	public static void main(String[] args) {
		
		new Actividades1();
		
	}
	
	public Actividades1() {
		
		super("Actividades 1 GUI");
		setSize(350,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JButton ej1Btn = new JButton("Ejercicio 1");
		JButton ej2Btn = new JButton("Ejercicio 2");
		JButton ej3Btn = new JButton("Ejercicio 3");
		JButton ej4Btn = new JButton("Ejercicio 4");
		JButton ej5Btn = new JButton("Ejercicio 5");
		
		ej1Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null,
											 "¿Formater el disco duro?",
											 "Confirmación de formateo",
											 JOptionPane.OK_CANCEL_OPTION,
											 JOptionPane.WARNING_MESSAGE);
				}
		});
		
		ej2Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showInputDialog(null,
										   "Escribe tu DNI:",
										   "Confirmación de identidad",
										   JOptionPane.QUESTION_MESSAGE);
			}
		});

		ej3Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
											 "Se ha detectado un escaneo de red desde la IP 192.168.1.51",
											 "Alerta de seguridad",
											 JOptionPane.WARNING_MESSAGE);
			}
		});

		ej4Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String series[] = {"Futurama", "Los Simpson", "Héroes"};
				JOptionPane.showOptionDialog(null,
											"Haz clic en tu serie favorita",
											"Elección de serie",
											0,
											JOptionPane.INFORMATION_MESSAGE,
											null,
											series,
											series[2]);
			}
		});

		ej5Btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String hostings[] = {"Apache", "IIS", "Nginx", "Node.JS"};
				JOptionPane.showOptionDialog(null,
											"¿Qué servidor web desea para su hosting?",
											"Elección de servidor web",
											0,
											JOptionPane.INFORMATION_MESSAGE,
											null,
											hostings,
											hostings[1]);
			}
		});
		
		add(ej1Btn);
		add(ej2Btn);
		add(ej3Btn);
		add(ej4Btn);
		add(ej5Btn);
		
		setVisible(true);
		
	}
}
