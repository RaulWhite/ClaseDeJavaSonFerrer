package leccion12;

/**
 * @author Raúl Blanco Rama
 */

public class Sobrecarga {

	public static void main(String[] args) {
		doblar(5);
	}
	
	public static void doblar(int x){
		System.out.println("El doble de " + x + " es: " + (x * 2));
	}

	public static void doblar(double x){
		System.out.println("El doble de " + x + " es: " + (x * 2));
	}
	
}
