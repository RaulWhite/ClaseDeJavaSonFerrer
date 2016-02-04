/**
 * @author Raúl Blanco Rama
 * 
 * Programa que pida por consola los datos de tres alumnos, y sus edades.
 * A continuación mostrará la media de edad de los alumnos.
 */
import java.util.Scanner;

public class EjemploArraysBidimensionales2 {

	public static void main(String[] args) {
		
		String alumnos[][] = new String[3][2];
		float media = 0;
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i<alumnos.length; i++){
			System.out.print("Nombre del alumno " + (i+1) + ": ");
			alumnos[i][0] = entrada.nextLine();
						
			System.out.print("Edad del alumno " + (i+1) + ": ");
			alumnos[i][1] = entrada.nextLine();
			
			System.out.println();
		}
		
		for (int j = 0; j<alumnos.length; j++){
			media = media + Integer.parseInt(alumnos[j][1]);
		}
		
		media = media/(alumnos.length);
		
		System.out.println("Edad media de la clase: " + media + " años.");
		
		entrada.close();
		
	}
	
}
