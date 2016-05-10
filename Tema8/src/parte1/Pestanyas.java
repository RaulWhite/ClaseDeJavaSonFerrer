package parte1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Pestanyas extends JFrame {

	public static void main(String[] args) {
		
		new Pestanyas();
		
	}
	
	public Pestanyas() {
		
		super("Paneles de pestañas");
		setSize(500,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JTabbedPane panelPestanyas = new JTabbedPane();
		panelPestanyas.setPreferredSize(new Dimension(450,350));
		
		// Panel de pestañas 1
		JPanel panelClientes = new JPanel();
		
		JButton btnAddClient = new JButton("Añadir nuevo cliente");
		JButton btnListClient = new JButton("Listar clientes");
		
		panelClientes.add(btnAddClient);
		panelClientes.add(btnListClient);
		
		ImageIcon iconClientes = new ImageIcon("icons/13.png");
		
		// Panel de pestañas global
		panelPestanyas.addTab("Clientes", iconClientes, panelClientes);
		
		add(panelPestanyas);
				
		setVisible(true);
		
	}
	
}