package actividades4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeListener;

/**
 * @author Raúl Blanco Rama
 */

public class Act4_4 extends JFrame {

	public static void main(String[] args) {
		
		new Act4_4();
		
	}
	
	JSlider sldR;
	JSlider sldG;
	JSlider sldB;
	
	JButton btnMuestra;
	
	JTextField txtHex;
	
	public Act4_4() {
		
		super("Paleta");
		setSize(220, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		JLabel lblRojo = new JLabel("Rojo");
		JLabel lblVerde = new JLabel("Verde");
		JLabel lblAzul = new JLabel("Azul");
		
		sldR = new JSlider(0, 255, 255);
		sldG = new JSlider(0, 255, 200);
		sldB = new JSlider(0, 255, 51);
		
		sldR.setMajorTickSpacing(50);
		sldR.setMinorTickSpacing(25);
		sldR.setPaintLabels(true);
		sldR.setPaintTicks(true);
		sldR.addMouseListener(eventoRaton);
		
		sldG.setMajorTickSpacing(50);
		sldG.setMinorTickSpacing(25);
		sldG.setPaintLabels(true);
		sldG.setPaintTicks(true);
		sldG.addMouseListener(eventoRaton);
		
		sldB.setMajorTickSpacing(50);
		sldB.setMinorTickSpacing(25);
		sldB.setPaintLabels(true);
		sldB.setPaintTicks(true);
		sldB.addMouseListener(eventoRaton);
		
		btnMuestra = new JButton("                ");
		btnMuestra.setBackground(new Color(255, 200, 51));
		
		txtHex = new JTextField("#FFC833", 6);
		txtHex.setEditable(false);
		
		add(lblRojo);
		add(sldR);
		
		add(lblVerde);
		add(sldG);
		
		add(lblAzul);
		add(sldB);
		
		add(btnMuestra);
		add(txtHex);
		
		setVisible(true);
		
	}
	
	MouseAdapter eventoRaton = new MouseAdapter() {
		public void mouseReleased(MouseEvent e) {
			btnMuestra.setBackground(new Color(sldR.getValue(), sldG.getValue(), sldB.getValue()));
			txtHex.setText("#" + Integer.toHexString(0x100 | sldR.getValue()).substring(1).toUpperCase() 
								+ "" + Integer.toHexString(0x100 | sldG.getValue()).substring(1).toUpperCase() 
								+ "" + Integer.toHexString(0x100 | sldB.getValue()).substring(1).toUpperCase());
			}
	};
	
}
