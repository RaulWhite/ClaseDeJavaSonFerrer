/**
 * @author Raúl Blanco Rama
 */

public class EjemploAlgoritmoSeleccion5 {

	public static void main(String[] args) {
		
		double precios[] = {60.50, 8.45, 300.40, 12.50, 23.90};
		int posMin;
		double aux;
		
		for (int i = 0; i<precios.length; i++){
			posMin = i;
			for (int j = (i + 1); j<precios.length; j++){
				if (precios[j] < precios[posMin]){
					posMin = j;
				}
			}
			
			aux = precios[i];
			precios[i] = precios[posMin];
			precios[posMin] = aux;
			
			for (int k = 0; k < precios.length; k++){
				System.out.println(precios[k]);
			}
			
			System.out.println("---");
			
		}
		
	}
	
}
