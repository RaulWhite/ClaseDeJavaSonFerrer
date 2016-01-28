/**
 * @author Raúl Blanco Rama
 * 
 * Crear un array con los pesos de 10 pacientes.
 * Ordenarlo de menor a mayor.
 */
public class EjemploArraysBidimensionales7 {

	public static void main(String[] args) {
		
		double pesos[] = {90.2, 80.3, 65.2, 78.9, 92.3, 78.3, 89.7, 43.2, 87.3, 56.2};
		double min = pesos[0], max = pesos[0];
		
		for (int i = 1; i < pesos.length; i++){
			if (pesos[i] < min){
				min = pesos[i];
			}
			if (pesos[i] > max){
				max = pesos[i];
			}
		}		
		
		System.out.println("Peso mínimo: " + min);
		System.out.println("Peso máximo: " + max);
		
	}
	
}
