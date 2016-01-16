/**
 * @author Raúl Blanco Rama
 */

public class EjemploAlgoritmoSeleccion2 {

	public static void main(String[] args) {
		
		int notas[] = {4, 7, 10, 9, 2, 8, 8, 1};
		int posMin;
		int aux;
		
		for (int i=0; i<(notas.length - 1); i++){
			
			//BUSCAR LA POSICIÓN DEL ELEMENTO MÁS PEQUEÑO EN EL SUBARRAY DESDE i HASTA EL FINAL
			
			posMin = i;
			for (int j = (i + 1); j<notas.length; j++){
				if (notas[j]<notas[posMin]){
					posMin = j;
				}
			}
			
			//INTERCAMBIAR LA POSICIÓN DE ESE ELEMENTO MÁS PEQUEÑO POR LA POSICIÓN EN LA QUE ESTAMOS AHORA (i)
			
			aux = notas[i];
			notas[i] = notas[posMin];
			notas[posMin] = aux;
			
			//POR ÚLTIMO LA i AUMENTARÁ EN 1 Y VOLVERÁ A EMPEZAR HASTA LLEGAR AL PENÚLTIMO DEL ARRAY
			
			//PODEMOS VER EN CAA PASADA DEL BUCLR CÓMO VA QUEDANDO EL ARRAY
			for (int k=0; k<notas.length; k++){
				System.out.println(notas[k]);
			}
			
			System.out.println("---");
			
		}
		
	}
	
}
