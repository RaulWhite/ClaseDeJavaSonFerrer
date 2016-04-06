/**
 * @author Raúl Blanco Rama
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		System.out.println(transforma(100));
		
	}
	
	public static long transforma(long dato){
		String binario = "";
		for (long i = dato; i > 0; i/=2){
			binario = (i%2) + binario;
		}
		return Long.parseLong(binario);
	}
	
}
