/**
 * @author Raúl Blanco Rama
 */
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		String ordenes[] = new String[1000];
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < ordenes.length; i++){
			System.out.print("Introduzca orden nº " + (i+1) + ": ");
			ordenes[i] = entrada.nextLine().toLowerCase();
			
			if (ordenes[i].equals("ejecutar")){
				break;
			}
		}
		
		System.out.println("\nLista de ordenes");
		System.out.println("==================");
		
		
		int j=0;
		while (j<ordenes.length && !ordenes[j].equals("ejecutar")){
			System.out.println("Orden nº " + (j+1) + ": " + ordenes[j]);
			j++;
		}
		
		entrada.close();
		
	}
	
}