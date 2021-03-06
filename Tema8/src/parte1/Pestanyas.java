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
//		setLayout(new FlowLayout());
		
		// Panel de pestañas 1
		JPanel panelClientes = new JPanel();
		
		JButton btnAddClient = new JButton("Añadir nuevo cliente");
		JButton btnListClient = new JButton("Listar clientes");
		
		panelClientes.add(btnAddClient);
		panelClientes.add(btnListClient);
		
		ImageIcon iconClientes = new ImageIcon("icons/13.png");
		
		// Panel de pestañas 2
		JPanel panelEmpleados = new JPanel();
		
		JButton btnAddEmp = new JButton("Añadir nuevo empleado");
		JButton btnListEmp = new JButton("Listar empleados");
		
		panelEmpleados.add(btnAddEmp);
		panelEmpleados.add(btnListEmp);
		
		ImageIcon iconEmp = new ImageIcon("icons/73.png");
		
		// Panel de pestañas 3
		JPanel panelProveedores = new JPanel();
		
		JButton btnAddProv = new JButton("Añadir nuevo proveedor");
		JButton btnListProv = new JButton("Listar proveedores");
		
		panelProveedores.add(btnAddProv);
		panelProveedores.add(btnListProv);
		
		ImageIcon iconProv = new ImageIcon("icons/80.png");
		
		// Panel de pestañas global
		JTabbedPane panelPestanyas = new JTabbedPane();
		panelPestanyas.setPreferredSize(new Dimension(450,350));
		
		panelPestanyas.addTab("Clientes ", iconClientes, panelClientes);
		panelPestanyas.addTab("Empleados ", iconEmp, panelEmpleados);
		panelPestanyas.addTab("Proveedores", iconProv, panelProveedores);
		
//		panelPestanyas.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		
		add(panelPestanyas);
				
		setVisible(true);
		
	}
	
}
