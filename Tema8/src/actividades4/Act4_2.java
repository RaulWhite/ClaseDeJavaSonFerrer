package actividades4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Act4_2 extends JFrame implements ItemListener {

	public static void main(String[] args) {
		
		new Act4_2();
		
	}
	
	private JLabel lblSelect;
	private String[] cursos = { "Selecciona un curso", "1º ESO", "2º ESO", "3º ESO", "4º ESO" };
	private JComboBox<String> cmbCurso;
	
	public Act4_2() {
		
		super("Matrícula");
		setSize(250, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel lblApellidos = new JLabel("Apellidos");
		JLabel lblNombre = new JLabel("Nombre");
		JLabel lblCurso = new JLabel("Curso");
		
		JTextField txtApellidos = new JTextField(20);
		JTextField txtNombre = new JTextField(20);
		
		cmbCurso = new JComboBox<String>(cursos);
		cmbCurso.addItemListener(this);
		
		lblSelect = new JLabel("");
		
		add(lblApellidos);
		add(txtApellidos);
		
		add(lblNombre);
		add(txtNombre);
		
		add(lblCurso);
		add(cmbCurso);
		
		add(lblSelect);
		
		setVisible(true);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int i = cmbCurso.getSelectedIndex();
		if (i != 0){
			lblSelect.setText("Curso: " + cursos[i].toString());
		} else if (i == 0){
			lblSelect.setText("");
		}
	}
	
}