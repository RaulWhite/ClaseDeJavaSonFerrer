/**
 * @author Raúl Blanco Rama
 */

public class Ejercicio3 {

	public static void main(String[] args) {
		
		// Variable contador para exponentes
		int i = 0;
		
		// Variable resultado para que el bucle pare cuando haya un exponente
		// de 3 con resultado mayor de 12000
		int resultado = 1;
		
		do {
			
			// Se imprime el exponente válido si el resultado es menor de 12000
			// La primera vez, al ser exponente 0, el resultado es 1, sin depender de la base
			System.out.println("Con exponente " + i + " = " + resultado);
			
			i++;
						
			// Cálculo de potencias con exponente i (contador)
			resultado = (int)(Math.pow(3,i));
						
		} while (resultado < 12000);
		
		/* 
		 * Ya que se hace con DoWhile, se tiene que pensar de manera distinta que con solo while. 
		 * Al primero realizar las instrucciones del bucle y luego comprobar si hacerlo otra vez,
		 * es buena idea imprimir primero para que no se imprima un resultado que no queramos.
		 */
		
	}
	
}
