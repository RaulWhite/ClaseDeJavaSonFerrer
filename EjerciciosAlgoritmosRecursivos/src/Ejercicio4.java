/**
 * @author Raúl Blanco Rama
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		System.out.println(divisionEntera(20, 6));
		
	}
	
	public static int divisionEntera(int dividendo, int divisor){
		if (dividendo >= divisor){
			return 1 + divisionEntera((dividendo - divisor), divisor);
		} else {
			return 0;
		}
	}
	
}
