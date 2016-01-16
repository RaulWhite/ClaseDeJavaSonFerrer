/**
 * @author Raúl Blanco Rama
 */

public class EjemploAlgoritmoSeleccion4 {

	public static void main(String[] args) {
		
		double alturas[] = {1.5, 1.72, 1.60, 1.65, 1.91, 1.8, 1.62};
		int posMin;
		double aux;
		
		for (int i = 0; i<alturas.length; i++){
			posMin = i;
			for (int j = (i + 1); j<alturas.length; j++){
				if (alturas[j] < alturas[posMin]){
					posMin = j;
				}
			}
			
			aux = alturas[i];
			alturas[i] = alturas[posMin];
			alturas[posMin] = aux;
			
			for (int k = 0; k < alturas.length; k++){
				System.out.println(alturas[k]);
			}
			
			System.out.println("---");
			
		}
		
	}
	
}
