package parte1;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class TemaNimbus {

	public TemaNimbus(JFrame a){
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(a);
		} catch (Exception e) {
			System.out.println("El tema de la aplicación no se ha podido cargar...");
		} 
	}
	
}
