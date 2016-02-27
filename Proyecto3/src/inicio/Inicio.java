/**
 * @author Raúl Blanco Rama
 */
package inicio;

import java.util.Scanner;

import biblioteca.Autor;
import biblioteca.Libro;

public class Inicio {

	public static void main(String[] args) {
		
		Autor a1 = new Autor();
		Libro l1 = new Libro();
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nombre del autor: ");
		a1.setNombre(entrada.nextLine());
		
		System.out.print("eMail del autor: ");
		a1.setEmail(entrada.nextLine());
		
		System.out.print("Fecha de nacimiento: ");
		a1.setFechaNacimiento(entrada.nextLine());
		
		System.out.println();
		System.out.print("Título del libro: ");
		l1.setTitulo(entrada.nextLine());
		
		System.out.print("ISBN del libro: ");
		l1.setIsbn(entrada.nextLine());
		
		System.out.print("Año actual: ");
		l1.setAnnoActual(entrada.nextInt());
		entrada.nextLine();
		
		l1.setAutor(a1);
		
		System.out.println();
		System.out.println("Autor:");
		System.out.println(a1.toString());
		System.out.println();
		System.out.println("Libro:");
		System.out.println(l1.toString());
		
		entrada.close();
	}
	
}
