import java.util.Scanner;

public class Ejercicio21 {
	
	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		String nombre = entrada.nextLine();
		
		// También se puede hacer con un solo String:
		// nombre = (nombre.equals(""))? "Desconocido":nombre;
		// Al ser falso, se queda con el mismo valor.
		
		String escribirNombre = (nombre.equals(""))? "Desconocido":nombre;
		
		System.out.println("Tu nombre es: " + escribirNombre);

		entrada.close();
	}
}
