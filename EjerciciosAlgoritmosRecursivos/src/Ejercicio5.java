/**
 * @author Raúl Blanco Rama
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		
		System.out.println(sumaN(5));
		
	}
	
	public static int sumaN (int n){
		if (n > 1){
			return n + (sumaN(n-1));
		} else {
			return n;
		}
	}
	
}
