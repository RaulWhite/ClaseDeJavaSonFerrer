/**
 * @author Raúl Blanco Rama
 */

public class EjemploAlgoritmoSeleccion {

	public static void main(String[] args) {
		
		int[] valores = {4, 9, 30, -1, 5, 8}; //Array a ordenar
		int posMin; //Posición del menor elemento del subarray
		int aux; //Variable auxiliar para intercambiar valores
		
		for (int i=0; i<(valores.length - 1); i++){
			
			//Buscamos la posición del elemento más pequeño entre u y n-1
			posMin = i;
			for (int j=i+1; j<valores.length; j++){
				if (valores[j] < valores[posMin]) {
					posMin = j;
				}
			}
			//Ahora posMin es la posición del mñinimo elemento del array (entre i y el final del array)
			
			//Intercambiamos las posiciones i y posMin
			aux = valores[posMin];
			valores[posMin] = valores[i];
			valores[i] = aux;
			
			//Para ver qué hace el algoritmo en cada paso
			for (int k = 0; k<valores.length; k++){
				System.out.println(valores[k]);
			}
			System.out.println("---");
		}
		
//		//Mostramos el array ya ordenado
//		for (int k = 0; k<valores.length; k++){
//			System.out.println(valores[k]);
//		}
		
	}
	
}
