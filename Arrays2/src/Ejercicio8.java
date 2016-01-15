/**
 * @author Raúl Blanco Rama
 */

public class Ejercicio8 {

	public static void main(String[] args) {
		
		int humedad[] = {45, 40, 40, 40, 37, 35, 39, 39, 45, 50, 55, 60, 65, 70, 70, 75, 75, 72, 65, 60, 55, 50, 50, 45};
		int min = humedad[0], max = humedad[0];
		int posicionMin = 0, posicionMax = 0;
		
		for (int i = 0; i<humedad.length; i++){
			
			if (humedad[i]<min){
				min = humedad[i];
				posicionMin = i;
			}
			
			if (humedad[i]>max){
				max = humedad[i];
				posicionMax = i;
			}
			
		}
		
		System.out.println("Mínimo de humedad: " + min + "%. Registrado a las " + posicionMin + " horas.");
		System.out.println("Máximo de humedad: " + max + "%. Registrado a las " + posicionMax + " horas.");

	}
	
}
