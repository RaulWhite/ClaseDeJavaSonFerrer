package actividades3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Act3_1 extends JFrame {

	public static void main(String[] args) {
		
		new Act3_1();
		
	}
	
	public Act3_1() {
		
		super("Planificador personal");
		setSize(400,150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		JButton btnNuevo = new JButton(new ImageIcon("icons/1.png"));
		JButton btnGrafica = new JButton(new ImageIcon("icons/11.png"));
		JButton btnGuardar = new JButton(new ImageIcon("icons/22.png"));
		JButton btnIdea = new JButton(new ImageIcon("icons/3.png"));
		
		JButton btnCalendario = new JButton(new ImageIcon("icons/44.png"));
		JButton btnFoto = new JButton(new ImageIcon("icons/66.png"));
		JButton btnVideo = new JButton(new ImageIcon("icons/67.png"));
		
		JButton btnAjustes = new JButton(new ImageIcon("icons/73.png"));
		
		JToolBar barra = new JToolBar();
		
		barra.add(btnNuevo);
		barra.add(btnGrafica);
		barra.add(btnGuardar);
		barra.add(btnIdea);
		
		barra.addSeparator();
		
		barra.add(btnCalendario);
		barra.add(btnFoto);
		barra.add(btnVideo);
		
		barra.addSeparator();
		
		barra.add(btnAjustes);
		
		add(barra, BorderLayout.NORTH);
		
		setVisible(true);
		
	}
	
}
