package parte3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Peliculas extends JFrame implements ItemListener {

	public static void main(String[] args) {
		
		new Peliculas();
		
	}
	
	JComboBox comboPeliculas;
	JLabel lblProtagonista;
	
	String[] actores = { "Michael J. Fox", "Mathew Broderick", "Harrison Ford", "Arnold Schwarzenneger" };
	
	public Peliculas() {
		
		super("Películas de ciencia ficción");
		setSize(300, 80);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		new parte1.TemaNimbus(this);
		
		String[] peliculas = {"Regreso al futuro", "Juegos de guerra", "Blade Runner", "Terminator"};
		comboPeliculas = new JComboBox(peliculas);
		comboPeliculas.addItemListener(this);
		
		lblProtagonista = new JLabel("Protagonista: " + actores[0]);
		
		add(comboPeliculas);
		add(lblProtagonista);
		
		setVisible(true);
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		int seleccionado = comboPeliculas.getSelectedIndex();
		lblProtagonista.setText("Protagonista: " + actores[seleccionado]);
	}

}
