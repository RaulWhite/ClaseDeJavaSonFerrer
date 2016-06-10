/**
 * @author Raúl Blanco Rama
 */
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		double precios[] = new double[10];
		int i = 0;
		double suma = 0;
		int masDeDiez = 0;
		
		do {
			System.out.print("Precio del producto " + (i+1) + ": ");
			precios[i] = entrada.nextDouble();
			i++;
		}while (i<precios.length);
		
		for (i = 0; i<precios.length; i++){
			suma = suma + precios[i];
			
			if (precios[i] > 10){
				masDeDiez++;
			}
			
		}
		
		System.out.println("\nTotal: " + suma + "€.");
		System.out.println(masDeDiez + " productos cuestan más de 10€.");
		
		entrada.close();
		
	}
	
}
