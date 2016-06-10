/**
 * @author Raúl Blanco Rama
 */
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int multiplicar;
		
		do {
			System.out.print("Tabla de multiplicar: ");
			multiplicar = entrada.nextInt();
			
			System.out.println("Tabla de multiplicar del " + multiplicar);
			System.out.println("===========================");
			
			for (int i = 1; i <= 10; i++){
				System.out.println("\t" + multiplicar + " x " + i + " = " + (multiplicar*i));
			}
			
			System.out.println();
			
		} while (multiplicar != 0);
		
		entrada.close();
		
	}
	
}
