/**
 * @author Raúl Blanco Rama
 */
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int temps[] = new int[8];
		int posMin;
		int aux;
		Scanner entrada = new Scanner(System.in);
		
		for (int h=0; h<temps.length; h++){
			System.out.print("Temperaturas a las " + (h + 16) + " horas: ");
			temps[h] = entrada.nextInt();
		}
		
		for (int i=0; i < (temps.length - 1); i++){
			posMin = i;
			for (int j = (i + 1); j < temps.length; j++){
				if (temps[j] < temps[posMin]){
					posMin = j;
				}
			}
			
			aux = temps[i];
			temps[i] = temps[posMin];
			temps[posMin] = aux;
			
		}
		
		System.out.println();
		
		for (int k=0; k<temps.length; k++){
			System.out.print(temps[k] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Temperatura mínima: " + temps[0] + "ºC.");
		System.out.println("Temperatura máxima: " + temps[(temps.length - 1)] + "ºC.");
		
		entrada.close();
		
	}
	
}
