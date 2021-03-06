import java.io.*;

/**
 * @author Raúl Blanco Rama
 */

public class GuardarPuntuaciones {

	public static void main(String[] args) {
		
		guardar("puntuaciones.txt", "Charlie", 10);
		
	}
	
	public static void guardar(String nombreArchivo, String nombre, int puntos) {
		
		try {
			
			FileWriter archivo = new FileWriter(nombreArchivo, true);
			BufferedWriter buffer = new BufferedWriter(archivo);
			
			buffer.write(nombre);
			buffer.newLine();
			buffer.write(String.valueOf(puntos));
			buffer.newLine();
			
			buffer.close();
			
		} catch (IOException ioe) {
			System.out.println("Error: " + ioe.toString());
		}
		
	}
	
}
