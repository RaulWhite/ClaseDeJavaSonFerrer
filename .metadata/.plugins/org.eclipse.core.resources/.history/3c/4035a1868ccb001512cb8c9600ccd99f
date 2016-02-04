/**
 * @author Raúl Blanco Rama
 */

public class EjemploAlgoritmoSeleccion3 {

	public static void main(String[] args) {
		
		int edades[] = {20, 35, 40, 17, 22, 90, 23, 15};
		int posMin;
		int aux;
		
		for (int i = 0; i < (edades.length - 1); i++){
			posMin = i;
			
			for (int j = (i + 1); j<edades.length; j++){
				if (edades[j] < edades[posMin]){
					posMin = j;
				}
			}
			
			aux = edades[i];
			edades[i] = edades[posMin];
			edades[posMin] = aux;
			
			for (int k = 0; k<edades.length; k++){
				System.out.println(edades[k]);
			}
			
			System.out.println("---");
			
		}
		
	}
	
}
