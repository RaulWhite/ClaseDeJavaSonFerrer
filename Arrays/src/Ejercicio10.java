/**
 * @author Raúl Blanco Rama
 */
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		double compras[] = new double[100];
		Scanner entrada = new Scanner(System.in);
		int i;
		
		for (i = 0; i < compras.length; i++){
			System.out.print("Introduzca precio " + (i+1) + ": ");
			compras[i] = entrada.nextDouble();
			
			if (compras[i] == 0){
				break;
			}
		}
		
		System.out.println("\nLista de la compra");
		System.out.println("==================");
		
		for (int j = 0; j < i; j++){
			System.out.println("Precio producto " + (j+1) + ": " + compras[j]);
		}
		
		entrada.close();
		
	}
	
}