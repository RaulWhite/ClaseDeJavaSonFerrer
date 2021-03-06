import java.io.*;

/**
 * @author Raúl Blanco Rama
 */

public class LectorBytes {

	public static void main(String[] args) {
		
		try {
			FileInputStream archivo = new FileInputStream("nombres.txt");
			
			int byteLeido = 0;
			
			boolean eof = false; // End of File
			
			int contador = 0;
			
			while (eof == false) {
				byteLeido = archivo.read();
				
				if (byteLeido == -1) {
					eof = true;
				} else {
					System.out.print(byteLeido + " ");
					contador++;
				}
			}
			
			archivo.close();
			
			System.out.println("\n" + contador + " bytes");
			
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	
}
