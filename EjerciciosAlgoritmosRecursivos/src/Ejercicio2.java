/**
 * @author Raúl Blanco Rama
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		System.out.println(transforma(100));
		
	}
	
	public static long transforma(long dato){
		String binario = "";
		while (dato > 0){
			binario = (dato%2) + binario;
			dato/=2;
		}
		return Long.parseLong(binario);
	}
	
}
