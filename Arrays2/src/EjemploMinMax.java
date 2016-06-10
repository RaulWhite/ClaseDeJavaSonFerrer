/**
 * @author Raúl Blanco Rama
 */

public class EjemploMinMax {

	public static void main(String[] args) {
		
		int[] numeros = {3,12,54,-4,0,4,30};
		
		int min = numeros[0], max = numeros[0];
		
		for (int i = 1; i < numeros.length; i++){
			
			if (numeros[i] < min){
				min = numeros[i];
			}
			
			if (numeros[i] > max){
				max = numeros[i];
			}
			
		}
		
		System.out.println("Mínimo: " + min);
		System.out.println("Máximo: " + max);
		
	}
	
}
