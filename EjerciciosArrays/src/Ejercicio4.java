import java.util.Arrays;

/**
 * @author Raúl Blanco Rama
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		int notas[] = {5, 8, 4, 9, 10, 8, 2, 4};
		int primerasNotas[] = Arrays.copyOfRange(notas, 0, 4);
		
		System.out.println(Arrays.toString(notas));
		System.out.println(Arrays.toString(primerasNotas));
		
	}
	
}