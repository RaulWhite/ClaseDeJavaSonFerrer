import java.io.*;
import java.util.Scanner;

public class Contactos {

	// El programa pide nombre y teléfono de varias personas y
	// los va guardando en un archivo de texto con el formato:
	//   nombre
	//   teléfono
	//   ---
	//   nombre
	//   teléfono
	//   ---
	
	// Al preguntar los datos, se preguntará al usuario si quiere seguir introduciendo nombres.
	// Si contesta "no", se terminará el programa.
	
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		guardarContactos();
		
	}
	
	public static void guardarContactos() {
		
		try {
			FileWriter archivo = new FileWriter("contactos.txt", true);
			BufferedWriter buffer = new BufferedWriter(archivo);
			
			do {
				
				System.out.print("Nombre: ");
				buffer.write(entrada.nextLine());
				
				buffer.newLine();
				
				System.out.print("Teléfono: ");
				buffer.write(entrada.nextLine());
				
				buffer.newLine();
				buffer.write("---");
				buffer.newLine();
				
			} while (seguir());
			
		buffer.close();
			
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		System.out.println("Se ha finalizado el registro de contactos.");
		
	}
	
	public static boolean seguir() {
		
		System.out.print("¿Quiere introducir más números? (s/N): ");
		
		if (entrada.nextLine().toLowerCase().equals("s")){
			return true;
		} else if (entrada.nextLine().toLowerCase().equals("a")){
			System.out.println("Proceso abortado. No se han escrito los cambios.");
			System.exit(1);
			return false;
		} else {
			return false;
		}
		
	}
	
}
