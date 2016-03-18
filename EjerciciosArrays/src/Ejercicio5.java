import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Raúl Blanco Rama
 */
public class Ejercicio5 {

	public static void main(String[] args) {
		
		String nombres1[] = new String[5];
		String nombres2[] = new String[5];
		
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < nombres1.length; i++) {
			System.out.print("Nombre " + (i+1) + " del array 1: ");
			nombres1[i] = entrada.nextLine();
		}
		
		for (int i = 0; i < nombres2.length; i++) {
			System.out.print("Nombre " + (i+1) + " del array 2: ");
			nombres2[i] = entrada.nextLine();
		}

		if (Arrays.equals(nombres1, nombres2)){
			System.out.println("Los dos arrays son iguales.");
		} else {
			System.out.println("Los dos arrays son distintos.");
		}
		
		entrada.close();
		
	}
	
}
