import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		
		while (numero < 1 || numero > 10) {
			
			System.out.print("Indique un número entre 1 y 10: ");
			numero = entrada.nextInt();
			
		}
		
		System.out.println("Número válido introducido: " + numero);
	
		entrada.close();
		
	}
	
}
