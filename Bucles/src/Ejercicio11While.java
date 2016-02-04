import java.util.Scanner;

public class Ejercicio11While {
	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		
		while (numero < 1 || numero > 20) {
			
			System.out.print("Número: ");
			numero = entrada.nextInt();
			
		} 
		
		System.out.println("Su número es el " + numero);
		
		entrada.close();
	
	}
}
