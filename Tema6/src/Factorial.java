/**
 * @author Raúl Blanco Rama
 */
public class Factorial {

	public static void main(String[] args) {
		
		int n = 6;
		int resultado = n;
		
		for (int i = (n-1); i>1; i--){
			resultado = resultado * i;
		}
		
		System.out.println(resultado);
		
	}
	
}
