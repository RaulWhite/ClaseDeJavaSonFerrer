/**
 * @author Raúl Blanco Rama
 * 
 * Programa que lea el día y la temperatura media de 7 días de un mes
 * y luego devuelva el número de temperaturas que han pasado de 20ºC. 
 */
import java.util.Scanner;

public class EjemploArraysBidimensionales5 {

	public static void main(String[] args) {
		
		float temps[][] = new float[7][2];
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < temps.length; i++) {
			System.out.print("Día: ");
			temps[i][0] = entrada.nextFloat();

			System.out.print("Temperatura: ");
			temps[i][1] = entrada.nextFloat();

			System.out.println();
		}
		
		System.out.println("Día\t| Temperatura");
		System.out.println("=====================");
		
		for (int j = 0; j<temps.length; j++){
			if (temps[j][1]>20){
				System.out.println("Día " + (int)(temps[j][0]) + "\t| " + temps[j][1] + "ºC.");
				System.out.println("---------------------");
			}
		}
		
		entrada.close();
		
	}
	
}
