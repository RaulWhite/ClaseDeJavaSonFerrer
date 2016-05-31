import java.io.*;

/**
 * @author Raúl Blanco Rama
 */

public class Bufferes {
	
	public static void main(String[] args) {
		
		if (escribir()) {
			System.out.println("Se ha podido escribir en el archivo");
		} else {
			System.out.println("Error al escribir en el archivo");
		}
		
		if (leer()) {
			System.out.println("Se ha podido leer el archivo");
		} else {
			System.out.println("Error al leer en el archivo");
		}
		
	}

	public static boolean escribir() {
		try {
			
			FileOutputStream fichero = new FileOutputStream("numeros.dat");
			BufferedOutputStream buffer = new BufferedOutputStream(fichero);
			
			for (int i = 1; i <= 50; i++) {
				buffer.write(i);
			}
			
			buffer.close();
			
			return true;
			
		} catch (IOException e) {
			System.out.println("Error: " + e.toString());
			return false;
		}
	}

	public static boolean leer() {
		try {
			
			FileInputStream fichero = new FileInputStream("numeros.dat");
			BufferedInputStream buffer = new BufferedInputStream(fichero);
			
			boolean eof = false;
			int caracter = 0;
			
			while (!eof) {
				caracter = buffer.read();
				
				if (caracter == -1){
					eof = true;
				} else {
					System.out.println(caracter + " ");
				}
			}
			
			buffer.close();
			
			return true;
			
		} catch (IOException e) {
			System.out.println("Error: " + e.toString());
			return false;
		}
	}
	
}