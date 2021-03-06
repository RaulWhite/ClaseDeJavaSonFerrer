/**
 * @author Raúl Blanco Rama
 */
package inicio;

import java.util.Scanner;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		Autor autores[] = new Autor[5];
		Libro libros[] = new Libro[100];
		int i = 0;
				
		do {
			autores[i] = new Autor();
			System.out.println("Autor " + (i+1) + " de " + autores.length);
			
			System.out.print("Nombre: ");
			autores[i].setNombre(entrada.nextLine());
			
			System.out.print("eMail: ");
			autores[i].setEmail(entrada.nextLine());
			
			System.out.print("Fecha de nacimiento: ");
			autores[i].setFechaNacimiento(entrada.nextLine());
			
			if (i < (autores.length - 1)){
				System.out.print("¿Continuar? (s/n): ");
				
				if (entrada.nextLine().toLowerCase().equals("s")){
					i++;
					System.out.println();
				}else{
					System.out.println("Se han rellenado datos de " + (i+1) + " de un total de " + autores.length + ".");
					break;
				}
			}else if(i == (autores.length - 1)){
				System.out.println("Se han rellenado los datos de todos los autores.");
			}
			
		} while (i < autores.length);
		
		for (int j = 0; j < libros.length; j++){
			libros[j] = new Libro();
		}
		
		entrada.close();
		
	}
	
}
