package excepciones;

/**
 * @author Raúl Blanco Rama
 */

public class PruebaExcepciones {

	public static void main(String[] args) {
		
		String dividendo = "20";
		String divisor = "0";
				
		try {
			int a = Integer.parseInt(dividendo);
			int b = Integer.parseInt(divisor);
			int resultado = a/b;
			System.out.println("La división da " + resultado);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
}
