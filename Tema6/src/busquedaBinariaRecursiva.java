/**
 * @author Raúl Blanco Rama
 */
public class busquedaBinariaRecursiva {

	public static void main(String[] args) {
		
		int numeros[] = {2, 12, 14, 20, 21, 22};
		
		System.out.println(busqueda(numeros, 12, 0, (numeros.length - 1)));
		
	}
	

	public static int busqueda(int[] lista, int x, int i, int f){
		// Caso base: Si slos índices se cruzan, el número no se encuentra en el array
		if (i > f){
			return -1;
		}
		
		int m = (i + f) / 2;
		
		if (lista[m] == x) {
			return m;
		} else if (lista[m] > x) {
			// f = m - 1;
			return busqueda(lista, x, i, (m - 1));
		} else /* (lista[m] < x) */ {
			// i = m + 1;
			return busqueda(lista, x, (m + 1), f);
		}
	}
	
	
}
