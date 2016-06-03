import java.util.Scanner;

public class EjemploContinue {

	public static void main(String[] args) {
		
		// Programa que pida números y devuelva el doble de dichos números.
		// Ahora bien, si el número introducido es 0, no tendrá que hacer ninguna operación,
		// y seguirá pidiendo más números.
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		for (int i = 1; i <= 10; i++) {
		
			System.out.print("Número " + i + ": ");
			numero = entrada.nextInt();
			
			if (numero == 0) {
				continue;
			}
			
			System.out.println("El doble de " + numero + " es: " + (numero*2));
			
		}
		
		entrada.close();
		
	}
	
}
