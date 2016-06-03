import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Indique idioma para saludo:\n"
				+ "\t1) Francés\n"
				+ "\t2) Inglés\n"
				+ "\t3) Alemán\n"
				+ "\t4) Italiano");
		byte opcion = teclado.nextByte();
		
		switch (opcion) {
		case 1:
			System.out.println("Bonjour.");
			break;
			
		case 2:
			System.out.println("Hello.");
			break;
			
		case 3:
			System.out.println("Hallo.");
			break;
			
		case 4:
			System.out.println("Ciao.");
			break;
			
		default:
			System.out.println("ERROR. Elija una opción del 1 al 4.");
			
		}
		
		teclado.close();
		
	}
	
}
