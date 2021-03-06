package parte1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class CuadroDeDialogo extends JFrame {

	public static void main(String[] args) {
		
		new CuadroDeDialogo();
		
	}

	public CuadroDeDialogo(){
		
		super("Pruebas con cuadros de diálogo");
		setSize(350,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JButton btnMostrar = new JButton("Mostrar");
		
		btnMostrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/*Diálogo de información*/
//				JOptionPane.showMessageDialog(null, "Se han guardado los últimos cambios.", "Guardar cambios", JOptionPane.INFORMATION_MESSAGE);
				
				/*Diálogo sí no*/
//				int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres salir de la aplicación?", "Salir de la aplicación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
//				if(respuesta == JOptionPane.YES_OPTION){
//					System.exit(0);
//				}
				
				/*Diálogo con entrada de texto*/
//				String nombre = JOptionPane.showInputDialog(null, "¿Cómo te llamas?", "Nombre del usuario", JOptionPane.INFORMATION_MESSAGE);
//				System.out.println("El nombre del usuario es " + nombre);
				
				/*Diálogo con opciones personalizadas*/
				String cursos[] = {"Java", "C++", "PHP"}; 
				int opcion = JOptionPane.showOptionDialog(null, "¿Qué curso sigues?", "Cursos", 0, JOptionPane.INFORMATION_MESSAGE, null, cursos, cursos[0]);
				System.out.println(cursos[opcion]);
				
			}
		});
		
		add(btnMostrar);
		
		setVisible(true);
		
	}
	
}
