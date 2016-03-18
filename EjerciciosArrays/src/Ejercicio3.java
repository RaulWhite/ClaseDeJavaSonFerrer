import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Raúl Blanco Rama
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double precios[] = {6.30, 3.50, 4.95, 2.90, 10, 12.30, 2.45, 4.90, 6.20, 7};
		Arrays.sort(precios);
		
		System.out.print("Introduzca precio a buscar: ");
		double busqueda = entrada.nextDouble();
		
		if (Arrays.binarySearch(precios, busqueda) >= 0){
			System.out.println("Posición en el array: " + Arrays.binarySearch(precios, busqueda));
		} else {
			System.out.println("No se ha encontrado el elemento.");
		}
				
		System.out.println(Arrays.toString(precios));
		
		entrada.close();
		
	}
	
}
