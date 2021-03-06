package excepciones;

/**
 * @author Raúl Blanco Rama
 */

public class PruebaExcepciones {

	public static void main(String[] args) {
		
		String dividendo = "20";
		String divisor = "10";
				
		try {
			int a = Integer.parseInt(dividendo);
			int b = Integer.parseInt(divisor);
			int resultado = a/b;
			System.out.println("La división da " + resultado);
		} catch (NumberFormatException nfe) {
			System.out.println("Al menos uno de los operandos no es un número");
		} catch (ArithmeticException ae){
			System.out.println("El divisor no puede ser 0");
		} catch (Exception e) {
			System.out.println("Error no especificado");
		}
		
	}
	
}
