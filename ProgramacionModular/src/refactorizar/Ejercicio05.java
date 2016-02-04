package refactorizar;
/**
 * @author Raúl Blanco Rama
 */

public class Ejercicio05 {

	public static void main(String[] args) {
		
		double temps[] = {15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6};
		double min = temps[0], max = temps[0];
		int posicionMin = 1, posicionMax = 1;
		
		for (int i = 1; i<temps.length; i++){
			
			if (temps[i]<min) {
				min = temps[i];
				posicionMin = i+1;
			}
			
			if (temps[i]>max) {
				max = temps[i];
				posicionMax = i+1;
			}
			
		}
		
		System.out.println("Temperatura mínima: " + min + "ºC. Posición de Array: " + posicionMin + " de " + temps.length);
		System.out.println("Temperatura máxima: " + max + "ºC. Posición de Array: " + posicionMax + " de " + temps.length);
		
	}
	
}
