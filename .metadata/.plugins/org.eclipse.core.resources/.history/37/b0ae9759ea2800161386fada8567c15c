import java.io.*;

/**
 * @author Raúl Blanco Rama
 */

public class Encriptado {

	public static void main(String[] args) {
		
		//cifrar("nombres.txt");
		
		descifrar("nombres.txt.nuevo");
		
	}
	
	public static void cifrar (String nombreArchivo) {
		
		try {
			
			FileInputStream entrada = new FileInputStream(nombreArchivo);
			BufferedInputStream bufferEntrada = new BufferedInputStream(entrada);
			
			FileOutputStream salida = new FileOutputStream(nombreArchivo + ".nuevo");
			BufferedOutputStream bufferSalida = new BufferedOutputStream(salida);
			
			boolean eof = false;
			int byteEntrada = 0;
			
			while (!eof) {
				byteEntrada = bufferEntrada.read();
				
				if (byteEntrada == -1){
					eof = true;
				} else {
					if (byteEntrada == 255) {
						bufferSalida.write(0);
					} else {
						bufferSalida.write((byteEntrada + 1));
					}
				}
			}
			
			bufferEntrada.close();
			bufferSalida.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	public static void descifrar (String nombreArchivo) {
		
		try {
			
			FileInputStream entrada = new FileInputStream(nombreArchivo);
			BufferedInputStream bufferEntrada = new BufferedInputStream(entrada);
			
			FileOutputStream salida = new FileOutputStream(nombreArchivo + ".nuevo");
			BufferedOutputStream bufferSalida = new BufferedOutputStream(salida);
			
			boolean eof = false;
			int byteEntrada = 0;
			
			while (!eof) {
				byteEntrada = bufferEntrada.read();
				
				if (byteEntrada == -1){
					eof = true;
				} else {
					if (byteEntrada == 0) {
						bufferSalida.write(255);
					} else {
						bufferSalida.write((byteEntrada - 1));
					}
				}
			}
			
			bufferEntrada.close();
			bufferSalida.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
		
	}
	
}
