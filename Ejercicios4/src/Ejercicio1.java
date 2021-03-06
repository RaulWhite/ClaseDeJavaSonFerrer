/**
 * @author Raúl Blanco Rama
 */
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String libros[][] = new String[5][4];
		Scanner entrada = new Scanner(System.in);
		
		for (int i = 0; i < libros.length; i++){
			System.out.println("Libro " + (i+1));
			System.out.print("ISBN: ");
			libros[i][0] = entrada.nextLine();
			
			System.out.print("Título: ");
			libros[i][1] = entrada.nextLine();
			
			System.out.print("Autor: ");
			libros[i][2] = entrada.nextLine();
			
			System.out.print("Editorial: ");
			libros[i][3] = entrada.nextLine();
			
			System.out.println();
		}
		
		System.out.println("| ISBN\t\t| Título\t\t| Autor\t\t\t| Editorial\t\t |");
		System.out.println("------------------------------------------------------------------------------------------");
		
		for (int j = 0; j < libros.length; j++){
			System.out.println(libros[j][0] + "\t| " + libros[j][1] + "\t| " + libros[j][2] + "\t| " + libros[j][3] + "\t|");
		}
		
		entrada.close();
		
	}
	
}
