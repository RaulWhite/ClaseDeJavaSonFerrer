/**
 * @author Raúl Blanco Rama
 */

public class Ejercicio2 {

	public static void main(String[] args) {
		
		// Imprimir múltiplos de 5 entre 1 y 1000.
		
		// Variable contador = 0 para entrar en el bucle.
		int i = 0;
		int suma = 0;
		
		while (i < 1000) {
			// Se van sumando 5 al contador, y de cada vez se suman entre sí
			// en la variable suma
			i+=5;
			suma = suma + i;
			
		}
		
		//Al final se imprime el resultado total
		System.out.println(suma);
		
	}
	
}
