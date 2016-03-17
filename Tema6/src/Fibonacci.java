/**
 * @author Raúl Blanco Rama
 */
public class Fibonacci {
	
	public static void main(String[] args) {
		
		System.out.println(fibonacci(8));
		
	}
	
	static long fibonacci(long n){
		if (n == 1 || n == 2){
			return 1;
		} else if (n > 2){
			return fibonacci(n-1) + fibonacci(n-2);
		} else {
			return 0;
		}
	}
	
}
