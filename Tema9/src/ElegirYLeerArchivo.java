import javax.swing.filechooser.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

/**
 * @author Raúl Blanco Rama
 */

public class ElegirYLeerArchivo extends JFrame {

	public static void main(String[] args) {
		
		new ElegirYLeerArchivo();
		
	}
	
	JTextArea txtArea;
	
	public ElegirYLeerArchivo() {
		
		super("Elegir y leer archivo");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setLayout(new FlowLayout());
		
		JMenuItem itmAbrir = new JMenuItem("Abrir");
		itmAbrir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				abrirCuadroDialogo();
			}
		});
		
		JMenuItem itmGuardar = new JMenuItem("Guardar como...");
		itmGuardar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				guardarCuadroDialogo();
			}
		});
		
		JMenu menuArchivo = new JMenu("Archivo");
		menuArchivo.add(itmAbrir);
		menuArchivo.add(itmGuardar);
		
		JMenuBar barra = new JMenuBar();
		barra.add(menuArchivo);
		
		setJMenuBar(barra);
		
		txtArea = new JTextArea();
		JScrollPane scrArea = new JScrollPane(txtArea);
		
		add(scrArea);
		
		setVisible(true);
		
	}
	
	private void abrirCuadroDialogo() {
		
		JFileChooser cuadroAbrir = new JFileChooser();
		
		int resultado = cuadroAbrir.showOpenDialog(null);
		
		if (resultado == JFileChooser.CANCEL_OPTION)
			return;
		
		File archivoElegido = cuadroAbrir.getSelectedFile();
		
		try {
			FileReader archivo = new FileReader(archivoElegido);
			BufferedReader buffer = new BufferedReader(archivo);
			
			boolean eof = false;
			String linea;
			
			txtArea.setText("");
			
			while(!eof) {				
				linea = buffer.readLine();
				
				if (linea == null){
					eof = true;
				} else {
					txtArea.append(linea + "\n");					
				}
			}
			
			buffer.close();
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
	private void guardarCuadroDialogo() {
		
		JFileChooser cuadroGuardar = new JFileChooser();
		
		int resultado = cuadroGuardar.showSaveDialog(null);
		
		if (resultado == JFileChooser.CANCEL_OPTION)
			return;
		
		File archivoElegido = cuadroGuardar.getSelectedFile();
		
		try {
			FileWriter archivo = new FileWriter(archivoElegido);
			BufferedWriter buffer = new BufferedWriter(archivo);
			
			buffer.write(txtArea.getText());
			
			buffer.close();	
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
}
