import java.io.*;

/**
 * @author Raúl Blanco Rama
 */

public class Junio3 {

	public static void main(String[] args) {
		
		leerArchivo("mensaje.txt");
		
		System.out.println();
		
		System.out.println(contarPalabras("mensaje.txt", "hola"));
		
		System.out.println(contarPalabrasTotales("mensaje.txt", "hola"));
	}
	
	public static void leerArchivo (String nombreArchivo){
		
		try {
			
			FileReader archivo = new FileReader(nombreArchivo);
			BufferedReader buffer = new BufferedReader(archivo);
			
			boolean eof = false;
			String linea = "";
			
			while (!eof){
				
				linea = buffer.readLine();
				
				if (linea == null)
					eof = true;
				else
					System.out.println(linea.toUpperCase());
				
			}
			
			buffer.close();			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
	public static int contarPalabras (String nombreArchivo, String palabra){
		
		int contador = 0;
		
		try {
			
			FileReader archivo = new FileReader(nombreArchivo);
			BufferedReader buffer = new BufferedReader(archivo);
			
			boolean eof = false;
			String linea = "";
			
			while (!eof){
				
				linea = buffer.readLine();
				
				if (linea == null)
					eof = true;
				else if (linea.toLowerCase().contains(palabra.toLowerCase()))
					contador++;
				
			}
			
			buffer.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		return contador;
		
	}
	
	public static int contarPalabrasTotales (String nombreArchivo, String palabra){
		
		int contador = 0;
		
		try {
			
			FileReader archivo = new FileReader(nombreArchivo);
			BufferedReader buffer = new BufferedReader(archivo);
			
			boolean eof = false;
			String linea = "";
			
			while (!eof){
				
				linea = buffer.readLine();
				
				if (linea == null){
					eof = true;
				} else if (linea.toLowerCase().contains(palabra.toLowerCase())) {
					contador += (palabrasEnString(palabra, linea));
				}
				
			}
			
			buffer.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		return contador;
		
	}
	
	public static int palabrasEnString(String palabra, String linea) {
		
		linea = linea.toLowerCase();
		palabra = palabra.toLowerCase();
		
		int inicioSub = linea.indexOf(palabra);
		int finalSub = palabra.length() + inicioSub;
		int contador = 0;
		
		while (finalSub <= linea.length()) {
			if (linea.substring(inicioSub, finalSub).equals(palabra))
				contador++;
			
			inicioSub++;
			finalSub++;
		}
		
		return contador;
		
	}
	
}