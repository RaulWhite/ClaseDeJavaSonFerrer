/**
 * @author Raúl Blanco Rama
 * 
 * Crear un array con los pesos de 10 pacientes.
 * Ordenarlo de menor a mayor.
 */
public class EjemploArraysBidimensionales7 {

	public static void main(String[] args) {
		
		double pesos[] = {90.2, 80.3, 65.2, 78.9, 92.3, 78.3, 89.7, 43.2, 87.3, 56.2};
		int posMin;
		double aux;
		
		for (int i = 0; i<pesos.length; i++){
			posMin = i;
			for (int j = (i + 1); j<pesos.length; j++){
				if (pesos[j] < pesos[posMin]){
					posMin = j;
				}
			}
			
			aux = pesos[i];
			pesos[i] = pesos[posMin];
			pesos[posMin] = aux;
			
		}	
		
		for (int k = 0; k < pesos.length; k++){
			System.out.print(pesos[k] + " ");
		}
		
	}
	
}

