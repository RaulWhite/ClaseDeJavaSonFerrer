/**
 * @author Raúl Blanco Rama
 */

public class Ejercicio1 {

	public static void main(String[] args) {
		
		// Imprimir múltiplos de 5 entre 1 y 1000.
		
		// Variable contador = 0 para entrar en el bucle.
		int i = 0;
		
		// La última vez que se entra en el bucle la i vale 995, pero se calcula antes de imprimir.
		// Si fuera i <= 1000, el último valor imprimido sería 1005.
		
		while (i < 1000) {
			
			i+=5;
			System.out.println(i);
			
		}
		
	}
	
}
