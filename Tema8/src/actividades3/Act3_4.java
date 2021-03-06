package actividades3;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * @author Raúl Blanco Rama
 */

public class Act3_4 extends JFrame {

	public static void main(String[] args) {
		
		new Act3_4();
		
	}
	
	public Act3_4() {
		
		super("Asistente matemático");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		//Componentes menú Aritmética
		JMenuItem itmSuma = new JMenuItem("Suma");
		JMenuItem itmResta = new JMenuItem("Resta");
		
		JMenuItem itmMult = new JMenuItem("Multiplicación");
		JMenuItem itmDiv = new JMenuItem("División");
		
		JMenuItem itmPorc = new JMenuItem("Porcentaje");
		
		//Menú aritmética
		JMenu menuArit = new JMenu("Aritmética");
		
		menuArit.add(itmSuma);
		menuArit.add(itmResta);
		
		menuArit.addSeparator();
		
		menuArit.add(itmMult);
		menuArit.add(itmDiv);
		
		menuArit.addSeparator();
		
		menuArit.add(itmPorc);
		
		//Componentes menú Cálculo
		JMenuItem itmDeriv = new JMenuItem("Derivada");
		JMenuItem itmInteg = new JMenuItem("Integral");
		
		JMenuItem itmTaylor = new JMenuItem("Polinomio de Taylor");
		JMenuItem itmEcDif = new JMenuItem("Ecuación diferencial");
		
		//Menú Cálculo
		JMenu menuCalc = new JMenu("Cálculo");
		
		menuCalc.add(itmDeriv);
		menuCalc.add(itmInteg);
		
		menuCalc.addSeparator();
		
		menuCalc.add(itmTaylor);
		menuCalc.add(itmEcDif);
		
		//Barra de menú
		JMenuBar barra = new JMenuBar();
		
		barra.add(menuArit);
		barra.add(menuCalc);
		
		setJMenuBar(barra);
		
		setVisible(true);
		
	}
	
}
