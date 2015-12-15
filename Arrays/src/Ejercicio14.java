/**
 * @author Raúl Blanco Rama
 */
public class Ejercicio14 {

	public static void main(String[] args) {
		
		int[] primos = new int[100];
		int temporal = 0;
		primos[0] = 2;
		int j = 1;
		
		for (int i = 0; j<100; i++){
			
			for (int k = 2; k<i; k++){
				
				temporal = i%k;
				
				if (temporal == 0) {
					break;
				}
				
			}
			
			if (temporal!=0) {
				primos[j] = i;
				j++;
			}
			
		}
		
		for (int i = 0; i<primos.length; i++){
			System.out.println(primos[i]);
		}
		
	}
	
}
