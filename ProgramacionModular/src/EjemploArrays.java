/**
 * @author Raúl Blanco Rama
 */
import java.util.Scanner;

public class EjemploArrays {
	
	static String[] palabras = new String[10];
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		relleno();
		
		if (busqueda2("ordenador") == true){
			System.out.println("Se ha encontrado la palabra \"Ordenador\".");
		} else {
			System.out.println("No se ha encontrado la palabra \"Ordenador\".");
		}
		
		if (busqueda("ordenador") != (-1)){
			System.out.println("La palabra \"Ordenador\" se encuentra en la posición " + busqueda("ordenador"));
		} else {
			System.out.println("No se ha encontrado la palabra \"Ordenador\".");
		}
	}
	
	static void relleno(){
		for (int i = 0; i < palabras.length; i++){
			System.out.print("Palabra " + (i+1) + ": ");
			palabras[i] = entrada.nextLine();
		}
	}
	
	static int busqueda(String palabra){
		int posicion = -1;
		
		for (int i = 0; i < palabras.length; i++){
			if (palabras[i].toLowerCase().equals(palabra)){
				posicion = i;
				return posicion;
			}
		}
		
		return posicion;		
	}
	
	static boolean busqueda2(String palabra){
		
		for (int i = 0; i<palabras.length; i++){
			if (palabras[i].toLowerCase().equals(palabra)){
				return true;
			}
		}
		
		return false;
	}
	
}
