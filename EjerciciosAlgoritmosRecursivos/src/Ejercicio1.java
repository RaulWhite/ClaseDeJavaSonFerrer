/**
 * @author Raúl Blanco Rama
 */
public class Ejercicio1 {

	public static void main(String[] args) {
		
		System.out.println(transforma(65535));
		
	}
	
	public static long transforma(long dato){
		if (dato > 1){
			return Long.parseLong(transforma(dato/2) + "" + (dato%2));
		} else {
			return dato;
		}
	}
	
}