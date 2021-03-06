/**
 * @author Raúl Blanco Rama
 */

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int numeros[] = {5, 2, 8, 69, 1, 23, 7};
		
		System.out.println(buscaMinimo(numeros, 7));
		
	}
	
	public static int buscaMinimo(int[] a, int n){
		if (n == 1){
			return a[0];
		} else {
			return Math.min(a[n-1], buscaMinimo(a, (n-1)));
		}
	}
	
}
