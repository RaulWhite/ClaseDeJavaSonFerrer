/**
 * @author Raúl Blanco Rama
 */
package inicio;

import java.util.Scanner;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("¿Cuántos autores tiene el libro?: ");
		int cant = entrada.nextInt();
		entrada.nextLine();
		Libro l1 = new Libro();
		Autor autores[] = new Autor[cant];
		
		for (int i = 0; i < autores.length; i++){
			autores[i] = new Autor();
			System.out.println("Autor " + (i+1) + " de " + autores.length);
			
			System.out.print("Nombre: ");
			autores[i].setNombre(entrada.nextLine());
			
			System.out.print("eMail: ");
			autores[i].setEmail(entrada.nextLine());
			
			System.out.print("Fecha de nacimiento: ");
			autores[i].setFechaNacimiento(entrada.nextLine());
			
			System.out.println();
		}
		
		System.out.println("Información del libro");
		System.out.print("Título del libro: ");
		l1.setTitulo(entrada.nextLine());
		
		System.out.print("ISBN del libro: ");
		l1.setIsbn(entrada.nextLine());
		
		System.out.print("Año actual: ");
		l1.setAnnoActual(entrada.nextInt());
		entrada.nextLine();
		
		l1.setAutor(autores);
		
		System.out.println();
		System.out.println("Libro:");
		System.out.println(l1.toString());
		
		System.out.println();
		
		if (autores.length > 1){
			System.out.println("Autores del libro");
			System.out.println(l1.muestraAutores());
		}
		
		entrada.close();
		
	}
	
}
