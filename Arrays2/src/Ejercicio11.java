/**
 * @author Raúl Blanco Rama
 */
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		
		int edades[] = new int[10];
		int posMin;
		int aux;
		Scanner entrada = new Scanner(System.in);
		
		for (int h=0; h<edades.length; h++){
			System.out.print("Edad alumno " + (h + 1) + ": ");
			edades[h] = entrada.nextInt();
		}
		
		for (int i=0; i < (edades.length - 1); i++){
			posMin = i;
			for (int j = (i + 1); j < edades.length; j++){
				if (edades[j] < edades[posMin]){
					posMin = j;
				}
			}
			
			aux = edades[i];
			edades[i] = edades[posMin];
			edades[posMin] = aux;
			
		}
		
		System.out.println();
		
		for (int k=0; k<edades.length; k++){
			System.out.print(edades[k] + " ");
		}
		
		entrada.close();
		
	}
	
}
